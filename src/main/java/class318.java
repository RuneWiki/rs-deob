import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class318 extends class406 {

    @OriginalMember(owner = "client!rc", name = "y", descriptor = "[I")
    public static int[] field4516 = new int[5];

    @OriginalMember(owner = "client!rc", name = "u", descriptor = "I")
    public static int field4512;

    @OriginalMember(owner = "client!rc", name = "v", descriptor = "I")
    public static int field4513;

    @OriginalMember(owner = "client!rc", name = "x", descriptor = "I")
    public static int field4515;

    @OriginalMember(owner = "client!rc", name = "A", descriptor = "I")
    public static int field4518;

    @OriginalMember(owner = "client!rc", name = "C", descriptor = "I")
    public int field4520;

    @OriginalMember(owner = "client!rc", name = "D", descriptor = "I")
    public int field4521;

    @OriginalMember(owner = "client!rc", name = "t", descriptor = "Ltq;")
    public static class376 field4511;

    @OriginalMember(owner = "client!rc", name = "p", descriptor = "[I")
    public int[] field4507;

    @OriginalMember(owner = "client!rc", name = "r", descriptor = "[I")
    public static int[] field4509;

    @OriginalMember(owner = "client!rc", name = "w", descriptor = "[I")
    public int[] field4514;

    @OriginalMember(owner = "client!rc", name = "B", descriptor = "[I")
    public int[] field4519;

    @OriginalMember(owner = "client!rc", name = "s", descriptor = "[Lts;")
    public class315[] field4510;

    @OriginalMember(owner = "client!rc", name = "z", descriptor = "[Lts;")
    public class315[] field4517;

    @OriginalMember(owner = "client!rc", name = "q", descriptor = "[[[B")
    public byte[][][] field4508;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(B)V", line = 4)
    public static void method2080(byte arg0) {
        field4516 = null;
        field4511 = null;
        if (arg0 == 20) {
            field4509 = null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I[IBI[I)V", line = 16)
    public static final void method2081(int arg0, int[] arg1, byte arg2, int arg3, int[] arg4) {
        int var5 = 91 % ((54 - arg2) / 44);
        field4512++;
        if (arg0 >= arg3) {
            return;
        }
        int var6 = (arg0 + arg3) / 2;
        int var7 = arg0;
        int var8 = arg1[var6];
        arg1[var6] = arg1[arg3];
        arg1[arg3] = var8;
        int var9 = arg4[var6];
        arg4[var6] = arg4[arg3];
        arg4[arg3] = var9;
        for (int var10 = arg0; var10 < arg3; var10++) {
            if (arg1[var10] < ((var10 & 0x1) + var8)) {
                int var11 = arg1[var10];
                arg1[var10] = arg1[var7];
                arg1[var7] = var11;
                int var12 = arg4[var10];
                arg4[var10] = arg4[var7];
                arg4[var7++] = var12;
            }
        }
        arg1[arg3] = arg1[var7];
        arg1[var7] = var8;
        arg4[arg3] = arg4[var7];
        arg4[var7] = var9;
        method2081(arg0, arg1, (byte) 10, var7 - 1, arg4);
        method2081(var7 + 1, arg1, (byte) 121, arg3, arg4);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)V", line = 71)
    public static final void method2082(int arg0, int arg1) {
        class273.field3879.method1629(arg0, 119);
        field4515++;
        class161.field2126.method1629(arg0, 104);
        if (arg1 != 0) {
            method2081(66, (int[]) null, (byte) -94, 73, (int[]) null);
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ZLfj;)V", line = 90)
    public static final void method2083(boolean arg0, class396 arg1) {
        arg1.field5583 = false;
        field4518++;
        if (arg1.field5640 != -1) {
            class412 var2 = class189.method1288(-8192, arg1.field5640);
            if (var2 == null || var2.field5925 == null) {
                arg1.field5640 = -1;
                arg1.field5613 = false;
            } else {
                label306: {
                    arg1.field5623++;
                    if (arg1.field5643 < var2.field5925.length && var2.field5918[arg1.field5643] < arg1.field5623) {
                        arg1.field5643++;
                        arg1.field5623 = 1;
                        arg1.field5609++;
                        class148.method896(class384.field5422 == arg1, var2, (byte) 108, arg1.field3284, arg1.field5643, arg1.field3269);
                    }
                    if (arg1.field5643 >= var2.field5925.length) {
                        arg1.field5643 = 0;
                        arg1.field5623 = 0;
                        if (arg1.field5613) {
                            arg1.field5640 = arg1.method2526(4).method2018((byte) 109);
                            if (arg1.field5640 == -1) {
                                arg1.field5613 = false;
                                break label306;
                            }
                            var2 = class189.method1288(-8192, arg1.field5640);
                        }
                        class148.method896(class384.field5422 == arg1, var2, (byte) 101, arg1.field3284, arg1.field5643, arg1.field3269);
                    }
                    arg1.field5609 = arg1.field5643 + 1;
                    if (arg1.field5609 >= var2.field5925.length) {
                        arg1.field5609 = 0;
                    }
                }
            }
        }
        if (arg1.field5611 != -1 && arg1.field5650 <= class189.field2726) {
            class97 var3 = class434.method2721(arg1.field5611, 4096);
            int var4 = var3.field1166;
            if (var4 == -1) {
                arg1.field5611 = -1;
            } else {
                label308: {
                    class412 var5 = class189.method1288(-8192, var4);
                    if (var3.field1158) {
                        if (var5.field5934 == 3) {
                            if (arg1.field5667 > 0 && class189.field2726 >= arg1.field5579 && class189.field2726 > arg1.field5636) {
                                arg1.field5611 = -1;
                                break label308;
                            }
                        } else if (var5.field5934 == 1 && arg1.field5667 > 0 && arg1.field5579 <= class189.field2726 && class189.field2726 > arg1.field5636) {
                            arg1.field5650 = class189.field2726 + 1;
                            break label308;
                        }
                    }
                    if (var5 == null || var5.field5925 == null) {
                        arg1.field5611 = -1;
                    } else {
                        if (arg1.field5649 < 0) {
                            arg1.field5649 = 0;
                            class148.method896(class384.field5422 == arg1, var5, (byte) 117, arg1.field3284, 0, arg1.field3269);
                        }
                        arg1.field5606++;
                        if (var5.field5925.length > arg1.field5649 && var5.field5918[arg1.field5649] < arg1.field5606) {
                            arg1.field5606 = 1;
                            arg1.field5649++;
                            class148.method896(class384.field5422 == arg1, var5, (byte) 117, arg1.field3284, arg1.field5649, arg1.field3269);
                        }
                        if (var5.field5925.length <= arg1.field5649) {
                            if (var3.field1158) {
                                arg1.field5576++;
                                arg1.field5649 -= var5.field5915;
                                if (arg1.field5576 >= var5.field5930) {
                                    arg1.field5611 = -1;
                                } else if (arg1.field5649 >= 0 && arg1.field5649 < var5.field5925.length) {
                                    class148.method896(class384.field5422 == arg1, var5, (byte) 106, arg1.field3284, arg1.field5649, arg1.field3269);
                                } else {
                                    arg1.field5611 = -1;
                                }
                            } else {
                                arg1.field5611 = -1;
                            }
                        }
                        arg1.field5593 = arg1.field5649 + 1;
                        if (var5.field5925.length <= arg1.field5593) {
                            if (var3.field1158) {
                                arg1.field5593 -= var5.field5915;
                                if (var5.field5930 <= arg1.field5576 + 1) {
                                    arg1.field5593 = -1;
                                } else if (arg1.field5593 < 0 || arg1.field5593 >= var5.field5925.length) {
                                    arg1.field5593 = -1;
                                }
                            } else {
                                arg1.field5593 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg1.field5612 != -1 && arg1.field5638 <= 1) {
            class412 var6 = class189.method1288(-8192, arg1.field5612);
            if (var6.field5934 == 3) {
                if (arg1.field5667 > 0 && class189.field2726 >= arg1.field5579 && class189.field2726 > arg1.field5636) {
                    arg1.field5612 = -1;
                }
            } else if (var6.field5934 == 1 && arg1.field5667 > 0 && arg1.field5579 <= class189.field2726 && class189.field2726 > arg1.field5636) {
                arg1.field5638 = 2;
            }
        }
        if (arg1.field5612 != -1 && arg1.field5638 == 0) {
            class412 var7 = class189.method1288(-8192, arg1.field5612);
            if (var7 == null || var7.field5925 == null) {
                arg1.field5612 = -1;
            } else {
                arg1.field5634++;
                if (var7.field5925.length > arg1.field5591 && var7.field5918[arg1.field5591] < arg1.field5634) {
                    arg1.field5591++;
                    arg1.field5634 = 1;
                    class148.method896(class384.field5422 == arg1, var7, (byte) 110, arg1.field3284, arg1.field5591, arg1.field3269);
                }
                if (arg1.field5591 >= var7.field5925.length) {
                    arg1.field5642++;
                    arg1.field5591 -= var7.field5915;
                    if (var7.field5930 <= arg1.field5642) {
                        arg1.field5612 = -1;
                    } else if (arg1.field5591 >= 0 && var7.field5925.length > arg1.field5591) {
                        class148.method896(class384.field5422 == arg1, var7, (byte) 119, arg1.field3284, arg1.field5591, arg1.field3269);
                    } else {
                        arg1.field5612 = -1;
                    }
                }
                arg1.field5630 = arg1.field5591 + 1;
                if (var7.field5925.length <= arg1.field5630) {
                    arg1.field5630 -= var7.field5915;
                    if (var7.field5930 <= arg1.field5642 + 1) {
                        arg1.field5630 = -1;
                    } else if (arg1.field5630 < 0 || arg1.field5630 >= var7.field5925.length) {
                        arg1.field5630 = -1;
                    }
                }
                arg1.field5583 = var7.field5921;
            }
        }
        if (!arg0) {
            field4511 = null;
        }
        if (arg1.field5638 > 0) {
            arg1.field5638--;
        }
        for (int var8 = 0; var8 < arg1.field5596.length; var8++) {
            class299 var9 = arg1.field5596[var8];
            if (var9 != null) {
                if (var9.field4188 > 0) {
                    var9.field4188--;
                } else {
                    class412 var10 = class189.method1288(-8192, var9.field4182);
                    if (var10 == null || var10.field5925 == null) {
                        arg1.field5596[var8] = null;
                    } else {
                        var9.field4186++;
                        if (var9.field4183 < var10.field5925.length && var9.field4186 > var10.field5918[var9.field4183]) {
                            var9.field4186 = 1;
                            var9.field4183++;
                            class148.method896(class384.field5422 == arg1, var10, (byte) 103, arg1.field3284, var9.field4183, arg1.field3269);
                        }
                        if (var10.field5925.length <= var9.field4183) {
                            var9.field4183 -= var10.field5915;
                            var9.field4187++;
                            if (var10.field5930 <= var9.field4187) {
                                arg1.field5596[var8] = null;
                            } else if (var9.field4183 >= 0 && var10.field5925.length > var9.field4183) {
                                class148.method896(class384.field5422 == arg1, var10, (byte) 102, arg1.field3284, var9.field4183, arg1.field3269);
                            } else {
                                arg1.field5596[var8] = null;
                            }
                        }
                        var9.field4185 = var9.field4183 + 1;
                        if (var10.field5925.length <= var9.field4185) {
                            var9.field4185 -= var10.field5915;
                            if (var10.field5930 <= (var9.field4187 + 1)) {
                                var9.field4185 = -1;
                            } else if (var9.field4185 < 0 || var10.field5925.length <= var9.field4185) {
                                var9.field4185 = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "(B)V", line = 413)
    public static final void method2084(byte arg0) {
        field4513++;
        class237 var1 = class406.field5860;
        synchronized (class406.field5860) {
            if (arg0 != 94) {
                return;
            }
            class406.field5860.method1618(0);
        }
        class237 var2 = class66.field755;
        synchronized (class66.field755) {
            class66.field755.method1618(0);
        }
        class101 var3 = class26.field322;
        synchronized (class26.field322) {
            class26.field322.method561(489974055);
        }
    }
}
