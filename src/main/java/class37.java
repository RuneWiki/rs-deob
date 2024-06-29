import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class37 extends class131 {

    @OriginalMember(owner = "client!w", name = "o", descriptor = "I")
    private int field424 = 0;

    @OriginalMember(owner = "client!w", name = "E", descriptor = "I")
    private int field440 = -32768;

    @OriginalMember(owner = "client!w", name = "A", descriptor = "Z")
    public boolean field436 = false;

    @OriginalMember(owner = "client!w", name = "D", descriptor = "I")
    private int field439 = -1;

    @OriginalMember(owner = "client!w", name = "K", descriptor = "I")
    private int field446 = 0;

    @OriginalMember(owner = "client!w", name = "M", descriptor = "I")
    public int field448;

    @OriginalMember(owner = "client!w", name = "F", descriptor = "I")
    public int field441;

    @OriginalMember(owner = "client!w", name = "C", descriptor = "I")
    public int field438;

    @OriginalMember(owner = "client!w", name = "u", descriptor = "I")
    public int field430;

    @OriginalMember(owner = "client!w", name = "p", descriptor = "I")
    public int field425;

    @OriginalMember(owner = "client!w", name = "H", descriptor = "I")
    private int field443;

    @OriginalMember(owner = "client!w", name = "s", descriptor = "Lrj;")
    private class274 field428;

    @OriginalMember(owner = "client!w", name = "w", descriptor = "I")
    public static int field432 = 0;

    @OriginalMember(owner = "client!w", name = "v", descriptor = "I")
    public static int field431 = 0;

    @OriginalMember(owner = "client!w", name = "m", descriptor = "I")
    public static int field422 = 0;

    @OriginalMember(owner = "client!w", name = "l", descriptor = "I")
    public static int field421;

    @OriginalMember(owner = "client!w", name = "n", descriptor = "I")
    public static int field423;

    @OriginalMember(owner = "client!w", name = "q", descriptor = "I")
    public static int field426;

    @OriginalMember(owner = "client!w", name = "r", descriptor = "I")
    public static int field427;

    @OriginalMember(owner = "client!w", name = "t", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "client!w", name = "x", descriptor = "I")
    public static int field433;

    @OriginalMember(owner = "client!w", name = "z", descriptor = "I")
    public static int field435;

    @OriginalMember(owner = "client!w", name = "G", descriptor = "I")
    public static int field442;

    @OriginalMember(owner = "client!w", name = "I", descriptor = "I")
    public static int field444;

    @OriginalMember(owner = "client!w", name = "J", descriptor = "I")
    public static int field445;

    @OriginalMember(owner = "client!w", name = "L", descriptor = "I")
    public static int field447;

    @OriginalMember(owner = "client!w", name = "B", descriptor = "Lqd;")
    private class162 field437;

    @OriginalMember(owner = "client!w", name = "y", descriptor = "Lwg;")
    public static class23 field434;

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(I)Lah;")
    private final class106 method225(int arg0) {
        field426++;
        class101 var2 = class189.method1246(this.field443, (byte) -80);
        if (arg0 != -1) {
            this.field443 = 46;
        }
        class106 var3;
        if (this.field436) {
            var3 = var2.method615(0, -1, -1, arg0 + 9);
        } else {
            var3 = var2.method615(this.field424, this.field446, this.field439, 8);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(I)V")
    private static final void method226(int arg0) {
        if (arg0 != -3063) {
            return;
        }
        int var1 = (class177.field2507.field4563 >> 7) + class110.field1473;
        class246.field3572 = 0;
        int var2 = (class177.field2507.field4553 >> 7) + class166.field2383;
        field445++;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class246.field3572 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class246.field3572 = 1;
        }
        if (class246.field3572 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class246.field3572 = 0;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "()I")
    public final int method227() {
        field444++;
        return this.field440;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(B)V")
    public static final void method228(byte arg0) {
        if (arg0 <= 45) {
            return;
        }
        field421++;
        if (class233.field3361 == 0) {
            return;
        }
        try {
            if (++class23.field278 > 1500) {
                if (class117.field1637 != null) {
                    class117.field1637.method1199(-105);
                    class117.field1637 = null;
                }
                if (class177.field2509 >= 1) {
                    class20.field247 = -5;
                    class233.field3361 = 0;
                    return;
                }
                if (class177.field2516 == class16.field194) {
                    class16.field194 = class20.field250;
                } else {
                    class16.field194 = class177.field2516;
                }
                class177.field2509++;
                class23.field278 = 0;
                class233.field3361 = 1;
            }
            if (class233.field3361 == 1) {
                class163.field2344 = class115.field1592.method349(0, class16.field194, class163.field2342);
                class233.field3361 = 2;
            }
            if (class233.field3361 == 2) {
                if (class163.field2344.field960 == 2) {
                    throw new IOException();
                }
                if (class163.field2344.field960 != 1) {
                    return;
                }
                class117.field1637 = new class185((Socket) class163.field2344.field958, class115.field1592);
                class163.field2344 = null;
                class117.field1637.method1206(class94.field1259.field3030, class94.field1259.field3021, (byte) -43, 0);
                if (class73.field878 != null) {
                    class73.field878.method830(32237);
                }
                if (class282.field4282 != null) {
                    class282.field4282.method830(32237);
                }
                int var1 = class117.field1637.method1209((byte) 100);
                if (class73.field878 != null) {
                    class73.field878.method830(32237);
                }
                if (class282.field4282 != null) {
                    class282.field4282.method830(32237);
                }
                if (var1 != 101) {
                    class20.field247 = var1;
                    class233.field3361 = 0;
                    class117.field1637.method1199(-29);
                    class117.field1637 = null;
                    return;
                }
                class233.field3361 = 3;
            }
            if (class233.field3361 == 3 && class117.field1637.method1202((byte) -85) >= 2) {
                int var2 = class117.field1637.method1209((byte) 100) << 8 | class117.field1637.method1209((byte) 100);
                class17.method104(false, var2);
                if (class210.field2952 == -1) {
                    class20.field247 = 6;
                    class233.field3361 = 0;
                    class117.field1637.method1199(-73);
                    class117.field1637 = null;
                } else {
                    class233.field3361 = 0;
                    class117.field1637.method1199(-67);
                    class117.field1637 = null;
                    class6.method38(-25444);
                }
            }
        } catch (IOException var3) {
            if (class117.field1637 != null) {
                class117.field1637.method1199(-62);
                class117.field1637 = null;
            }
            if (class177.field2509 < 1) {
                class233.field3361 = 1;
                class177.field2509++;
                if (class177.field2516 == class16.field194) {
                    class16.field194 = class20.field250;
                } else {
                    class16.field194 = class177.field2516;
                }
                class23.field278 = 0;
            } else {
                class20.field247 = -4;
                class233.field3361 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIII)V")
    public final void method229(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field433++;
    }

    @OriginalMember(owner = "client!w", name = "d", descriptor = "(I)V")
    public static void method230(int arg0) {
        if (arg0 != -2) {
            method232(-13);
        }
        field434 = null;
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(IIIII)V")
    public static final void method231(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field442++;
        if (class73.field880 == 1) {
            class115.field1579[class97.field1298 / 100].method848(class285.field4413 - 8, class119.field1702 + -8);
        }
        if (arg3 == -14032) {
            if (class73.field880 == 2) {
                class115.field1579[class97.field1298 / 100 + 4].method848(class285.field4413 - 8, class119.field1702 + -8);
            }
            method226(-3063);
        }
    }

    @OriginalMember(owner = "client!w", name = "e", descriptor = "(I)V")
    public static final void method232(int arg0) {
        field447++;
        if (arg0 != 0) {
            method230(38);
        }
        if (class75.field899 != null) {
            class57 var1 = class75.field899;
            synchronized (class75.field899) {
                class75.field899 = null;
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(II)V")
    public final void method233(int arg0, int arg1) {
        if (arg1 != -5227) {
            method230(-101);
        }
        field435++;
        if (this.field436) {
            return;
        }
        this.field424 += arg0;
        while (this.field428.field4081[this.field446] < this.field424) {
            this.field424 -= this.field428.field4081[this.field446];
            this.field446++;
            if (this.field446 >= this.field428.field4072.length) {
                this.field436 = true;
                break;
            }
        }
        if (!this.field436) {
            class270.method1730(this.field446, this.field425, this.field430, (byte) 106, this.field428, false);
        }
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(B)I")
    public static final int method234(byte arg0) {
        field423++;
        return arg0 < 90 ? -61 : class39.field466.method69(21);
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "(IIIIIII)V")
    public class37(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field448 = arg4;
        this.field441 = arg1;
        this.field438 = arg5 + arg6;
        this.field430 = arg3;
        this.field425 = arg2;
        this.field443 = arg0;
        int var8 = class189.method1246(this.field443, (byte) -20).field1382;
        if (var8 == -1) {
            this.field436 = true;
        } else {
            this.field436 = false;
            this.field428 = class27.method165(var8, (byte) -119);
        }
        if (this.field438 == arg6) {
            class270.method1730(this.field446, this.field425, this.field430, (byte) -122, this.field428, false);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIIIIJILqd;)V")
    public final void method235(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class162 arg10) {
        class106 var13 = this.method225(-1);
        field429++;
        if (var13 != null) {
            var13.method235(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field437);
            this.field440 = var13.method227();
        }
    }
}
