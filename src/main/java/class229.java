import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class229 extends class103 {

    @OriginalMember(owner = "client!r", name = "t", descriptor = "[I")
    public static int[] field4049 = new int[64];

    @OriginalMember(owner = "client!r", name = "s", descriptor = "Lvf;")
    public static class265 field4048 = class87.method582(-46, "Continuer");

    @OriginalMember(owner = "client!r", name = "u", descriptor = "[I")
    public static int[] field4050 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!r", name = "w", descriptor = "Lvf;")
    public static class265 field4052 = class87.method582(-46, "Ausw-=hlen");

    @OriginalMember(owner = "client!r", name = "v", descriptor = "I")
    public static int field4051 = 0;

    @OriginalMember(owner = "client!r", name = "x", descriptor = "I")
    public static int field4053;

    @OriginalMember(owner = "client!r", name = "z", descriptor = "I")
    public int field4055;

    @OriginalMember(owner = "client!r", name = "A", descriptor = "I")
    public static int field4056;

    @OriginalMember(owner = "client!r", name = "B", descriptor = "I")
    public static int field4057;

    @OriginalMember(owner = "client!r", name = "C", descriptor = "I")
    public static int field4058;

    @OriginalMember(owner = "client!r", name = "D", descriptor = "I")
    public static int field4059;

    @OriginalMember(owner = "client!r", name = "r", descriptor = "Lvf;")
    public class265 field4047;

    @OriginalMember(owner = "client!r", name = "y", descriptor = "Lvf;")
    public class265 field4054;

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(B)V")
    public static final void method1549(byte arg0) {
        class178.field3174 = new class6[class245.field4276.method1315(arg0 ^ -101)][];
        if (arg0 != -101) {
            field4052 = null;
        }
        ++field4058;
        class263.field4594 = new boolean[class245.field4276.method1315(arg0 + 101)];
    }

    @OriginalMember(owner = "client!r", name = "d", descriptor = "(I)Lw;")
    public final class230 method1550(int arg0) {
        if (arg0 != 100) {
            field4051 = 19;
        }
        ++field4053;
        return class55.field1131[super.field1836];
    }

    @OriginalMember(owner = "client!r", name = "e", descriptor = "(I)V")
    public static final void method1551(int arg0) {
        ++field4056;
        class82.field1547 = 0;
        class10.field339 = 0;
        class241.field4199 = arg0;
        class17.field473 = false;
        class102.field1798 = -3;
        class122.field2189 = 1;
        class204.field3656 = -1;
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(B)V")
    public static void method1552(byte arg0) {
        field4049 = null;
        field4050 = null;
        field4052 = null;
        if (arg0 != -107) {
            method1552((byte) -103);
        }
        field4048 = null;
    }

    @OriginalMember(owner = "client!r", name = "d", descriptor = "(B)I")
    public static final int method1553(byte arg0) {
        ++field4057;
        try {
            if (arg0 != 111) {
                return 110;
            } else {
                if (class7.field262 == 0) {
                    if (~(class136.method950(8954) + -5000L) > ~class39.field896) {
                        return 0;
                    }
                    class278.field4913 = class281.field4957.method1533(0, class82.field1549, class265.field4613);
                    class43.field960 = class136.method950(8954);
                    class7.field262 = 1;
                }
                if (class136.method950(arg0 + 8843) > class43.field960 + 30000L) {
                    return class5.method32(1000, 0);
                } else {
                    if (class7.field262 == 1) {
                        if (~class278.field4913.field1996 == -3) {
                            return class5.method32(1001, 0);
                        }
                        if (class278.field4913.field1996 != 1) {
                            return -1;
                        }
                        class197.field3520 = new class143((Socket) class278.field4913.field1997, class281.field4957);
                        class55.field1133.field2449 = 0;
                        class278.field4913 = null;
                        int var1 = 0;
                        if (class76.field1465) {
                            var1 = class183.field3254;
                        }
                        class55.field1133.method903((byte) 36, 0);
                        class55.field1133.method898((byte) 98, var1);
                        class197.field3520.method982(0, true, class55.field1133.field2483, class55.field1133.field2449);
                        if (class238.field4145 != null) {
                            class238.field4145.method675(0);
                        }
                        if (class30.field774 != null) {
                            class30.field774.method675(0);
                        }
                        int var2 = class197.field3520.method985((byte) 70);
                        if (class238.field4145 != null) {
                            class238.field4145.method675(0);
                        }
                        if (class30.field774 != null) {
                            class30.field774.method675(0);
                        }
                        if (~var2 != -1) {
                            return class5.method32(var2, 0);
                        }
                        class7.field262 = 2;
                    }
                    if (class7.field262 == 2) {
                        if (~class197.field3520.method987((byte) 53) > -3) {
                            return -1;
                        }
                        class81.field1536 = class197.field3520.method985((byte) 70);
                        class81.field1536 <<= 8;
                        class81.field1536 += class197.field3520.method985((byte) 70);
                        class161.field2937 = 0;
                        class7.field262 = 3;
                        class30.field753 = new byte[class81.field1536];
                    }
                    if (class7.field262 == 3) {
                        int var3 = class197.field3520.method987((byte) 53);
                        if (var3 < 1) {
                            return -1;
                        } else {
                            if (~(-class161.field2937 + class81.field1536) > ~var3) {
                                var3 = -class161.field2937 + class81.field1536;
                            }
                            class197.field3520.method986(var3, class161.field2937, class30.field753, 13418);
                            class161.field2937 += var3;
                            if (~class161.field2937 > ~class81.field1536) {
                                return -1;
                            } else if (!class178.method1163((byte) 48, class30.field753)) {
                                return class5.method32(1002, arg0 ^ 111);
                            } else {
                                class52.field1091 = new class229[class16.field464];
                                int var4 = 0;
                                for (int var5 = class182.field3233; ~class179.field3187 <= ~var5; ++var5) {
                                    class229 var6 = class258.method1703((byte) -111, var5);
                                    if (var6 != null) {
                                        class52.field1091[var4++] = var6;
                                    }
                                }
                                class197.field3520.method990(4);
                                class7.field262 = 0;
                                class30.field753 = null;
                                class134.field2421 = 0;
                                class197.field3520 = null;
                                class39.field896 = class136.method950(arg0 + 8843);
                                return 0;
                            }
                        }
                    } else {
                        return -1;
                    }
                }
            }
        } catch (IOException var7) {
            return class5.method32(1003, arg0 + -111);
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ZI)V")
    public static final void method1554(boolean arg0, int arg1) {
        if (!arg0) {
            field4050 = null;
        }
        ++field4059;
        class174.field3125 = -1;
        if (arg1 != 37) {
            if (~arg1 == -51) {
                class144.field2687 = 4.0F;
            } else if (arg1 == 75) {
                class144.field2687 = 6.0F;
            } else if (arg1 == 100) {
                class144.field2687 = 8.0F;
            } else if (~arg1 == -201) {
                class144.field2687 = 16.0F;
            }
        } else {
            class144.field2687 = 3.0F;
        }
        class174.field3125 = -1;
    }
}
