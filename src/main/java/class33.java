import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bt")
public class class33 implements class154 {

    @OriginalMember(owner = "client!bt", name = "p", descriptor = "I")
    public static int field662 = 104;

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "I")
    public static int field647;

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "I")
    public static int field648;

    @OriginalMember(owner = "client!bt", name = "d", descriptor = "I")
    public int field650;

    @OriginalMember(owner = "client!bt", name = "e", descriptor = "I")
    public static int field651;

    @OriginalMember(owner = "client!bt", name = "f", descriptor = "I")
    public static int field652;

    @OriginalMember(owner = "client!bt", name = "g", descriptor = "I")
    public int field653;

    @OriginalMember(owner = "client!bt", name = "h", descriptor = "I")
    public int field654;

    @OriginalMember(owner = "client!bt", name = "i", descriptor = "I")
    public int field655;

    @OriginalMember(owner = "client!bt", name = "j", descriptor = "I")
    public static int field656;

    @OriginalMember(owner = "client!bt", name = "k", descriptor = "I")
    public int field657;

    @OriginalMember(owner = "client!bt", name = "l", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!bt", name = "m", descriptor = "I")
    public int field659;

    @OriginalMember(owner = "client!bt", name = "n", descriptor = "I")
    public static int field660;

    @OriginalMember(owner = "client!bt", name = "o", descriptor = "I")
    public static int field661;

    @OriginalMember(owner = "client!bt", name = "c", descriptor = "Z")
    public boolean field649;

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(Z)V", line = 3)
    public static final void method349(boolean arg0) {
        field661++;
        class346 var1 = null;
        try {
            class324 var2 = class368.field5553.method1856(0, "2");
            while (var2.field4940 == 0) {
                class71.method583(1L, 111);
            }
            if (!arg0) {
                method355(-81);
            }
            if (var2.field4940 == 1) {
                var1 = (class346) var2.field4939;
                class145 var3 = new class145((class358.field5443 * 6) + 3);
                var3.method1109(false, 1);
                var3.method1094(1618659784, class358.field5443);
                for (int var4 = 0; var4 < class170.field2629.length; var4++) {
                    if (class255.field3672[var4]) {
                        var3.method1094(1618659784, var4);
                        var3.method1117(class170.field2629[var4], (byte) 12);
                    }
                }
                var1.method2202(var3.field2270, 125, 0, var3.field2289);
            }
        } catch (Exception var6) {
        }
        try {
            if (var1 != null) {
                var1.method2199((byte) -122);
            }
        } catch (Exception var5) {
        }
        class290.field4125 = class211.method1419(12921);
        class310.field4724 = false;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(BII)Z", line = 59)
    public static final boolean method350(byte arg0, int arg1, int arg2) {
        field647++;
        if (arg0 != 68) {
            field662 = 33;
        }
        return (class315.method2052((byte) -43, arg2, arg1) | class53.method472(-1, arg2, arg1) | class21.method176(-94, arg2, arg1)) & class447.method2676(arg1, arg2, -1);
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", line = 76)
    public static final String method351(String arg0, int arg1) {
        field651++;
        if (arg0 == null) {
            return null;
        }
        int var2 = -6 / ((-arg1 - 9) / 44);
        int var3 = 0;
        int var4 = arg0.length();
        while (var4 > var3 && class174.method1255(90, arg0.charAt(var3))) {
            var3++;
        }
        while (var3 < var4 && class174.method1255(88, arg0.charAt(var4 - 1))) {
            var4--;
        }
        int var5 = var4 - var3;
        if (var5 < 1 || var5 > 12) {
            return null;
        }
        StringBuffer var6 = new StringBuffer(var5);
        for (int var7 = var3; var7 < var4; var7++) {
            char var8 = arg0.charAt(var7);
            if (class141.method1050((byte) -123, var8)) {
                char var9 = class50.method460(110, var8);
                if (var9 != '\u0000') {
                    var6.append(var9);
                }
            }
        }
        if (var6.length() == 0) {
            return null;
        } else {
            return var6.toString();
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(ILue;)Z", line = 130)
    public final boolean method352(int arg0, class154 arg1) {
        field648++;
        if (!(arg1 instanceof class33)) {
            return false;
        } else if (arg0 == 24847) {
            class33 var3 = (class33) arg1;
            if (this.field653 != var3.field653) {
                return false;
            } else if (this.field659 != var3.field659) {
                return false;
            } else if (this.field654 != var3.field654) {
                return false;
            } else if (this.field657 != var3.field657) {
                return false;
            } else if (this.field650 != var3.field650) {
                return false;
            } else if (this.field655 == var3.field655) {
                return this.field649 == var3.field649;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(B)V", line = 171)
    public static final void method353(byte arg0) {
        field652++;
        if (arg0 != 22) {
            field662 = -30;
        }
        for (int var1 = 0; var1 < class260.field3784.length; var1++) {
            for (int var2 = 0; var2 < class260.field3784[0].length; var2++) {
                for (int var3 = 0; var3 < class260.field3784[0][0].length; var3++) {
                    class260.field3784[var1][var2][var3] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(I)J", line = 207)
    public final long method354(int arg0) {
        field658++;
        long[] var2 = class108.field1791;
        long var3 = -1L;
        int var5 = -21 % ((arg0 + 26) / 34);
        long var6 = var3 >>> 8 ^ var2[(int) (((long) this.field653 ^ var3) & 0xFFL)];
        long var8 = var6 >>> 8 ^ var2[(int) ((var6 ^ (long) (this.field659 >> 8)) & 0xFFL)];
        long var10 = var2[(int) ((var8 ^ (long) this.field659) & 0xFFL)] ^ var8 >>> 8;
        long var12 = var2[(int) (((long) (this.field654 >> 24) ^ var10) & 0xFFL)] ^ var10 >>> 8;
        long var14 = var2[(int) (((long) (this.field654 >> 16) ^ var12) & 0xFFL)] ^ var12 >>> 8;
        long var16 = var14 >>> 8 ^ var2[(int) ((var14 ^ (long) (this.field654 >> 8)) & 0xFFL)];
        long var18 = var16 >>> 8 ^ var2[(int) (((long) this.field654 ^ var16) & 0xFFL)];
        long var20 = var2[(int) ((var18 ^ (long) this.field657) & 0xFFL)] ^ var18 >>> 8;
        long var22 = var20 >>> 8 ^ var2[(int) (((long) (this.field650 >> 24) ^ var20) & 0xFFL)];
        long var24 = var2[(int) (((long) (this.field650 >> 16) ^ var22) & 0xFFL)] ^ var22 >>> 8;
        long var26 = var2[(int) (((long) (this.field650 >> 8) ^ var24) & 0xFFL)] ^ var24 >>> 8;
        long var28 = var26 >>> 8 ^ var2[(int) ((var26 ^ (long) this.field650) & 0xFFL)];
        long var30 = var28 >>> 8 ^ var2[(int) ((var28 ^ (long) this.field655) & 0xFFL)];
        return var30 >>> 8 ^ var2[(int) ((var30 ^ (long) (this.field649 ? 1 : 0)) & 0xFFL)];
    }

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "(I)V", line = 237)
    public static final void method355(int arg0) {
        class445.field6649.field247 = 1;
        field656++;
        class452.field6752 = 0;
        class489.field7243 = 0;
        class452.field6748 = 0;
        class319.field4835 = 0;
        class518.field7699 = 0;
        class282.field4035 = 0;
        class303.field4439 = 0;
        class487.field7212 = 0;
        class396.field5976 = 0;
        class55.field952 = 0;
        class23.field480 = 0;
        class260.field3773 = 0;
        class214.field3077 = 0;
        class166.field2571 = 0;
        class488.field7225 = 0;
        class214.field3086 = 0;
        class45.field841 = 0;
        class134.field2089 = 0;
        class303.field4375 = 0;
        class362.field5491 = 0;
        class188.field2815 = 0;
        class281.field4020 = 0;
        class250.field3574 = 0;
        class308.field4702 = 0;
        class199.field2920 = 0;
        class455.field6802 = 0;
        class219.field3135 = 0;
        class59.field1046 = 0;
        class89.field1552 = 0;
        class367.field5548 = 0;
        class200.field2926 = 0;
        class290.field4135 = 0;
        class306.field4679 = 0;
        class303.field4315 = 0;
        class145.field2311 = 0;
        class329.field4966 = 0;
        class95.field1604 = 0;
        class2.field95 = 0;
        class165.field2555 = 0;
        client.field2885 = 0;
        class305.field4652 = 0;
        class109.field1834 = 0;
        class442.field6614 = 0;
        class255.field3655 = 0;
        class303.field4460 = 0;
        class318.field4778 = 0;
        class319.field4787 = 0;
        class20.field336 = 0;
        class380.field5739 = 0;
        class124.field2009 = 0;
        class480.field7151 = 0;
        class8.field137 = 0;
        class364.field5509 = 0;
        class213.field3061 = 0;
        class319.field4844 = 0;
        class462.field6911 = 0;
        class421.field6285 = 0;
        class61.field1066 = 0;
        class100.field1646 = 0;
        class259.field3764 = 0;
        class167.field2584 = 0;
        class391.field5920 = 0;
        class455.field6792 = 0;
        class495.field7313 = 0;
        class457.field6829 = 0;
        class88.field1537 = 0;
        class402.field6037 = 0;
        class65.field1111 = 0;
        class523.field7763 = 0;
        class28.field583 = 0;
        class80.field1405 = 0;
        class70.field1220 = 0;
        class303.field4486 = 0;
        class200.field2929 = 0;
        class240.field3470 = 0;
        class370.field5599 = 0;
        class516.field7586 = 0;
        class447.field6712 = 0;
        class506.field7464 = 0;
        class215.field3093 = 0;
        class147.field2356 = 0;
        class413.field6175 = 0;
        class236.field3420 = 0;
        class451.field6745 = 0;
        class246.field3556 = 0;
        class229.field3251 = 0;
        class303.field4485 = 0;
        class255.field3656 = 0;
        class466.field6949 = 0;
        class130.field2068 = 0;
        class348.field5203 = 0;
        class108.field1786 = 0;
        class45.field838 = 0;
        class310.field4728 = 0;
        class17.field261 = 0;
        class284.field4052 = 0;
        class345.field5171 = 0;
        class366.field5530 = 0;
        class337.field5080 = 0;
        class319.field4842 = 0;
        class437.field6531 = 0;
        class23.field479 = 0;
        class270.field3887 = 0;
        field658 = 0;
        class303.field4428 = 0;
        class338.field5086 = 0;
        class161.field2491 = 0;
        class2.field92 = 0;
        class66.field1136 = 0;
        class114.field1902 = 0;
        class203.field2967 = 0;
        class59.field1036 = 0;
        class47.field875 = 0;
        class309.field4720 = 0;
        class457.field6827 = 0;
        class250.field3584 = 0;
        class282.field4031 = 0;
        class201.field2943 = 0;
        class147.field2352 = 0;
        class228.field3242 = 0;
        class36.field688 = 0;
        class79.field1398 = 0;
        class268.field3863 = 0;
        class58.field1030 = 0;
        class75.field1263 = 0;
        class303.field4312 = 0;
        client.field2879 = 0;
        class303.field4316 = 0;
        class330.field4976 = 0;
        class223.field3189 = 0;
        class139.field2227 = 0;
        class328.field4955 = 0;
        class25.field536 = 0;
        class8.field141 = 0;
        class523.field7768 = 0;
        class308.field4701 = 0;
        class65.field1114 = 0;
        class331.field4992 = 0;
        class406.field6080 = 0;
        class103.field1703 = 0;
        class380.field5741 = 0;
        class368.field5559 = 0;
        class499.field7372 = 0;
        class305.field4666 = 0;
        class303.field4360 = 0;
        class79.field1355 = 0;
        class302.field4281 = 0;
        class425.field6332 = 0;
        class338.field5088 = 0;
        class307.field4692 = 0;
        class331.field5012 = 0;
        class32.field646 = 0;
        class316.field4758 = 0;
        class174.field2670 = 0;
        class106.field1771 = 0;
        class281.field4022 = 0;
        class145.field2296 = 0;
        class460.field6903 = 0;
        class40.field726 = 0;
        class86.field1506 = 0;
        class187.field2784 = 0;
        class145.field2293 = 0;
        class419.field6254 = 0;
        class130.field2066 = 0;
        class319.field4843 = 0;
        class319.field4885 = 0;
        class37.field702 = 0;
        class388.field5839 = 0;
        class303.field4374 = 0;
        class515.field7572 = 0;
        class499.field7362 = 0;
        class23.field473 = 0;
        class222.field3179 = 0;
        class426.field6342 = 0;
        class69.field1195 = 0;
        class303.field4408 = 0;
        class369.field5582 = 0;
        class153.field2427 = 0;
        class303.field4385 = 0;
        class381.field5777 = 0;
        class268.field3847 = 0;
        class104.field1734 = 0;
        class406.field6078 = 0;
        class261.field3791 = 0;
        class123.field2001 = 0;
        class99.field1636 = 0;
        class79.field1363 = 0;
        class17.field281 = 0;
        class466.field6965 = 0;
        class380.field5770 = 0;
        class319.field4786 = 0;
        class361.field5471 = 0;
        class348.field5200 = 0;
        class319.field4793 = 0;
        class123.field1996 = 0;
        class528.field7792 = 0;
        class168.field2613 = 0;
        class252.field3600 = 0;
        class499.field7364 = 0;
        class91.field1570 = 0;
        class272.field3921 = 0;
        class303.field4359 = 0;
        class492.field7269 = 0;
        class171.field2644 = 0;
        class14.field231 = 0;
        class179.field2708 = 0;
        class345.field5174 = 0;
        class229.field3257 = 0;
        class145.field2271 = 0;
        class303.field4361 = 0;
        class55.field953 = 0;
        class99.field1637 = 0;
        class488.field7223 = 0;
        class457.field6840 = 0;
        class504.field7443 = 0;
        class240.field3441 = 0;
        class389.field5847 = 0;
        class350.field5372 = 0;
        class122.field1981 = 0;
        class183.field2744 = 0;
        class303.field4339 = 0;
        class201.field2940 = 0;
        class9.field150 = 0;
        class152.field2409 = 0;
        class305.field4663 = 0;
        class448.field6719 = 0;
        class54.field929 = 0;
        class17.field256 = 0;
        class63.field1085 = 0;
        class28.field587 = 0;
        class430.field6396 = 0;
        class66.field1131 = 0;
        class380.field5754 = 0;
        class22.field439 = 0;
        class406.field6081 = 0;
        class390.field5871 = 0;
        class303.field4405 = 0;
        class260.field3778 = 0;
        class259.field3761 = 0;
        class103.field1697 = 0;
        class321.field4909 = 0;
        class96.field1613 = 0;
        class369.field5590 = 0;
        class378.field5713 = 0;
        class28.field592 = 0;
        class171.field2641 = 0;
        class470.field7019 = 0;
        class331.field4990 = 0;
        class390.field5867 = 0;
        class363.field5502 = 0;
        class424.field6326 = 0;
        class303.field4445 = 0;
        class433.field6432 = 0;
        class153.field2424 = 0;
        class36.field684 = 0;
        class213.field3059 = 0;
        class57.field1000 = 0;
        class19.field310 = 0;
        class121.field1960 = 0;
        class214.field3078 = 0;
        class474.field7093 = 0;
        class247.field3572 = 0;
        class26.field560 = 0;
        class256.field3702 = 0;
        class321.field4913 = 0;
        class517.field7655 = 0;
        class71.field1236 = 0;
        class350.field5347 = 0;
        class367.field5542 = 0;
        class42.field812 = 0;
        class121.field1965 = 0;
        class11.field167 = 0;
        class286.field4072 = 0;
        class369.field5581 = 0;
        class51.field911 = 0;
        class294.field4189 = 0;
        class299.field4264 = 0;
        class20.field345 = 0;
        class470.field7043 = 0;
        class519.field7719 = 0;
        class152.field2412 = 0;
        class17.field257 = 0;
        class145.field2268 = 0;
        class303.field4448 = 0;
        class66.field1141 = 0;
        class110.field1866 = 0;
        class504.field7441 = 0;
        class162.field2500 = 0;
        class360.field5459 = 0;
        class41.field734 = 0;
        class256.field3705 = 0;
        class153.field2428 = 0;
        class441.field6588 = 0;
        class251.field3589 = 0;
        class86.field1493 = 0;
        class103.field1700 = 0;
        class489.field7231 = 0;
        class263.field3800 = 0;
        class470.field7025 = 0;
        class404.field6065 = 0;
        class303.field4392 = 0;
        class303.field4415 = 0;
        class226.field3220 = 0;
        class451.field6747 = 0;
        class420.field6281 = 0;
        class470.field7029 = 0;
        class20.field344 = 0;
        class152.field2413 = 0;
        class331.field4996 = 0;
        class197.field2911 = 0;
        class457.field6816 = 0;
        class478.field7133 = 0;
        class246.field3552 = 0;
        class384.field5801 = 0;
        class438.field6550 = 0;
        class459.field6866 = 0;
        class339.field5102 = 0;
        class268.field3855 = 0;
        class79.field1400 = 0;
        class149.field2370 = 0;
        class303.field4461 = 0;
        class145.field2298 = 0;
        class300.field4271 = 0;
        class358.field5438 = 0;
        class116.field1913 = 0;
        class187.field2789 = 0;
        class169.field2615 = 0;
        class437.field6528 = 0;
        class483.field7189 = 0;
        class155.field2435 = 0;
        class35.field677 = 0;
        class19.field326 = 0;
        class69.field1197 = 0;
        class86.field1502 = 0;
        class445.field6641 = 0;
        class396.field5977 = 0;
        class20.field334 = 0;
        class213.field3053 = 0;
        class303.field4344 = 0;
        class97.field1622 = 0;
        class145.field2291 = 0;
        class268.field3858 = 0;
        class503.field7422 = 0;
        class447.field6707 = 0;
        class303.field4349 = 0;
        class319.field4832 = 0;
        class491.field7261 = 0;
        class480.field7144 = 0;
        class302.field4286 = 0;
        class435.field6446 = 0;
        class496.field7328 = 0;
        class430.field6401 = 0;
        class162.field2497 = 0;
        class396.field5964 = 0;
        class19.field318 = 0;
        class79.field1316 = 0;
        class489.field7250 = 0;
        class303.field4290 = 0;
        class17.field245 = 0;
        class88.field1538 = 0;
        class303.field4335 = 0;
        class140.field2228 = 0;
        class111.field1881 = 0;
        class329.field4974 = 0;
        class409.field6134 = 0;
        class185.field2762 = 0;
        class303.field4404 = 0;
        class303.field4398 = 0;
        class256.field3697 = 0;
        class449.field6734 = 0;
        class492.field7285 = 0;
        class392.field5936 = 0;
        class164.field2531 = 0;
        class457.field6828 = 0;
        class147.field2354 = 0;
        class85.field1472 = 0;
        class296.field4203 = 0;
        class408.field6117 = 0;
        class315.field4752 = 0;
        class48.field878 = 0;
        class152.field2418 = 0;
        class65.field1118 = 0;
        class319.field4827 = 0;
        class246.field3545 = 0;
        class452.field6751 = 0;
        class481.field7155 = 0;
        class56.field973 = 0;
        class145.field2305 = 0;
        class416.field6217 = 0;
        class334.field5044 = 0;
        class303.field4319 = 0;
        class215.field3100 = 0;
        class254.field3649 = 0;
        class523.field7752 = 0;
        class55.field948 = 0;
        class247.field3566 = 0;
        class383.field5789 = 0;
        class106.field1762 = 0;
        class102.field1681 = 0;
        class305.field4667 = 0;
        class343.field5155 = 0;
        class500.field7380 = 0;
        class197.field2909 = 0;
        class138.field2220 = 0;
        class517.field7639 = 0;
        class445.field6644 = 0;
        class452.field6753 = 0;
        class430.field6397 = 0;
        class54.field936 = 0;
        class152.field2415 = 0;
        class489.field7242 = 0;
        class75.field1264 = 0;
        class402.field6045 = 0;
        class517.field7599 = 0;
        class390.field5860 = 0;
        class145.field2306 = 0;
        class188.field2799 = 0;
        class449.field6733 = 0;
        class145.field2320 = 0;
        class319.field4808 = 0;
        class17.field280 = 0;
        class299.field4260 = 0;
        class199.field2919 = 0;
        class170.field2634 = 0;
        class396.field5965 = 0;
        class57.field1007 = 0;
        class430.field6393 = 0;
        class71.field1238 = 0;
        class187.field2779 = 0;
        class57.field1005 = 0;
        class386.field5823 = 0;
        class19.field323 = 0;
        client.field2869 = 0;
        class280.field4013 = 0;
        class240.field3443 = 0;
        class380.field5735 = 0;
        class350.field5343 = 0;
        class298.field4246 = 0;
        class369.field5585 = 0;
        class28.field585 = 0;
        class47.field860 = 0;
        class93.field1579 = 0;
        class470.field7039 = 0;
        class386.field5818 = 0;
        class109.field1814 = 0;
        class129.field2044 = 0;
        class167.field2585 = 0;
        class65.field1122 = 0;
        class121.field1959 = 0;
        class303.field4442 = 0;
        class134.field2161 = 0;
        class470.field7057 = 0;
        class242.field3489 = 0;
        class397.field5995 = 0;
        class391.field5923 = 0;
        class303.field4475 = 0;
        class438.field6554 = 0;
        class51.field913 = 0;
        class330.field4979 = 0;
        class270.field3896 = 0;
        class76.field1275 = 0;
        class492.field7274 = 0;
        class121.field1967 = 0;
        class303.field4338 = 0;
        class396.field5967 = 0;
        class256.field3708 = 0;
        class386.field5816 = 0;
        class319.field4788 = 0;
        class303.field4364 = 0;
        class503.field7418 = 0;
        class489.field7241 = 0;
        class147.field2344 = 0;
        class161.field2482 = 0;
        class303.field4407 = 0;
        class240.field3458 = 0;
        class345.field5172 = 0;
        class417.field6236 = 0;
        class206.field2979 = 0;
        class42.field796 = 0;
        class212.field3037 = 0;
        class523.field7760 = 0;
        class3.field100 = 0;
        class303.field4400 = 0;
        class518.field7697 = 0;
        class378.field5712 = 0;
        class71.field1237 = 0;
        class292.field4161 = 0;
        class310.field4727 = 0;
        class445.field6643 = 0;
        class452.field6755 = 0;
        field648 = 0;
        class55.field951 = 0;
        class441.field6601 = 0;
        class261.field3790 = 0;
        class71.field1235 = 0;
        class264.field3808 = 0;
        class369.field5574 = 0;
        class260.field3777 = 0;
        class453.field6766 = 0;
        class476.field7112 = 0;
        class466.field6964 = 0;
        class81.field1423 = 0;
        class331.field5001 = 0;
        class255.field3659 = 0;
        class331.field5010 = 0;
        class105.field1750 = 0;
        class517.field7612 = 0;
        class470.field7060 = 0;
        class102.field1682 = 0;
        class250.field3576 = 0;
        class45.field840 = 0;
        class237.field3427 = 0;
        class196.field2892 = 0;
        class345.field5175 = 0;
        class317.field4769 = 0;
        class393.field5949 = 0;
        class21.field401 = 0;
        class134.field2130 = 0;
        class470.field7040 = 0;
        class359.field5451 = 0;
        class216.field3106 = 0;
        class180.field2712 = 0;
        class234.field3404 = 0;
        class338.field5090 = 0;
        class19.field321 = 0;
        class180.field2729 = 0;
        class55.field956 = 0;
        class303.field4342 = 0;
        class304.field4641 = 0;
        class425.field6336 = 0;
        field656 = 0;
        class298.field4253 = 0;
        class436.field6503 = 0;
        class317.field4765 = 0;
        class463.field6937 = 0;
        class188.field2813 = 0;
        class2.field76 = 0;
        class457.field6835 = 0;
        class5.field119 = 0;
        class303.field4484 = 0;
        class184.field2754 = 0;
        class28.field586 = 0;
        class369.field5591 = 0;
        class383.field5787 = 0;
        class369.field5595 = 0;
        class268.field3848 = 0;
        class496.field7330 = 0;
        class12.field203 = 0;
        class462.field6923 = 0;
        class153.field2426 = 0;
        class308.field4703 = 0;
        class77.field1295 = 0;
        class188.field2810 = 0;
        class380.field5751 = 0;
        class482.field7176 = 0;
        class376.field5706 = 0;
        class425.field6333 = 0;
        class234.field3406 = 0;
        class68.field1170 = 0;
        class215.field3095 = 0;
        class463.field6929 = 0;
        class93.field1578 = 0;
        class396.field5968 = 0;
        class470.field7005 = 0;
        class303.field4326 = 0;
        class457.field6833 = 0;
        class148.field2362 = 0;
        class516.field7585 = 0;
        class457.field6856 = 0;
        class333.field5033 = 0;
        class369.field5589 = 0;
        class347.field5192 = 0;
        class65.field1117 = 0;
        class385.field5808 = 0;
        class303.field4419 = 0;
        class348.field5201 = 0;
        class297.field4242 = 0;
        class460.field6905 = 0;
        class413.field6165 = 0;
        class167.field2582 = 0;
        class436.field6507 = 0;
        class109.field1824 = 0;
        class496.field7322 = 0;
        class264.field3811 = 0;
        class20.field346 = 0;
        class339.field5111 = 0;
        class246.field3549 = 0;
        class329.field4967 = 0;
        class380.field5752 = 0;
        class350.field5270 = 0;
        class339.field5125 = 0;
        class70.field1221 = 0;
        class286.field4079 = 0;
        class285.field4064 = 0;
        class436.field6506 = 0;
        class328.field4956 = 0;
        class445.field6647 = 0;
        class125.field2018 = 0;
        class45.field850 = 0;
        class78.field1309 = 0;
        class217.field3116 = 0;
        class145.field2277 = 0;
        class13.field211 = 0;
        class303.field4384 = 0;
        class442.field6615 = 0;
        class74.field1252 = 0;
        class86.field1485 = 0;
        class14.field227 = 0;
        class416.field6212 = 0;
        class55.field943 = 0;
        class59.field1039 = 0;
        class437.field6519 = 0;
        class322.field4915 = 0;
        class396.field5960 = 0;
        class208.field3010 = 0;
        class140.field2230 = 0;
        class303.field4474 = 0;
        class51.field912 = 0;
        class173.field2666 = 0;
        class128.field2036 = 0;
        class85.field1474 = 0;
        class449.field6725 = 0;
        class222.field3185 = 0;
        class145.field2272 = 0;
        class256.field3678 = 0;
        class130.field2070 = 0;
        class121.field1972 = 0;
        class25.field549 = 0;
        class145.field2294 = 0;
        class34.field665 = 0;
        class69.field1192 = 0;
        class303.field4414 = 0;
        class255.field3658 = 0;
        class261.field3795 = 0;
        class282.field4033 = 0;
        class341.field5144 = 0;
        class253.field3611 = 0;
        class187.field2785 = 0;
        class303.field4289 = 0;
        class435.field6483 = 0;
        class303.field4481 = 0;
        class268.field3866 = 0;
        class88.field1541 = 0;
        class292.field4159 = 0;
        class367.field5539 = 0;
        class88.field1535 = 0;
        class158.field2465 = 0;
        class272.field3922 = 0;
        class54.field932 = 0;
        class23.field475 = 0;
        class303.field4457 = 0;
        class470.field7030 = 0;
        class216.field3112 = 0;
        class303.field4311 = 0;
        class256.field3707 = 0;
        class256.field3683 = 0;
        class177.field2687 = 0;
        class183.field2749 = 0;
        class9.field145 = 0;
        class515.field7573 = 0;
        class53.field920 = 0;
        class339.field5114 = 0;
        class303.field4399 = 0;
        class308.field4704 = 0;
        class389.field5858 = 0;
        class433.field6431 = 0;
        class392.field5930 = 0;
        class264.field3806 = 0;
        class11.field193 = 0;
        class177.field2692 = 0;
        class331.field5004 = 0;
        class402.field6047 = 0;
        class332.field5023 = 0;
        class315.field4740 = 0;
        class255.field3669 = 0;
        class441.field6599 = 0;
        class20.field350 = 0;
        class66.field1134 = 0;
        class437.field6529 = 0;
        class202.field2964 = 0;
        class452.field6758 = 0;
        class497.field7333 = 0;
        class245.field3520 = 0;
        class515.field7574 = 0;
        class470.field7052 = 0;
        class392.field5942 = 0;
        class457.field6819 = 0;
        class319.field4888 = 0;
        class303.field4409 = 0;
        class303.field4310 = 0;
        class407.field6112 = 0;
        class519.field7713 = 0;
        class80.field1407 = 0;
        class338.field5087 = 0;
        class246.field3534 = 0;
        class396.field5974 = 0;
        class187.field2777 = 0;
        class89.field1548 = 0;
        class68.field1178 = 0;
        class179.field2707 = 0;
        class188.field2802 = 0;
        class177.field2686 = 0;
        class201.field2932 = 0;
        class23.field482 = 0;
        class288.field4108 = 0;
        class303.field4288 = 0;
        class255.field3671 = 0;
        class319.field4811 = 0;
        class170.field2630 = 0;
        class303.field4330 = 0;
        class17.field248 = 0;
        class9.field146 = 0;
        class165.field2565 = 0;
        class303.field4304 = 0;
        class331.field5011 = 0;
        class45.field842 = 0;
        class80.field1412 = 0;
        class79.field1327 = 0;
        class474.field7089 = 0;
        class359.field5449 = 0;
        class283.field4045 = 0;
        class393.field5948 = 0;
        class318.field4775 = 0;
        class116.field1922 = 0;
        class145.field2302 = 0;
        class59.field1043 = 0;
        class396.field5970 = 0;
        class48.field882 = 0;
        class446.field6654 = 0;
        class447.field6669 = 0;
        class180.field2718 = 0;
        class442.field6613 = 0;
        class209.field3020 = 0;
        class36.field680 = 0;
        class457.field6839 = 0;
        class97.field1615 = 0;
        class251.field3588 = 0;
        class303.field4362 = 0;
        class297.field4232 = 0;
        class291.field4147 = 0;
        class457.field6817 = 0;
        class25.field547 = 0;
        class87.field1527 = 0;
        class466.field6960 = 0;
        class155.field2443 = 0;
        class303.field4453 = 0;
        class268.field3850 = 0;
        class9.field151 = 0;
        class80.field1404 = 0;
        class150.field2388 = 0;
        class291.field4145 = 0;
        class437.field6538 = 0;
        class449.field6731 = 0;
        class530.field7797 = 0;
        class303.field4455 = 0;
        class355.field5417 = 0;
        class303.field4345 = 0;
        class138.field2216 = 0;
        class303.field4390 = 0;
        class71.field1233 = 0;
        class329.field4968 = 0;
        class145.field2285 = 0;
        class20.field341 = 0;
        class20.field343 = 0;
        class132.field2080 = 0;
        class329.field4962 = 0;
        class347.field5189 = 0;
        class130.field2069 = 0;
        class343.field5158 = 0;
        class23.field477 = 0;
        class1.field14 = 0;
        class492.field7273 = 0;
        class305.field4647 = 0;
        class132.field2079 = 0;
        class245.field3526 = 0;
        class470.field6996 = 0;
        class193.field2857 = 0;
        class399.field6014 = 0;
        class392.field5938 = 0;
        class390.field5862 = 0;
        class416.field6210 = 0;
        class80.field1413 = 0;
        class482.field7174 = 0;
        class449.field6732 = 0;
        class370.field5607 = 0;
        class303.field4352 = 0;
        class141.field2240 = 0;
        class429.field6376 = 0;
        class213.field3047 = 0;
        class233.field3395 = 0;
        class303.field4334 = 0;
        class45.field851 = 0;
        class470.field7059 = 0;
        class120.field1955 = 0;
        class195.field2865 = 0;
        class309.field4722 = 0;
        class518.field7703 = 0;
        class244.field3502 = 0;
        class496.field7318 = 0;
        class303.field4426 = 0;
        class412.field6154 = 0;
        class17.field251 = 0;
        class447.field6664 = 0;
        class429.field6388 = 0;
        class17.field267 = 0;
        class173.field2661 = 0;
        class392.field5931 = 0;
        class339.field5100 = 0;
        class47.field872 = 0;
        class256.field3679 = 0;
        class455.field6789 = 0;
        class57.field993 = 0;
        class243.field3497 = 0;
        class138.field2195 = 0;
        class83.field1435 = 0;
        class303.field4462 = 0;
        class270.field3897 = 0;
        class23.field470 = 0;
        class164.field2530 = 0;
        class355.field5418 = 0;
        class303.field4397 = 0;
        class420.field6279 = 0;
        class470.field7035 = 0;
        class482.field7179 = 0;
        class414.field6177 = 0;
        class430.field6398 = 0;
        class460.field6890 = 0;
        class221.field3176 = 0;
        class240.field3467 = 0;
        class460.field6898 = 0;
        class240.field3453 = 0;
        class103.field1701 = 0;
        class413.field6174 = 0;
        class270.field3893 = 0;
        class315.field4745 = 0;
        class457.field6852 = 0;
        class506.field7462 = 0;
        class103.field1699 = 0;
        class240.field3466 = 0;
        class5.field121 = 0;
        class50.field906 = 0;
        class229.field3256 = 0;
        class455.field6808 = 0;
        class521.field7734 = 0;
        class118.field1944 = 0;
        class62.field1074 = 0;
        class17.field266 = 0;
        class256.field3695 = 0;
        class240.field3459 = 0;
        class263.field3801 = 0;
        class17.field277 = 0;
        class19.field313 = 0;
        class350.field5255 = 0;
        class504.field7453 = 0;
        class488.field7224 = 0;
        class441.field6603 = 0;
        class303.field4318 = 0;
        class74.field1257 = 0;
        class29.field624 = 0;
        class277.field3990 = 0;
        class77.field1281 = 0;
        class482.field7175 = 0;
        class480.field7150 = 0;
        class210.field3028 = 0;
        class417.field6240 = 0;
        class86.field1498 = 0;
        class447.field6678 = 0;
        class303.field4333 = 0;
        class305.field4658 = 0;
        class256.field3718 = 0;
        class42.field808 = 0;
        class21.field365 = 0;
        class23.field476 = 0;
        class148.field2358 = 0;
        class256.field3694 = 0;
        class46.field857 = 0;
        class303.field4388 = 0;
        class333.field5036 = 0;
        class304.field4638 = 0;
        class268.field3868 = 0;
        class303.field4377 = 0;
        class303.field4320 = 0;
        class240.field3449 = 0;
        field651 = 0;
        class187.field2778 = 0;
        class445.field6629 = 0;
        class11.field184 = 0;
        class303.field4417 = 0;
        class368.field5555 = 0;
        class352.field5388 = 0;
        class200.field2924 = 0;
        class107.field1778 = 0;
        class145.field2256 = 0;
        class503.field7421 = 0;
        class28.field588 = 0;
        class422.field6307 = 0;
        class65.field1105 = 0;
        class89.field1551 = 0;
        class53.field919 = 0;
        class303.field4443 = 0;
        class2.field67 = 0;
        class410.field6145 = 0;
        class34.field664 = 0;
        class132.field2078 = 0;
        class391.field5918 = 0;
        class397.field5991 = 0;
        class222.field3186 = 0;
        class246.field3558 = 0;
        class60.field1056 = 0;
        class123.field2002 = 0;
        class303.field4366 = 0;
        class397.field5992 = 0;
        class303.field4420 = 0;
        class319.field4823 = 0;
        class219.field3152 = 0;
        class105.field1746 = 0;
        class134.field2166 = 0;
        class261.field3794 = 0;
        class162.field2510 = 0;
        class369.field5573 = 0;
        class160.field2476 = 0;
        class494.field7303 = 0;
        class64.field1096 = 0;
        class496.field7326 = 0;
        class404.field6063 = 0;
        class127.field2025 = 0;
        class370.field5602 = 0;
        class482.field7178 = 0;
        class141.field2237 = 0;
        class447.field6676 = 0;
        class363.field5498 = 0;
        class87.field1531 = 0;
        class138.field2202 = 0;
        class252.field3599 = 0;
        class386.field5820 = 0;
        class470.field7018 = 0;
        class303.field4293 = 0;
        class86.field1483 = 0;
        class413.field6170 = 0;
        class369.field5575 = 0;
        class66.field1142 = 0;
        class185.field2763 = 0;
        field660 = 0;
        class416.field6215 = 0;
        class253.field3630 = 0;
        class164.field2536 = 0;
        class303.field4354 = 0;
        class56.field976 = 0;
        class286.field4077 = 0;
        class65.field1120 = 0;
        class466.field6963 = 0;
        class145.field2257 = 0;
        class202.field2951 = 0;
        class517.field7663 = 0;
        class145.field2309 = 0;
        class228.field3249 = 0;
        class145.field2264 = 0;
        class413.field6176 = 0;
        class517.field7650 = 0;
        class303.field4422 = 0;
        class130.field2061 = 0;
        class306.field4671 = 0;
        class169.field2626 = 0;
        class303.field4438 = 0;
        class308.field4700 = 0;
        class407.field6105 = 0;
        class368.field5565 = 0;
        class17.field258 = 0;
        class145.field2319 = 0;
        class517.field7680 = 0;
        class362.field5489 = 0;
        class114.field1895 = 0;
        class246.field3531 = 0;
        class285.field4063 = 0;
        class213.field3060 = 0;
        class369.field5580 = 0;
        class380.field5753 = 0;
        class466.field6948 = 0;
        class331.field5013 = 0;
        class319.field4883 = 0;
        class392.field5940 = 0;
        class107.field1777 = 0;
        class244.field3510 = 0;
        class315.field4751 = 0;
        class247.field3570 = 0;
        client.field2878 = 0;
        class139.field2225 = 0;
        class45.field848 = 0;
        class419.field6253 = 0;
        class130.field2065 = 0;
        class214.field3079 = 0;
        class492.field7286 = 0;
        class66.field1150 = 0;
        class260.field3776 = 0;
        class308.field4698 = 0;
        class138.field2209 = 0;
        class319.field4861 = 0;
        class62.field1079 = 0;
        class147.field2346 = 0;
        class331.field5002 = 0;
        class135.field2171 = 0;
        class145.field2299 = 0;
        class183.field2742 = 0;
        class161.field2486 = 0;
        class237.field3428 = 0;
        class253.field3615 = 0;
        client.field2880 = 0;
        class319.field4872 = 0;
        class59.field1047 = 0;
        class303.field4373 = 0;
        class460.field6897 = 0;
        class42.field750 = 0;
        class145.field2321 = 0;
        class295.field4198 = 0;
        class11.field185 = 0;
        class516.field7591 = 0;
        class355.field5422 = 0;
        class489.field7240 = 0;
        class275.field3975 = 0;
        class497.field7346 = 0;
        class331.field5003 = 0;
        class259.field3763 = 0;
        class201.field2936 = 0;
        class121.field1970 = 0;
        class470.field7017 = 0;
        class233.field3396 = 0;
        class58.field1035 = 0;
        class319.field4877 = 0;
        class383.field5792 = 0;
        class460.field6887 = 0;
        class213.field3054 = 0;
        class226.field3214 = 0;
        class421.field6286 = 0;
        class303.field4430 = 0;
        class116.field1929 = 0;
        class2.field69 = 0;
        class319.field4813 = 0;
        class8.field142 = 0;
        class445.field6635 = 0;
        class258.field3740 = 0;
        class332.field5020 = 0;
        class489.field7248 = 0;
        class303.field4411 = 0;
        class37.field703 = 0;
        class70.field1210 = 0;
        class157.field2457 = 0;
        class383.field5797 = 0;
        class378.field5716 = 0;
        class90.field1559 = 0;
        class332.field5019 = 0;
        class147.field2350 = 0;
        class250.field3583 = 0;
        class303.field4487 = 0;
        class499.field7365 = 0;
        class303.field4370 = 0;
        class222.field3180 = 0;
        class303.field4469 = 0;
        client.field2877 = 0;
        class111.field1876 = 0;
        class359.field5456 = 0;
        class34.field669 = 0;
        class162.field2511 = 0;
        class1.field10 = 0;
        class229.field3255 = 0;
        class319.field4789 = 0;
        class260.field3787 = 0;
        class299.field4258 = 0;
        class303.field4324 = 0;
        class433.field6428 = 0;
        class460.field6892 = 0;
        class462.field6914 = 0;
        class396.field5956 = 0;
        class470.field7033 = 0;
        class323.field4931 = 0;
        class455.field6799 = 0;
        class103.field1706 = 0;
        class286.field4075 = 0;
        class57.field994 = 0;
        class265.field3816 = 0;
        class483.field7190 = 0;
        class470.field7001 = 0;
        class22.field437 = 0;
        class129.field2054 = 0;
        class523.field7753 = 0;
        class332.field5031 = 0;
        class86.field1490 = 0;
        class315.field4747 = 0;
        class321.field4912 = 0;
        class303.field4418 = 0;
        class164.field2532 = 0;
        class79.field1395 = 0;
        class183.field2736 = 0;
        class373.field5661 = 0;
        class22.field455 = 0;
        class17.field273 = 0;
        class49.field890 = 0;
        class2.field68 = 0;
        class62.field1081 = 0;
        class432.field6426 = 0;
        class283.field4038 = 0;
        class182.field2730 = 0;
        client.field2871 = 0;
        class317.field4766 = 0;
        class139.field2226 = 0;
        class303.field4308 = 0;
        class455.field6803 = 0;
        class460.field6904 = 0;
        class303.field4402 = 0;
        class253.field3606 = 0;
        class197.field2906 = 0;
        class167.field2592 = 0;
        class339.field5108 = 0;
        client.field2883 = 0;
        class70.field1209 = 0;
        class214.field3076 = 0;
        class74.field1256 = 0;
        class459.field6873 = 0;
        class138.field2185 = 0;
        class441.field6598 = 0;
        class240.field3464 = 0;
        class374.field5669 = 0;
        class334.field5042 = 0;
        class430.field6394 = 0;
        class240.field3461 = 0;
        class298.field4254 = 0;
        class57.field999 = 0;
        class174.field2671 = 0;
        class62.field1076 = 0;
        class470.field6999 = 0;
        class488.field7220 = 0;
        class367.field5549 = 0;
        class2.field85 = 0;
        class441.field6606 = 0;
        class134.field2163 = 0;
        class461.field6908 = 0;
        class510.field7525 = 0;
        class252.field3596 = 0;
        class360.field5462 = 0;
        class530.field7799 = 0;
        class303.field4480 = 0;
        class196.field2890 = 0;
        class101.field1656 = 0;
        class391.field5916 = 0;
        class441.field6591 = 0;
        class34.field663 = 0;
        class213.field3058 = 0;
        class474.field7098 = 0;
        class23.field463 = 0;
        class68.field1177 = 0;
        class11.field178 = 0;
        class319.field4868 = 0;
        class103.field1698 = 0;
        class391.field5925 = 0;
        class441.field6592 = 0;
        class259.field3760 = 0;
        class246.field3560 = 0;
        class233.field3391 = 0;
        class255.field3667 = 0;
        class319.field4892 = 0;
        class134.field2119 = 0;
        class252.field3601 = 0;
        class305.field4656 = 0;
        class291.field4138 = 0;
        class51.field915 = 0;
        class90.field1557 = 0;
        class80.field1406 = 0;
        class463.field6938 = 0;
        class457.field6845 = 0;
        class105.field1743 = 0;
        class184.field2755 = 0;
        class305.field4670 = 0;
        class70.field1227 = 0;
        class2.field86 = 0;
        class441.field6589 = 0;
        class86.field1500 = 0;
        class147.field2348 = 0;
        class429.field6362 = 0;
        class302.field4283 = 0;
        class285.field4067 = 0;
        class282.field4029 = 0;
        class59.field1050 = 0;
        class145.field2281 = 0;
        class207.field3000 = 0;
        class436.field6502 = 0;
        class460.field6893 = 0;
        class319.field4878 = 0;
        class213.field3070 = 0;
        class460.field6884 = 0;
        class425.field6330 = 0;
        class85.field1471 = 0;
        class319.field4824 = 0;
        class390.field5896 = 0;
        class368.field5560 = 0;
        class306.field4678 = 0;
        class399.field6013 = 0;
        class445.field6634 = 0;
        class145.field2263 = 0;
        class453.field6771 = 0;
        class61.field1063 = 0;
        class120.field1953 = 0;
        class407.field6101 = 0;
        class96.field1614 = 0;
        class290.field4122 = 0;
        class339.field5123 = 0;
        class303.field4325 = 0;
        class382.field5779 = 0;
        class492.field7271 = 0;
        class28.field591 = 0;
        class457.field6837 = 0;
        class75.field1261 = 0;
        class254.field3647 = 0;
        class233.field3398 = 0;
        class209.field3016 = 0;
        class441.field6604 = 0;
        class80.field1411 = 0;
        class259.field3758 = 0;
        class303.field4444 = 0;
        class332.field5017 = 0;
        class303.field4391 = 0;
        class390.field5864 = 0;
        class489.field7239 = 0;
        class209.field3015 = 0;
        class271.field3910 = 0;
        class240.field3446 = 0;
        class167.field2599 = 0;
        class215.field3096 = 0;
        class470.field7031 = 0;
        class163.field2521 = 0;
        class329.field4963 = 0;
        class345.field5178 = 0;
        class158.field2466 = 0;
        class109.field1797 = 0;
        class206.field2981 = 0;
        class213.field3048 = 0;
        class141.field2235 = 0;
        class71.field1232 = 0;
        class470.field7022 = 0;
        class268.field3861 = 0;
        class523.field7759 = 0;
        class250.field3582 = 0;
        class286.field4083 = 0;
        class57.field986 = 0;
        class85.field1470 = 0;
        class303.field4346 = 0;
        class481.field7161 = 0;
        class339.field5103 = 0;
        class275.field3978 = 0;
        class515.field7576 = 0;
        class303.field4356 = 0;
        class453.field6776 = 0;
        class252.field3603 = 0;
        class161.field2484 = 0;
        class145.field2276 = 0;
        class11.field191 = 0;
        class483.field7192 = 0;
        class511.field7538 = 0;
        class303.field4401 = 0;
        class114.field1898 = 0;
        class388.field5838 = 0;
        class265.field3818 = 0;
        class253.field3626 = 0;
        class504.field7435 = 0;
        class385.field5807 = 0;
        class321.field4908 = 0;
        class331.field4994 = 0;
        class283.field4040 = 0;
        class419.field6270 = 0;
        class20.field335 = 0;
        class196.field2891 = 0;
        class122.field1988 = 0;
        class350.field5283 = 0;
        class101.field1665 = 0;
        class219.field3141 = 0;
        class69.field1191 = 0;
        class325.field4946 = 0;
        class47.field866 = 0;
        class244.field3503 = 0;
        class318.field4776 = 0;
        class48.field889 = 0;
        class510.field7524 = 0;
        class85.field1464 = 0;
        class305.field4661 = 0;
        class17.field244 = 0;
        class425.field6331 = 0;
        class452.field6760 = 0;
        class482.field7177 = 0;
        class86.field1495 = 0;
        class368.field5567 = 0;
        class244.field3500 = 0;
        class70.field1224 = 0;
        class303.field4412 = 0;
        class366.field5525 = 0;
        class283.field4041 = 0;
        class319.field4812 = 0;
        class17.field283 = 0;
        class270.field3890 = 0;
        class319.field4859 = 0;
        class517.field7620 = 0;
        class57.field992 = 0;
        class54.field928 = 0;
        class294.field4187 = 0;
        class215.field3101 = 0;
        class457.field6842 = 0;
        class497.field7343 = 0;
        class363.field5497 = 0;
        class213.field3071 = 0;
        class83.field1439 = 0;
        class304.field4637 = 0;
        class323.field4928 = 0;
        class223.field3194 = 0;
        class443.field6622 = 0;
        class241.field3479 = 0;
        class417.field6237 = 0;
        class303.field4296 = 0;
        class167.field2597 = 0;
        class369.field5576 = 0;
        class252.field3593 = 0;
        class65.field1110 = 0;
        class396.field5958 = 0;
        class65.field1106 = 0;
        class432.field6421 = 0;
        class42.field758 = 0;
        class470.field7011 = 0;
        class425.field6341 = 0;
        class86.field1479 = 0;
        class171.field2642 = 0;
        class260.field3772 = 0;
        class174.field2669 = 0;
        class11.field171 = 0;
        class370.field5604 = 0;
        class53.field918 = 0;
        class134.field2165 = 0;
        class303.field4340 = 0;
        class85.field1466 = 0;
        class193.field2856 = 0;
        class54.field937 = 0;
        class86.field1491 = 0;
        class489.field7245 = 0;
        class442.field6617 = 0;
        class271.field3909 = 0;
        class179.field2706 = 0;
        class303.field4465 = 0;
        class169.field2625 = 0;
        class17.field262 = 0;
        class167.field2591 = 0;
        class149.field2371 = 0;
        class463.field6931 = 0;
        class402.field6041 = 0;
        class104.field1725 = 0;
        class303.field4427 = 0;
        class501.field7383 = 0;
        class17.field268 = 0;
        class303.field4331 = 0;
        class303.field4380 = 0;
        class305.field4657 = 0;
        class309.field4717 = 0;
        class11.field175 = 0;
        class268.field3854 = 0;
        class106.field1765 = 0;
        class358.field5448 = 0;
        class318.field4782 = 0;
        class188.field2812 = 0;
        class89.field1547 = 0;
        class338.field5093 = 0;
        class122.field1986 = 0;
        class366.field5528 = 0;
        class247.field3563 = 0;
        class68.field1166 = 0;
        class111.field1882 = 0;
        class145.field2312 = 0;
        class156.field2450 = 0;
        class167.field2586 = 0;
        class501.field7387 = 0;
        class42.field760 = 0;
        class28.field578 = 0;
        class80.field1416 = 0;
        class297.field4231 = 0;
        class256.field3716 = 0;
        class145.field2317 = 0;
        class145.field2280 = 0;
        class303.field4378 = 0;
        class42.field773 = 0;
        class457.field6818 = 0;
        class29.field600 = 0;
        class382.field5784 = 0;
        class254.field3644 = 0;
        class246.field3548 = 0;
        class407.field6113 = 0;
        class462.field6924 = 0;
        class451.field6744 = 0;
        class303.field4321 = 0;
        class227.field3227 = 0;
        class97.field1618 = 0;
        class407.field6107 = 0;
        class102.field1683 = 0;
        class32.field639 = 0;
        class9.field148 = 0;
        class398.field6000 = 0;
        class49.field893 = 0;
        class35.field671 = 0;
        class217.field3121 = 0;
        class343.field5156 = 0;
        class270.field3895 = 0;
        class303.field4416 = 0;
        class457.field6815 = 0;
        class122.field1976 = 0;
        class319.field4854 = 0;
        class12.field198 = 0;
        class257.field3732 = 0;
        class457.field6820 = 0;
        class160.field2475 = 0;
        class244.field3508 = 0;
        class23.field467 = 0;
        class286.field4085 = 0;
        class392.field5944 = 0;
        class190.field2829 = 0;
        class318.field4772 = 0;
        class280.field4015 = 0;
        class347.field5186 = 0;
        class303.field4447 = 0;
        class201.field2933 = 0;
        class303.field4322 = 0;
        class79.field1375 = 0;
        class244.field3515 = 0;
        class197.field2898 = 0;
        class79.field1364 = 0;
        class12.field199 = 0;
        class303.field4437 = 0;
        class123.field2003 = 0;
        class145.field2313 = 0;
        class338.field5096 = 0;
        class435.field6477 = 0;
        class253.field3633 = 0;
        class443.field6624 = 0;
        class232.field3379 = 0;
        class315.field4748 = 0;
        class165.field2563 = 0;
        class463.field6928 = 0;
        class162.field2509 = 0;
        class110.field1865 = 0;
        class489.field7230 = 0;
        class272.field3923 = 0;
        class489.field7237 = 0;
        class392.field5941 = 0;
        class390.field5874 = 0;
        class79.field1333 = 0;
        class62.field1075 = 0;
        class303.field4297 = 0;
        class188.field2816 = 0;
        class162.field2505 = 0;
        class369.field5583 = 0;
        class429.field6361 = 0;
        class2.field94 = 0;
        class459.field6879 = 0;
        class145.field2286 = 0;
        class518.field7698 = 0;
        class145.field2304 = 0;
        class197.field2899 = 0;
        class396.field5980 = 0;
        class373.field5664 = 0;
        class264.field3804 = 0;
        class428.field6355 = 0;
        class36.field698 = 0;
        class523.field7761 = 0;
        class503.field7415 = 0;
        class202.field2960 = 0;
        class254.field3651 = 0;
        class36.field690 = 0;
        class246.field3547 = 0;
        class397.field5994 = 0;
        class81.field1420 = 0;
        class100.field1652 = 0;
        class101.field1662 = 0;
        class177.field2694 = 0;
        class303.field4298 = 0;
        class449.field6728 = 0;
        class110.field1845 = 0;
        class217.field3126 = 0;
        class470.field6998 = 0;
        class452.field6761 = 0;
        class2.field89 = 0;
        class97.field1617 = 0;
        class304.field4639 = 0;
        class303.field4348 = 0;
        class302.field4282 = 0;
        class254.field3642 = 0;
        class145.field2303 = 0;
        class350.field5292 = 0;
        class277.field3993 = 0;
        class338.field5085 = 0;
        class303.field4336 = 0;
        class319.field4874 = 0;
        class244.field3506 = 0;
        class36.field691 = 0;
        class243.field3495 = 0;
        class390.field5869 = 0;
        class447.field6713 = 0;
        class184.field2753 = 0;
        class350.field5362 = 0;
        class75.field1262 = 0;
        class149.field2377 = 0;
        class157.field2460 = 0;
        class474.field7085 = 0;
        class303.field4295 = 0;
        class65.field1112 = 0;
        class526.field7780 = 0;
        class419.field6267 = 0;
        class109.field1822 = 0;
        class102.field1680 = 0;
        class5.field118 = 0;
        class416.field6221 = 0;
        class66.field1129 = 0;
        class482.field7173 = 0;
        class303.field4413 = 0;
        class280.field4012 = 0;
        class289.field4116 = 0;
        class402.field6039 = 0;
        class446.field6655 = 0;
        class366.field5531 = 0;
        class253.field3631 = 0;
        class151.field2395 = 0;
        class501.field7388 = 0;
        class116.field1917 = 0;
        class138.field2206 = 0;
        class79.field1335 = 0;
        class250.field3575 = 0;
        class304.field4636 = 0;
        class457.field6843 = 0;
        class517.field7673 = 0;
        class528.field7784 = 0;
        class303.field4449 = 0;
        class460.field6894 = 0;
        class209.field3021 = 0;
        class256.field3713 = 0;
        class134.field2088 = 0;
        class517.field7637 = 0;
        class292.field4160 = 0;
        class350.field5240 = 0;
        class202.field2952 = 0;
        class219.field3153 = 0;
        class470.field7038 = 0;
        class303.field4466 = 0;
        class256.field3701 = 0;
        class111.field1878 = 0;
        class503.field7419 = 0;
        class380.field5722 = 0;
        class162.field2498 = 0;
        class62.field1080 = 0;
        class22.field448 = 0;
        class118.field1943 = 0;
        class57.field996 = 0;
        class168.field2606 = 0;
        class303.field4369 = 0;
        class396.field5957 = 0;
        class306.field4684 = 0;
        class168.field2610 = 0;
        class338.field5083 = 0;
        class497.field7341 = 0;
        class437.field6523 = 0;
        class121.field1964 = 0;
        class200.field2925 = 0;
        class185.field2766 = 0;
        class362.field5486 = 0;
        class20.field354 = 0;
        class65.field1119 = 0;
        class303.field4393 = 0;
        class418.field6247 = 0;
        class215.field3102 = 0;
        class460.field6902 = 0;
        class319.field4847 = 0;
        class347.field5190 = 0;
        class19.field332 = 0;
        class323.field4935 = 0;
        class101.field1668 = 0;
        class240.field3448 = 0;
        class368.field5564 = 0;
        class303.field4446 = 0;
        class462.field6921 = 0;
        class242.field3491 = 0;
        class482.field7167 = 0;
        class331.field5007 = 0;
        class161.field2490 = 0;
        class339.field5110 = 0;
        class332.field5030 = 0;
        class42.field816 = 0;
        class258.field3742 = 0;
        class303.field4389 = 0;
        class65.field1107 = 0;
        class70.field1216 = 0;
        class268.field3871 = 0;
        class145.field2316 = 0;
        class383.field5788 = 0;
        class105.field1754 = 0;
        class409.field6138 = 0;
        class246.field3541 = 0;
        class255.field3666 = 0;
        class101.field1659 = 0;
        class183.field2740 = 0;
        class215.field3099 = 0;
        class268.field3860 = 0;
        class303.field4468 = 0;
        class404.field6060 = 0;
        class498.field7358 = 0;
        class59.field1038 = 0;
        class391.field5921 = 0;
        class239.field3436 = 0;
        class145.field2262 = 0;
        class57.field1009 = 0;
        class17.field274 = 0;
        class317.field4770 = 0;
        class474.field7080 = 0;
        class370.field5601 = 0;
        class470.field7028 = 0;
        class2.field82 = 0;
        class56.field971 = 0;
        class438.field6553 = 0;
        class197.field2910 = 0;
        class129.field2050 = 0;
        class56.field979 = 0;
        class475.field7102 = 0;
        class145.field2269 = 0;
        class361.field5469 = 0;
        class11.field192 = 0;
        class5.field117 = 0;
        class425.field6329 = 0;
        class69.field1193 = 0;
        class14.field229 = 0;
        class145.field2297 = 0;
        class303.field4421 = 0;
        class445.field6631 = 0;
        class475.field7103 = 0;
        class241.field3478 = 0;
        class474.field7091 = 0;
        client.field2886 = 0;
        class457.field6825 = 0;
        class358.field5441 = 0;
        class303.field4394 = 0;
        class491.field7263 = 0;
        class109.field1837 = 0;
        class397.field5993 = 0;
        class305.field4669 = 0;
        class445.field6638 = 0;
        class47.field868 = 0;
        class40.field724 = 0;
        class290.field4127 = 0;
        class47.field874 = 0;
        class50.field899 = 0;
        class217.field3114 = 0;
        class423.field6315 = 0;
        class479.field7135 = 0;
        class425.field6340 = 0;
        class385.field5809 = 0;
        class21.field375 = 0;
        class362.field5493 = 0;
        class303.field4307 = 0;
        class55.field954 = 0;
        class59.field1042 = 0;
        class378.field5717 = 0;
        class436.field6505 = 0;
        class153.field2425 = 0;
        class145.field2310 = 0;
        class518.field7701 = 0;
        class277.field3994 = 0;
        class435.field6491 = 0;
        class187.field2791 = 0;
        class392.field5933 = 0;
        class246.field3532 = 0;
        class214.field3088 = 0;
        class71.field1231 = 0;
        class145.field2300 = 0;
        class333.field5037 = 0;
        class72.field1248 = 0;
        class452.field6757 = 0;
        class36.field681 = 0;
        class476.field7108 = 0;
        class265.field3815 = 0;
        class392.field5937 = 0;
        class187.field2795 = 0;
        class216.field3110 = 0;
        class362.field5490 = 0;
        class303.field4440 = 0;
        class304.field4642 = 0;
        class319.field4791 = 0;
        class330.field4980 = 0;
        class303.field4454 = 0;
        class339.field5117 = 0;
        class438.field6551 = 0;
        class123.field1991 = 0;
        class285.field4062 = 0;
        class145.field2290 = 0;
        class66.field1130 = 0;
        class282.field4030 = 0;
        class290.field4132 = 0;
        class380.field5769 = 0;
        class1.field3 = 0;
        class134.field2147 = 0;
        class114.field1903 = 0;
        class244.field3504 = 0;
        class219.field3156 = 0;
        class152.field2414 = 0;
        class372.field5651 = 0;
        class460.field6889 = 0;
        class319.field4895 = 0;
        class90.field1562 = 0;
        class123.field2000 = 0;
        class453.field6774 = 0;
        class86.field1480 = 0;
        class453.field6770 = 0;
        class259.field3754 = 0;
        class355.field5412 = 0;
        class504.field7450 = 0;
        class109.field1795 = 0;
        class253.field3613 = 0;
        class339.field5120 = 0;
        class303.field4309 = 0;
        class305.field4668 = 0;
        class436.field6511 = 0;
        class437.field6524 = 0;
        class331.field5000 = 0;
        class227.field3226 = 0;
        class246.field3546 = 0;
        class147.field2345 = 0;
        class419.field6266 = 0;
        class101.field1666 = 0;
        class253.field3607 = 0;
        class303.field4368 = 0;
        class145.field2307 = 0;
        class145.field2282 = 0;
        class87.field1532 = 0;
        class470.field7020 = 0;
        field652 = 0;
        class437.field6521 = 0;
        class499.field7374 = 0;
        class66.field1132 = 0;
        class392.field5939 = 0;
        class102.field1686 = 0;
        class247.field3568 = 0;
        class219.field3137 = 0;
        class419.field6256 = 0;
        class77.field1287 = 0;
        class48.field880 = 0;
        class277.field3997 = 0;
        class268.field3859 = 0;
        class74.field1254 = 0;
        class305.field4659 = 0;
        class320.field4900 = 0;
        class316.field4759 = 0;
        class164.field2533 = 0;
        class438.field6555 = 0;
        class457.field6821 = 0;
        class354.field5409 = 0;
        class390.field5888 = 0;
        class270.field3892 = 0;
        class263.field3798 = 0;
        class457.field6823 = 0;
        class488.field7227 = 0;
        class257.field3727 = 0;
        class462.field6922 = 0;
        class474.field7082 = 0;
        class319.field4840 = 0;
        class377.field5709 = 0;
        class369.field5578 = 0;
        class244.field3499 = 0;
        class520.field7729 = 0;
        class169.field2618 = 0;
        class1.field6 = 0;
        class463.field6935 = 0;
        class32.field644 = 0;
        class459.field6882 = 0;
        class110.field1851 = 0;
        class109.field1820 = 0;
        class475.field7101 = 0;
        class421.field6293 = 0;
        class187.field2775 = 0;
        class404.field6062 = 0;
        class530.field7798 = 0;
        class421.field6292 = 0;
        class169.field2617 = 0;
        class528.field7787 = 0;
        class303.field4478 = 0;
        client.field2881 = 0;
        class489.field7233 = 0;
        class518.field7704 = 0;
        class392.field5932 = 0;
        class286.field4073 = 0;
        class233.field3392 = 0;
        class145.field2267 = 0;
        class303.field4300 = 0;
        class187.field2790 = 0;
        class147.field2351 = 0;
        class282.field4028 = 0;
        class323.field4925 = 0;
        class374.field5671 = 0;
        class277.field3986 = 0;
        class223.field3190 = 0;
        class197.field2908 = 0;
        class56.field975 = 0;
        class55.field960 = 0;
        class303.field4429 = 0;
        class304.field4640 = 0;
        class251.field3591 = 0;
        class470.field7055 = 0;
        class485.field7208 = 0;
        class259.field3755 = 0;
        class23.field461 = 0;
        class436.field6512 = 0;
        class97.field1619 = 0;
        class167.field2590 = 0;
        class457.field6838 = 0;
        class369.field5577 = 0;
        class308.field4708 = 0;
        class470.field7056 = 0;
        class240.field3445 = 0;
        class305.field4655 = 0;
        class329.field4973 = 0;
        class138.field2217 = 0;
        class167.field2581 = 0;
        class510.field7528 = 0;
        class233.field3393 = 0;
        class100.field1645 = 0;
        class374.field5670 = 0;
        class297.field4216 = 0;
        class494.field7304 = 0;
        class109.field1838 = 0;
        class294.field4191 = 0;
        class137.field2179 = 0;
        class389.field5852 = 0;
        class151.field2393 = 0;
        class109.field1832 = 0;
        class145.field2284 = 0;
        class374.field5667 = 0;
        class320.field4905 = 0;
        class448.field6720 = 0;
        class162.field2512 = 0;
        class303.field4433 = 0;
        class42.field762 = 0;
        class517.field7661 = 0;
        class502.field7405 = 0;
        class455.field6795 = 0;
        class397.field5997 = 0;
        class320.field4903 = 0;
        class251.field3587 = 0;
        class114.field1900 = 0;
        class437.field6539 = 0;
        class437.field6516 = 0;
        class145.field2259 = 0;
        class343.field5168 = 0;
        class157.field2458 = 0;
        class114.field1899 = 0;
        class303.field4386 = 0;
        class355.field5413 = 0;
        class481.field7162 = 0;
        class1.field38 = 0;
        class130.field2063 = 0;
        class303.field4350 = 0;
        class105.field1748 = 0;
        class86.field1501 = 0;
        class106.field1763 = 0;
        class36.field694 = 0;
        class397.field5989 = 0;
        class350.field5341 = 0;
        class405.field6070 = 0;
        class121.field1973 = 0;
        class42.field787 = 0;
        class56.field966 = 0;
        class221.field3171 = 0;
        class289.field4120 = 0;
        class455.field6801 = 0;
        class339.field5105 = 0;
        class385.field5805 = 0;
        class466.field6959 = 0;
        class219.field3148 = 0;
        class26.field572 = 0;
        class103.field1696 = 0;
        class188.field2809 = 0;
        class77.field1278 = 0;
        class319.field4814 = 0;
        class445.field6639 = 0;
        class466.field6961 = 0;
        class386.field5821 = 0;
        class202.field2953 = 0;
        class162.field2508 = 0;
        class147.field2349 = 0;
        class441.field6582 = 0;
        class9.field149 = 0;
        class504.field7449 = 0;
        class315.field4749 = 0;
        class435.field6472 = 0;
        class275.field3979 = 0;
        class2.field87 = 0;
        class517.field7662 = 0;
        class79.field1344 = 0;
        class419.field6251 = 0;
        class319.field4816 = 0;
        class145.field2278 = 0;
        client.field2872 = 0;
        class368.field5563 = 0;
        class255.field3675 = 0;
        class91.field1572 = 0;
        class338.field5092 = 0;
        class268.field3864 = 0;
        class103.field1710 = 0;
        class115.field1906 = 0;
        class45.field846 = 0;
        class213.field3068 = 0;
        class502.field7401 = 0;
        class228.field3245 = 0;
        class303.field4441 = 0;
        class388.field5840 = 0;
        class138.field2211 = 0;
        class368.field5566 = 0;
        class174.field2672 = 0;
        class54.field939 = 0;
        class436.field6495 = 0;
        class307.field4690 = 0;
        class422.field6297 = 0;
        class129.field2045 = 0;
        class121.field1961 = 0;
        class330.field4977 = 0;
        class87.field1528 = 0;
        class108.field1790 = 0;
        class17.field278 = 0;
        class270.field3885 = 0;
        class470.field7053 = 0;
        class445.field6636 = 0;
        class296.field4204 = 0;
        class470.field6995 = 0;
        class78.field1311 = 0;
        class303.field4382 = 0;
        class332.field5024 = 0;
        class234.field3407 = 0;
        class36.field689 = 0;
        class55.field958 = 0;
        class78.field1304 = 0;
        class3.field103 = 0;
        class464.field6942 = 0;
        class399.field6018 = 0;
        class388.field5843 = 0;
        class334.field5040 = 0;
        class383.field5795 = 0;
        class45.field847 = 0;
        class232.field3385 = 0;
        class163.field2519 = 0;
        class448.field6718 = 0;
        class79.field1338 = 0;
        class447.field6673 = 0;
        class350.field5303 = 0;
        class109.field1799 = 0;
        class355.field5416 = 0;
        class165.field2548 = 0;
        class212.field3032 = 0;
        class162.field2504 = 0;
        class303.field4435 = 0;
        class246.field3535 = 0;
        class399.field6010 = 0;
        class457.field6851 = 0;
        class79.field1387 = 0;
        class385.field5803 = 0;
        class319.field4863 = 0;
        class339.field5106 = 0;
        class392.field5934 = 0;
        class308.field4707 = 0;
        class110.field1863 = 0;
        class104.field1730 = 0;
        class166.field2574 = 0;
        class496.field7331 = 0;
        class223.field3196 = 0;
        class397.field5998 = 0;
        class21.field384 = 0;
        class368.field5558 = 0;
        class184.field2760 = 0;
        class496.field7327 = 0;
        class431.field6411 = 0;
        class255.field3668 = 0;
        class66.field1139 = 0;
        class169.field2620 = 0;
        class523.field7764 = 0;
        class389.field5849 = 0;
        class447.field6665 = 0;
        class29.field606 = 0;
        class303.field4434 = 0;
        class141.field2242 = 0;
        class11.field190 = 0;
        class366.field5526 = 0;
        class146.field2336 = 0;
        class343.field5154 = 0;
        class306.field4683 = 0;
        class270.field3882 = 0;
        class232.field3388 = 0;
        class109.field1825 = 0;
        class201.field2941 = 0;
        class138.field2218 = 0;
        class408.field6130 = 0;
        class412.field6159 = 0;
        class514.field7558 = 0;
        class66.field1140 = 0;
        class441.field6594 = 0;
        class303.field4363 = 0;
        class17.field270 = 0;
        class253.field3623 = 0;
        class244.field3509 = 0;
        class325.field4949 = 0;
        class21.field389 = 0;
        class2.field70 = 0;
        class319.field4821 = 0;
        class319.field4879 = 0;
        class495.field7310 = 0;
        class414.field6179 = 0;
        class102.field1687 = 0;
        class268.field3865 = 0;
        class303.field4463 = 0;
        class319.field4837 = 0;
        class115.field1907 = 0;
        class264.field3805 = 0;
        class234.field3403 = 0;
        class373.field5660 = 0;
        class190.field2831 = 0;
        class66.field1146 = 0;
        class256.field3703 = 0;
        class339.field5109 = 0;
        class452.field6756 = 0;
        class502.field7404 = 0;
        class457.field6846 = 0;
        class474.field7087 = 0;
        class518.field7707 = 0;
        class228.field3244 = 0;
        class489.field7247 = 0;
        class496.field7317 = 0;
        class519.field7723 = 0;
        class446.field6656 = 0;
        class283.field4044 = 0;
        class396.field5961 = 0;
        class274.field3960 = 0;
        class303.field4459 = 0;
        class320.field4898 = 0;
        class417.field6229 = 0;
        class2.field71 = 0;
        class305.field4651 = 0;
        class79.field1386 = 0;
        class122.field1987 = 0;
        class500.field7378 = 0;
        class390.field5873 = 0;
        class272.field3925 = 0;
        class519.field7716 = 0;
        class303.field4424 = 0;
        class232.field3387 = 0;
        class256.field3714 = 0;
        class498.field7353 = 0;
        class57.field998 = 0;
        class36.field695 = 0;
        class342.field5151 = 0;
        class319.field4884 = 0;
        class168.field2611 = 0;
        class338.field5091 = 0;
        class26.field563 = 0;
        class146.field2341 = 0;
        class1.field8 = 0;
        class70.field1223 = 0;
        class343.field5164 = 0;
        class523.field7767 = 0;
        class64.field1102 = 0;
        class421.field6284 = 0;
        class274.field3972 = 0;
        class88.field1540 = 0;
        class489.field7236 = 0;
        class258.field3743 = 0;
        class137.field2180 = 0;
        class373.field5659 = 0;
        class350.field5352 = 0;
        class85.field1476 = 0;
        class202.field2956 = 0;
        class481.field7157 = 0;
        class87.field1534 = 0;
        class134.field2155 = 0;
        class212.field3036 = 0;
        class470.field7027 = 0;
        class368.field5554 = 0;
        class441.field6593 = 0;
        class247.field3564 = 0;
        class148.field2359 = 0;
        class25.field546 = 0;
        class76.field1276 = 0;
        class332.field5027 = 0;
        class474.field7081 = 0;
        class303.field4371 = 0;
        class256.field3711 = 0;
        class299.field4261 = 0;
        class216.field3111 = 0;
        class25.field551 = 0;
        class389.field5854 = 0;
        class105.field1761 = 0;
        class303.field4450 = 0;
        class255.field3676 = 0;
        class303.field4395 = 0;
        class240.field3465 = 0;
        class129.field2043 = 0;
        class389.field5846 = 0;
        class310.field4725 = 0;
        class488.field7221 = 0;
        class335.field5056 = 0;
        class58.field1025 = 0;
        class12.field200 = 0;
        class116.field1910 = 0;
        class255.field3673 = 0;
        class406.field6091 = 0;
        class332.field5016 = 0;
        class487.field7210 = 0;
        class78.field1306 = 0;
        class474.field7095 = 0;
        class103.field1708 = 0;
        class391.field5922 = 0;
        class461.field6909 = 0;
        class510.field7531 = 0;
        class432.field6422 = 0;
        class489.field7235 = 0;
        class436.field6496 = 0;
        class502.field7396 = 0;
        class319.field4894 = 0;
        class516.field7584 = 0;
        class457.field6822 = 0;
        class328.field4952 = 0;
        class255.field3662 = 0;
        class518.field7700 = 0;
        class481.field7165 = 0;
        class221.field3170 = 0;
        class460.field6900 = 0;
        class45.field849 = 0;
        class254.field3648 = 0;
        class167.field2595 = 0;
        class42.field749 = 0;
        class111.field1884 = 0;
        class390.field5883 = 0;
        class333.field5032 = 0;
        class389.field5855 = 0;
        class22.field445 = 0;
        class339.field5118 = 0;
        class45.field852 = 0;
        class240.field3471 = 0;
        class447.field6703 = 0;
        class517.field7619 = 0;
        class164.field2535 = 0;
        class229.field3254 = 0;
        class452.field6762 = 0;
        class65.field1113 = 0;
        class216.field3107 = 0;
        class319.field4852 = 0;
        class319.field4803 = 0;
        class503.field7412 = 0;
        class343.field5166 = 0;
        class101.field1657 = 0;
        class244.field3505 = 0;
        class79.field1396 = 0;
        class42.field766 = 0;
        class270.field3891 = 0;
        class56.field969 = 0;
        class183.field2737 = 0;
        class370.field5598 = 0;
        class32.field641 = 0;
        class409.field6132 = 0;
        class11.field172 = 0;
        class68.field1176 = 0;
        class259.field3757 = 0;
        class168.field2609 = 0;
        class303.field4383 = 0;
        class240.field3440 = 0;
        class449.field6727 = 0;
        class213.field3050 = 0;
        class388.field5844 = 0;
        class145.field2308 = 0;
        class503.field7417 = 0;
        class460.field6891 = 0;
        class145.field2295 = 0;
        class165.field2540 = 0;
        class309.field4719 = 0;
        class65.field1123 = 0;
        class427.field6350 = 0;
        class244.field3501 = 0;
        class446.field6660 = 0;
        class64.field1095 = 0;
        class145.field2315 = 0;
        class165.field2542 = 0;
        class517.field7665 = 0;
        class32.field642 = 0;
        class303.field4337 = 0;
        class331.field5005 = 0;
        class446.field6657 = 0;
        class283.field4042 = 0;
        class304.field4645 = 0;
        class457.field6832 = 0;
        class25.field534 = 0;
        class483.field7197 = 0;
        class55.field944 = 0;
        class322.field4916 = 0;
        class200.field2930 = 0;
        class419.field6261 = 0;
        class65.field1108 = 0;
        class19.field324 = 0;
        class214.field3084 = 0;
        class441.field6600 = 0;
        class300.field4266 = 0;
        class303.field4464 = 0;
        class319.field4891 = 0;
        class435.field6469 = 0;
        class470.field7000 = 0;
        class32.field645 = 0;
        class319.field4801 = 0;
        class79.field1394 = 0;
        class22.field453 = 0;
        class56.field974 = 0;
        class167.field2593 = 0;
        class332.field5029 = 0;
        class437.field6525 = 0;
        class183.field2739 = 0;
        class185.field2764 = 0;
        class116.field1924 = 0;
        class470.field7050 = 0;
        class170.field2631 = 0;
        class122.field1985 = 0;
        class145.field2265 = 0;
        class413.field6168 = 0;
        class232.field3380 = 0;
        class446.field6662 = 0;
        class188.field2805 = 0;
        client.field2875 = 0;
        class325.field4947 = 0;
        class124.field2006 = 0;
        class83.field1452 = 0;
        class425.field6328 = 0;
        class298.field4250 = 0;
        class303.field4355 = 0;
        class511.field7540 = 0;
        class399.field6011 = 0;
        class270.field3898 = 0;
        class511.field7535 = 0;
        class250.field3581 = 0;
        class460.field6886 = 0;
        class58.field1023 = 0;
        class17.field271 = 0;
        class260.field3786 = 0;
        class474.field7096 = 0;
        class165.field2557 = 0;
        class523.field7765 = 0;
        class523.field7755 = 0;
        class221.field3165 = 0;
        class110.field1848 = 0;
        class124.field2005 = 0;
        class188.field2808 = 0;
        class240.field3442 = 0;
        class253.field3610 = 0;
        class319.field4804 = 0;
        class420.field6278 = 0;
        class17.field246 = 0;
        class17.field264 = 0;
        class87.field1526 = 0;
        class51.field909 = 0;
        class103.field1711 = 0;
        class101.field1664 = 0;
        class460.field6901 = 0;
        class359.field5457 = 0;
        class98.field1626 = 0;
        class452.field6749 = 0;
        class303.field4343 = 0;
        class202.field2962 = 0;
        class342.field5150 = 0;
        class319.field4834 = 0;
        class256.field3715 = 0;
        class13.field210 = 0;
        class214.field3074 = 0;
        class244.field3514 = 0;
        class68.field1175 = 0;
        class410.field6140 = 0;
        client.field2874 = 0;
        class319.field4802 = 0;
        class256.field3698 = 0;
        class470.field7004 = 0;
        class55.field950 = 0;
        class86.field1492 = 0;
        class304.field4644 = 0;
        class277.field3988 = 0;
        class494.field7305 = 0;
        class41.field736 = 0;
        class303.field4327 = 0;
        class64.field1100 = 0;
        class270.field3881 = 0;
        class416.field6216 = 0;
        class145.field2292 = 0;
        client.field2882 = 0;
        class292.field4153 = 0;
        class212.field3035 = 0;
        class109.field1804 = 0;
        class399.field6016 = 0;
        class421.field6294 = 0;
        class396.field5979 = 0;
        class55.field947 = 0;
        class462.field6918 = 0;
        class17.field250 = 0;
        class460.field6888 = 0;
        class453.field6764 = 0;
        class355.field5419 = 0;
        class265.field3814 = 0;
        class163.field2518 = 0;
        class496.field7329 = 0;
        class358.field5444 = 0;
        class134.field2113 = 0;
        class289.field4119 = 0;
        class59.field1041 = 0;
        class26.field554 = 0;
        class103.field1695 = 0;
        class470.field7045 = 0;
        class168.field2604 = 0;
        class369.field5592 = 0;
        class481.field7164 = 0;
        class107.field1779 = 0;
        class501.field7394 = 0;
        class246.field3538 = 0;
        class380.field5766 = 0;
        class96.field1611 = 0;
        class55.field957 = 0;
        class60.field1054 = 0;
        class2.field90 = 0;
        class517.field7646 = 0;
        class217.field3120 = 0;
        class116.field1916 = 0;
        class134.field2095 = 0;
        class296.field4206 = 0;
        class518.field7702 = 0;
        class254.field3643 = 0;
        class17.field272 = 0;
        class368.field5561 = 0;
        class188.field2801 = 0;
        class470.field7023 = 0;
        class303.field4367 = 0;
        class213.field3066 = 0;
        class212.field3039 = 0;
        class277.field3996 = 0;
        class470.field7010 = 0;
        class201.field2934 = 0;
        class468.field6969 = 0;
        class213.field3051 = 0;
        class36.field682 = 0;
        class361.field5477 = 0;
        class255.field3661 = 0;
        class90.field1564 = 0;
        class210.field3025 = 0;
        class19.field312 = 0;
        class445.field6632 = 0;
        class213.field3065 = 0;
        class370.field5608 = 0;
        class215.field3092 = 0;
        class459.field6876 = 0;
        class42.field764 = 0;
        class489.field7246 = 0;
        class103.field1702 = 0;
        class134.field2122 = 0;
        class240.field3468 = 0;
        class138.field2197 = 0;
        class519.field7722 = 0;
        class470.field7008 = 0;
        class20.field348 = 0;
        class201.field2935 = 0;
        class430.field6400 = 0;
        class303.field4328 = 0;
        class177.field2688 = 0;
        class17.field249 = 0;
        class518.field7705 = 0;
        class398.field6001 = 0;
        class187.field2787 = 0;
        class129.field2047 = 0;
        class422.field6301 = 0;
        class246.field3539 = 0;
        class101.field1674 = 0;
        class350.field5222 = 0;
        class17.field275 = 0;
        class247.field3571 = 0;
        class303.field4306 = 0;
        class95.field1603 = 0;
        class246.field3540 = 0;
        class66.field1143 = 0;
        class455.field6807 = 0;
        class303.field4303 = 0;
        class167.field2589 = 0;
        class268.field3867 = 0;
        class219.field3134 = 0;
        class145.field2273 = 0;
        class455.field6798 = 0;
        class11.field170 = 0;
        class37.field701 = 0;
        class17.field254 = 0;
        class355.field5426 = 0;
        class161.field2489 = 0;
        class2.field79 = 0;
        class87.field1530 = 0;
        class431.field6403 = 0;
        class28.field589 = 0;
        class209.field3018 = 0;
        class17.field279 = 0;
        class107.field1775 = 0;
        field661 = 0;
        class277.field3989 = 0;
        class489.field7238 = 0;
        class391.field5917 = 0;
        class196.field2888 = 0;
        class396.field5981 = 0;
        class110.field1846 = 0;
        class478.field7129 = 0;
        class358.field5437 = 0;
        class303.field4299 = 0;
        class65.field1104 = 0;
        class217.field3117 = 0;
        class240.field3460 = 0;
        class285.field4060 = 0;
        class110.field1858 = 0;
        class130.field2067 = 0;
        class390.field5863 = 0;
        class364.field5508 = 0;
        class167.field2580 = 0;
        class502.field7399 = 0;
        class474.field7079 = 0;
        class319.field4792 = 0;
        class445.field6637 = 0;
        class331.field4987 = 0;
        class329.field4972 = 0;
        class21.field425 = 0;
        class102.field1679 = 0;
        class489.field7232 = 0;
        class145.field2275 = 0;
        class305.field4665 = 0;
        class303.field4432 = 0;
        class303.field4436 = 0;
        class177.field2689 = 0;
        class517.field7645 = 0;
        class438.field6547 = 0;
        class303.field4376 = 0;
        class335.field5057 = 0;
        class101.field1675 = 0;
        class303.field4347 = 0;
        class244.field3511 = 0;
        class210.field3029 = 0;
        class66.field1137 = 0;
        class36.field686 = 0;
        class342.field5153 = 0;
        class19.field316 = 0;
        class323.field4934 = 0;
        class64.field1093 = 0;
        class303.field4396 = 0;
        class414.field6178 = 0;
        class253.field3628 = 0;
        class319.field4797 = 0;
        class116.field1912 = 0;
        class350.field5272 = 0;
        class98.field1629 = 0;
        class281.field4019 = 0;
        class258.field3744 = 0;
        class240.field3450 = 0;
        class496.field7319 = 0;
        class42.field775 = 0;
        class91.field1569 = 0;
        class303.field4323 = 0;
        class76.field1272 = 0;
        class390.field5865 = 0;
        field647 = 0;
        class492.field7278 = 0;
        class213.field3072 = 0;
        class392.field5928 = 0;
        class363.field5499 = 0;
        class369.field5587 = 0;
        class372.field5648 = 0;
        class270.field3883 = 0;
        class245.field3516 = 0;
        class258.field3748 = 0;
        class104.field1739 = 0;
        class447.field6716 = 0;
        class480.field7141 = 0;
        class125.field2019 = 0;
        class87.field1524 = 0;
        class517.field7600 = 0;
        class2.field72 = 0;
        class515.field7579 = 0;
        class383.field5796 = 0;
        class303.field4365 = 0;
        class36.field683 = 0;
        class470.field7024 = 0;
        class86.field1484 = 0;
        class303.field4431 = 0;
        class170.field2636 = 0;
        class65.field1116 = 0;
        class453.field6768 = 0;
        class244.field3513 = 0;
        class61.field1067 = 0;
        class339.field5121 = 0;
        class366.field5524 = 0;
        class319.field4841 = 0;
        class291.field4141 = 0;
        class303.field4305 = 0;
        class308.field4705 = 0;
        class5.field116 = 0;
        class380.field5737 = 0;
        class145.field2314 = 0;
        class306.field4680 = 0;
        class210.field3026 = 0;
        class492.field7281 = 0;
        class245.field3525 = 0;
        class3.field99 = 0;
        class477.field7121 = 0;
        class121.field1974 = 0;
        class470.field7012 = 0;
        class122.field1989 = 0;
        class138.field2188 = 0;
        class260.field3782 = 0;
        class423.field6314 = 0;
        class43.field828 = 0;
        class422.field6304 = 0;
        class20.field339 = 0;
        class134.field2098 = 0;
        class285.field4061 = 0;
        class242.field3490 = 0;
        class390.field5887 = 0;
        class412.field6155 = 0;
        class526.field7776 = 0;
        class391.field5926 = 0;
        class457.field6830 = 0;
        class303.field4456 = 0;
        class383.field5793 = 0;
        class162.field2503 = 0;
        class4.field106 = 0;
        class156.field2452 = 0;
        class250.field3579 = 0;
        class167.field2583 = 0;
        class219.field3144 = 0;
        class76.field1273 = 0;
        class339.field5099 = 0;
        class2.field83 = 0;
        class332.field5022 = 0;
        class380.field5758 = 0;
        class228.field3243 = 0;
        class504.field7440 = 0;
        class303.field4473 = 0;
        class474.field7084 = 0;
        class253.field3625 = 0;
        class25.field540 = 0;
        class362.field5485 = 0;
        class396.field5959 = 0;
        class134.field2106 = 0;
        class390.field5894 = 0;
        class392.field5935 = 0;
        class396.field5978 = 0;
        class303.field4381 = 0;
        class165.field2552 = 0;
        class391.field5914 = 0;
        class338.field5097 = 0;
        class329.field4970 = 0;
        class303.field4317 = 0;
        class146.field2331 = 0;
        class79.field1315 = 0;
        class21.field402 = 0;
        class370.field5606 = 0;
        class28.field582 = 0;
        class423.field6318 = 0;
        class378.field5714 = 0;
        class183.field2741 = 0;
        class145.field2260 = 0;
        class259.field3756 = 0;
        class331.field5008 = 0;
        class423.field6312 = 0;
        class319.field4893 = 0;
        class145.field2258 = 0;
        class111.field1883 = 0;
        class386.field5825 = 0;
        class331.field4988 = 0;
        class255.field3664 = 0;
        class337.field5077 = 0;
        class165.field2570 = 0;
        class482.field7172 = 0;
        class127.field2028 = 0;
        class167.field2598 = 0;
        class121.field1969 = 0;
        class257.field3729 = 0;
        class145.field2322 = 0;
        class427.field6348 = 0;
        class347.field5188 = 0;
        class203.field2968 = 0;
        class328.field4959 = 0;
        class28.field581 = 0;
        class64.field1092 = 0;
        class137.field2182 = 0;
        class397.field5990 = 0;
        class319.field4810 = 0;
        class464.field6940 = 0;
        class25.field550 = 0;
        class380.field5742 = 0;
        class202.field2963 = 0;
        class516.field7589 = 0;
        class376.field5708 = 0;
        class101.field1661 = 0;
        class42.field765 = 0;
        class257.field3737 = 0;
        class470.field7051 = 0;
        class66.field1144 = 0;
        class380.field5729 = 0;
        class109.field1809 = 0;
        class246.field3553 = 0;
        class319.field4819 = 0;
        class402.field6032 = 0;
        class523.field7757 = 0;
        class457.field6826 = 0;
        class86.field1504 = 0;
        class396.field5962 = 0;
        class254.field3652 = 0;
        class305.field4648 = 0;
        class303.field4357 = 0;
        class109.field1812 = 0;
        class270.field3906 = 0;
        class103.field1707 = 0;
        class221.field3168 = 0;
        class303.field4467 = 0;
        class514.field7553 = 0;
        class303.field4313 = 0;
        class500.field7381 = 0;
        client.field2884 = 0;
        class497.field7348 = 0;
        class175.field2677 = 0;
        class146.field2328 = 0;
        class151.field2391 = 0;
        class156.field2453 = 0;
        class358.field5446 = 0;
        class300.field4265 = 0;
        class303.field4471 = 0;
        class188.field2803 = 0;
        class497.field7339 = 0;
        class217.field3122 = 0;
        class462.field6926 = 0;
        class390.field5881 = 0;
        class424.field6327 = 0;
        class518.field7706 = 0;
        class480.field7147 = 0;
        class91.field1567 = 0;
        class305.field4664 = 0;
        class506.field7466 = 0;
        class145.field2283 = 0;
        class234.field3402 = 0;
        class303.field4291 = 0;
        class36.field687 = 0;
        class213.field3064 = 0;
        class497.field7335 = 0;
        class145.field2287 = 0;
        class55.field945 = 0;
        class17.field265 = 0;
        class449.field6729 = 0;
        class183.field2738 = 0;
        class339.field5113 = 0;
        class207.field2999 = 0;
        class226.field3213 = 0;
        class436.field6500 = 0;
        class255.field3665 = 0;
        class515.field7566 = 0;
        class331.field4997 = 0;
        class337.field5078 = 0;
        class11.field176 = 0;
        class55.field961 = 0;
        class111.field1874 = 0;
        class463.field6934 = 0;
        class492.field7267 = 0;
        class422.field6306 = 0;
        class331.field4991 = 0;
        class303.field4301 = 0;
        class426.field6343 = 0;
        class86.field1481 = 0;
        class270.field3905 = 0;
        class285.field4065 = 0;
        class78.field1305 = 0;
        class145.field2279 = 0;
        class368.field5551 = 0;
        class506.field7465 = 0;
        class123.field1995 = 0;
        class303.field4425 = 0;
        class297.field4221 = 0;
        class66.field1133 = 0;
        class104.field1732 = 0;
        class240.field3472 = 0;
        class457.field6844 = 0;
        class483.field7193 = 0;
        class227.field3236 = 0;
        class174.field2675 = 0;
        class435.field6441 = 0;
        class2.field77 = 0;
        class17.field252 = 0;
        class246.field3542 = 0;
        class120.field1958 = 0;
        class145.field2274 = 0;
        class303.field4341 = 0;
        class163.field2528 = 0;
        class23.field474 = 0;
        class365.field5518 = 0;
        class145.field2261 = 0;
        class267.field3845 = 0;
        class386.field5819 = 0;
        class455.field6805 = 0;
        class116.field1915 = 0;
        class88.field1544 = 0;
        class58.field1027 = 0;
        class487.field7211 = 0;
        class359.field5452 = 0;
        class174.field2667 = 0;
        class406.field6086 = 0;
        class142.field2247 = 0;
        class134.field2090 = 0;
        class179.field2709 = 0;
        class348.field5196 = 0;
        class42.field820 = 0;
        class390.field5876 = 0;
        class63.field1090 = 0;
        class457.field6824 = 0;
        class270.field3901 = 0;
        class243.field3496 = 0;
        class54.field935 = 0;
        class303.field4452 = 0;
        class303.field4406 = 0;
        class392.field5943 = 0;
        class135.field2170 = 0;
        class352.field5389 = 0;
        class303.field4403 = 0;
        class422.field6308 = 0;
        class303.field4292 = 0;
        class140.field2231 = 0;
        class445.field6633 = 0;
        class210.field3023 = 0;
        class253.field3617 = 0;
        class305.field4660 = 0;
        if (arg0 != -15819) {
            field662 = -89;
        }
        class240.field3451 = 0;
        class451.field6737 = 0;
        class134.field2108 = 0;
        class250.field3580 = 0;
        class145.field2266 = 0;
        class416.field6223 = 0;
        class105.field1744 = 0;
        class29.field627 = 0;
        class390.field5893 = 0;
        class219.field3139 = 0;
        class455.field6793 = 0;
        class268.field3849 = 0;
        class70.field1219 = 0;
        class109.field1798 = 0;
        class277.field3991 = 0;
        class188.field2800 = 0;
        class213.field3067 = 0;
        class396.field5966 = 0;
        class17.field282 = 0;
        class446.field6659 = 0;
        class283.field4036 = 0;
        class305.field4662 = 0;
        class470.field6997 = 0;
        class134.field2156 = 0;
        class109.field1815 = 0;
        class145.field2301 = 0;
        class65.field1115 = 0;
        class104.field1736 = 0;
        class17.field269 = 0;
        class343.field5167 = 0;
        class433.field6427 = 0;
        class66.field1135 = 0;
        class457.field6831 = 0;
        class303.field4423 = 0;
        class213.field3057 = 0;
        class270.field3889 = 0;
        class350.field5287 = 0;
        class103.field1712 = 0;
        class303.field4332 = 0;
        class303.field4358 = 0;
        class517.field7626 = 0;
        class526.field7777 = 0;
        class145.field2288 = 0;
        class252.field3594 = 0;
        class19.field322.method2728((byte) 115);
        class160.field2478 = true;
        class274.field3947 = true;
        class500.method2993(arg0 + 15706);
        class410.field6141.field2289 = 0;
        class298.field4247 = null;
        class349.field5212 = 0;
        class291.field4140 = 0;
        class158.field2463 = null;
        class92.field1573.field2289 = 0;
        class277.field4001 = null;
        class23.field468 = 0;
        class306.field4673 = null;
        for (int var1 = 0; var1 < class45.field835.length; var1++) {
            class45.field835[var1] = null;
        }
        for (int var2 = 0; var2 < 100; var2++) {
            class142.field2250[var2] = null;
        }
        class476.field7117 = 0;
        class99.field1638 = false;
        class385.method2383(true);
        class526.field7779 = ((int) (Math.random() * 160.0D) - 80 & 0x3FFF);
        class435.field6453 = (int) (Math.random() * 110.0D) - 55;
        class345.field5179 = (int) (Math.random() * 80.0D) - 40;
        class115.field1905 = (int) (Math.random() * 100.0D) - 50;
        class70.field1215 = (int) (Math.random() * 30.0D) - 20;
        class255.field3674 = (int) (Math.random() * 120.0D) - 60;
        class362.method2272(0);
        for (int var3 = 0; var3 < 2048; var3++) {
            class183.field2747[var3] = null;
        }
        class510.field7529 = 0;
        for (int var4 = 0; var4 < 32768; var4++) {
            class34.field668[var4] = null;
        }
        class149.field2372.method2419((byte) 112);
        class167.field2596.method2419((byte) 126);
        class343.field5157.method1637(arg0 ^ 0xFFFFA6D2);
        class433.field6430.method159(arg0 + 15819);
        class431.field6415 = new class392();
        class184.field2756 = 0;
        class169.field2623 = 0;
        class335.field5059.method2305(true);
        class121.method892(0);
        class403.field6053 = 0;
        class516.field7587 = 0;
        class98.field1631 = 0;
        class302.field4285 = 0;
        class236.field3423 = 0;
        class152.field2416 = 0;
        class184.field2758 = 0;
        class236.field3422 = 0;
        class420.field6283 = 0;
        class255.field3660 = 0;
        for (int var5 = 0; var5 < class170.field2629.length; var5++) {
            if (!class255.field3672[var5]) {
                class170.field2629[var5] = -1;
            }
        }
        if (class364.field5513 != -1) {
            class503.method3010((byte) -124, class364.field5513);
        }
        for (class352 var6 = (class352) class162.field2507.method160((byte) -20); var6 != null; var6 = (class352) class162.field2507.method163(124)) {
            if (!var6.method2091((byte) 2)) {
                var6 = (class352) class162.field2507.method160((byte) -20);
                if (var6 == null) {
                    break;
                }
            }
            class123.method946(true, false, var6, (byte) 80);
        }
        class364.field5513 = -1;
        class162.field2507 = new class20(8);
        class122.method943(false);
        class162.field2513 = null;
        for (int var7 = 0; var7 < 8; var7++) {
            class11.field169[var7] = null;
            class159.field2474[var7] = false;
            class26.field561[var7] = -1;
        }
        class468.method2774(-74);
        class421.field6291 = true;
        for (int var8 = 0; var8 < 100; var8++) {
            class355.field5424[var8] = true;
        }
        class149.field2374 = null;
        class335.field5050 = 0;
        class202.field2955 = null;
        for (int var9 = 0; var9 < 6; var9++) {
            class61.field1072[var9] = new class499();
        }
        for (int var10 = 0; var10 < 25; var10++) {
            class95.field1607[var10] = 0;
            class232.field3384[var10] = 0;
            class489.field7249[var10] = 0;
        }
        class418.method2527((byte) -111);
        class157.field2461 = true;
        class163.field2527 = class519.field7724 = class240.field3447 = class173.field2663 = new short[256];
        class165.field2561 = class234.field3409.method2180(client.field2870, 29491);
        class443.field6623.field7097 = false;
        class443.field6623.field7092 = false;
        class334.field5043 = 0;
        class429.method2573(338);
        class474.method2839((byte) 108);
        class445.field6649.field247 = 2;
        class462.field6919 = 0L;
        class188.field2817 = null;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(IIIILvm;)V", line = 3191)
    public static final void method356(int arg0, int arg1, int arg2, int arg3, class481 arg4) {
        class429 var5 = class394.method2438(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        int var6 = 0;
        arg4.field7156 = (arg1 << class426.field6345) + class130.field2075;
        arg4.field7160 = arg3;
        arg4.field7158 = (arg2 << class426.field6345) + class130.field2075;
        for (class166 var7 = var5.field6364; var7 != null; var7 = var7.field2572) {
            if (var7.field2576.field6225) {
                int var8 = var7.field2576.method547(3);
                if (var8 != -32768 && var8 < var6) {
                    var6 = var8;
                }
            }
        }
        if (var6 < 0) {
            arg4.field7160 += var6;
            arg4.field7154 = true;
        }
        var5.field6385 = arg4;
    }

    @OriginalMember(owner = "client!bt", name = "c", descriptor = "(I)V", line = 3234)
    public static final void method357(int arg0) {
        if (class291.field4140 > 1) {
            class291.field4140--;
            class232.field3381 = class431.field6404;
        }
        if (arg0 > -31) {
            return;
        }
        if (class349.field5212 > 0) {
            class349.field5212--;
        }
        field660++;
        if (class83.field1448) {
            class83.field1448 = false;
            class149.method1144(2);
            return;
        }
        if (!class197.field2903) {
            class369.method2313((byte) 127);
        }
        for (int var1 = 0; var1 < 100 && class504.method3019(39); var1++) {
        }
        if (class281.field4023 != 30) {
            return;
        }
        class331.method2124(0, class147.field2353.method1253((byte) -123), class410.field6141);
        if (class188.field2817 == null) {
            if (class462.field6919 <= class211.method1419(12921)) {
                class188.field2817 = class390.field5892.method2755(class315.field4742, (byte) -63);
            }
        } else if (class188.field2817.field7074 != -1) {
            class28.method321(class48.field887, -5001);
            class410.field6141.method1094(1618659784, class188.field2817.field7074);
            class188.field2817 = null;
            class462.field6919 = class211.method1419(12921) + 30000L;
        }
        class432 var2 = (class432) class502.field7411.method2427(117);
        if (var2 != null || class211.method1419(12921) - 2000L > class123.field1999) {
            boolean var3 = false;
            int var4 = class410.field6141.field2289;
            for (class432 var5 = (class432) class449.field6726.method2427(108); var5 != null && (class410.field6141.field2289 - var4) < 240; var5 = (class432) class449.field6726.method2422(-82)) {
                var5.method2090(-1);
                int var6 = var5.method2186((byte) 123);
                if (var6 < 0) {
                    var6 = 0;
                } else if (var6 > 65534) {
                    var6 = 65534;
                }
                int var7 = var5.method2183(-5);
                if (var7 < 0) {
                    var7 = 0;
                } else if (var7 > 65534) {
                    var7 = 65534;
                }
                boolean var8 = false;
                if (var5.method2186((byte) 104) == -1 && var5.method2183(-5) == -1) {
                    var7 = -1;
                    var8 = true;
                    var6 = -1;
                }
                if (class49.field894 != var7 || class182.field2732 != var6) {
                    if (!var3) {
                        class480.field7150++;
                        class28.method321(class397.field5999, -5001);
                        class410.field6141.method1109(false, 0);
                        var3 = true;
                        var4 = class410.field6141.field2289;
                    }
                    int var9 = var7 - class49.field894;
                    class49.field894 = var7;
                    int var10 = var6 - class182.field2732;
                    class182.field2732 = var6;
                    int var11 = (int) ((var5.method2184(-1) - class123.field1999) / 20L);
                    if (var11 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                        var10 += 32;
                        var9 += 32;
                        class410.field6141.method1094(1618659784, (var9 << 6) + ((var11 << 12) + var10));
                    } else if (var11 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                        class410.field6141.method1109(false, var11 + 128);
                        var10 += 128;
                        var9 += 128;
                        class410.field6141.method1094(1618659784, (var9 << 8) + var10);
                    } else if (var11 < 32) {
                        class410.field6141.method1109(false, var11 + 192);
                        if (var8) {
                            class410.field6141.method1117(Integer.MIN_VALUE, (byte) 12);
                        } else {
                            class410.field6141.method1117(var7 | var6 << 16, (byte) 12);
                        }
                    } else {
                        class410.field6141.method1094(1618659784, var11 + 57344);
                        if (var8) {
                            class410.field6141.method1117(Integer.MIN_VALUE, (byte) 12);
                        } else {
                            class410.field6141.method1117(var6 << 16 | var7, (byte) 12);
                        }
                    }
                    class123.field1999 = var5.method2184(-1);
                }
            }
            if (var3) {
                class410.field6141.method1110(class410.field6141.field2289 - var4, false);
            }
        }
        if (var2 != null) {
            long var12 = (var2.method2184(-1) - class251.field3590) / 50L;
            if (var12 > 32767L) {
                var12 = 32767L;
            }
            class251.field3590 = var2.method2184(-1);
            int var14 = var2.method2186((byte) 124);
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 65535) {
                var14 = 65535;
            }
            int var15 = var2.method2183(-5);
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 65535) {
                var15 = 65535;
            }
            byte var16 = 0;
            if (var2.method2187((byte) 11) == 2) {
                var16 = 1;
            }
            class28.method321(class446.field6651, -5001);
            int var17 = (int) var12;
            class342.field5151++;
            class410.field6141.method1095(-22, var17 | var16 << 15);
            class410.field6141.method1088(var15 | var14 << 16, -268435456);
        }
        if (class483.field7187 > 0) {
            int var18 = 0;
            for (int var19 = 0; var19 < class483.field7187; var19++) {
                if (class109.field1842[var19].method1169(0)) {
                    var18++;
                }
            }
            if (var18 > 0) {
                class28.method321(class148.field2366, -5001);
                class257.field3729++;
                if (var18 > 75) {
                    var18 = 75;
                }
                class410.field6141.method1109(false, var18 * 3);
                for (int var20 = 0; var20 < class483.field7187; var20++) {
                    class156 var21 = class109.field1842[var20];
                    if (var21.method1169(0)) {
                        long var22 = (var21.method1175(8204) - class385.field5812) / 50L;
                        if (var22 > 65535L) {
                            var22 = 65535L;
                        }
                        class385.field5812 = var21.method1175(8204);
                        class410.field6141.method1109(false, var21.method1171((byte) 101));
                        class410.field6141.method1094(1618659784, (int) var22);
                    }
                }
            }
        }
        if (class392.field5947 > 0) {
            class392.field5947--;
        }
        if (class157.field2461 && class392.field5947 <= 0) {
            class392.field5947 = 20;
            class120.field1953++;
            class157.field2461 = false;
            class28.method321(class360.field5460, -5001);
            class410.field6141.method1094(1618659784, (int) class455.field6790 >> 3);
            class410.field6141.method1068((byte) -89, (int) class526.field7779 >> 3);
        }
        if (class160.field2478 && !class274.field3947) {
            class325.field4947++;
            class274.field3947 = true;
            class28.method321(class252.field3598, -5001);
            class410.field6141.method1109(false, 1);
        }
        if (!class160.field2478 && class274.field3947) {
            class274.field3947 = false;
            class325.field4947++;
            class28.method321(class252.field3598, -5001);
            class410.field6141.method1109(false, 0);
        }
        if (!class72.field1247) {
            class28.method321(class12.field201, -5001);
            class369.field5575++;
            class410.field6141.method1109(false, 0);
            int var24 = class410.field6141.field2289;
            class145 var25 = class443.field6623.method2841(19707);
            class410.field6141.method1076(var25.field2289, -1, 0, var25.field2270);
            class410.field6141.method1110(class410.field6141.field2289 - var24, false);
            class72.field1247 = true;
        }
        if (class380.field5761 != null) {
            if (class85.field1473 == 2) {
                class57.method508(119);
            } else if (class85.field1473 == 3) {
                class106.method797(false);
            }
        }
        if (class388.field5841) {
            class388.field5841 = false;
        } else {
            class174.field2668 /= 2.0F;
        }
        if (class212.field3040) {
            class212.field3040 = false;
        } else {
            class168.field2614 /= 2.0F;
        }
        class476.method2849(5);
        if (class281.field4023 != 30) {
            return;
        }
        class459.method2734((byte) -110);
        class310.method2031((byte) -76);
        class81.method643(false);
        class157.method1177(65294);
        class23.field468++;
        if (class23.field468 > 750) {
            class149.method1144(2);
            return;
        }
        class416.method2519(true);
        class488.method2892(-54);
        class317.method2062((byte) 66);
        for (int var26 = class335.field5059.method2302(43, true); var26 != -1; var26 = class335.field5059.method2302(74, false)) {
            class325.method2101((byte) 18, var26);
            class531.field7825[class207.method1405(31, class474.field7083++)] = var26;
        }
        for (class54 var27 = class427.method2565((byte) 116); var27 != null; var27 = class427.method2565((byte) 116)) {
            int var28 = var27.method477(-13446);
            int var29 = var27.method474(false);
            if (var28 == 1) {
                class170.field2629[var29] = var27.field934;
                class310.field4724 |= class255.field3672[var29];
                class199.field2922[class207.method1405(31, class23.field483++)] = var29;
            } else if (var28 == 2) {
                class352.field5392[var29] = var27.field931;
                class495.field7311[class207.method1405(class353.field5404++, 31)] = var29;
            } else if (var28 == 3) {
                class350 var51 = class319.method2075(true, var29);
                if (!var27.field931.equals(var51.field5364)) {
                    var51.field5364 = var27.field931;
                    class302.method1902((byte) 110, var51);
                }
            } else if (var28 == 4) {
                class350 var30 = class319.method2075(true, var29);
                int var31 = var27.field934;
                int var32 = var27.field930;
                int var33 = var27.field933;
                if (var30.field5286 != var31 || var30.field5260 != var32 || var30.field5258 != var33) {
                    var30.field5286 = var31;
                    var30.field5258 = var33;
                    var30.field5260 = var32;
                    class302.method1902((byte) -106, var30);
                }
            } else if (var28 == 5) {
                class350 var34 = class319.method2075(true, var29);
                if (var27.field934 != var34.field5276 || var27.field934 == -1) {
                    var34.field5323 = 1;
                    var34.field5276 = var27.field934;
                    var34.field5342 = 0;
                    var34.field5220 = 0;
                    class302.method1902((byte) -118, var34);
                }
            } else if (var28 == 6) {
                int var45 = var27.field934;
                int var46 = (var45 & 0x7D1C) >> 10;
                int var47 = (var45 & 0x3FB) >> 5;
                int var48 = var45 & 0x1F;
                int var49 = (var48 << 3) + (var46 << 19) + (var47 << 11);
                class350 var50 = class319.method2075(true, var29);
                if (var50.field5312 != var49) {
                    var50.field5312 = var49;
                    class302.method1902((byte) -99, var50);
                }
            } else if (var28 == 7) {
                class350 var43 = class319.method2075(true, var29);
                boolean var44 = var27.field934 == 1;
                if (var43.field5358 != var44) {
                    var43.field5358 = var44;
                    class302.method1902((byte) -110, var43);
                }
            } else if (var28 == 8) {
                class350 var42 = class319.method2075(true, var29);
                if (var27.field934 != var42.field5261 || var27.field930 != var42.field5361 || var27.field933 != var42.field5253) {
                    var42.field5253 = var27.field933;
                    var42.field5261 = var27.field934;
                    var42.field5361 = var27.field930;
                    if (var42.field5273 != -1) {
                        if (var42.field5356 > 0) {
                            var42.field5253 = var42.field5253 * 32 / var42.field5356;
                        } else if (var42.field5280 > 0) {
                            var42.field5253 = var42.field5253 * 32 / var42.field5280;
                        }
                    }
                    class302.method1902((byte) 50, var42);
                }
            } else if (var28 == 9) {
                class350 var35 = class319.method2075(true, var29);
                if (var27.field934 != var35.field5273 || var27.field930 != var35.field5296) {
                    var35.field5273 = var27.field934;
                    var35.field5296 = var27.field930;
                    class302.method1902((byte) 99, var35);
                }
            } else if (var28 == 10) {
                class350 var36 = class319.method2075(true, var29);
                if (var27.field934 != var36.field5308 || var27.field930 != var36.field5288 || var27.field933 != var36.field5321) {
                    var36.field5308 = var27.field934;
                    var36.field5321 = var27.field933;
                    var36.field5288 = var27.field930;
                    class302.method1902((byte) -126, var36);
                }
            } else if (var28 == 11) {
                class350 var41 = class319.method2075(true, var29);
                var41.field5327 = 0;
                var41.field5225 = var41.field5355 = var27.field934;
                var41.field5246 = 0;
                var41.field5234 = var41.field5293 = var27.field930;
                class302.method1902((byte) 120, var41);
            } else if (var28 == 12) {
                class350 var39 = class319.method2075(true, var29);
                int var40 = var27.field934;
                if (var39 != null && var39.field5215 == 0) {
                    if (var39.field5221 - var39.field5269 < var40) {
                        var40 = var39.field5221 - var39.field5269;
                    }
                    if (var40 < 0) {
                        var40 = 0;
                    }
                    if (var39.field5226 != var40) {
                        var39.field5226 = var40;
                        class302.method1902((byte) 44, var39);
                    }
                }
            } else if (var28 == 14) {
                class350 var37 = class319.method2075(true, var29);
                var37.field5266 = var27.field934;
            } else if (var28 == 15) {
                class308.field4710 = var27.field930;
                class467.field6967 = var27.field934;
                class100.field1648 = true;
            } else if (var28 == 16) {
                class350 var38 = class319.method2075(true, var29);
                var38.field5223 = var27.field934;
            }
        }
        if (class531.field7826 != 0) {
            class343.field5162 += 20;
            if (class343.field5162 >= 400) {
                class531.field7826 = 0;
            }
        }
        class514.field7564++;
        if (class212.field3041 != null) {
            class360.field5461++;
            if (class360.field5461 >= 15) {
                class302.method1902((byte) 14, class212.field3041);
                class212.field3041 = null;
            }
        }
        class449.field6730 = false;
        class47.field876 = null;
        class504.field7446 = null;
        class174.field2673 = false;
        class452.method2693(-1, 255, null, -1);
        class196.method1360(-1, 3, null, -1);
        if (!class99.field1638) {
            class245.field3518 = -1;
        }
        class497.method2979(0);
        class431.field6404++;
        if (class274.field3952) {
            class417.field6236++;
            class28.method321(class121.field1971, -5001);
            class410.field6141.method1103(class80.field1414 << 28 | class353.field5407 << 14 | class418.field6241, -16384);
            class274.field3952 = false;
        }
        while (true) {
            class207 var52;
            class350 var53;
            class350 var54;
            do {
                var52 = (class207) class72.field1243.method2423(0);
                if (var52 == null) {
                    while (true) {
                        class207 var55;
                        class350 var56;
                        class350 var57;
                        do {
                            var55 = (class207) class491.field7262.method2423(0);
                            if (var55 == null) {
                                while (true) {
                                    class207 var58;
                                    class350 var59;
                                    class350 var60;
                                    do {
                                        var58 = (class207) class378.field5715.method2423(0);
                                        if (var58 == null) {
                                            if (class47.field876 == null) {
                                                class333.field5035 = 0;
                                            }
                                            if (class475.field7100 != null) {
                                                class246.method1598((byte) -95);
                                            }
                                            if (class75.field1260 > 0 && class380.field5726.method1584(14, 82) && class380.field5726.method1584(14, 81) && class50.field908 != 0) {
                                                int var61 = class139.field2224.field6232 - class50.field908;
                                                if (var61 < 0) {
                                                    var61 = 0;
                                                } else if (var61 > 3) {
                                                    var61 = 3;
                                                }
                                                class470.method2794(true, class200.field2931 + class139.field2224.field7692[0], class139.field2224.field7694[0] + class403.field6059, var61);
                                            }
                                            class378.method2350(false);
                                            for (int var62 = 0; var62 < 5; var62++) {
                                                int var10002 = class12.field202[var62]++;
                                            }
                                            if (class310.field4724 && class290.field4125 < class211.method1419(12921) - 60000L) {
                                                method349(true);
                                            }
                                            class36.field696++;
                                            if (class36.field696 > 500) {
                                                class36.field696 = 0;
                                                int var63 = (int) (Math.random() * 8.0D);
                                                if ((var63 & 0x2) == 2) {
                                                    class435.field6453 += class308.field4713;
                                                }
                                                if ((var63 & 0x4) == 4) {
                                                    class345.field5179 += class50.field900;
                                                }
                                                if ((var63 & 0x1) == 1) {
                                                    class115.field1905 += class255.field3653;
                                                }
                                            }
                                            if (class115.field1905 < -50) {
                                                class255.field3653 = 2;
                                            }
                                            if (class435.field6453 < -55) {
                                                class308.field4713 = 2;
                                            }
                                            if (class115.field1905 > 50) {
                                                class255.field3653 = -2;
                                            }
                                            if (class345.field5179 < -40) {
                                                class50.field900 = 1;
                                            }
                                            if (class435.field6453 > 55) {
                                                class308.field4713 = -2;
                                            }
                                            class372.field5646++;
                                            if (class345.field5179 > 40) {
                                                class50.field900 = -1;
                                            }
                                            if (class372.field5646 > 500) {
                                                class372.field5646 = 0;
                                                int var64 = (int) (Math.random() * 8.0D);
                                                if ((var64 & 0x2) == 2) {
                                                    class70.field1215 += class427.field6353;
                                                }
                                                if ((var64 & 0x1) == 1) {
                                                    class255.field3674 += class93.field1580;
                                                }
                                            }
                                            if (class255.field3674 < -60) {
                                                class93.field1580 = 2;
                                            }
                                            if (class70.field1215 < -20) {
                                                class427.field6353 = 1;
                                            }
                                            if (class255.field3674 > 60) {
                                                class93.field1580 = -2;
                                            }
                                            class121.field1962++;
                                            if (class70.field1215 > 10) {
                                                class427.field6353 = -1;
                                            }
                                            if (class121.field1962 > 50) {
                                                class28.method321(client.field2873, -5001);
                                                class447.field6707++;
                                            }
                                            if (class193.field2859) {
                                                class363.method2279((byte) 114);
                                                class193.field2859 = false;
                                            }
                                            try {
                                                if (class116.field1927 != null && class410.field6141.field2289 > 0) {
                                                    class451.field6739 += class410.field6141.field2289;
                                                    class116.field1927.method1304(class410.field6141.field2270, 0, class410.field6141.field2289, (byte) 108);
                                                    class121.field1962 = 0;
                                                    class410.field6141.field2289 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var65) {
                                                class149.method1144(2);
                                                return;
                                            }
                                        }
                                        var59 = var58.field2995;
                                        if (var59.field5354 < 0) {
                                            break;
                                        }
                                        var60 = class319.method2075(true, var59.field5297);
                                    } while (var60 == null || var60.field5291 == null || var60.field5291.length <= var59.field5354 || var60.field5291[var59.field5354] != var59);
                                    class437.method2614(var58);
                                }
                            }
                            var56 = var55.field2995;
                            if (var56.field5354 < 0) {
                                break;
                            }
                            var57 = class319.method2075(true, var56.field5297);
                        } while (var57 == null || var57.field5291 == null || var56.field5354 >= var57.field5291.length || var57.field5291[var56.field5354] != var56);
                        class437.method2614(var55);
                    }
                }
                var53 = var52.field2995;
                if (var53.field5354 < 0) {
                    break;
                }
                var54 = class319.method2075(true, var53.field5297);
            } while (var54 == null || var54.field5291 == null || var54.field5291.length <= var53.field5354 || var54.field5291[var53.field5354] != var53);
            class437.method2614(var52);
        }
    }
}
