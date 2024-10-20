package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("dl")
public class class114 extends class18 {

    @ObfuscatedName("dl.aa")
    public AudioFormat field1561;

    @ObfuscatedName("dl.af")
    public SourceDataLine field1558;

    @ObfuscatedName("dl.ae")
    public int field1560;

    @ObfuscatedName("dl.at")
    public byte[] field1559;

    @ObfuscatedName("dl.v(Ljava/awt/Component;)V")
    public void method194(Component arg0) {
        this.field1561 = new AudioFormat((float) Statics.field354, 16, Statics.field243 ? 2 : 1, true, false);
        this.field1559 = new byte[0x100 << (Statics.field243 ? 2 : 1)];
    }

    @ObfuscatedName("dl.f(I)V")
    public void method195(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1561, arg0 << (Statics.field243 ? 2 : 1));
            this.field1558 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1558.open();
            this.field1558.start();
            this.field1560 = arg0;
        } catch (LineUnavailableException var18) {
            int var5 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
            int var6 = (var5 >>> 2 & 0x33333333) + (var5 & 0x33333333);
            int var7 = (var6 >>> 4) + var6 & 0xF0F0F0F;
            int var8 = (var7 >>> 8) + var7;
            int var9 = (var8 >>> 16) + var8;
            int var10 = var9 & 0xFF;
            if (var10 == 1) {
                this.field1558 = null;
                throw var18;
            }
            int var11 = arg0 - 1;
            int var12 = var11 | var11 >>> 1;
            int var13 = var12 | var12 >>> 2;
            int var14 = var13 | var13 >>> 4;
            int var15 = var14 | var14 >>> 8;
            int var16 = var15 | var15 >>> 16;
            int var17 = var16 + 1;
            this.method195(var17);
        }
    }

    @ObfuscatedName("dl.s()I")
    public int method196() {
        return this.field1560 - (this.field1558.available() >> (Statics.field243 ? 2 : 1));
    }

    @ObfuscatedName("dl.j()V")
    public void method197() {
        int var1 = 256;
        if (Statics.field243) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field260[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1559[var2 * 2] = (byte) (var3 >> 8);
            this.field1559[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1558.write(this.field1559, 0, var1 << 1);
    }

    @ObfuscatedName("dl.e()V")
    public void method217() {
        if (this.field1558 != null) {
            this.field1558.close();
            this.field1558 = null;
        }
    }

    @ObfuscatedName("dl.t()V")
    public void method199() {
        this.field1558.flush();
    }
}
