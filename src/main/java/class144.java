import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gw")
public class class144 {

    @OriginalMember(owner = "client!gw", name = "c", descriptor = "I")
    public int field1847 = 0;

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "Z")
    public boolean field1845 = false;

    @OriginalMember(owner = "client!gw", name = "h", descriptor = "Z")
    public boolean field1852 = false;

    @OriginalMember(owner = "client!gw", name = "e", descriptor = "Ljj;")
    public class67 field1849 = null;

    @OriginalMember(owner = "client!gw", name = "n", descriptor = "Z")
    public boolean field1858 = false;

    @OriginalMember(owner = "client!gw", name = "k", descriptor = "[S")
    public short[] field1855;

    @OriginalMember(owner = "client!gw", name = "f", descriptor = "[S")
    public short[] field1850;

    @OriginalMember(owner = "client!gw", name = "l", descriptor = "[S")
    public short[] field1856;

    @OriginalMember(owner = "client!gw", name = "p", descriptor = "[S")
    public short[] field1860;

    @OriginalMember(owner = "client!gw", name = "o", descriptor = "[S")
    public short[] field1859;

    @OriginalMember(owner = "client!gw", name = "g", descriptor = "[B")
    public byte[] field1851;

    @OriginalMember(owner = "client!gw", name = "b", descriptor = "[S")
    private static short[] field1846 = new short[500];

    @OriginalMember(owner = "client!gw", name = "d", descriptor = "[S")
    private static short[] field1848 = new short[500];

    @OriginalMember(owner = "client!gw", name = "j", descriptor = "[S")
    private static short[] field1854 = new short[500];

    @OriginalMember(owner = "client!gw", name = "m", descriptor = "[S")
    private static short[] field1857 = new short[500];

    @OriginalMember(owner = "client!gw", name = "i", descriptor = "[B")
    private static byte[] field1853 = new byte[500];

    @OriginalMember(owner = "client!gw", name = "q", descriptor = "[S")
    private static short[] field1861 = new short[500];

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "()V")
    public static void method839() {
        field1854 = null;
        field1857 = null;
        field1846 = null;
        field1848 = null;
        field1861 = null;
        field1853 = null;
    }

    @OriginalMember(owner = "client!gw", name = "<init>", descriptor = "([BLjj;)V")
    public class144(byte[] arg0, class67 arg1) {
        this.field1849 = arg1;
        try {
            class630 var3 = new class630(arg0);
            class630 var4 = new class630(arg0);
            var3.method3501(-9268);
            var3.field8812 += 2;
            int var5 = var3.method3501(-9268);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field8812 = var3.field8812 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field1849.field906[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method3501(-9268);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field1854[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3 || var10 == 10) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field1857[var6] = var12;
                    } else {
                        field1857[var6] = (short) var4.method3465(-9561);
                    }
                    if ((var11 & 0x2) == 0) {
                        field1846[var6] = var12;
                    } else {
                        field1846[var6] = (short) var4.method3465(-9561);
                    }
                    if ((var11 & 0x4) == 0) {
                        field1848[var6] = var12;
                    } else {
                        field1848[var6] = (short) var4.method3465(-9561);
                    }
                    field1853[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2 || var10 == 9) {
                        field1857[var6] = (short) (field1857[var6] << 2 & 0x3FFF);
                        field1846[var6] = (short) (field1846[var6] << 2 & 0x3FFF);
                        field1848[var6] = (short) (field1848[var6] << 2 & 0x3FFF);
                    }
                    field1861[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field1861[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field1845 = true;
                    } else if (var10 == 7) {
                        this.field1858 = true;
                    } else if (var10 == 9 || var10 == 10 || var10 == 8) {
                        this.field1852 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field8812) {
                throw new RuntimeException();
            }
            this.field1847 = var6;
            this.field1855 = new short[var6];
            this.field1850 = new short[var6];
            this.field1856 = new short[var6];
            this.field1860 = new short[var6];
            this.field1859 = new short[var6];
            this.field1851 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field1855[var13] = field1854[var13];
                this.field1850[var13] = field1857[var13];
                this.field1856[var13] = field1846[var13];
                this.field1860[var13] = field1848[var13];
                this.field1859[var13] = field1861[var13];
                this.field1851[var13] = field1853[var13];
            }
        } catch (Exception var14) {
            this.field1847 = 0;
            this.field1845 = false;
            this.field1858 = false;
        }
    }
}
