import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class350 {

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "Laq;")
    public class444 field4478 = null;

    @OriginalMember(owner = "client!bl", name = "f", descriptor = "[Lqaa;")
    public class309[] field4483 = null;

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "[Lqaa;")
    private class309[] field4481 = null;

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "Z")
    public boolean field4482;

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "Lra;")
    public static class361 field4479 = new class361(29, 28);

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "I")
    public static int field4480;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(B)V", line = 7)
    public static void method2009(byte arg0) {
        field4479 = null;
        if (arg0 != 26) {
            field4479 = null;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)Z", line = 22)
    public final boolean method2010(int arg0) {
        if (arg0 != -17) {
            method2009((byte) -21);
        }
        field4480++;
        if (this.field4482) {
            return this.field4478 != null;
        } else {
            return this.field4483 != null;
        }
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(Lfc;)V", line = 48)
    public class350(class575 arg0) {
        this.field4482 = arg0.field7748;
        if (this.field4482 && !arg0.method176((byte) -111, class395.field5023, class6.field48)) {
            this.field4482 = false;
        }
        if (this.field4482 || arg0.method222(class395.field5023, (byte) 106, class6.field48)) {
            class196.method1298(4);
            if (this.field4482) {
                byte[] var6 = class310.method1807((byte) -63, false, class630.field8792);
                this.field4478 = arg0.method227(9, var6, 128, 16, class395.field5023, 128);
                byte[] var7 = class310.method1807((byte) -102, false, class429.field5553);
                arg0.method227(9, var7, 128, 16, class395.field5023, 128);
            } else {
                this.field4483 = new class309[16];
                for (int var2 = 0; var2 < 16; var2++) {
                    byte[] var5 = class111.method854(0, class630.field8792, 32768, var2 * 2 * 16384);
                    this.field4483[var2] = arg0.method3139(128, var5, (byte) 33, true, 128, class395.field5023);
                }
                this.field4481 = new class309[16];
                for (int var3 = 0; var3 < 16; var3++) {
                    byte[] var4 = class111.method854(0, class429.field5553, 32768, var3 * 128 * 256);
                    this.field4481[var3] = arg0.method3139(128, var4, (byte) 33, true, 128, class395.field5023);
                }
            }
        }
    }
}
