import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class230 extends class45 {

    @OriginalMember(owner = "client!sc", name = "n", descriptor = "Lfa;")
    public static class156 field3367 = new class156(64);

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "I")
    public static int field3362;

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "I")
    public static int field3363;

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "I")
    public static int field3364;

    @OriginalMember(owner = "client!sc", name = "m", descriptor = "I")
    public static int field3366;

    @OriginalMember(owner = "client!sc", name = "o", descriptor = "I")
    public static int field3368;

    @OriginalMember(owner = "client!sc", name = "p", descriptor = "I")
    public static int field3369;

    @OriginalMember(owner = "client!sc", name = "q", descriptor = "I")
    public static int field3370;

    @OriginalMember(owner = "client!sc", name = "r", descriptor = "I")
    public static int field3371;

    @OriginalMember(owner = "client!sc", name = "s", descriptor = "I")
    public static int field3372;

    @OriginalMember(owner = "client!sc", name = "l", descriptor = "Lfs;")
    public static class387 field3365;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILiv;I)Ljava/lang/String;", line = 3)
    public static final String method1543(int arg0, class65 arg1, int arg2) {
        ++field3363;
        try {
            int var3 = arg1.method593((byte) 53);
            if (~arg2 > ~var3) {
                var3 = arg2;
            }
            byte[] var4 = new byte[var3];
            arg1.field827 += class425.field6285.method2620(arg1.field783, arg0, var4, ~arg0, var3, arg1.field827);
            return class81.method733(11783, var4, var3, 0);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)V", line = 29)
    public static void method1544(int arg0) {
        field3365 = null;
        if (arg0 > -99) {
            field3365 = null;
        }
        field3367 = null;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILkj;Z)V", line = 43)
    public final void method285(int arg0, class396 arg1, boolean arg2) {
        super.field506.method2188((byte) 78, arg1);
        ++field3364;
        if (!arg2) {
            method1545(false);
        }
        super.field506.method2183(7681, arg0);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(III)V", line = 55)
    public final void method286(int arg0, int arg1, int arg2) {
        ++field3366;
        if (arg1 <= 76) {
            this.method286(-22, 85, -112);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V", line = 68)
    public final void method287(int arg0) {
        if (arg0 != 0) {
            field3370 = 22;
        }
        super.field506.method2249(false, false);
        ++field3368;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZB)V", line = 79)
    public final void method279(boolean arg0, byte arg1) {
        ++field3372;
        if (arg1 <= 115) {
            this.method279(true, (byte) 35);
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(Z)Z", line = 93)
    public static final boolean method1545(boolean arg0) {
        for (int var1 = class168.field2378; var1 < class308.field4395; ++var1) {
            class148[][] var2 = class422.field6240[var1];
            for (int var3 = -class385.field5672; var3 <= 0; ++var3) {
                int var4 = class321.field4527 + var3;
                int var5 = class321.field4527 - var3;
                if (var4 >= class400.field5938 || var5 < class74.field1016) {
                    for (int var6 = -class385.field5672; var6 <= 0; ++var6) {
                        int var7 = class209.field3040 + var6;
                        int var8 = class209.field3040 - var6;
                        if (var4 >= class400.field5938) {
                            if (var7 >= class101.field1415) {
                                class148 var9 = var2[var4][var7];
                                if (var9 != null && var9.field2092) {
                                    class102.field1433 = arg0;
                                    class198.field2896.method1201(var9, 0);
                                    class198.field2896.method1203(5000);
                                }
                            }
                            if (var8 < class215.field3099) {
                                class148 var10 = var2[var4][var8];
                                if (var10 != null && var10.field2092) {
                                    class102.field1433 = arg0;
                                    class198.field2896.method1201(var10, 0);
                                    class198.field2896.method1203(5000);
                                }
                            }
                        }
                        if (var5 < class74.field1016) {
                            if (var7 >= class101.field1415) {
                                class148 var11 = var2[var5][var7];
                                if (var11 != null && var11.field2092) {
                                    class102.field1433 = arg0;
                                    class198.field2896.method1201(var11, 0);
                                    class198.field2896.method1203(5000);
                                }
                            }
                            if (var8 < class215.field3099) {
                                class148 var12 = var2[var5][var8];
                                if (var12 != null && var12.field2092) {
                                    class102.field1433 = arg0;
                                    class198.field2896.method1201(var12, 0);
                                    class198.field2896.method1203(5000);
                                }
                            }
                        }
                        if (class63.field752 == 0) {
                            if (class348.field4832) {
                                class198.field2896.method1193((byte) 2, 24);
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Z)Z", line = 200)
    public final boolean method280(boolean arg0) {
        if (!arg0) {
            this.method285(-81, (class396) null, false);
        }
        ++field3371;
        return true;
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(Lfd;)V", line = 212)
    public class230(class365 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IZ)V", line = 218)
    public final void method281(int arg0, boolean arg1) {
        if (arg0 == 0) {
            ++field3369;
            super.field506.method2249(true, false);
        }
    }

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "(I)V", line = 230)
    public static final void method1546(int arg0) {
        ++field3362;
        if (arg0 != 64) {
            field3365 = null;
        }
        if (class397.field5823) {
            class155.field2206 = null;
            class439.field6528 = null;
            class397.field5823 = false;
        }
    }
}
