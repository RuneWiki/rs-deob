import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dka")
public class class192 extends class86 {

    @OriginalMember(owner = "client!dka", name = "g", descriptor = "Z")
    public static volatile boolean field2684 = true;

    @OriginalMember(owner = "client!dka", name = "i", descriptor = "I")
    public static int field2686;

    @OriginalMember(owner = "client!dka", name = "j", descriptor = "I")
    public static int field2687;

    @OriginalMember(owner = "client!dka", name = "k", descriptor = "I")
    public static int field2688;

    @OriginalMember(owner = "client!dka", name = "m", descriptor = "I")
    public static int field2690;

    @OriginalMember(owner = "client!dka", name = "n", descriptor = "I")
    public static int field2691;

    @OriginalMember(owner = "client!dka", name = "o", descriptor = "I")
    public static int field2692;

    @OriginalMember(owner = "client!dka", name = "l", descriptor = "Lwm;")
    public static class30 field2689;

    @OriginalMember(owner = "client!dka", name = "h", descriptor = "Lpu;")
    public static class772 field2685;

    @OriginalMember(owner = "client!dka", name = "<init>", descriptor = "(ILsf;)V", line = 3)
    public class192(int arg0, class551 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!dka", name = "<init>", descriptor = "(Lsf;)V", line = 7)
    public class192(class551 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!dka", name = "b", descriptor = "(I)I", line = 10)
    public final int method73(int arg0) {
        ++field2688;
        if (arg0 != 0) {
            method1341((class30) null, (class570) null, 88);
        }
        return 127;
    }

    @OriginalMember(owner = "client!dka", name = "a", descriptor = "(Z)I", line = 21)
    public final int method1340(boolean arg0) {
        if (arg0) {
            field2689 = null;
        }
        ++field2686;
        return super.field1200;
    }

    @OriginalMember(owner = "client!dka", name = "a", descriptor = "(IZ)V", line = 38)
    public final void method76(int arg0, boolean arg1) {
        if (arg1) {
            this.method76(43, true);
        }
        super.field1200 = arg0;
        ++field2690;
    }

    @OriginalMember(owner = "client!dka", name = "b", descriptor = "(II)I", line = 52)
    public final int method72(int arg0, int arg1) {
        if (arg1 != -2) {
            field2684 = false;
        }
        ++field2692;
        return 1;
    }

    @OriginalMember(owner = "client!dka", name = "a", descriptor = "(Lwm;Lha;I)V", line = 63)
    public static final void method1341(class30 arg0, class570 arg1, int arg2) {
        ++field2691;
        class388[] var3 = class388.method2226(arg0, class570.field7195, 0);
        class668.field8688 = new class772[var3.length];
        for (int var4 = 0; var3.length > var4; ++var4) {
            class668.field8688[var4] = arg1.method977(var3[var4], true);
        }
        class388[] var5 = class388.method2226(arg0, class674.field8728, 0);
        class634.field8064 = new class772[var5.length];
        for (int var6 = 0; var5.length > var6; ++var6) {
            class634.field8064[var6] = arg1.method977(var5[var6], true);
        }
        class388[] var7 = class388.method2226(arg0, class547.field6840, 0);
        class544.field6816 = new class772[var7.length];
        for (int var8 = 0; var7.length > var8; ++var8) {
            class544.field6816[var8] = arg1.method977(var7[var8], true);
        }
        class388[] var9 = class388.method2226(arg0, class567.field7178, 0);
        class394.field5191 = new class772[var9.length];
        for (int var10 = 0; ~var10 > ~var9.length; ++var10) {
            class394.field5191[var10] = arg1.method977(var9[var10], true);
        }
        class388[] var11 = class388.method2226(arg0, class195.field2704, 0);
        class362.field4402 = new class772[var11.length];
        for (int var12 = 0; ~var12 > ~var11.length; ++var12) {
            class362.field4402[var12] = arg1.method977(var11[var12], true);
        }
        class388[] var13 = class388.method2226(arg0, class562.field7148, arg2);
        class689.field8854 = new class772[var13.length];
        for (int var14 = 0; var13.length > var14; ++var14) {
            class689.field8854[var14] = arg1.method977(var13[var14], true);
        }
        class388[] var15 = class388.method2226(arg0, class545.field6823, 0);
        class235.field3205 = new class772[var15.length];
        for (int var16 = 0; ~var16 > ~var15.length; ++var16) {
            class235.field3205[var16] = arg1.method977(var15[var16], true);
        }
        class388[] var17 = class388.method2226(arg0, class63.field828, 0);
        class152.field1926 = new class772[var17.length];
        for (int var18 = 0; var18 < var17.length; ++var18) {
            class152.field1926[var18] = arg1.method977(var17[var18], true);
        }
        class388[] var19 = class388.method2226(arg0, class122.field1643, 0);
        class790.field10812 = new class772[var19.length];
        for (int var20 = 0; ~var20 > ~var19.length; ++var20) {
            class790.field10812[var20] = arg1.method977(var19[var20], true);
        }
        class388[] var21 = class388.method2226(arg0, class755.field10292, 0);
        class207.field2858 = new class772[var21.length];
        for (int var22 = 0; var21.length > var22; ++var22) {
            class207.field2858[var22] = arg1.method977(var21[var22], true);
        }
        class388[] var23 = class388.method2226(arg0, class659.field8611, 0);
        class177.field2324 = new class772[var23.length];
        for (int var24 = 0; var23.length > var24; ++var24) {
            class177.field2324[var24] = arg1.method977(var23[var24], true);
        }
        class388[] var25 = class388.method2226(arg0, class322.field3987, 0);
        class662.field8639 = new class772[var25.length];
        for (int var26 = 0; var25.length > var26; ++var26) {
            class662.field8639[var26] = arg1.method977(var25[var26], true);
        }
        class226.field3060 = arg1.method977(class388.method2232(arg0, class369.field4529, 0), true);
        class585.field7406 = arg1.method977(class388.method2232(arg0, class297.field3763, 0), true);
        class388[] var27 = class388.method2226(arg0, class655.field8446, 0);
        class88.field1220 = new class772[var27.length];
        for (int var28 = 0; var28 < var27.length; ++var28) {
            class88.field1220[var28] = arg1.method977(var27[var28], true);
        }
    }

    @OriginalMember(owner = "client!dka", name = "c", descriptor = "(I)V", line = 191)
    public static void method1342(int arg0) {
        if (arg0 >= -27) {
            method1341((class30) null, (class570) null, -9);
        }
        field2685 = null;
        field2689 = null;
    }

    @OriginalMember(owner = "client!dka", name = "a", descriptor = "(B)V", line = 205)
    public final void method71(byte arg0) {
        if (~super.field1200 > -1 && super.field1200 > 127) {
            super.field1200 = this.method73(0);
        }
        if (arg0 == -65) {
            ++field2687;
        }
    }
}
