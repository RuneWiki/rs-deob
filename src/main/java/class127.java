import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class127 {

    @OriginalMember(owner = "client!m", name = "a", descriptor = "Lcf;")
    public class427 field1844 = null;

    @OriginalMember(owner = "client!m", name = "f", descriptor = "Lcf;")
    public class427 field1849 = null;

    @OriginalMember(owner = "client!m", name = "e", descriptor = "[Laf;")
    public class299[] field1848 = null;

    @OriginalMember(owner = "client!m", name = "g", descriptor = "Lcf;")
    public class427 field1850 = null;

    @OriginalMember(owner = "client!m", name = "d", descriptor = "[Laf;")
    public class299[] field1847 = null;

    @OriginalMember(owner = "client!m", name = "b", descriptor = "Z")
    public boolean field1845;

    @OriginalMember(owner = "client!m", name = "c", descriptor = "Lbg;")
    public static class324 field1846 = new class324(97, -2);

    @OriginalMember(owner = "client!m", name = "j", descriptor = "I")
    public static int field1853 = 0;

    @OriginalMember(owner = "client!m", name = "h", descriptor = "I")
    public static int field1851;

    @OriginalMember(owner = "client!m", name = "i", descriptor = "Lfs;")
    public static class387 field1852;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(II)I")
    public static final int method990(int arg0, int arg1) {
        if (arg0 <= 28) {
            method990(-39, -26);
        }
        field1851++;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(B)V")
    public static void method991(byte arg0) {
        field1846 = null;
        if (arg0 != 100) {
            field1852 = null;
        }
        field1852 = null;
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Lfd;)V")
    public class127(class365 arg0) {
        this.field1845 = arg0.field5432;
        class384.method2337((byte) -16, arg0);
        if (this.field1845) {
            byte[] var6 = class186.method1303(false, (byte) 64, class388.field5742);
            this.field1850 = new class427(arg0, 6410, 128, 128, 16, var6, 6410);
            byte[] var7 = class186.method1303(false, (byte) 122, class92.field1267);
            this.field1844 = new class427(arg0, 6410, 128, 128, 16, var7, 6410);
            class368 var8 = arg0.field5308;
            if (var8.method2276(-104)) {
                byte[] var9 = class186.method1303(false, (byte) 108, class484.field7119);
                this.field1849 = new class427(arg0, 6408, 128, 128, 16);
                class427 var10 = new class427(arg0, 6409, 128, 128, 16, var9, 6409);
                if (var8.method2278(2.0F, var10, 1, this.field1849)) {
                    this.field1849.method2429(-125);
                } else {
                    this.field1849.method2423(67);
                    this.field1849 = null;
                }
                var10.method2423(-119);
            }
        } else {
            this.field1848 = new class299[16];
            for (int var2 = 0; var2 < 16; var2++) {
                byte[] var5 = class424.method2594(32768, (byte) 94, class388.field5742, var2 * 128 * 256);
                this.field1848[var2] = new class299(arg0, 3553, 6410, 128, 128, true, var5, 6410, false);
            }
            this.field1847 = new class299[16];
            for (int var3 = 0; var3 < 16; var3++) {
                byte[] var4 = class424.method2594(32768, (byte) 51, class92.field1267, var3 * 32768);
                this.field1847[var3] = new class299(arg0, 3553, 6410, 128, 128, true, var4, 6410, false);
            }
        }
    }
}
