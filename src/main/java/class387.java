import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class387 implements Runnable {

    @OriginalMember(owner = "client!ci", name = "l", descriptor = "[Lck;")
    public volatile class351[] field5552 = new class351[2];

    @OriginalMember(owner = "client!ci", name = "h", descriptor = "Z")
    public volatile boolean field5548 = false;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "Z")
    public volatile boolean field5541 = false;

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "Ljava/lang/String;")
    public static String field5543 = "Cancel";

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "I")
    public static int field5547 = 0;

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "Z")
    public static boolean field5546 = false;

    @OriginalMember(owner = "client!ci", name = "k", descriptor = "Ljava/lang/String;")
    public static String field5551 = "Discard";

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "I")
    public static int field5544;

    @OriginalMember(owner = "client!ci", name = "i", descriptor = "I")
    public static int field5549;

    @OriginalMember(owner = "client!ci", name = "j", descriptor = "I")
    public static int field5550;

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "Lvj;")
    public class177 field5542;

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "[Lof;")
    public static class421[] field5545;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(BI)V", line = 10)
    public static final void method2451(byte arg0, int arg1) {
        field5550++;
        if (class389.field5596 == arg1) {
            return;
        }
        class183.field2703 = class66.field1056 = class339.field4825[arg1];
        class73.field1235.method738(50, (int) ((double) class183.field2703 * 34.46D));
        class205.field3013 = new int[class183.field2703][class66.field1056];
        class244.field3547 = new int[class183.field2703][class66.field1056];
        class41.field630 = new int[4][class183.field2703 >> 3][class66.field1056 >> 3];
        if (arg0 != -32) {
            field5551 = null;
        }
        for (int var2 = 0; var2 < 4; var2++) {
            class322.field4646[var2] = class50.method401(class183.field2703, (byte) 113, class66.field1056);
        }
        class141.field2232 = new byte[4][class183.field2703][class66.field1056];
        class75.method594(class66.field1056, class183.field2703, 4, 125);
        class122.method1028(arg0 ^ 0x1E, class66.field1056 >> 3, class183.field2703 >> 3, class73.field1235);
        class389.field5596 = arg1;
    }

    @OriginalMember(owner = "client!ci", name = "run", descriptor = "()V", line = 46)
    public final void run() {
        this.field5541 = true;
        field5544++;
        try {
            while (!this.field5548) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class351 var2 = this.field5552[var1];
                    if (var2 != null) {
                        var2.method2258((byte) 111);
                    }
                }
                class134.method1106(10L, 10);
                class360.method2311(611902952, (Object) null, this.field5542);
            }
        } catch (Exception var9) {
            class282.method2003((String) null, -24830, var9);
        } finally {
            Object var6 = null;
            this.field5541 = false;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lpe;I)V", line = 86)
    public static final void method2452(class390 arg0, int arg1) {
        arg0.field5619 = false;
        field5549++;
        if (arg0.field5642 != -1) {
            class51 var2 = class113.method974(arg0.field5642, (byte) -107);
            if (var2 == null || var2.field835 == null) {
                arg0.field5642 = -1;
                arg0.field5661 = false;
            } else {
                label306: {
                    arg0.field5640++;
                    if (var2.field835.length > arg0.field5659 && var2.field845[arg0.field5659] < arg0.field5640) {
                        arg0.field5640 = 1;
                        arg0.field5659++;
                        arg0.field5608++;
                        class50.method399(arg0.field5659, arg0.field6519, (byte) 103, var2, arg0.field6520, class86.field1394 == arg0);
                    }
                    if (arg0.field5659 >= var2.field835.length) {
                        arg0.field5640 = 0;
                        arg0.field5659 = 0;
                        if (arg0.field5661) {
                            arg0.field5642 = arg0.method2476((byte) 74).method2627((byte) 126);
                            if (arg0.field5642 == -1) {
                                arg0.field5661 = false;
                                break label306;
                            }
                            var2 = class113.method974(arg0.field5642, (byte) -124);
                        }
                        class50.method399(arg0.field5659, arg0.field6519, (byte) 55, var2, arg0.field6520, class86.field1394 == arg0);
                    }
                    arg0.field5608 = arg0.field5659 + 1;
                    if (arg0.field5608 >= var2.field835.length) {
                        arg0.field5608 = 0;
                    }
                }
            }
        }
        if (arg0.field5683 != -1 && class267.field4002 >= arg0.field5605) {
            class389 var3 = class321.method2140(arg0.field5683, (byte) -115);
            int var4 = var3.field5597;
            if (var4 == -1) {
                arg0.field5683 = -1;
            } else {
                label308: {
                    class51 var5 = class113.method974(var4, (byte) -111);
                    if (var3.field5590) {
                        if (var5.field848 == 3) {
                            if (arg0.field5698 > 0 && class267.field4002 >= arg0.field5601 && arg0.field5667 < class267.field4002) {
                                arg0.field5683 = -1;
                                break label308;
                            }
                        } else if (var5.field848 == 1 && arg0.field5698 > 0 && class267.field4002 >= arg0.field5601 && arg0.field5667 < class267.field4002) {
                            arg0.field5605 = class267.field4002 + 1;
                            break label308;
                        }
                    }
                    if (var5 == null || var5.field835 == null) {
                        arg0.field5683 = -1;
                    } else {
                        if (arg0.field5630 < 0) {
                            arg0.field5630 = 0;
                            class50.method399(0, arg0.field6519, (byte) 50, var5, arg0.field6520, class86.field1394 == arg0);
                        }
                        arg0.field5651++;
                        if (var5.field835.length > arg0.field5630 && arg0.field5651 > var5.field845[arg0.field5630]) {
                            arg0.field5651 = 1;
                            arg0.field5630++;
                            class50.method399(arg0.field5630, arg0.field6519, (byte) 85, var5, arg0.field6520, class86.field1394 == arg0);
                        }
                        if (arg0.field5630 >= var5.field835.length) {
                            if (var3.field5590) {
                                arg0.field5630 -= var5.field838;
                                arg0.field5626++;
                                if (var5.field841 <= arg0.field5626) {
                                    arg0.field5683 = -1;
                                } else if (arg0.field5630 >= 0 && arg0.field5630 < var5.field835.length) {
                                    class50.method399(arg0.field5630, arg0.field6519, (byte) 92, var5, arg0.field6520, class86.field1394 == arg0);
                                } else {
                                    arg0.field5683 = -1;
                                }
                            } else {
                                arg0.field5683 = -1;
                            }
                        }
                        arg0.field5681 = arg0.field5630 + 1;
                        if (arg0.field5681 >= var5.field835.length) {
                            if (var3.field5590) {
                                arg0.field5681 -= var5.field838;
                                if (var5.field841 <= (arg0.field5626 + 1)) {
                                    arg0.field5681 = -1;
                                } else if (arg0.field5681 < 0 || var5.field835.length <= arg0.field5681) {
                                    arg0.field5681 = -1;
                                }
                            } else {
                                arg0.field5681 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg0.field5620 != -1 && arg0.field5647 <= 1) {
            class51 var6 = class113.method974(arg0.field5620, (byte) -75);
            if (var6.field848 == 3) {
                if (arg0.field5698 > 0 && class267.field4002 >= arg0.field5601 && class267.field4002 > arg0.field5667) {
                    arg0.field5620 = -1;
                }
            } else if (var6.field848 == 1 && arg0.field5698 > 0 && class267.field4002 >= arg0.field5601 && arg0.field5667 < class267.field4002) {
                arg0.field5647 = 2;
            }
        }
        if (arg0.field5620 != -1 && arg0.field5647 == 0) {
            class51 var7 = class113.method974(arg0.field5620, (byte) -118);
            if (var7 == null || var7.field835 == null) {
                arg0.field5620 = -1;
            } else {
                arg0.field5648++;
                if (var7.field835.length > arg0.field5687 && var7.field845[arg0.field5687] < arg0.field5648) {
                    arg0.field5687++;
                    arg0.field5648 = 1;
                    class50.method399(arg0.field5687, arg0.field6519, (byte) 80, var7, arg0.field6520, class86.field1394 == arg0);
                }
                if (var7.field835.length <= arg0.field5687) {
                    arg0.field5677++;
                    arg0.field5687 -= var7.field838;
                    if (var7.field841 <= arg0.field5677) {
                        arg0.field5620 = -1;
                    } else if (arg0.field5687 >= 0 && arg0.field5687 < var7.field835.length) {
                        class50.method399(arg0.field5687, arg0.field6519, (byte) 117, var7, arg0.field6520, class86.field1394 == arg0);
                    } else {
                        arg0.field5620 = -1;
                    }
                }
                arg0.field5665 = arg0.field5687 + 1;
                if (var7.field835.length <= arg0.field5665) {
                    arg0.field5665 -= var7.field838;
                    if (var7.field841 <= arg0.field5677 + 1) {
                        arg0.field5665 = -1;
                    } else if (arg0.field5665 < 0 || arg0.field5665 >= var7.field835.length) {
                        arg0.field5665 = -1;
                    }
                }
                arg0.field5619 = var7.field825;
            }
        }
        if (arg0.field5647 > 0) {
            arg0.field5647--;
        }
        if (arg1 != -11877) {
            method2452((class390) null, -77);
        }
        for (int var8 = 0; var8 < arg0.field5646.length; var8++) {
            class109 var9 = arg0.field5646[var8];
            if (var9 != null) {
                if (var9.field1783 > 0) {
                    var9.field1783--;
                } else {
                    class51 var10 = class113.method974(var9.field1789, (byte) -110);
                    if (var10 == null || var10.field835 == null) {
                        arg0.field5646[var8] = null;
                    } else {
                        var9.field1788++;
                        if (var9.field1784 < var10.field835.length && var9.field1788 > var10.field845[var9.field1784]) {
                            var9.field1788 = 1;
                            var9.field1784++;
                            class50.method399(var9.field1784, arg0.field6519, (byte) 78, var10, arg0.field6520, class86.field1394 == arg0);
                        }
                        if (var9.field1784 >= var10.field835.length) {
                            var9.field1784 -= var10.field838;
                            var9.field1781++;
                            if (var10.field841 <= var9.field1781) {
                                arg0.field5646[var8] = null;
                            } else if (var9.field1784 >= 0 && var10.field835.length > var9.field1784) {
                                class50.method399(var9.field1784, arg0.field6519, (byte) 121, var10, arg0.field6520, class86.field1394 == arg0);
                            } else {
                                arg0.field5646[var8] = null;
                            }
                        }
                        var9.field1776 = var9.field1784 + 1;
                        if (var10.field835.length <= var9.field1776) {
                            var9.field1776 -= var10.field838;
                            if ((var9.field1781 + 1) >= var10.field841) {
                                var9.field1776 = -1;
                            } else if (var9.field1776 < 0 || var9.field1776 >= var10.field835.length) {
                                var9.field1776 = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Z)V", line = 436)
    public static void method2453(boolean arg0) {
        field5543 = null;
        field5551 = null;
        field5545 = null;
        if (!arg0) {
            method2452((class390) null, -97);
        }
    }
}
