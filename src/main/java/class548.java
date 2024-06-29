import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class548 extends class381 {

    @OriginalMember(owner = "client!re", name = "U", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field7826 = new CRC32();

    @OriginalMember(owner = "client!re", name = "bb", descriptor = "I")
    public static int field7833 = 0;

    @OriginalMember(owner = "client!re", name = "cb", descriptor = "Z")
    public static boolean field7834 = false;

    @OriginalMember(owner = "client!re", name = "eb", descriptor = "S")
    public static short field7836 = 1;

    @OriginalMember(owner = "client!re", name = "db", descriptor = "F")
    public static float field7835;

    @OriginalMember(owner = "client!re", name = "G", descriptor = "I")
    public static int field7825;

    @OriginalMember(owner = "client!re", name = "V", descriptor = "I")
    public static int field7827;

    @OriginalMember(owner = "client!re", name = "W", descriptor = "I")
    public static int field7828;

    @OriginalMember(owner = "client!re", name = "X", descriptor = "I")
    public static int field7829;

    @OriginalMember(owner = "client!re", name = "Y", descriptor = "I")
    public static int field7830;

    @OriginalMember(owner = "client!re", name = "Z", descriptor = "I")
    public static int field7831;

    @OriginalMember(owner = "client!re", name = "ab", descriptor = "I")
    public static int field7832;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IB)[[I")
    public final int[][] method1251(int arg0, byte arg1) {
        ++field7830;
        int[][] var3 = super.field9471.method3639(69, arg0);
        if (super.field9471.field9180 && this.method2084((byte) -109)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = arg0 % super.field4940 * super.field4940;
            for (int var8 = 0; ~class501.field7222 < ~var8; ++var8) {
                int var9 = super.field4949[var8 % super.field4943 + var7];
                var6[var8] = class203.method1246(var9, 255) << 4;
                var5[var8] = class203.method1246(65280, var9) >> 4;
                var4[var8] = class203.method1246(4080, var9 >> 12);
            }
        }
        if (arg1 != 98) {
            method3099((byte) -37);
        }
        return var3;
    }

    @OriginalMember(owner = "client!re", name = "i", descriptor = "(I)V")
    public static final void method3097(int arg0) {
        ++field7827;
        if (class351.field4601 == 7) {
            class184.method1069(false, false);
        } else {
            class46.field505 = class170.field2043;
            class170.field2043 = null;
            class508.method2921(13, (byte) -100);
            if (arg0 >= -65) {
                method3097(-15);
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ILoa;Ljo;)V")
    public static final void method3098(int arg0, class635 arg1, class303 arg2) {
        ++field7832;
        class563[] var3 = class563.method3180(arg2, class579.field8245, 0);
        class18.field160 = new class458[var3.length];
        for (int var4 = 0; ~var4 > ~var3.length; ++var4) {
            class18.field160[var4] = arg1.method351(var3[var4], true);
        }
        class563[] var5 = class563.method3180(arg2, class191.field2304, 0);
        class400.field5343 = new class458[var5.length];
        for (int var6 = 0; var6 < var5.length; ++var6) {
            class400.field5343[var6] = arg1.method351(var5[var6], true);
        }
        class563[] var7 = class563.method3180(arg2, class587.field8339, 0);
        class618.field8704 = new class458[var7.length];
        for (int var8 = 0; ~var7.length < ~var8; ++var8) {
            class618.field8704[var8] = arg1.method351(var7[var8], true);
        }
        class563[] var9 = class563.method3180(arg2, class518.field7400, 0);
        class522.field7478 = new class458[var9.length];
        for (int var10 = 0; ~var10 > ~var9.length; ++var10) {
            class522.field7478[var10] = arg1.method351(var9[var10], true);
        }
        class563[] var11 = class563.method3180(arg2, class480.field7043, 0);
        class537.field7685 = new class458[var11.length];
        for (int var12 = 0; var11.length > var12; ++var12) {
            class537.field7685[var12] = arg1.method351(var11[var12], true);
        }
        class563[] var13 = class563.method3180(arg2, class683.field9692, 0);
        class2.field20 = new class458[var13.length];
        for (int var14 = 0; ~var14 > ~var13.length; ++var14) {
            class2.field20[var14] = arg1.method351(var13[var14], true);
        }
        class563[] var15 = class563.method3180(arg2, class117.field1350, 0);
        class638.field9066 = new class458[var15.length];
        for (int var16 = 0; ~var16 > ~var15.length; ++var16) {
            class638.field9066[var16] = arg1.method351(var15[var16], true);
        }
        class563[] var17 = class563.method3180(arg2, class256.field3280, 0);
        class157.field1766 = new class458[var17.length];
        for (int var18 = 0; ~var17.length < ~var18; ++var18) {
            class157.field1766[var18] = arg1.method351(var17[var18], true);
        }
        class563[] var19 = class563.method3180(arg2, class620.field8716, 0);
        class232.field2957 = new class458[var19.length];
        for (int var20 = 0; ~var19.length < ~var20; ++var20) {
            class232.field2957[var20] = arg1.method351(var19[var20], true);
        }
        class563[] var21 = class563.method3180(arg2, class555.field7900, 0);
        class13.field121 = new class458[var21.length];
        for (int var22 = 0; var21.length > var22; ++var22) {
            class13.field121[var22] = arg1.method351(var21[var22], true);
        }
        class563[] var23 = class563.method3180(arg2, class140.field1600, 0);
        class286.field3671 = new class458[var23.length];
        for (int var24 = 0; var23.length > var24; ++var24) {
            class286.field3671[var24] = arg1.method351(var23[var24], true);
        }
        class563[] var25 = class563.method3180(arg2, class687.field9712, 0);
        class387.field5169 = new class458[var25.length];
        for (int var26 = 0; ~var25.length < ~var26; ++var26) {
            class387.field5169[var26] = arg1.method351(var25[var26], true);
        }
        class319.field4132 = arg1.method351(class563.method3185(arg2, class678.field9611, 0), true);
        class217.field2619 = arg1.method351(class563.method3185(arg2, class525.field7505, 0), true);
        class563[] var27 = class563.method3180(arg2, class552.field7870, 0);
        class589.field8385 = new class458[var27.length];
        if (arg0 == 23096) {
            for (int var28 = 0; var27.length > var28; ++var28) {
                class589.field8385[var28] = arg1.method351(var27[var28], true);
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "e", descriptor = "(B)Z")
    public static final boolean method3099(byte arg0) {
        ++field7831;
        if (class140.field1599) {
            try {
                class432.method2311(4975, "showVideoAd", class485.field7068);
                return true;
            } catch (Throwable var1) {
            }
        }
        if (arg0 != -125) {
            method3098(-42, (class635) null, (class303) null);
        }
        return false;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ZBLjava/lang/Object;)[B")
    public static final byte[] method3100(boolean arg0, byte arg1, Object arg2) {
        ++field7825;
        if (arg1 <= 17) {
            return null;
        } else if (arg2 == null) {
            return null;
        } else if (arg2 instanceof byte[]) {
            byte[] var3 = (byte[]) arg2;
            return !arg0 ? var3 : class377.method2069(var3, (byte) -66);
        } else if (arg2 instanceof class40) {
            class40 var4 = (class40) arg2;
            return var4.method209(false);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!re", name = "f", descriptor = "(B)V")
    public static void method3101(byte arg0) {
        field7826 = null;
        if (arg0 != 123) {
            method3102(-96, (byte) 80, -35);
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IBI)Z")
    public static final boolean method3102(int arg0, byte arg1, int arg2) {
        if (arg1 < 10) {
            method3101((byte) -72);
        }
        ++field7828;
        return class549.method3104(arg0, 106, arg2) | (2048 & arg0) != 0 || class270.method1523(arg2, arg0, -4);
    }
}
