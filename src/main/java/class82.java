import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class82 {

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "[I")
    public static int[] field1186 = new int[500];

    @OriginalMember(owner = "client!oi", name = "l", descriptor = "Ljava/lang/String;")
    public static String field1191 = "yellow:";

    @OriginalMember(owner = "client!oi", name = "m", descriptor = "Ljava/lang/String;")
    public static String field1192 = "Loaded input handler";

    @OriginalMember(owner = "client!oi", name = "p", descriptor = "I")
    public static int field1195 = 0;

    @OriginalMember(owner = "client!oi", name = "n", descriptor = "Ljava/lang/String;")
    public static String field1193 = "wave:";

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "F")
    public static float field1180;

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "I")
    public int field1181;

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "I")
    public static int field1182;

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "I")
    public static int field1183;

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "I")
    public static int field1184;

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "I")
    public int field1185;

    @OriginalMember(owner = "client!oi", name = "i", descriptor = "I")
    public int field1188;

    @OriginalMember(owner = "client!oi", name = "j", descriptor = "I")
    public static int field1189;

    @OriginalMember(owner = "client!oi", name = "k", descriptor = "I")
    public static int field1190;

    @OriginalMember(owner = "client!oi", name = "o", descriptor = "I")
    public static int field1194;

    @OriginalMember(owner = "client!oi", name = "h", descriptor = "Lqi;")
    public static class131 field1187;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(III)Lgk;")
    public static final class159 method596(int arg0, int arg1, int arg2) {
        class286 var3 = class220.field3525[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class159 var4 = var3.field4518;
            var3.field4518 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ZI)V")
    public static final void method597(boolean arg0, int arg1) {
        class33.field417 = null;
        class253.field4183 = null;
        class121.field1767 = null;
        class108.field1564 = null;
        class267.field4310 = null;
        int var2 = 41 % ((arg1 - 28) / 50);
        class122.field1784 = null;
        class256.field4218 = null;
        class208.field3338 = null;
        class24.field280 = null;
        class252.field4162 = null;
        if (arg0 && class222.field3551 != null) {
            class252.field4166 = class222.field3551.field3545;
        } else {
            class252.field4166 = -1;
        }
        field1194++;
        class222.field3551 = null;
        class101.field1498 = 0;
        class56.field806.method1382(0);
        class29.field339 = -1;
        class96.field1423 = null;
        class112.field1613 = -1;
        class296.field4688 = null;
        class112.field1616 = null;
        class213.field3411 = null;
        class156.field2567 = null;
        class238.field3803 = null;
        class10.field103 = null;
        class10.field115 = null;
        class21.field237 = null;
        class63.field940 = null;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)V")
    public static void method598(int arg0) {
        field1192 = null;
        if (arg0 != 0) {
            method596(59, -93, 29);
        }
        field1191 = null;
        field1186 = null;
        field1187 = null;
        field1193 = null;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ILv;Z)V")
    private final void method599(int arg0, class152 arg1, boolean arg2) {
        if (!arg2) {
            this.field1188 = 122;
        }
        field1184++;
        if (arg0 == 1) {
            this.field1188 = arg1.method1126(false);
            this.field1181 = arg1.method1111(255);
            this.field1185 = arg1.method1111(255);
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "()V")
    public static final void method600() {
        class274.field4408 = 0;
        label191: for (int var0 = 0; var0 < class191.field3083; var0++) {
            class174 var1 = class250.field4153[var0];
            if (class216.field3427 != null) {
                for (int var2 = 0; var2 < class216.field3427.length; var2++) {
                    if (class216.field3427[var2] != -1000000 && (var1.field2827 <= class216.field3427[var2] || var1.field2840 <= class216.field3427[var2]) && (var1.field2828 <= class273.field4387[var2] || var1.field2824 <= class273.field4387[var2]) && (var1.field2828 >= class27.field318[var2] || var1.field2824 >= class27.field318[var2]) && (var1.field2835 <= class243.field3892[var2] || var1.field2839 <= class243.field3892[var2]) && (var1.field2835 >= class62.field901[var2] || var1.field2839 >= class62.field901[var2])) {
                        continue label191;
                    }
                }
            }
            if (var1.field2822 == 1) {
                int var3 = var1.field2844 + class263.field4276 - class24.field278;
                if (var3 >= 0 && var3 <= class263.field4276 + class263.field4276) {
                    int var4 = var1.field2842 + class263.field4276 - class52.field768;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field2821 + class263.field4276 - class52.field768;
                    if (var5 > class263.field4276 + class263.field4276) {
                        var5 = class263.field4276 + class263.field4276;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class290.field4603[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class204.field3277 - var1.field2828;
                        if (var7 > 32) {
                            var1.field2823 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field2823 = 2;
                            var7 = -var7;
                        }
                        var1.field2831 = (var1.field2835 - class108.field1566 << 8) / var7;
                        var1.field2846 = (var1.field2839 - class108.field1566 << 8) / var7;
                        var1.field2829 = (var1.field2827 - class244.field3960 << 8) / var7;
                        var1.field2841 = (var1.field2840 - class244.field3960 << 8) / var7;
                        class85.field1238[class274.field4408++] = var1;
                    }
                }
            } else if (var1.field2822 == 2) {
                int var8 = var1.field2842 + class263.field4276 - class52.field768;
                if (var8 >= 0 && var8 <= class263.field4276 + class263.field4276) {
                    int var9 = var1.field2844 + class263.field4276 - class24.field278;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field2830 + class263.field4276 - class24.field278;
                    if (var10 > class263.field4276 + class263.field4276) {
                        var10 = class263.field4276 + class263.field4276;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class290.field4603[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class108.field1566 - var1.field2835;
                        if (var12 > 32) {
                            var1.field2823 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field2823 = 4;
                            var12 = -var12;
                        }
                        var1.field2826 = (var1.field2828 - class204.field3277 << 8) / var12;
                        var1.field2837 = (var1.field2824 - class204.field3277 << 8) / var12;
                        var1.field2829 = (var1.field2827 - class244.field3960 << 8) / var12;
                        var1.field2841 = (var1.field2840 - class244.field3960 << 8) / var12;
                        class85.field1238[class274.field4408++] = var1;
                    }
                }
            } else if (var1.field2822 == 4) {
                int var13 = var1.field2827 - class244.field3960;
                if (var13 > 128) {
                    int var14 = var1.field2842 + class263.field4276 - class52.field768;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field2821 + class263.field4276 - class52.field768;
                    if (var15 > class263.field4276 + class263.field4276) {
                        var15 = class263.field4276 + class263.field4276;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field2844 + class263.field4276 - class24.field278;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field2830 + class263.field4276 - class24.field278;
                        if (var17 > class263.field4276 + class263.field4276) {
                            var17 = class263.field4276 + class263.field4276;
                        }
                        boolean var18 = false;
                        label163: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class290.field4603[var19][var20]) {
                                    var18 = true;
                                    break label163;
                                }
                            }
                        }
                        if (var18) {
                            var1.field2823 = 5;
                            var1.field2826 = (var1.field2828 - class204.field3277 << 8) / var13;
                            var1.field2837 = (var1.field2824 - class204.field3277 << 8) / var13;
                            var1.field2831 = (var1.field2835 - class108.field1566 << 8) / var13;
                            var1.field2846 = (var1.field2839 - class108.field1566 << 8) / var13;
                            class85.field1238[class274.field4408++] = var1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ILv;)V")
    public final void method601(int arg0, class152 arg1) {
        if (arg0 > -56) {
            field1186 = null;
        }
        while (true) {
            int var3 = arg1.method1111(255);
            if (var3 == 0) {
                field1190++;
                return;
            }
            this.method599(var3, arg1, true);
        }
    }
}
