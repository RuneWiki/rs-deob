import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class77 extends class166 {

    @OriginalMember(owner = "client!hh", name = "fb", descriptor = "I")
    private int field1591 = 0;

    @OriginalMember(owner = "client!hh", name = "kb", descriptor = "Z")
    public boolean field1596 = false;

    @OriginalMember(owner = "client!hh", name = "bb", descriptor = "I")
    private int field1587 = 0;

    @OriginalMember(owner = "client!hh", name = "U", descriptor = "I")
    public int field1580;

    @OriginalMember(owner = "client!hh", name = "lb", descriptor = "I")
    public int field1597;

    @OriginalMember(owner = "client!hh", name = "V", descriptor = "I")
    public int field1581;

    @OriginalMember(owner = "client!hh", name = "X", descriptor = "I")
    public int field1583;

    @OriginalMember(owner = "client!hh", name = "gb", descriptor = "I")
    public int field1592;

    @OriginalMember(owner = "client!hh", name = "mb", descriptor = "I")
    private int field1598;

    @OriginalMember(owner = "client!hh", name = "ab", descriptor = "Lre;")
    private class162 field1586;

    @OriginalMember(owner = "client!hh", name = "hb", descriptor = "I")
    public static int field1593 = 0;

    @OriginalMember(owner = "client!hh", name = "eb", descriptor = "[I")
    public static int[] field1590 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!hh", name = "W", descriptor = "I")
    public static int field1582;

    @OriginalMember(owner = "client!hh", name = "Z", descriptor = "I")
    public static int field1585;

    @OriginalMember(owner = "client!hh", name = "cb", descriptor = "I")
    public static int field1588;

    @OriginalMember(owner = "client!hh", name = "db", descriptor = "I")
    public static int field1589;

    @OriginalMember(owner = "client!hh", name = "jb", descriptor = "I")
    public static int field1595;

    @OriginalMember(owner = "client!hh", name = "nb", descriptor = "I")
    public static int field1599;

    @OriginalMember(owner = "client!hh", name = "ob", descriptor = "I")
    public static int field1600;

    @OriginalMember(owner = "client!hh", name = "Y", descriptor = "Lu;")
    public static class184 field1584;

    @OriginalMember(owner = "client!hh", name = "ib", descriptor = "[Lrh;")
    public static class165[] field1594;

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(Z)Lje;")
    public final class91 method406(boolean arg0) {
        if (arg0) {
            method535((byte) -73, -111, null, false, null, null);
        }
        field1582++;
        class208 var2 = class93.method650(15575, this.field1598);
        class91 var3;
        if (this.field1596) {
            var3 = var2.method1359((byte) 123, -1);
        } else {
            var3 = var2.method1359((byte) 106, this.field1587);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(II)V")
    public final void method533(int arg0, int arg1) {
        field1589++;
        if (this.field1596 || arg1 <= 21) {
            return;
        }
        this.field1591 += arg0;
        while (this.field1591 > this.field1586.field3292[this.field1587]) {
            this.field1591 -= this.field1586.field3292[this.field1587];
            this.field1587++;
            if (this.field1587 >= this.field1586.field3263.length) {
                this.field1596 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lig;I)V")
    public static final void method534(class84 arg0, int arg1) {
        int var2 = arg0.field1830;
        field1595++;
        if (arg1 >= -20) {
            return;
        }
        if (var2 == 324) {
            if (class147.field3009 == -1) {
                class151.field3111 = arg0.field1768;
                class147.field3009 = arg0.field1730;
            }
            if (class108.field2241.field2402) {
                arg0.field1730 = class147.field3009;
            } else {
                arg0.field1730 = class151.field3111;
            }
        } else if (var2 == 325) {
            if (class147.field3009 == -1) {
                class147.field3009 = arg0.field1730;
                class151.field3111 = arg0.field1768;
            }
            if (class108.field2241.field2402) {
                arg0.field1730 = class151.field3111;
            } else {
                arg0.field1730 = class147.field3009;
            }
        } else if (var2 == 327) {
            arg0.field1742 = 150;
            arg0.field1739 = (int) (Math.sin((double) class51.field1023 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field1787 = -1;
            arg0.field1816 = 5;
        } else if (var2 == 328) {
            if (class56.field1136.field758 == null) {
                arg0.field1787 = 0;
            } else {
                arg0.field1742 = 150;
                arg0.field1739 = (int) (Math.sin((double) class51.field1023 / 40.0D) * 256.0D) & 0x7FF;
                arg0.field1816 = 5;
                arg0.field1787 = ((int) class56.field1136.field758.method1058(-124) << 11) + 2047;
                arg0.field1785 = class56.field1136.field693;
                arg0.field1827 = class56.field1136.field705;
            }
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(BILrf;ZLu;Lrf;)V")
    public static final void method535(byte arg0, int arg1, class163 arg2, boolean arg3, class184 arg4, class163 arg5) {
        field1588++;
        if (arg0 != 71) {
            field1590 = null;
        }
        int var6 = arg4.method1228(106, arg2);
        int var7 = arg4.method1231(arg5, var6, 2);
        class34.method220(arg3, arg1, arg4, -52, var7, var6);
    }

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "(II)V")
    public static final void method536(int arg0, int arg1) {
        field1600++;
        if (arg1 < 0) {
            return;
        }
        int var2 = class193.field3795[arg1];
        int var3 = class87.field1900[arg1];
        int var4 = class21.field373[arg1];
        if (var4 >= 2000) {
            var4 -= 2000;
        }
        long var5 = class188.field3741[arg1];
        int var7 = (int) class188.field3741[arg1];
        if (var4 == 46) {
            class70 var8 = class187.field3723[var7];
            if (var8 != null) {
                class58.field1166++;
                class15.method103(class56.field1136.field692[0], var8.field692[0], 0, 2, -125, 0, 1, class56.field1136.field718[0], var8.field718[0], 0, 1, false);
                class124.field2591 = 2;
                class115.field2442 = class193.field3796;
                class107.field2218 = 0;
                class136.field2805 = class16.field283;
                class141.field2896.method326(104, 54);
                class141.field2896.method346(0, var7);
            }
        }
        if (var4 == 25) {
            class43.field861++;
            class141.field2896.method326(104, 174);
            class141.field2896.method361(-1810503640, var2);
            class141.field2896.method364(class133.field2762, (byte) -35);
            class141.field2896.method369(class190.field3777, (byte) -127);
            class141.field2896.method374(false, var3);
            class141.field2896.method346(0, var7);
            class141.field2896.method361(-1810503640, class9.field183);
            class5.field98 = 0;
            class128.field2631 = class138.method907(var3, false);
            class75.field1573 = var2;
        }
        if (var4 == 24) {
            class143.method932(var2, 4, var3, var5);
            class5.field116++;
            class141.field2896.method326(104, 60);
            class141.field2896.method355(class172.field3493 + var2, (byte) 97);
            class141.field2896.method346(0, (int) (var5 >>> 32) & Integer.MAX_VALUE);
            class141.field2896.method355(class69.field1470 + var3, (byte) 98);
        }
        if (var4 == 5) {
            class127.method839(class60.field1227, var2, var3);
        }
        if (var4 == 33) {
            class143.method932(var2, 4, var3, var5);
            class141.field2896.method326(104, 8);
            class116.field2455++;
            class141.field2896.method355(class172.field3493 + var2, (byte) 88);
            class141.field2896.method355((int) (var5 >>> 32) & Integer.MAX_VALUE, (byte) 103);
            class141.field2896.method355(class69.field1470 + var3, (byte) 102);
        }
        if (var4 == 44) {
            class141.field2896.method326(104, 172);
            class112.field2369++;
            class141.field2896.method346(0, var7);
            class141.field2896.method341(var3, -118);
            class141.field2896.method364(var2, (byte) -35);
            class5.field98 = 0;
            class128.field2631 = class138.method907(var3, false);
            class75.field1573 = var2;
        }
        if (var4 == 4) {
            class180.field3603++;
            boolean var9 = class15.method103(class56.field1136.field692[0], var2, 0, 2, -58, 0, 0, class56.field1136.field718[0], var3, 0, 0, false);
            if (!var9) {
                class15.method103(class56.field1136.field692[0], var2, 0, 2, -98, 0, 1, class56.field1136.field718[0], var3, 0, 1, false);
            }
            class124.field2591 = 2;
            class115.field2442 = class193.field3796;
            class136.field2805 = class16.field283;
            class107.field2218 = 0;
            class141.field2896.method326(104, 141);
            class141.field2896.method355(var7, (byte) 121);
            class141.field2896.method361(-1810503640, class172.field3493 + var2);
            class141.field2896.method364(class69.field1470 + var3, (byte) -35);
        }
        if (var4 == 30) {
            class141.field2896.method326(104, 79);
            class127.field2610++;
            class141.field2896.method346(0, var2);
            class141.field2896.method361(-1810503640, var7);
            class141.field2896.method374(false, var3);
            class5.field98 = 0;
            class128.field2631 = class138.method907(var3, false);
            class75.field1573 = var2;
        }
        if (var4 == 16) {
            boolean var11 = class15.method103(class56.field1136.field692[0], var2, 0, 2, -100, 0, 0, class56.field1136.field718[0], var3, 0, 0, false);
            class195.field3838++;
            if (!var11) {
                class15.method103(class56.field1136.field692[0], var2, 0, 2, -87, 0, 1, class56.field1136.field718[0], var3, 0, 1, false);
            }
            class107.field2218 = 0;
            class136.field2805 = class16.field283;
            class124.field2591 = 2;
            class115.field2442 = class193.field3796;
            class141.field2896.method326(104, 19);
            class141.field2896.method361(-1810503640, class69.field1470 + var3);
            class141.field2896.method364(var2 + class172.field3493, (byte) -35);
            class141.field2896.method364(var7, (byte) -35);
        }
        if (var4 == 29) {
            class38 var13 = class121.field2553[var7];
            if (var13 != null) {
                class15.method103(class56.field1136.field692[0], var13.field692[0], 0, 2, 86, 0, 1, class56.field1136.field718[0], var13.field718[0], 0, 1, false);
                class107.field2218 = 0;
                class53.field1094++;
                class115.field2442 = class193.field3796;
                class124.field2591 = 2;
                class136.field2805 = class16.field283;
                class141.field2896.method326(104, 20);
                class141.field2896.method355(var7, (byte) 93);
            }
        }
        if (var4 == 1001) {
            class84 var14 = class138.method907(var3, false);
            if (var14 == null || var14.field1766[var2] < 100000) {
                class81.field1640++;
                class141.field2896.method326(104, 139);
                class141.field2896.method361(-1810503640, var7);
            } else {
                class43.method267((byte) -44, class180.method1216(new class163[] { class34.method217(var14.field1766[var2], -126), class151.field3114, class97.method669(-91, var7).field62 }, false), class36.field728, 0);
            }
            class5.field98 = 0;
            class128.field2631 = class138.method907(var3, false);
            class75.field1573 = var2;
        }
        if (var4 == 10) {
            class141.field2896.method326(104, 41);
            class141.field2896.method369(var3, (byte) -112);
            class177.field3581++;
            class141.field2896.method361(-1810503640, var2);
            class141.field2896.method346(0, var7);
            class5.field98 = 0;
            class128.field2631 = class138.method907(var3, false);
            class75.field1573 = var2;
        }
        if (var4 == 19) {
            class70 var15 = class187.field3723[var7];
            if (var15 != null) {
                class185.field3703++;
                class15.method103(class56.field1136.field692[0], var15.field692[0], 0, 2, -71, 0, 1, class56.field1136.field718[0], var15.field718[0], 0, 1, false);
                class136.field2805 = class16.field283;
                class115.field2442 = class193.field3796;
                class124.field2591 = 2;
                class107.field2218 = 0;
                class141.field2896.method326(104, 100);
                class141.field2896.method355(class118.field2508, (byte) 93);
                class141.field2896.method369(class181.field3627, (byte) -120);
                class141.field2896.method355(var7, (byte) 112);
            }
        }
        if (var4 == 43) {
            class38 var16 = class121.field2553[var7];
            if (var16 != null) {
                class15.method103(class56.field1136.field692[0], var16.field692[0], 0, 2, -47, 0, 1, class56.field1136.field718[0], var16.field718[0], 0, 1, false);
                class136.field2805 = class16.field283;
                class210.field4082++;
                class107.field2218 = 0;
                class124.field2591 = 2;
                class115.field2442 = class193.field3796;
                class141.field2896.method326(104, 144);
                class141.field2896.method386((byte) 105, class190.field3777);
                class141.field2896.method361(-1810503640, class133.field2762);
                class141.field2896.method346(0, var7);
                class141.field2896.method364(class9.field183, (byte) -35);
            }
        }
        if (var4 == 15) {
            class70 var17 = class187.field3723[var7];
            if (var17 != null) {
                class15.method103(class56.field1136.field692[0], var17.field692[0], 0, 2, 59, 0, 1, class56.field1136.field718[0], var17.field718[0], 0, 1, false);
                class107.field2218 = 0;
                class136.field2805 = class16.field283;
                class115.field2442 = class193.field3796;
                class124.field2591 = 2;
                class150.field3099++;
                class141.field2896.method326(104, 201);
                class141.field2896.method361(-1810503640, var7);
            }
        }
        if (var4 == 34) {
            class143.method932(var2, 4, var3, var5);
            class130.field2693++;
            class141.field2896.method326(104, 39);
            class141.field2896.method355(class172.field3493 + var2, (byte) 102);
            class141.field2896.method364((int) (var5 >>> 32) & Integer.MAX_VALUE, (byte) -35);
            class141.field2896.method346(0, class69.field1470 + var3);
        }
        if (var4 == 39) {
            class141.field2896.method326(104, 63);
            class172.field3495++;
            class141.field2896.method355(var7, (byte) 86);
            class141.field2896.method369(var3, (byte) -114);
            class141.field2896.method355(var2, (byte) 117);
            class5.field98 = 0;
            class128.field2631 = class138.method907(var3, false);
            class75.field1573 = var2;
        }
        if (var4 == 23) {
            class38 var18 = class121.field2553[var7];
            if (var18 != null) {
                class19.field307++;
                class15.method103(class56.field1136.field692[0], var18.field692[0], 0, 2, 47, 0, 1, class56.field1136.field718[0], var18.field718[0], 0, 1, false);
                class136.field2805 = class16.field283;
                class115.field2442 = class193.field3796;
                class107.field2218 = 0;
                class124.field2591 = 2;
                class141.field2896.method326(104, 210);
                class141.field2896.method355(var7, (byte) 112);
            }
        }
        if (var4 == 35) {
            class38 var19 = class121.field2553[var7];
            if (var19 != null) {
                class15.method103(class56.field1136.field692[0], var19.field692[0], 0, 2, 86, 0, 1, class56.field1136.field718[0], var19.field718[0], 0, 1, false);
                field1599++;
                class115.field2442 = class193.field3796;
                class136.field2805 = class16.field283;
                class107.field2218 = 0;
                class124.field2591 = 2;
                class141.field2896.method326(104, 80);
                class141.field2896.method346(0, var7);
            }
        }
        if (var4 == 28) {
            class38 var20 = class121.field2553[var7];
            if (var20 != null) {
                class11.field228++;
                class15.method103(class56.field1136.field692[0], var20.field692[0], 0, 2, 92, 0, 1, class56.field1136.field718[0], var20.field718[0], 0, 1, false);
                class124.field2591 = 2;
                class136.field2805 = class16.field283;
                class115.field2442 = class193.field3796;
                class107.field2218 = 0;
                class141.field2896.method326(104, 180);
                class141.field2896.method346(0, var7);
            }
        }
        if (var4 == 40) {
            class38 var21 = class121.field2553[var7];
            if (var21 != null) {
                class63.field1328++;
                class15.method103(class56.field1136.field692[0], var21.field692[0], 0, 2, 104, 0, 1, class56.field1136.field718[0], var21.field718[0], 0, 1, false);
                class124.field2591 = 2;
                class107.field2218 = 0;
                class136.field2805 = class16.field283;
                class115.field2442 = class193.field3796;
                class141.field2896.method326(104, 163);
                class141.field2896.method361(-1810503640, var7);
            }
        }
        if (var4 == 1007) {
            class111.field2338++;
            class143.method932(var2, 4, var3, var5);
            class141.field2896.method326(104, 5);
            class141.field2896.method355(Integer.MAX_VALUE & (int) (var5 >>> 32), (byte) 120);
            class141.field2896.method361(-1810503640, class69.field1470 + var3);
            class141.field2896.method346(0, var2 + class172.field3493);
        }
        if (var4 == 22) {
            class57.field1156++;
            class141.field2896.method326(104, 228);
            class141.field2896.method346(0, var2);
            class141.field2896.method386((byte) 102, var3);
            class141.field2896.method361(-1810503640, var7);
            class5.field98 = 0;
            class128.field2631 = class138.method907(var3, false);
            class75.field1573 = var2;
        }
        if (var4 == 42) {
            class141.field2896.method326(104, 93);
            class141.field2896.method386((byte) 123, var3);
            class92.field1983++;
            class141.field2896.method355(var2, (byte) 102);
            class141.field2896.method361(-1810503640, var7);
            class5.field98 = 0;
            class128.field2631 = class138.method907(var3, false);
            class75.field1573 = var2;
        }
        if (var4 == 47 || var4 == 1003) {
            class51.method325(112, var3, class197.field3918[arg1], var7, var2);
        }
        if (var4 == 38) {
            class151.field3115++;
            boolean var22 = class15.method103(class56.field1136.field692[0], var2, 0, 2, -123, 0, 0, class56.field1136.field718[0], var3, 0, 0, false);
            if (!var22) {
                class15.method103(class56.field1136.field692[0], var2, 0, 2, 110, 0, 1, class56.field1136.field718[0], var3, 0, 1, false);
            }
            class124.field2591 = 2;
            class115.field2442 = class193.field3796;
            class136.field2805 = class16.field283;
            class107.field2218 = 0;
            class141.field2896.method326(104, 105);
            class141.field2896.method355(var7, (byte) 93);
            class141.field2896.method361(-1810503640, class172.field3493 + var2);
            class141.field2896.method361(-1810503640, class69.field1470 + var3);
        }
        if (var4 == 1006) {
            class124.field2591 = 2;
            class115.field2442 = class193.field3796;
            class107.field2218 = 0;
            class136.field2805 = class16.field283;
            class70 var24 = class187.field3723[var7];
            if (var24 != null) {
                class129 var25 = var24.field1482;
                if (var25.field2682 != null) {
                    var25 = var25.method851(0);
                }
                if (var25 != null) {
                    class105.field2184++;
                    class141.field2896.method326(104, 98);
                    class141.field2896.method355(var25.field2662, (byte) 97);
                }
            }
        }
        if (var4 == 58) {
            class60.field1233++;
            boolean var26 = class15.method103(class56.field1136.field692[0], var2, 0, 2, -111, 0, 0, class56.field1136.field718[0], var3, 0, 0, false);
            if (!var26) {
                class15.method103(class56.field1136.field692[0], var2, 0, 2, 114, 0, 1, class56.field1136.field718[0], var3, 0, 1, false);
            }
            class124.field2591 = 2;
            class136.field2805 = class16.field283;
            class115.field2442 = class193.field3796;
            class107.field2218 = 0;
            class141.field2896.method326(104, 88);
            class141.field2896.method364(class69.field1470 + var3, (byte) -35);
            class141.field2896.method364(var7, (byte) -35);
            class141.field2896.method346(0, class172.field3493 + var2);
        }
        if (var4 == 3) {
            class38 var28 = class121.field2553[var7];
            if (var28 != null) {
                class15.method103(class56.field1136.field692[0], var28.field692[0], 0, 2, 53, 0, 1, class56.field1136.field718[0], var28.field718[0], 0, 1, false);
                class136.field2805 = class16.field283;
                class107.field2218 = 0;
                class115.field2442 = class193.field3796;
                class172.field3492++;
                class124.field2591 = 2;
                class141.field2896.method326(104, 124);
                class141.field2896.method364(var7, (byte) -35);
            }
        }
        if (var4 == 11 && class88.field1924 == null) {
            class72.method514(var3, var2, (byte) -26);
            class88.field1924 = class48.method298(var3, var2, 0);
            class194.method1295((byte) -121, class88.field1924);
        }
        if (var4 == 2) {
            class84 var29 = class48.method298(var3, var2, 0);
            if (var29 != null) {
                class27.method162(1);
                class57.method414(class88.method618((byte) 126, class21.method130(var29, (byte) 77)), var2, 4100, var3);
                class62.field1326 = 0;
                class181.field3635 = class90.method627(false, var29);
                if (class181.field3635 == null) {
                    class181.field3635 = class202.field3983;
                }
                if (!var29.field1853) {
                    class6.field134 = class180.method1216(new class163[] { class205.field4005, var29.field1835, class168.field3403 }, false);
                    return;
                }
                class6.field134 = class180.method1216(new class163[] { var29.field1800, class168.field3403 }, false);
            }
            return;
        }
        if (var4 == 17) {
            class70 var30 = class187.field3723[var7];
            if (var30 != null) {
                class15.method103(class56.field1136.field692[0], var30.field692[0], 0, 2, 74, 0, 1, class56.field1136.field718[0], var30.field718[0], 0, 1, false);
                class124.field2591 = 2;
                class115.field2442 = class193.field3796;
                class143.field2936++;
                class136.field2805 = class16.field283;
                class107.field2218 = 0;
                class141.field2896.method326(104, 61);
                class141.field2896.method361(-1810503640, var7);
            }
        }
        if (var4 == 1005) {
            class124.field2591 = 2;
            class107.field2218 = 0;
            class136.field2805 = class16.field283;
            class115.field2442 = class193.field3796;
            class81.field1640++;
            class141.field2896.method326(104, 139);
            class141.field2896.method361(-1810503640, var7);
        }
        if (var4 == 7) {
            boolean var31 = true;
            class84 var32 = class138.method907(var3, false);
            if (var32.field1830 > 0) {
                var31 = class97.method673(2, var32);
            }
            if (var31) {
                class141.field2896.method326(104, 47);
                class102.field2148++;
                class141.field2896.method369(var3, (byte) -113);
            }
        }
        if (var4 == 57) {
            class85.field1866++;
            boolean var33 = class15.method103(class56.field1136.field692[0], var2, 0, 2, -69, 0, 0, class56.field1136.field718[0], var3, 0, 0, false);
            if (!var33) {
                class15.method103(class56.field1136.field692[0], var2, 0, 2, 114, 0, 1, class56.field1136.field718[0], var3, 0, 1, false);
            }
            class107.field2218 = 0;
            class115.field2442 = class193.field3796;
            class136.field2805 = class16.field283;
            class124.field2591 = 2;
            class141.field2896.method326(104, 1);
            class141.field2896.method361(-1810503640, class172.field3493 + var2);
            class141.field2896.method374(false, class181.field3627);
            class141.field2896.method361(-1810503640, var7);
            class141.field2896.method361(-1810503640, class69.field1470 + var3);
            class141.field2896.method355(class118.field2508, (byte) 93);
        }
        if (var4 == 51) {
            class141.field2896.method326(104, 22);
            class141.field2896.method364(var7, (byte) -35);
            class21.field369++;
            class141.field2896.method386((byte) 114, var3);
            class141.field2896.method361(-1810503640, var2);
            class5.field98 = 0;
            class128.field2631 = class138.method907(var3, false);
            class75.field1573 = var2;
        }
        if (var4 == 48) {
            class38 var35 = class121.field2553[var7];
            if (var35 != null) {
                class15.method103(class56.field1136.field692[0], var35.field692[0], 0, 2, 67, 0, 1, class56.field1136.field718[0], var35.field718[0], 0, 1, false);
                class124.field2591 = 2;
                class107.field2218 = 0;
                class115.field2442 = class193.field3796;
                class166.field3374++;
                class136.field2805 = class16.field283;
                class141.field2896.method326(104, 152);
                class141.field2896.method361(-1810503640, var7);
            }
        }
        if (var4 == 50) {
            class70 var36 = class187.field3723[var7];
            if (var36 != null) {
                class121.field2539++;
                class15.method103(class56.field1136.field692[0], var36.field692[0], 0, 2, -79, 0, 1, class56.field1136.field718[0], var36.field718[0], 0, 1, false);
                class107.field2218 = 0;
                class115.field2442 = class193.field3796;
                class124.field2591 = 2;
                class136.field2805 = class16.field283;
                class141.field2896.method326(104, 72);
                class141.field2896.method364(var7, (byte) -35);
            }
        }
        if (var4 == 1002) {
            class60.field1222++;
            class107.field2218 = 0;
            class136.field2805 = class16.field283;
            class124.field2591 = 2;
            class115.field2442 = class193.field3796;
            class141.field2896.method326(104, 0);
            class141.field2896.method346(0, var7);
        }
        if (var4 == 41 && class143.method932(var2, 4, var3, var5)) {
            class141.field2896.method326(104, 245);
            class143.field2948++;
            class141.field2896.method355(class69.field1470 + var3, (byte) 99);
            class141.field2896.method355(class9.field183, (byte) 123);
            class141.field2896.method361(-1810503640, Integer.MAX_VALUE & (int) (var5 >>> 32));
            class141.field2896.method346(0, class172.field3493 + var2);
            class141.field2896.method386((byte) 115, class190.field3777);
            class141.field2896.method364(class133.field2762, (byte) -35);
        }
        if (var4 == 20) {
            class70 var37 = class187.field3723[var7];
            if (var37 != null) {
                class15.method103(class56.field1136.field692[0], var37.field692[0], 0, 2, -53, 0, 1, class56.field1136.field718[0], var37.field718[0], 0, 1, false);
                class136.field2805 = class16.field283;
                class107.field2218 = 0;
                class124.field2591 = 2;
                class115.field2442 = class193.field3796;
                class141.field2896.method326(104, 198);
                class136.field2807++;
                class141.field2896.method361(-1810503640, class9.field183);
                class141.field2896.method346(0, var7);
                class141.field2896.method364(class133.field2762, (byte) -35);
                class141.field2896.method386((byte) 125, class190.field3777);
            }
        }
        if (var4 == 9) {
            class70 var38 = class187.field3723[var7];
            if (var38 != null) {
                class176.field3534++;
                class15.method103(class56.field1136.field692[0], var38.field692[0], 0, 2, -99, 0, 1, class56.field1136.field718[0], var38.field718[0], 0, 1, false);
                class107.field2218 = 0;
                class136.field2805 = class16.field283;
                class124.field2591 = 2;
                class115.field2442 = class193.field3796;
                class141.field2896.method326(104, 247);
                class141.field2896.method355(var7, (byte) 116);
            }
        }
        if (var4 == 1) {
            class189.field3767++;
            class141.field2896.method326(104, 27);
            class141.field2896.method355(class118.field2508, (byte) 97);
            class141.field2896.method355(var2, (byte) 101);
            class141.field2896.method341(class181.field3627, 102);
            class141.field2896.method374(false, var3);
        }
        if (var4 == 18) {
            class97.method670(-108);
        }
        if (var4 == 49) {
            class21.field380++;
            class143.method932(var2, 4, var3, var5);
            class141.field2896.method326(104, 197);
            class141.field2896.method355(class69.field1470 + var3, (byte) 123);
            class141.field2896.method346(0, (int) (var5 >>> 32) & Integer.MAX_VALUE);
            class141.field2896.method364(class172.field3493 + var2, (byte) -35);
        }
        if (var4 == 12) {
            class102.field2148++;
            class141.field2896.method326(104, 47);
            class141.field2896.method369(var3, (byte) -127);
            class84 var39 = class138.method907(var3, false);
            if (var39.field1754 != null && var39.field1754[0][0] == 5) {
                int var40 = var39.field1754[0][1];
                if (class143.field2940[var40] != var39.field1846[0]) {
                    class143.field2940[var40] = var39.field1846[0];
                    class109.method744(-72, var40);
                }
            }
        }
        if (var4 == 6) {
            class167.field3386++;
            boolean var41 = class15.method103(class56.field1136.field692[0], var2, 0, 2, -116, 0, 0, class56.field1136.field718[0], var3, 0, 0, false);
            if (!var41) {
                class15.method103(class56.field1136.field692[0], var2, 0, 2, -38, 0, 1, class56.field1136.field718[0], var3, 0, 1, false);
            }
            class124.field2591 = 2;
            class107.field2218 = 0;
            class136.field2805 = class16.field283;
            class115.field2442 = class193.field3796;
            class141.field2896.method326(104, 9);
            class141.field2896.method364(class9.field183, (byte) -35);
            class141.field2896.method355(var2 + class172.field3493, (byte) 118);
            class141.field2896.method361(-1810503640, class133.field2762);
            class141.field2896.method361(-1810503640, var7);
            class141.field2896.method369(class190.field3777, (byte) -123);
            class141.field2896.method355(class69.field1470 + var3, (byte) 96);
        }
        if (var4 == 8) {
            class141.field2896.method326(104, 47);
            class102.field2148++;
            class141.field2896.method369(var3, (byte) -116);
            class84 var43 = class138.method907(var3, false);
            if (var43.field1754 != null && var43.field1754[0][0] == 5) {
                int var44 = var43.field1754[0][1];
                class143.field2940[var44] = 1 - class143.field2940[var44];
                class109.method744(95, var44);
            }
        }
        if (var4 == 37) {
            class191.field3784++;
            class141.field2896.method326(104, 193);
            class141.field2896.method361(-1810503640, class118.field2508);
            class141.field2896.method346(0, var7);
            class141.field2896.method364(var2, (byte) -35);
            class141.field2896.method374(false, var3);
            class141.field2896.method386((byte) 111, class181.field3627);
            class5.field98 = 0;
            class128.field2631 = class138.method907(var3, false);
            class75.field1573 = var2;
        }
        if (var4 == 32) {
            class27.method162(1);
            class84 var45 = class138.method907(var3, false);
            class190.field3777 = var3;
            class133.field2762 = var7;
            class9.field183 = var2;
            class62.field1326 = 1;
            class194.method1295((byte) 35, var45);
            class119.field2516 = class180.method1216(new class163[] { class191.field3787, class97.method669(-99, var7).field62, class168.field3403 }, false);
            if (class119.field2516 == null) {
                class119.field2516 = class87.field1902;
            }
            return;
        }
        if (var4 == 13) {
            class141.field2896.method326(104, 24);
            class128.field2623++;
            class141.field2896.method361(-1810503640, var2);
            class141.field2896.method364(var7, (byte) -35);
            class141.field2896.method341(var3, 97);
            class5.field98 = 0;
            class128.field2631 = class138.method907(var3, false);
            class75.field1573 = var2;
        }
        if (var4 == 31) {
            class141.field2896.method326(104, 92);
            class51.field1014++;
            class141.field2896.method355(var7, (byte) 108);
            class141.field2896.method341(var3, -35);
            class141.field2896.method361(-1810503640, var2);
            class5.field98 = 0;
            class128.field2631 = class138.method907(var3, false);
            class75.field1573 = var2;
        }
        if (var4 == 36 && class143.method932(var2, 4, var3, var5)) {
            class11.field220++;
            class141.field2896.method326(104, 129);
            class141.field2896.method369(class181.field3627, (byte) -120);
            class141.field2896.method361(-1810503640, class172.field3493 + var2);
            class141.field2896.method364(class69.field1470 + var3, (byte) -35);
            class141.field2896.method355(class118.field2508, (byte) 102);
            class141.field2896.method346(0, Integer.MAX_VALUE & (int) (var5 >>> 32));
        }
        if (var4 == 45) {
            class38 var46 = class121.field2553[var7];
            if (var46 != null) {
                class140.field2880++;
                class15.method103(class56.field1136.field692[0], var46.field692[0], 0, 2, -109, 0, 1, class56.field1136.field718[0], var46.field718[0], 0, 1, false);
                class115.field2442 = class193.field3796;
                class124.field2591 = 2;
                class136.field2805 = class16.field283;
                class107.field2218 = 0;
                class141.field2896.method326(104, 119);
                class141.field2896.method374(false, class181.field3627);
                class141.field2896.method346(0, var7);
                class141.field2896.method355(class118.field2508, (byte) 123);
            }
        }
        if (var4 == 26) {
            class43.field872++;
            boolean var47 = class15.method103(class56.field1136.field692[0], var2, 0, 2, -71, 0, 0, class56.field1136.field718[0], var3, 0, 0, false);
            if (!var47) {
                class15.method103(class56.field1136.field692[0], var2, 0, 2, -63, 0, 1, class56.field1136.field718[0], var3, 0, 1, false);
            }
            class107.field2218 = 0;
            class124.field2591 = 2;
            class115.field2442 = class193.field3796;
            class136.field2805 = class16.field283;
            class141.field2896.method326(104, 202);
            class141.field2896.method361(-1810503640, class69.field1470 + var3);
            class141.field2896.method364(var7, (byte) -35);
            class141.field2896.method346(0, var2 + class172.field3493);
        }
        int var49 = 64 % ((26 - arg0) / 61);
        if (var4 == 21) {
            class130.field2708++;
            class141.field2896.method326(104, 78);
            class141.field2896.method346(0, var7);
            class141.field2896.method369(var3, (byte) -110);
            class141.field2896.method346(0, var2);
            class5.field98 = 0;
            class128.field2631 = class138.method907(var3, false);
            class75.field1573 = var2;
        }
        if (var4 == 14) {
            class38 var50 = class121.field2553[var7];
            if (var50 != null) {
                class15.method103(class56.field1136.field692[0], var50.field692[0], 0, 2, 121, 0, 1, class56.field1136.field718[0], var50.field718[0], 0, 1, false);
                class124.field2591 = 2;
                class9.field182++;
                class107.field2218 = 0;
                class115.field2442 = class193.field3796;
                class136.field2805 = class16.field283;
                class141.field2896.method326(104, 150);
                class141.field2896.method355(var7, (byte) 114);
            }
        }
        if (class62.field1326 != 0) {
            class62.field1326 = 0;
            class194.method1295((byte) -125, class138.method907(class190.field3777, false));
        }
        if (class189.field3766) {
            class27.method162(1);
        }
        if (class128.field2631 != null && class5.field98 == 0) {
            class194.method1295((byte) -126, class128.field2631);
        }
    }

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "(B)V")
    public static void method537(byte arg0) {
        if (arg0 <= 119) {
            field1594 = null;
        }
        field1590 = null;
        field1594 = null;
        field1584 = null;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Ljava/awt/Component;Lu;Lu;I)V")
    public static final void method538(Component arg0, class184 arg1, class184 arg2, int arg3) {
        field1585++;
        if (class26.field486) {
            return;
        }
        class173.method1169();
        byte[] var4 = arg1.method1240(class202.field3986, (byte) 48, class115.field2434);
        class58.field1177 = new class165(var4, arg0);
        class190.field3775 = class58.field1177.method1120();
        class71.field1500 = class15.method104(arg2, class202.field3986, arg3 + 13333, client.field592);
        class125.field2607 = class15.method104(arg2, class202.field3986, 1, class27.field507);
        class107.field2232 = class15.method104(arg2, class202.field3986, 1, class196.field3896);
        class55.field1117 = class146.method945(class143.field2951, arg2, class202.field3986, (byte) -35);
        class168.field3432 = class146.method945(class125.field2603, arg2, class202.field3986, (byte) -35);
        class206.field4025 = new int[256];
        for (int var5 = 0; var5 < 64; var5++) {
            class206.field4025[var5] = var5 * 262144;
        }
        for (int var6 = 0; var6 < 64; var6++) {
            class206.field4025[var6 + 64] = var6 * 1024 + 16711680;
        }
        for (int var7 = 0; var7 < 64; var7++) {
            class206.field4025[var7 + 128] = var7 * 4 + 16776960;
        }
        for (int var8 = 0; var8 < 64; var8++) {
            class206.field4025[var8 + 192] = 16777215;
        }
        class148.field3056 = new int[256];
        for (int var9 = 0; var9 < 64; var9++) {
            class148.field3056[var9] = var9 * 1024;
        }
        for (int var10 = 0; var10 < 64; var10++) {
            class148.field3056[var10 + 64] = var10 * 4 + 65280;
        }
        for (int var11 = 0; var11 < 64; var11++) {
            class148.field3056[var11 + 128] = var11 * 262144 + 65535;
        }
        for (int var12 = 0; var12 < 64; var12++) {
            class148.field3056[var12 + 192] = 16777215;
        }
        class108.field2236 = new int[256];
        for (int var13 = 0; var13 < 64; var13++) {
            class108.field2236[var13] = var13 * 4;
        }
        for (int var14 = 0; var14 < 64; var14++) {
            class108.field2236[var14 + 64] = var14 * 262144 + 255;
        }
        for (int var15 = 0; var15 < 64; var15++) {
            class108.field2236[var15 + 128] = var15 * 1024 + 16711935;
        }
        for (int var16 = 0; var16 < 64; var16++) {
            class108.field2236[var16 + 192] = 16777215;
        }
        class48.field935 = new int[256];
        class13.field245 = new int[32768];
        class61.field1247 = new int[32768];
        class65.method469(null, 105);
        class202.field3989 = class202.field3986;
        if (arg3 != -13332) {
            field1594 = null;
        }
        class34.field661 = 0;
        class202.field3990 = class202.field3986;
        class96.field2041 = false;
        if (class144.field2961 == 0) {
            class163.field3327 = true;
        } else {
            class163.field3327 = false;
        }
        class43.field870 = new int[32768];
        class25.field449 = new int[32768];
        if (class163.field3327) {
            class9.method72(2, arg3 + 13331);
        } else {
            class39.method247(class177.field3577, class202.field3986, class134.field2777, 2, false, -15619, 255);
        }
        class96.method662(false, 113);
        class26.field486 = true;
        class58.field1177.method1116(0, 0);
        class190.field3775.method1116(382, 0);
        class71.field1500.method944(382 - class71.field1500.field2972 / 2, 18);
        class6.field121 = new class165(128, 254);
        class38.field779 = new class165(128, 254);
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(IIIIIII)V")
    public class77(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1580 = arg1;
        this.field1597 = arg3;
        this.field1581 = arg6 + arg5;
        this.field1583 = arg4;
        this.field1592 = arg2;
        this.field1598 = arg0;
        int var8 = class93.method650(15575, this.field1598).field4052;
        if (var8 == -1) {
            this.field1596 = true;
        } else {
            this.field1596 = false;
            this.field1586 = class97.method668(var8, (byte) 44);
        }
    }
}
