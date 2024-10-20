package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("dw")
public class class113 extends class18 {

    @ObfuscatedName("dw.ap")
    public AudioFormat field1544;

    @ObfuscatedName("dw.ai")
    public SourceDataLine field1546;

    @ObfuscatedName("dw.ae")
    public int field1543;

    @ObfuscatedName("dw.ad")
    public byte[] field1545;

    @ObfuscatedName("dw.g(Ljava/awt/Component;)V")
    public void method218(Component arg0) {
        this.field1544 = new AudioFormat((float) Statics.field823, 16, Statics.field251 ? 2 : 1, true, false);
        this.field1545 = new byte[0x100 << (Statics.field251 ? 2 : 1)];
    }

    @ObfuscatedName("dw.w(I)V")
    public void method211(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1544, arg0 << (Statics.field251 ? 2 : 1));
            this.field1546 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1546.open();
            this.field1546.start();
            this.field1543 = arg0;
        } catch (LineUnavailableException var11) {
            if (class66.method99(arg0) == 1) {
                this.field1546 = null;
                throw var11;
            }
            int var4 = arg0 - 1;
            int var5 = var4 | var4 >>> 1;
            int var6 = var5 | var5 >>> 2;
            int var7 = var6 | var6 >>> 4;
            int var8 = var7 | var7 >>> 8;
            int var9 = var8 | var8 >>> 16;
            int var10 = var9 + 1;
            this.method211(var10);
        }
    }

    @ObfuscatedName("dw.v()I")
    public int method217() {
        return this.field1543 - (this.field1546.available() >> (Statics.field251 ? 2 : 1));
    }

    @ObfuscatedName("dw.u()V")
    public void method213() {
        int var1 = 256;
        if (Statics.field251) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field238[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1545[var2 * 2] = (byte) (var3 >> 8);
            this.field1545[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1546.write(this.field1545, 0, var1 << 1);
    }

    @ObfuscatedName("dw.m()V")
    public void method214() {
        if (this.field1546 != null) {
            this.field1546.close();
            this.field1546 = null;
        }
    }

    @ObfuscatedName("dw.b()V")
    public void method215() {
        this.field1546.flush();
    }
}
