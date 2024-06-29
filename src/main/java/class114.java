import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class114 extends class129 {

    @OriginalMember(owner = "client!tb", name = "Q", descriptor = "I")
    private int field2769 = 0;

    @OriginalMember(owner = "client!tb", name = "db", descriptor = "[I")
    private int[] field2781 = new int[6];

    @OriginalMember(owner = "client!tb", name = "gb", descriptor = "I")
    public int field2784 = -1;

    @OriginalMember(owner = "client!tb", name = "Z", descriptor = "I")
    private int field2777 = 128;

    @OriginalMember(owner = "client!tb", name = "jb", descriptor = "I")
    private int field2787 = 0;

    @OriginalMember(owner = "client!tb", name = "X", descriptor = "I")
    private int field2775 = 0;

    @OriginalMember(owner = "client!tb", name = "pb", descriptor = "[I")
    private int[] field2793 = new int[6];

    @OriginalMember(owner = "client!tb", name = "Y", descriptor = "I")
    private int field2776 = 128;

    @OriginalMember(owner = "client!tb", name = "R", descriptor = "Lv;")
    private static class122 field2770 = class55.method425(-105, "Please wait)3)3)3");

    @OriginalMember(owner = "client!tb", name = "nb", descriptor = "Lv;")
    public static class122 field2791 = class55.method425(-97, "leuchten1:");

    @OriginalMember(owner = "client!tb", name = "mb", descriptor = "Lv;")
    public static class122 field2790 = class55.method425(-118, "Ung\u001c1ltige Verbindung mit einem Anmelde)2Server)3");

    @OriginalMember(owner = "client!tb", name = "sb", descriptor = "Z")
    public static boolean field2796 = false;

    @OriginalMember(owner = "client!tb", name = "ub", descriptor = "Lv;")
    public static class122 field2798 = class55.method425(-117, "Benutzen");

    @OriginalMember(owner = "client!tb", name = "xb", descriptor = "Lv;")
    public static class122 field2801 = class55.method425(-73, " (X");

    @OriginalMember(owner = "client!tb", name = "ab", descriptor = "Lv;")
    public static class122 field2778 = field2770;

    @OriginalMember(owner = "client!tb", name = "cb", descriptor = "Lv;")
    public static class122 field2780 = class55.method425(-56, "runes");

    @OriginalMember(owner = "client!tb", name = "S", descriptor = "I")
    public static int field2771;

    @OriginalMember(owner = "client!tb", name = "T", descriptor = "I")
    public static int field2772;

    @OriginalMember(owner = "client!tb", name = "U", descriptor = "I")
    public static int field2773;

    @OriginalMember(owner = "client!tb", name = "W", descriptor = "I")
    private int field2774;

    @OriginalMember(owner = "client!tb", name = "bb", descriptor = "I")
    public static int field2779;

    @OriginalMember(owner = "client!tb", name = "eb", descriptor = "I")
    public static int field2782;

    @OriginalMember(owner = "client!tb", name = "fb", descriptor = "I")
    public static int field2783;

    @OriginalMember(owner = "client!tb", name = "hb", descriptor = "I")
    public int field2785;

    @OriginalMember(owner = "client!tb", name = "ib", descriptor = "I")
    public static int field2786;

    @OriginalMember(owner = "client!tb", name = "kb", descriptor = "I")
    public static int field2788;

    @OriginalMember(owner = "client!tb", name = "lb", descriptor = "I")
    public static int field2789;

    @OriginalMember(owner = "client!tb", name = "ob", descriptor = "I")
    public static int field2792;

    @OriginalMember(owner = "client!tb", name = "qb", descriptor = "I")
    public static int field2794;

    @OriginalMember(owner = "client!tb", name = "rb", descriptor = "I")
    public static int field2795;

    @OriginalMember(owner = "client!tb", name = "tb", descriptor = "I")
    public static int field2797;

    @OriginalMember(owner = "client!tb", name = "vb", descriptor = "I")
    public static int field2799;

    @OriginalMember(owner = "client!tb", name = "wb", descriptor = "I")
    public static int field2800;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IB)Llb;", line = 8)
    public final class68 method868(int arg0, byte arg1) {
        if (arg1 >= -23) {
            return null;
        }
        class68 var3 = (class68) class28.field708.method436(-98, (long) this.field2785);
        field2773++;
        if (var3 == null) {
            var3 = class68.method544(class5.field120, this.field2774, 0);
            if (var3 == null) {
                return null;
            }
            for (int var4 = 0; var4 < 6; var4++) {
                if (this.field2793[0] != 0) {
                    var3.method560(this.field2793[var4], this.field2781[var4]);
                }
            }
            var3.method540();
            var3.method548(this.field2787 + 64, 850 - -this.field2775, -30, -50, -30, true);
            class28.field708.method437((long) this.field2785, var3, (byte) 69);
        }
        class68 var5;
        if (this.field2784 == -1 || arg0 == -1) {
            var5 = var3.method546(true);
        } else {
            var5 = class51.method401(-30325, this.field2784).method701(var3, arg0, -128);
        }
        if (this.field2777 != 128 || this.field2776 != 128) {
            var5.method552(this.field2777, this.field2776, this.field2777);
        }
        if (this.field2769 != 0) {
            if (this.field2769 == 90) {
                var5.method555();
            }
            if (this.field2769 == 180) {
                var5.method555();
                var5.method555();
            }
            if (this.field2769 == 270) {
                var5.method555();
                var5.method555();
                var5.method555();
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lid;", line = 79)
    public static final class52 method869(Throwable arg0, String arg1) {
        class52 var2;
        if (arg0 instanceof class52) {
            var2 = (class52) arg0;
            var2.field1345 = var2.field1345 + ' ' + arg1;
        } else {
            var2 = new class52(arg0, arg1);
        }
        field2771++;
        return var2;
    }

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "(I)V", line = 103)
    public static final void method870(int arg0) {
        if (class113.field2759 != null) {
            class113.field2759.method586(96);
        }
        if (arg0 <= 4) {
            method875((byte) -97);
        }
        field2795++;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lab;B)V", line = 123)
    public static final void method871(class3 arg0, byte arg1) {
        for (int var2 = 0; var2 < class89.field2274.length; var2++) {
            class89.field2274[var2] = 0;
        }
        short var3 = 256;
        if (arg1 != -11) {
            method877(null, null, (byte) -32, null);
        }
        for (int var4 = 0; var4 < 5000; var4++) {
            int var16 = (int) (Math.random() * 128.0D * (double) var3);
            class89.field2274[var16] = (int) (Math.random() * 256.0D);
        }
        field2789++;
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var12 = 1; var12 < var3 - 1; var12++) {
                for (int var14 = 1; var14 < 127; var14++) {
                    int var15 = (var12 << 7) + var14;
                    class122.field2985[var15] = (class89.field2274[var15 - 1] + class89.field2274[var15 + 1] + class89.field2274[var15 + 128] + class89.field2274[var15 + -128]) / 4;
                }
            }
            int[] var13 = class89.field2274;
            class89.field2274 = class122.field2985;
            class122.field2985 = var13;
        }
        if (arg0 == null) {
            return;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < arg0.field93; var7++) {
            for (int var8 = 0; var8 < arg0.field99; var8++) {
                if (arg0.field98[var6++] != 0) {
                    int var9 = var8 + arg0.field100 + 16;
                    int var10 = var7 + arg0.field95 + 16;
                    int var11 = var9 + (var10 << 7);
                    class89.field2274[var11] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IILkd;)V", line = 218)
    private final void method872(int arg0, int arg1, class64 arg2) {
        if (arg1 == 1) {
            this.field2774 = arg2.method506((byte) -90);
        } else if (arg1 == 2) {
            this.field2784 = arg2.method506((byte) -90);
        } else if (arg1 == 4) {
            this.field2777 = arg2.method506((byte) -90);
        } else if (arg1 == 5) {
            this.field2776 = arg2.method506((byte) -90);
        } else if (arg1 == 6) {
            this.field2769 = arg2.method506((byte) -90);
        } else if (arg1 == 7) {
            this.field2787 = arg2.method520(-109);
        } else if (arg1 == 8) {
            this.field2775 = arg2.method520(-113);
        } else if (arg1 >= 40 && arg1 < 50) {
            this.field2793[arg1 - 40] = arg2.method506((byte) -90);
        } else if (arg1 >= 50 && arg1 < 60) {
            this.field2781[arg1 - 50] = arg2.method506((byte) -90);
        }
        field2783++;
        if (arg0 > -117) {
            method880(-55, -95L);
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(Lbd;I)V", line = 270)
    public static final void method873(class11 arg0, int arg1) {
        field2779++;
        if (arg0.field294 == 0) {
            return;
        }
        if (arg0.field323 != -1 && arg0.field323 < 32768) {
            class80 var2 = class94.field2423[arg0.field323];
            if (var2 != null) {
                int var3 = arg0.field343 - var2.field343;
                int var4 = arg0.field349 - var2.field349;
                if (var3 != 0 || var4 != 0) {
                    arg0.field280 = (int) (Math.atan2((double) var3, (double) var4) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0.field323 >= 32768) {
            int var5 = arg0.field323 - 32768;
            if (class55.field1435 == var5) {
                var5 = 2047;
            }
            class55 var6 = class125.field3043[var5];
            if (var6 != null) {
                int var7 = arg0.field343 - var6.field343;
                int var8 = arg0.field349 - var6.field349;
                if (var7 != 0 || var8 != 0) {
                    arg0.field280 = (int) (Math.atan2((double) var7, (double) var8) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg1 != -26006) {
            return;
        }
        if ((arg0.field321 != 0 || arg0.field327 != 0) && (arg0.field285 == 0 || arg0.field342 > 0)) {
            int var9 = arg0.field343 - (arg0.field321 - class2.field77 - class2.field77) * 64;
            int var10 = arg0.field349 - (arg0.field327 - class51.field1286 - class51.field1286) * 64;
            if (var9 != 0 || var10 != 0) {
                arg0.field280 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
            }
            arg0.field321 = 0;
            arg0.field327 = 0;
        }
        int var11 = arg0.field280 - arg0.field299 & 0x7FF;
        if (var11 == 0) {
            return;
        }
        if (arg0.field294 > var11 || var11 > 2048 - arg0.field294) {
            arg0.field299 = arg0.field280;
        } else if (var11 <= 1024) {
            arg0.field299 += arg0.field294;
        } else {
            arg0.field299 -= arg0.field294;
        }
        arg0.field299 &= 0x7FF;
        if (arg0.field305 != arg0.field297 || arg0.field299 == arg0.field280) {
            return;
        }
        if (arg0.field345 == -1) {
            arg0.field305 = arg0.field279;
            return;
        }
        arg0.field305 = arg0.field345;
        return;
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "(B)V", line = 371)
    public static final void method874(byte arg0) {
        field2797++;
        class131.field3140.method54(true);
        if (arg0 != -11) {
            return;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            class74.field1983[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class69.field1821[var2] = 0L;
        }
        class7.field173 = 0;
    }

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "(B)V", line = 398)
    public static final void method875(byte arg0) {
        int var1 = 45 % ((-arg0 - 4) / 44);
        field2799++;
        if (class57.field1506.toLowerCase().indexOf("microsoft") != -1) {
            class4.field106[186] = 57;
            class4.field106[187] = 27;
            class4.field106[188] = 71;
            class4.field106[189] = 26;
            class4.field106[190] = 72;
            class4.field106[191] = 73;
            class4.field106[192] = 58;
            class4.field106[219] = 42;
            class4.field106[220] = 74;
            class4.field106[221] = 43;
            class4.field106[222] = 59;
            class4.field106[223] = 28;
            return;
        }
        class4.field106[44] = 71;
        class4.field106[45] = 26;
        class4.field106[46] = 72;
        class4.field106[47] = 73;
        class4.field106[59] = 57;
        class4.field106[61] = 27;
        class4.field106[91] = 42;
        class4.field106[92] = 74;
        class4.field106[93] = 43;
        if (class57.field1505 == null) {
            class4.field106[192] = 58;
            class4.field106[222] = 59;
        } else {
            class4.field106[192] = 28;
            class4.field106[222] = 58;
            class4.field106[520] = 59;
        }
    }

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "(B)V", line = 448)
    public static void method876(byte arg0) {
        field2791 = null;
        field2770 = null;
        field2778 = null;
        field2801 = null;
        if (arg0 != 99) {
            method876((byte) -56);
        }
        field2790 = null;
        field2798 = null;
        field2780 = null;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lmb;Lmb;BLmb;)V", line = 474)
    public static final void method877(class74 arg0, class74 arg1, byte arg2, class74 arg3) {
        class83.field2152 = arg3;
        field2788++;
        class63.field1597 = arg1;
        if (arg2 <= 41) {
            method877(null, null, (byte) 3, null);
        }
        class50.field1278 = arg0;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lkd;I)V", line = 497)
    public final void method878(class64 arg0, int arg1) {
        if (arg1 >= -66) {
            this.field2776 = 110;
        }
        field2792++;
        while (true) {
            int var3 = arg0.method520(-125);
            if (var3 == 0) {
                return;
            }
            this.method872(-120, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lmb;ZLmb;)V", line = 523)
    public static final void method879(class74 arg0, boolean arg1, class74 arg2) {
        field2800++;
        class5.field120 = arg0;
        class62.field1590 = arg2;
        if (arg1) {
            field2770 = null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(IJ)V", line = 561)
    public static final void method880(int arg0, long arg1) {
        field2786++;
        if (arg1 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class25.field683; var3++) {
            if (class129.field3133[var3] == arg1) {
                class62.field1588 = true;
                class60.field1541++;
                class25.field683--;
                for (int var4 = var3; var4 < class25.field683; var4++) {
                    class129.field3133[var4] = class129.field3133[var4 + 1];
                }
                class74.field1935.method996((byte) 109, 107);
                class74.field1935.method480(arg1, 299629920);
                break;
            }
        }
        if (arg0 != 107) {
            method877(null, null, (byte) 58, null);
        }
    }

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "(B)V", line = 601)
    public static final void method881(byte arg0) {
        class72.method591(31960);
        class51.method406((byte) -128);
        class88.method691(122);
        class19.method189(arg0 ^ 0x10);
        field2782++;
        class40.method343((byte) 127);
        class24.method250(-22998);
        if (arg0 != -123) {
            field2780 = null;
        }
        class47.method384(-32);
        class37.method329(arg0 ^ 0x7C);
        class40.method346(false);
        class89.method704(arg0 ^ 0xFFFFFF87);
        class109.method844(-1);
        class100.method772((byte) 92);
        ((class23) class77.field2067).method244(107);
        class22.field599.method627(-24653);
        class108.field2673.method627(arg0 - 24530);
        class63.field1605.method627(-24653);
        class24.field662.method627(-24653);
        class59.field1531.method627(-24653);
        class93.field2396.method627(arg0 ^ 0x6036);
        class28.field715.method627(-24653);
        class16.field397.method627(arg0 ^ 0x6036);
        client.field453.method627(arg0 ^ 0x6036);
        class70.field1845.method627(-24653);
        class34.field868.method627(-24653);
    }
}
