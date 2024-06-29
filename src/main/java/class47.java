import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class47 {

    @OriginalMember(owner = "client!jj", name = "r", descriptor = "[Log;")
    private static class75[] field672 = new class75[50];

    @OriginalMember(owner = "client!jj", name = "k", descriptor = "I")
    private static int field665 = 0;

    @OriginalMember(owner = "client!jj", name = "t", descriptor = "[Ljava/lang/String;")
    private static String[] field674 = new String[1000];

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "[I")
    private static int[] field659 = new int[1000];

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "[I")
    private static int[] field660 = new int[5];

    @OriginalMember(owner = "client!jj", name = "w", descriptor = "I")
    private static int field677 = 0;

    @OriginalMember(owner = "client!jj", name = "m", descriptor = "[[I")
    private static int[][] field667 = new int[5][5000];

    @OriginalMember(owner = "client!jj", name = "v", descriptor = "I")
    private static int field676 = 0;

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "Ljava/util/Calendar;")
    private static Calendar field656 = Calendar.getInstance();

    @OriginalMember(owner = "client!jj", name = "z", descriptor = "[Ljava/lang/String;")
    private static String[] field680 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!jj", name = "A", descriptor = "[I")
    private static int[] field681 = new int[3];

    @OriginalMember(owner = "client!jj", name = "y", descriptor = "Lka;")
    public static class473 field679 = new class473(4);

    @OriginalMember(owner = "client!jj", name = "C", descriptor = "I")
    private static int field683 = 0;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "I")
    public static int field655;

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "I")
    public static int field661;

    @OriginalMember(owner = "client!jj", name = "h", descriptor = "I")
    public static int field662;

    @OriginalMember(owner = "client!jj", name = "j", descriptor = "I")
    public static int field664;

    @OriginalMember(owner = "client!jj", name = "l", descriptor = "I")
    public static int field666;

    @OriginalMember(owner = "client!jj", name = "o", descriptor = "I")
    public static int field669;

    @OriginalMember(owner = "client!jj", name = "q", descriptor = "I")
    public static int field671;

    @OriginalMember(owner = "client!jj", name = "u", descriptor = "I")
    public static int field675;

    @OriginalMember(owner = "client!jj", name = "x", descriptor = "I")
    public static int field678;

    @OriginalMember(owner = "client!jj", name = "B", descriptor = "I")
    public static int field682;

    @OriginalMember(owner = "client!jj", name = "n", descriptor = "Lst;")
    private static class104 field668;

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "Lat;")
    private static class444 field657;

    @OriginalMember(owner = "client!jj", name = "i", descriptor = "Lat;")
    private static class444 field663;

    @OriginalMember(owner = "client!jj", name = "s", descriptor = "[I")
    private static int[] field673;

    @OriginalMember(owner = "client!jj", name = "p", descriptor = "[Ljava/lang/String;")
    private static String[] field670;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)Ljava/lang/String;", line = 8)
    private static final String method308(int arg0) {
        long var1 = ((long) arg0 + 11745L) * 86400000L;
        field656.setTime(new Date(var1));
        int var3 = field656.get(5);
        int var4 = field656.get(2);
        int var5 = field656.get(1);
        return var3 + "-" + field680[var4] + "-" + var5;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lwi;I)V", line = 22)
    private static final void method309(class414 arg0, int arg1) {
        Object[] var2 = arg0.field5900;
        int var3 = (Integer) var2[0];
        class343 var4 = class302.method1753(var3, 122);
        if (var4 == null) {
            return;
        }
        field673 = new int[var4.field4960];
        int var5 = 0;
        field670 = new String[var4.field4958];
        int var6 = 0;
        for (int var7 = 1; var7 < var2.length; var7++) {
            if (var2[var7] instanceof Integer) {
                int var8 = (Integer) var2[var7];
                if (var8 == -2147483647) {
                    var8 = arg0.field5897;
                }
                if (var8 == -2147483646) {
                    var8 = arg0.field5898;
                }
                if (var8 == -2147483645) {
                    var8 = arg0.field5896 == null ? -1 : arg0.field5896.field6469;
                }
                if (var8 == -2147483644) {
                    var8 = arg0.field5907;
                }
                if (var8 == -2147483643) {
                    var8 = arg0.field5896 == null ? -1 : arg0.field5896.field6510;
                }
                if (var8 == -2147483642) {
                    var8 = arg0.field5899 == null ? -1 : arg0.field5899.field6469;
                }
                if (var8 == -2147483641) {
                    var8 = arg0.field5899 == null ? -1 : arg0.field5899.field6510;
                }
                if (var8 == -2147483640) {
                    var8 = arg0.field5892;
                }
                if (var8 == -2147483639) {
                    var8 = arg0.field5908;
                }
                field673[var5++] = var8;
            } else if (var2[var7] instanceof String) {
                String var9 = (String) var2[var7];
                if (var9.equals("event_opbase")) {
                    var9 = arg0.field5901;
                }
                field670[var6++] = var9;
            }
        }
        field683 = arg0.field5902;
        method316(var4, arg1);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lub;II)V", line = 104)
    public static final void method310(class301 arg0, int arg1, int arg2) {
        class343 var3 = class499.method2976(arg0, arg2, false, arg1);
        if (var3 == null) {
            return;
        }
        field673 = new int[var3.field4960];
        field670 = new String[var3.field4958];
        if (class249.field3397 == var3.field4950 || class221.field3125 == var3.field4950 || class39.field585 == var3.field4950) {
            int var4 = 0;
            int var5 = 0;
            if (class387.field5556 != null) {
                var4 = class387.field5556.field6500;
                var5 = class387.field5556.field6418;
            }
            field673[0] = class113.field1820.method55((byte) -37) - var4;
            field673[1] = class113.field1820.method62((byte) 112) - var5;
        }
        method316(var3, 200000);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "()V", line = 132)
    public static void method311() {
        field673 = null;
        field670 = null;
        field660 = null;
        field667 = null;
        field659 = null;
        field674 = null;
        field672 = null;
        field657 = null;
        field663 = null;
        field668 = null;
        field656 = null;
        field680 = null;
        field681 = null;
        field679 = null;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 152)
    private static final void method312(String arg0, int arg1) {
        if (class136.field2064 == 0 && !(!class355.field5134 || class345.field4970) || class185.field2739) {
            return;
        }
        String var2 = arg0.toLowerCase();
        byte var3 = 0;
        if (var2.startsWith(class355.field5123.method1126(0, (byte) -19))) {
            var3 = 0;
            arg0 = arg0.substring(class355.field5123.method1126(0, (byte) -19).length());
        } else if (var2.startsWith(class63.field916.method1126(0, (byte) -19))) {
            var3 = 1;
            arg0 = arg0.substring(class63.field916.method1126(0, (byte) -19).length());
        } else if (var2.startsWith(class256.field3484.method1126(0, (byte) -19))) {
            var3 = 2;
            arg0 = arg0.substring(class256.field3484.method1126(0, (byte) -19).length());
        } else if (var2.startsWith(class257.field3493.method1126(0, (byte) -19))) {
            var3 = 3;
            arg0 = arg0.substring(class257.field3493.method1126(0, (byte) -19).length());
        } else if (var2.startsWith(class297.field4048.method1126(0, (byte) -19))) {
            var3 = 4;
            arg0 = arg0.substring(class297.field4048.method1126(0, (byte) -19).length());
        } else if (var2.startsWith(class109.field1769.method1126(0, (byte) -19))) {
            var3 = 5;
            arg0 = arg0.substring(class109.field1769.method1126(0, (byte) -19).length());
        } else if (var2.startsWith(class202.field2930.method1126(0, (byte) -19))) {
            var3 = 6;
            arg0 = arg0.substring(class202.field2930.method1126(0, (byte) -19).length());
        } else if (var2.startsWith(class109.field1772.method1126(0, (byte) -19))) {
            var3 = 7;
            arg0 = arg0.substring(class109.field1772.method1126(0, (byte) -19).length());
        } else if (var2.startsWith(class76.field1072.method1126(0, (byte) -19))) {
            var3 = 8;
            arg0 = arg0.substring(class76.field1072.method1126(0, (byte) -19).length());
        } else if (var2.startsWith(class94.field1533.method1126(0, (byte) -19))) {
            var3 = 9;
            arg0 = arg0.substring(class94.field1533.method1126(0, (byte) -19).length());
        } else if (var2.startsWith(class26.field354.method1126(0, (byte) -19))) {
            var3 = 10;
            arg0 = arg0.substring(class26.field354.method1126(0, (byte) -19).length());
        } else if (var2.startsWith(class503.field7367.method1126(0, (byte) -19))) {
            var3 = 11;
            arg0 = arg0.substring(class503.field7367.method1126(0, (byte) -19).length());
        } else if (class486.field6998 != 0) {
            if (var2.startsWith(class355.field5123.method1126(class486.field6998, (byte) -19))) {
                var3 = 0;
                arg0 = arg0.substring(class355.field5123.method1126(class486.field6998, (byte) -19).length());
            } else if (var2.startsWith(class63.field916.method1126(class486.field6998, (byte) -19))) {
                var3 = 1;
                arg0 = arg0.substring(class63.field916.method1126(class486.field6998, (byte) -19).length());
            } else if (var2.startsWith(class256.field3484.method1126(class486.field6998, (byte) -19))) {
                var3 = 2;
                arg0 = arg0.substring(class256.field3484.method1126(class486.field6998, (byte) -19).length());
            } else if (var2.startsWith(class257.field3493.method1126(class486.field6998, (byte) -19))) {
                var3 = 3;
                arg0 = arg0.substring(class257.field3493.method1126(class486.field6998, (byte) -19).length());
            } else if (var2.startsWith(class297.field4048.method1126(class486.field6998, (byte) -19))) {
                var3 = 4;
                arg0 = arg0.substring(class297.field4048.method1126(class486.field6998, (byte) -19).length());
            } else if (var2.startsWith(class109.field1769.method1126(class486.field6998, (byte) -19))) {
                var3 = 5;
                arg0 = arg0.substring(class109.field1769.method1126(class486.field6998, (byte) -19).length());
            } else if (var2.startsWith(class202.field2930.method1126(class486.field6998, (byte) -19))) {
                var3 = 6;
                arg0 = arg0.substring(class202.field2930.method1126(class486.field6998, (byte) -19).length());
            } else if (var2.startsWith(class109.field1772.method1126(class486.field6998, (byte) -19))) {
                var3 = 7;
                arg0 = arg0.substring(class109.field1772.method1126(class486.field6998, (byte) -19).length());
            } else if (var2.startsWith(class76.field1072.method1126(class486.field6998, (byte) -19))) {
                var3 = 8;
                arg0 = arg0.substring(class76.field1072.method1126(class486.field6998, (byte) -19).length());
            } else if (var2.startsWith(class94.field1533.method1126(class486.field6998, (byte) -19))) {
                var3 = 9;
                arg0 = arg0.substring(class94.field1533.method1126(class486.field6998, (byte) -19).length());
            } else if (var2.startsWith(class26.field354.method1126(class486.field6998, (byte) -19))) {
                var3 = 10;
                arg0 = arg0.substring(class26.field354.method1126(class486.field6998, (byte) -19).length());
            } else if (var2.startsWith(class503.field7367.method1126(class486.field6998, (byte) -19))) {
                var3 = 11;
                arg0 = arg0.substring(class503.field7367.method1126(class486.field6998, (byte) -19).length());
            }
        }
        String var4 = arg0.toLowerCase();
        byte var5 = 0;
        if (var4.startsWith(class29.field435.method1126(0, (byte) -19))) {
            var5 = 1;
            arg0 = arg0.substring(class29.field435.method1126(0, (byte) -19).length());
        } else if (var4.startsWith(class16.field215.method1126(0, (byte) -19))) {
            var5 = 2;
            arg0 = arg0.substring(class16.field215.method1126(0, (byte) -19).length());
        } else if (var4.startsWith(class202.field2932.method1126(0, (byte) -19))) {
            var5 = 3;
            arg0 = arg0.substring(class202.field2932.method1126(0, (byte) -19).length());
        } else if (var4.startsWith(class505.field7384.method1126(0, (byte) -19))) {
            var5 = 4;
            arg0 = arg0.substring(class505.field7384.method1126(0, (byte) -19).length());
        } else if (var4.startsWith(class282.field3829.method1126(0, (byte) -19))) {
            var5 = 5;
            arg0 = arg0.substring(class282.field3829.method1126(0, (byte) -19).length());
        } else if (class486.field6998 != 0) {
            if (var4.startsWith(class29.field435.method1126(class486.field6998, (byte) -19))) {
                var5 = 1;
                arg0 = arg0.substring(class29.field435.method1126(class486.field6998, (byte) -19).length());
            } else if (var4.startsWith(class16.field215.method1126(class486.field6998, (byte) -19))) {
                var5 = 2;
                arg0 = arg0.substring(class16.field215.method1126(class486.field6998, (byte) -19).length());
            } else if (var4.startsWith(class202.field2932.method1126(class486.field6998, (byte) -19))) {
                var5 = 3;
                arg0 = arg0.substring(class202.field2932.method1126(class486.field6998, (byte) -19).length());
            } else if (var4.startsWith(class505.field7384.method1126(class486.field6998, (byte) -19))) {
                var5 = 4;
                arg0 = arg0.substring(class505.field7384.method1126(class486.field6998, (byte) -19).length());
            } else if (var4.startsWith(class282.field3829.method1126(class486.field6998, (byte) -19))) {
                var5 = 5;
                arg0 = arg0.substring(class282.field3829.method1126(class486.field6998, (byte) -19).length());
            }
        }
        field675++;
        class274.method1602(14, class192.field2803);
        class17.field275.method1891(false, 0);
        int var6 = class17.field275.field4360;
        if (arg1 == 5021) {
            class17.field275.method1891(false, 1);
        } else if (arg1 == 5022) {
            class17.field275.method1891(false, 2);
        } else {
            class17.field275.method1891(false, 0);
        }
        class17.field275.method1891(false, var3);
        class17.field275.method1891(false, var5);
        class416.method2455(arg0, 0, class17.field275);
        class17.field275.method1851(class17.field275.field4360 - var6, 0);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lwi;)V", line = 427)
    public static final void method313(class414 arg0) {
        method309(arg0, 200000);
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "()V", line = 429)
    public static final void method314() {
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IZ)V", line = 435)
    private static final void method315(int arg0, boolean arg1) {
        if (arg0 < 300) {
            if (arg0 == 100) {
                field676 -= 3;
                int var2 = field659[field676];
                int var3 = field659[field676 + 1];
                int var4 = field659[field676 + 2];
                if (var3 == 0) {
                    throw new RuntimeException();
                }
                class444 var5 = class22.method138(-59, var2);
                if (var5.field6491 == null) {
                    var5.field6491 = new class444[var4 + 1];
                }
                if (var5.field6491.length <= var4) {
                    class444[] var6 = new class444[var4 + 1];
                    for (int var7 = 0; var7 < var5.field6491.length; var7++) {
                        var6[var7] = var5.field6491[var7];
                    }
                    var5.field6491 = var6;
                }
                if (var4 > 0 && var5.field6491[var4 - 1] == null) {
                    throw new RuntimeException("Gap at:" + (var4 - 1));
                }
                class444 var8 = new class444();
                var8.field6477 = var3;
                var8.field6515 = var8.field6469 = var5.field6469;
                var8.field6510 = var4;
                var5.field6491[var4] = var8;
                if (arg1) {
                    field663 = var8;
                } else {
                    field657 = var8;
                }
                class151.method1093(var5, 123);
                return;
            }
            if (arg0 == 101) {
                class444 var9 = arg1 ? field663 : field657;
                if (var9.field6510 == -1) {
                    if (arg1) {
                        throw new RuntimeException("Tried to .cc_delete static .active-component!");
                    }
                    throw new RuntimeException("Tried to cc_delete static active-component!");
                }
                class444 var10 = class22.method138(-92, var9.field6469);
                var10.field6491[var9.field6510] = null;
                class151.method1093(var10, 109);
                return;
            }
            if (arg0 == 102) {
                class444 var11 = class22.method138(79, field659[--field676]);
                var11.field6491 = null;
                class151.method1093(var11, 124);
                return;
            }
            if (arg0 == 200) {
                field676 -= 2;
                int var12 = field659[field676];
                int var13 = field659[field676 + 1];
                class444 var14 = class222.method1381(var12, var13, -86);
                if (var14 != null && var13 != -1) {
                    field659[field676++] = 1;
                    if (arg1) {
                        field663 = var14;
                        return;
                    }
                    field657 = var14;
                    return;
                }
                field659[field676++] = 0;
                return;
            }
            if (arg0 == 201) {
                int var15 = field659[--field676];
                class444 var16 = class22.method138(-124, var15);
                if (var16 != null) {
                    field659[field676++] = 1;
                    if (arg1) {
                        field663 = var16;
                        return;
                    }
                    field657 = var16;
                    return;
                }
                field659[field676++] = 0;
                return;
            }
            if (arg0 == 202) {
                int var17 = field659[--field676];
                method318(var17);
                return;
            }
            if (arg0 == 203) {
                int var18 = field659[--field676];
                method319(var18);
                return;
            }
        } else if (arg0 < 500) {
            if (arg0 == 403) {
                field676 -= 2;
                int var19 = field659[field676];
                int var20 = field659[field676 + 1];
                for (int var21 = 0; var21 < class367.field5272.length; var21++) {
                    if (class367.field5272[var21] == var19) {
                        class81.field1158.field7015.method1682(class244.field3344, var20, Integer.MIN_VALUE, var21);
                        return;
                    }
                }
                for (int var22 = 0; var22 < class151.field2331.length; var22++) {
                    if (class151.field2331[var22] == var19) {
                        class81.field1158.field7015.method1682(class244.field3344, var20, Integer.MIN_VALUE, var22);
                        return;
                    }
                }
                return;
            }
            if (arg0 == 404) {
                field676 -= 2;
                int var23 = field659[field676];
                int var24 = field659[field676 + 1];
                class81.field1158.field7015.method1690(-6710, var24, var23);
                return;
            }
            if (arg0 == 410) {
                boolean var25 = field659[--field676] != 0;
                class81.field1158.field7015.method1684(var25, -1);
                return;
            }
        } else if (arg0 >= 1000 && arg0 < 1100 || arg0 >= 2000 && arg0 < 2100) {
            class444 var26;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var26 = class22.method138(-77, field659[--field676]);
            } else {
                var26 = arg1 ? field663 : field657;
            }
            if (arg0 == 1000) {
                field676 -= 4;
                var26.field6548 = field659[field676];
                var26.field6391 = field659[field676 + 1];
                int var27 = field659[field676 + 2];
                if (var27 < 0) {
                    var27 = 0;
                } else if (var27 > 5) {
                    var27 = 5;
                }
                int var28 = field659[field676 + 3];
                if (var28 < 0) {
                    var28 = 0;
                } else if (var28 > 5) {
                    var28 = 5;
                }
                var26.field6518 = (byte) var27;
                var26.field6464 = (byte) var28;
                class151.method1093(var26, 121);
                class35.method257((byte) -113, var26);
                if (var26.field6510 == -1) {
                    class332.method1959(11, var26.field6469);
                }
                return;
            }
            if (arg0 == 1001) {
                field676 -= 4;
                var26.field6426 = field659[field676];
                var26.field6399 = field659[field676 + 1];
                var26.field6411 = 0;
                var26.field6423 = 0;
                int var29 = field659[field676 + 2];
                if (var29 < 0) {
                    var29 = 0;
                } else if (var29 > 4) {
                    var29 = 4;
                }
                int var30 = field659[field676 + 3];
                if (var30 < 0) {
                    var30 = 0;
                } else if (var30 > 4) {
                    var30 = 4;
                }
                var26.field6398 = (byte) var29;
                var26.field6452 = (byte) var30;
                class151.method1093(var26, 115);
                class35.method257((byte) -113, var26);
                if (var26.field6477 == 0) {
                    class345.method2078(false, var26, 0);
                }
                return;
            }
            if (arg0 == 1003) {
                boolean var31 = field659[--field676] == 1;
                if (var26.field6439 != var31) {
                    var26.field6439 = var31;
                    class151.method1093(var26, 125);
                }
                if (var26.field6510 == -1) {
                    class19.method128(-112, var26.field6469);
                }
                return;
            }
            if (arg0 == 1004) {
                field676 -= 2;
                var26.field6386 = field659[field676];
                var26.field6534 = field659[field676 + 1];
                class151.method1093(var26, 110);
                class35.method257((byte) -113, var26);
                if (var26.field6477 == 0) {
                    class345.method2078(false, var26, 0);
                }
                return;
            }
            if (arg0 == 1005) {
                var26.field6437 = field659[--field676] == 1;
                return;
            }
        } else if (!(arg0 < 1100 || arg0 >= 1200) || !(arg0 < 2100 || arg0 >= 2200)) {
            class444 var32;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var32 = class22.method138(-75, field659[--field676]);
            } else {
                var32 = arg1 ? field663 : field657;
            }
            if (arg0 == 1100) {
                field676 -= 2;
                var32.field6443 = field659[field676];
                if (var32.field6443 > var32.field6511 - var32.field6470) {
                    var32.field6443 = var32.field6511 - var32.field6470;
                }
                if (var32.field6443 < 0) {
                    var32.field6443 = 0;
                }
                var32.field6451 = field659[field676 + 1];
                if (var32.field6451 > var32.field6506 - var32.field6453) {
                    var32.field6451 = var32.field6506 - var32.field6453;
                }
                if (var32.field6451 < 0) {
                    var32.field6451 = 0;
                }
                class151.method1093(var32, 126);
                if (var32.field6510 == -1) {
                    class128.method926((byte) 33, var32.field6469);
                }
                return;
            }
            if (arg0 == 1101) {
                var32.field6480 = field659[--field676];
                class151.method1093(var32, 117);
                if (var32.field6510 == -1) {
                    class76.method592((byte) -119, var32.field6469);
                }
                return;
            }
            if (arg0 == 1102) {
                var32.field6440 = field659[--field676] == 1;
                class151.method1093(var32, 120);
                return;
            }
            if (arg0 == 1103) {
                var32.field6396 = field659[--field676];
                class151.method1093(var32, 116);
                return;
            }
            if (arg0 == 1104) {
                var32.field6454 = field659[--field676];
                class151.method1093(var32, 111);
                return;
            }
            if (arg0 == 1105) {
                int var33 = field659[--field676];
                if (var32.field6461 != var33) {
                    var32.field6461 = var33;
                    class151.method1093(var32, 113);
                }
                if (var32.field6510 == -1) {
                    class211.method1340(var32.field6469, (byte) 64);
                }
                return;
            }
            if (arg0 == 1106) {
                var32.field6446 = field659[--field676];
                class151.method1093(var32, 111);
                return;
            }
            if (arg0 == 1107) {
                var32.field6524 = field659[--field676] == 1;
                class151.method1093(var32, 108);
                return;
            }
            if (arg0 == 1108) {
                var32.field6493 = 1;
                var32.field6486 = field659[--field676];
                class151.method1093(var32, 120);
                if (var32.field6510 == -1) {
                    class125.method901(4, var32.field6469);
                }
                return;
            }
            if (arg0 == 1109) {
                field676 -= 6;
                var32.field6447 = field659[field676];
                var32.field6420 = field659[field676 + 1];
                var32.field6538 = field659[field676 + 2];
                var32.field6490 = field659[field676 + 3];
                var32.field6472 = field659[field676 + 4];
                var32.field6526 = field659[field676 + 5];
                class151.method1093(var32, 116);
                if (var32.field6510 == -1) {
                    class409.method2399(-27599, var32.field6469);
                    class414.method2437(var32.field6469, (byte) 4);
                }
                return;
            }
            if (arg0 == 1110) {
                int var34 = field659[--field676];
                if (var32.field6442 != var34) {
                    var32.field6442 = var34;
                    var32.field6484 = 0;
                    var32.field6479 = 1;
                    var32.field6492 = 0;
                    class151.method1093(var32, 111);
                }
                if (var32.field6510 == -1) {
                    class312.method1802(var32.field6469, (byte) 115);
                }
                return;
            }
            if (arg0 == 1111) {
                var32.field6546 = field659[--field676] == 1;
                class151.method1093(var32, 109);
                return;
            }
            if (arg0 == 1112) {
                String var35 = field674[--field665];
                if (!var35.equals(var32.field6527)) {
                    var32.field6527 = var35;
                    class151.method1093(var32, 124);
                }
                if (var32.field6510 == -1) {
                    class302.method1754(var32.field6469, 3);
                }
                return;
            }
            if (arg0 == 1113) {
                var32.field6413 = field659[--field676];
                class151.method1093(var32, 110);
                if (var32.field6510 == -1) {
                    class145.method1008(var32.field6469, -1773);
                }
                return;
            }
            if (arg0 == 1114) {
                field676 -= 3;
                var32.field6419 = field659[field676];
                var32.field6431 = field659[field676 + 1];
                var32.field6408 = field659[field676 + 2];
                class151.method1093(var32, 122);
                return;
            }
            if (arg0 == 1115) {
                var32.field6544 = field659[--field676] == 1;
                class151.method1093(var32, 112);
                return;
            }
            if (arg0 == 1116) {
                var32.field6466 = field659[--field676];
                class151.method1093(var32, 113);
                return;
            }
            if (arg0 == 1117) {
                var32.field6400 = field659[--field676];
                class151.method1093(var32, 126);
                return;
            }
            if (arg0 == 1118) {
                var32.field6476 = field659[--field676] == 1;
                class151.method1093(var32, 109);
                return;
            }
            if (arg0 == 1119) {
                var32.field6467 = field659[--field676] == 1;
                class151.method1093(var32, 121);
                return;
            }
            if (arg0 == 1120) {
                field676 -= 2;
                var32.field6511 = field659[field676];
                var32.field6506 = field659[field676 + 1];
                class151.method1093(var32, 121);
                if (var32.field6477 == 0) {
                    class345.method2078(false, var32, 0);
                }
                return;
            }
            if (arg0 == 1121) {
                field676 -= 2;
                var32.field6542 = (short) field659[field676];
                var32.field6537 = (short) field659[field676 + 1];
                class151.method1093(var32, 110);
                return;
            }
            if (arg0 == 1122) {
                var32.field6535 = field659[--field676] == 1;
                class151.method1093(var32, 112);
                return;
            }
            if (arg0 == 1123) {
                var32.field6526 = field659[--field676];
                class151.method1093(var32, 120);
                if (var32.field6510 == -1) {
                    class409.method2399(-27599, var32.field6469);
                }
                return;
            }
            if (arg0 == 1124) {
                int var36 = field659[--field676];
                var32.field6429 = var36 == 1;
                class151.method1093(var32, 125);
                return;
            }
            if (arg0 == 1125) {
                field676 -= 2;
                var32.field6498 = field659[field676];
                var32.field6499 = field659[field676 + 1];
                class151.method1093(var32, 110);
                return;
            }
            if (arg0 == 1126) {
                var32.field6496 = field659[--field676];
                class151.method1093(var32, 111);
                return;
            }
            if (arg0 == 1127) {
                field676 -= 2;
                int var37 = field659[field676];
                int var38 = field659[field676 + 1];
                class145 var39 = class365.field5241.method2181((byte) 111, var37);
                if (var39.field2140 != var38) {
                    var32.method2627(16, var37, var38);
                    return;
                }
                var32.method2623(var37, -5);
                return;
            }
            if (arg0 == 1128) {
                int var40 = field659[--field676];
                String var41 = field674[--field665];
                class145 var42 = class365.field5241.method2181((byte) 118, var40);
                if (!var42.field2141.equals(var41)) {
                    var32.method2626(var40, (byte) -38, var41);
                    return;
                }
                var32.method2623(var40, -5);
                return;
            }
        } else if (!(arg0 < 1200 || arg0 >= 1300) || !(arg0 < 2200 || arg0 >= 2300)) {
            class444 var43;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var43 = class22.method138(-54, field659[--field676]);
            } else {
                var43 = arg1 ? field663 : field657;
            }
            class151.method1093(var43, 111);
            if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
                field676 -= 2;
                int var44 = field659[field676];
                int var45 = field659[field676 + 1];
                if (var43.field6510 == -1) {
                    class3.method21(var43.field6469, 769521281);
                    class409.method2399(-27599, var43.field6469);
                    class414.method2437(var43.field6469, (byte) -126);
                }
                if (var44 == -1) {
                    var43.field6493 = 1;
                    var43.field6486 = -1;
                    var43.field6481 = -1;
                    return;
                }
                var43.field6481 = var44;
                var43.field6475 = var45;
                if (arg0 == 1208 || arg0 == 1209) {
                    var43.field6501 = true;
                } else {
                    var43.field6501 = false;
                }
                class297 var46 = class534.field7872.method3089(var44, -125);
                var43.field6538 = var46.field4034;
                var43.field6490 = var46.field4051;
                var43.field6472 = var46.field4035;
                var43.field6447 = var46.field4049;
                var43.field6420 = var46.field4059;
                var43.field6526 = var46.field4081;
                if (arg0 == 1205 || arg0 == 1209) {
                    var43.field6463 = 0;
                } else if (arg0 == 1212 || arg0 == 1213) {
                    var43.field6463 = 1;
                } else {
                    var43.field6463 = 2;
                }
                if (var43.field6411 > 0) {
                    var43.field6526 = var43.field6526 * 32 / var43.field6411;
                    return;
                }
                if (var43.field6426 > 0) {
                    var43.field6526 = var43.field6526 * 32 / var43.field6426;
                }
                return;
            }
            if (arg0 == 1201) {
                var43.field6493 = 2;
                var43.field6486 = field659[--field676];
                if (var43.field6510 == -1) {
                    class125.method901(4, var43.field6469);
                }
                return;
            }
            if (arg0 == 1202) {
                var43.field6493 = 3;
                var43.field6486 = -1;
                if (var43.field6510 == -1) {
                    class125.method901(4, var43.field6469);
                }
                return;
            }
            if (arg0 == 1203) {
                var43.field6493 = 6;
                var43.field6486 = field659[--field676];
                if (var43.field6510 == -1) {
                    class125.method901(4, var43.field6469);
                }
                return;
            }
            if (arg0 == 1204) {
                var43.field6493 = 5;
                var43.field6486 = field659[--field676];
                if (var43.field6510 == -1) {
                    class125.method901(4, var43.field6469);
                }
                return;
            }
            if (arg0 == 1206) {
                field676 -= 4;
                var43.field6539 = field659[field676];
                var43.field6444 = field659[field676 + 1];
                var43.field6516 = field659[field676 + 2];
                var43.field6448 = field659[field676 + 3];
                class151.method1093(var43, 123);
                return;
            }
            if (arg0 == 1207) {
                field676 -= 2;
                var43.field6450 = field659[field676];
                var43.field6513 = field659[field676 + 1];
                class151.method1093(var43, 119);
                return;
            }
            if (arg0 == 1210) {
                field676 -= 4;
                var43.field6486 = field659[field676];
                var43.field6414 = field659[field676 + 1];
                if (field659[field676 + 2] == 1) {
                    var43.field6493 = 9;
                } else {
                    var43.field6493 = 8;
                }
                if (field659[field676 + 3] == 1) {
                    var43.field6501 = true;
                } else {
                    var43.field6501 = false;
                }
                if (var43.field6510 == -1) {
                    class125.method901(4, var43.field6469);
                }
                return;
            }
            if (arg0 == 1211) {
                var43.field6493 = 5;
                var43.field6486 = class484.field6972;
                var43.field6414 = 0;
                if (var43.field6510 == -1) {
                    class125.method901(4, var43.field6469);
                }
                return;
            }
        } else if ((arg0 < 1300 || arg0 >= 1400) && (arg0 < 2300 || arg0 >= 2400)) {
            if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
                class444 var58;
                if (arg0 >= 2000) {
                    arg0 -= 1000;
                    var58 = class22.method138(-96, field659[--field676]);
                } else {
                    var58 = arg1 ? field663 : field657;
                }
                String var59 = field674[--field665];
                int[] var60 = null;
                if (var59.length() > 0 && var59.charAt(var59.length() - 1) == 'Y') {
                    int var61 = field659[--field676];
                    if (var61 > 0) {
                        var60 = new int[var61];
                        while (var61-- > 0) {
                            var60[var61] = field659[--field676];
                        }
                    }
                    var59 = var59.substring(0, var59.length() - 1);
                }
                Object[] var62 = new Object[var59.length() + 1];
                for (int var63 = var62.length - 1; var63 >= 1; var63--) {
                    if (var59.charAt(var63 - 1) == 's') {
                        var62[var63] = field674[--field665];
                    } else {
                        var62[var63] = Integer.valueOf(field659[--field676]);
                    }
                }
                int var64 = field659[--field676];
                if (var64 == -1) {
                    var62 = null;
                } else {
                    var62[0] = Integer.valueOf(var64);
                }
                if (arg0 == 1400) {
                    var58.field6531 = var62;
                } else if (arg0 == 1401) {
                    var58.field6541 = var62;
                } else if (arg0 == 1402) {
                    var58.field6462 = var62;
                } else if (arg0 == 1403) {
                    var58.field6532 = var62;
                } else if (arg0 == 1404) {
                    var58.field6465 = var62;
                } else if (arg0 == 1405) {
                    var58.field6390 = var62;
                } else if (arg0 == 1406) {
                    var58.field6406 = var62;
                } else if (arg0 == 1407) {
                    var58.field6521 = var62;
                    var58.field6441 = var60;
                } else if (arg0 == 1408) {
                    var58.field6394 = var62;
                } else if (arg0 == 1409) {
                    var58.field6536 = var62;
                } else if (arg0 == 1410) {
                    var58.field6543 = var62;
                } else if (arg0 == 1411) {
                    var58.field6489 = var62;
                } else if (arg0 == 1412) {
                    var58.field6522 = var62;
                } else if (arg0 == 1414) {
                    var58.field6402 = var62;
                    var58.field6458 = var60;
                } else if (arg0 == 1415) {
                    var58.field6427 = var62;
                    var58.field6430 = var60;
                } else if (arg0 == 1416) {
                    var58.field6425 = var62;
                } else if (arg0 == 1417) {
                    var58.field6428 = var62;
                } else if (arg0 == 1418) {
                    var58.field6416 = var62;
                } else if (arg0 == 1419) {
                    var58.field6432 = var62;
                } else if (arg0 == 1420) {
                    var58.field6478 = var62;
                } else if (arg0 == 1421) {
                    var58.field6438 = var62;
                } else if (arg0 == 1422) {
                    var58.field6393 = var62;
                } else if (arg0 == 1423) {
                    var58.field6530 = var62;
                } else if (arg0 == 1424) {
                    var58.field6445 = var62;
                } else if (arg0 == 1425) {
                    var58.field6457 = var62;
                } else if (arg0 == 1426) {
                    var58.field6460 = var62;
                } else if (arg0 == 1427) {
                    var58.field6509 = var62;
                } else if (arg0 == 1428) {
                    var58.field6508 = var62;
                    var58.field6433 = var60;
                } else if (arg0 == 1429) {
                    var58.field6468 = var62;
                    var58.field6422 = var60;
                } else if (arg0 == 1430) {
                    var58.field6512 = var62;
                }
                var58.field6395 = true;
                return;
            }
            if (arg0 < 1600) {
                class444 var65 = arg1 ? field663 : field657;
                if (arg0 == 1500) {
                    field659[field676++] = var65.field6500;
                    return;
                }
                if (arg0 == 1501) {
                    field659[field676++] = var65.field6418;
                    return;
                }
                if (arg0 == 1502) {
                    field659[field676++] = var65.field6470;
                    return;
                }
                if (arg0 == 1503) {
                    field659[field676++] = var65.field6453;
                    return;
                }
                if (arg0 == 1504) {
                    field659[field676++] = var65.field6439 ? 1 : 0;
                    return;
                }
                if (arg0 == 1505) {
                    field659[field676++] = var65.field6515;
                    return;
                }
                if (arg0 == 1506) {
                    class444 var66 = class345.method2079(-273095166, var65);
                    field659[field676++] = var66 == null ? -1 : var66.field6469;
                    return;
                }
            } else if (arg0 < 1700) {
                class444 var67 = arg1 ? field663 : field657;
                if (arg0 == 1600) {
                    field659[field676++] = var67.field6443;
                    return;
                }
                if (arg0 == 1601) {
                    field659[field676++] = var67.field6451;
                    return;
                }
                if (arg0 == 1602) {
                    field674[field665++] = var67.field6527;
                    return;
                }
                if (arg0 == 1603) {
                    field659[field676++] = var67.field6511;
                    return;
                }
                if (arg0 == 1604) {
                    field659[field676++] = var67.field6506;
                    return;
                }
                if (arg0 == 1605) {
                    field659[field676++] = var67.field6526;
                    return;
                }
                if (arg0 == 1606) {
                    field659[field676++] = var67.field6538;
                    return;
                }
                if (arg0 == 1607) {
                    field659[field676++] = var67.field6472;
                    return;
                }
                if (arg0 == 1608) {
                    field659[field676++] = var67.field6490;
                    return;
                }
                if (arg0 == 1609) {
                    field659[field676++] = var67.field6396;
                    return;
                }
                if (arg0 == 1610) {
                    field659[field676++] = var67.field6447;
                    return;
                }
                if (arg0 == 1611) {
                    field659[field676++] = var67.field6420;
                    return;
                }
                if (arg0 == 1612) {
                    field659[field676++] = var67.field6461;
                    return;
                }
                if (arg0 == 1613) {
                    int var68 = field659[--field676];
                    class145 var69 = class365.field5241.method2181((byte) 104, var68);
                    if (var69.method1003((byte) 122)) {
                        field674[field665++] = var67.method2618(var69.field2141, var68, (byte) 86);
                        return;
                    }
                    field659[field676++] = var67.method2616(-19977, var69.field2140, var68);
                    return;
                }
            } else if (arg0 < 1800) {
                class444 var70 = arg1 ? field663 : field657;
                if (arg0 == 1700) {
                    field659[field676++] = var70.field6481;
                    return;
                }
                if (arg0 == 1701) {
                    if (var70.field6481 != -1) {
                        field659[field676++] = var70.field6475;
                        return;
                    }
                    field659[field676++] = 0;
                    return;
                }
                if (arg0 == 1702) {
                    field659[field676++] = var70.field6510;
                    return;
                }
            } else if (arg0 < 1900) {
                class444 var71 = arg1 ? field663 : field657;
                if (arg0 == 1800) {
                    field659[field676++] = client.method3067(var71).method2554(-89);
                    return;
                }
                if (arg0 == 1801) {
                    int var72 = field659[--field676];
                    int var334 = var72 - 1;
                    if (var71.field6405 != null && var334 < var71.field6405.length && var71.field6405[var334] != null) {
                        field674[field665++] = var71.field6405[var334];
                        return;
                    }
                    field674[field665++] = "";
                    return;
                }
                if (arg0 == 1802) {
                    if (var71.field6409 == null) {
                        field674[field665++] = "";
                        return;
                    }
                    field674[field665++] = var71.field6409;
                    return;
                }
            } else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
                class444 var332;
                if (arg0 >= 2000) {
                    var332 = class22.method138(-54, field659[--field676]);
                    arg0 -= 1000;
                } else {
                    var332 = arg1 ? field663 : field657;
                }
                if (field683 >= 10) {
                    throw new RuntimeException("C29xx-1");
                }
                if (arg0 == 1927) {
                    if (var332.field6509 == null) {
                        return;
                    }
                    class414 var333 = new class414();
                    var333.field5896 = var332;
                    var333.field5900 = var332.field6509;
                    var333.field5902 = field683 + 1;
                    class63.field922.method3139(0, var333);
                    return;
                }
            } else if (arg0 < 2600) {
                class444 var73 = class22.method138(-72, field659[--field676]);
                if (arg0 == 2500) {
                    field659[field676++] = var73.field6500;
                    return;
                }
                if (arg0 == 2501) {
                    field659[field676++] = var73.field6418;
                    return;
                }
                if (arg0 == 2502) {
                    field659[field676++] = var73.field6470;
                    return;
                }
                if (arg0 == 2503) {
                    field659[field676++] = var73.field6453;
                    return;
                }
                if (arg0 == 2504) {
                    field659[field676++] = var73.field6439 ? 1 : 0;
                    return;
                }
                if (arg0 == 2505) {
                    field659[field676++] = var73.field6515;
                    return;
                }
                if (arg0 == 1506) {
                    class444 var74 = class345.method2079(-273095166, var73);
                    field659[field676++] = var74 == null ? -1 : var74.field6469;
                    return;
                }
            } else if (arg0 < 2700) {
                class444 var75 = class22.method138(117, field659[--field676]);
                if (arg0 == 2600) {
                    field659[field676++] = var75.field6443;
                    return;
                }
                if (arg0 == 2601) {
                    field659[field676++] = var75.field6451;
                    return;
                }
                if (arg0 == 2602) {
                    field674[field665++] = var75.field6527;
                    return;
                }
                if (arg0 == 2603) {
                    field659[field676++] = var75.field6511;
                    return;
                }
                if (arg0 == 2604) {
                    field659[field676++] = var75.field6506;
                    return;
                }
                if (arg0 == 2605) {
                    field659[field676++] = var75.field6526;
                    return;
                }
                if (arg0 == 2606) {
                    field659[field676++] = var75.field6538;
                    return;
                }
                if (arg0 == 2607) {
                    field659[field676++] = var75.field6472;
                    return;
                }
                if (arg0 == 2608) {
                    field659[field676++] = var75.field6490;
                    return;
                }
                if (arg0 == 2609) {
                    field659[field676++] = var75.field6396;
                    return;
                }
                if (arg0 == 2610) {
                    field659[field676++] = var75.field6447;
                    return;
                }
                if (arg0 == 2611) {
                    field659[field676++] = var75.field6420;
                    return;
                }
                if (arg0 == 2612) {
                    field659[field676++] = var75.field6461;
                    return;
                }
            } else if (arg0 < 2800) {
                if (arg0 == 2700) {
                    class444 var76 = class22.method138(-94, field659[--field676]);
                    field659[field676++] = var76.field6481;
                    return;
                }
                if (arg0 == 2701) {
                    class444 var77 = class22.method138(78, field659[--field676]);
                    if (var77.field6481 != -1) {
                        field659[field676++] = var77.field6475;
                        return;
                    }
                    field659[field676++] = 0;
                    return;
                }
                if (arg0 == 2702) {
                    int var78 = field659[--field676];
                    class91 var79 = (class91) class425.field6168.method1592((byte) -25, (long) var78);
                    if (var79 != null) {
                        field659[field676++] = 1;
                        return;
                    }
                    field659[field676++] = 0;
                    return;
                }
                if (arg0 == 2703) {
                    class444 var80 = class22.method138(-104, field659[--field676]);
                    if (var80.field6491 == null) {
                        field659[field676++] = 0;
                        return;
                    }
                    int var81 = var80.field6491.length;
                    for (int var82 = 0; var82 < var80.field6491.length; var82++) {
                        if (var80.field6491[var82] == null) {
                            var81 = var82;
                            break;
                        }
                    }
                    field659[field676++] = var81;
                    return;
                }
                if (arg0 == 2704 || arg0 == 2705) {
                    field676 -= 2;
                    int var83 = field659[field676];
                    int var84 = field659[field676 + 1];
                    class91 var85 = (class91) class425.field6168.method1592((byte) -25, (long) var83);
                    if (var85 != null && var85.field1460 == var84) {
                        field659[field676++] = 1;
                        return;
                    }
                    field659[field676++] = 0;
                    return;
                }
            } else if (arg0 < 2900) {
                class444 var86 = class22.method138(-106, field659[--field676]);
                if (arg0 == 2800) {
                    field659[field676++] = client.method3067(var86).method2554(127);
                    return;
                }
                if (arg0 == 2801) {
                    int var87 = field659[--field676];
                    int var335 = var87 - 1;
                    if (var86.field6405 != null && var335 < var86.field6405.length && var86.field6405[var335] != null) {
                        field674[field665++] = var86.field6405[var335];
                        return;
                    }
                    field674[field665++] = "";
                    return;
                }
                if (arg0 == 2802) {
                    if (var86.field6409 == null) {
                        field674[field665++] = "";
                        return;
                    }
                    field674[field665++] = var86.field6409;
                    return;
                }
            } else if (arg0 < 3200) {
                if (arg0 == 3100) {
                    String var88 = field674[--field665];
                    class35.method256((byte) 111, var88);
                    return;
                }
                if (arg0 == 3101) {
                    field676 -= 2;
                    class113.method854(field659[field676 + 1], class81.field1158, field659[field676], (byte) -90);
                    return;
                }
                if (arg0 == 3103) {
                    class163.method1138((byte) 92, true);
                    return;
                }
                if (arg0 == 3104) {
                    String var89 = field674[--field665];
                    int var90 = 0;
                    if (class458.method2674(var89, -88)) {
                        var90 = class410.method2405(54, var89);
                    }
                    field666++;
                    class274.method1602(14, class322.field4421);
                    class17.field275.method1858(var90, (byte) -86);
                    return;
                }
                if (arg0 == 3105) {
                    String var91 = field674[--field665];
                    field655++;
                    class274.method1602(14, class192.field2806);
                    class17.field275.method1891(false, var91.length() + 1);
                    class17.field275.method1879(32767, var91);
                    return;
                }
                if (arg0 == 3106) {
                    String var92 = field674[--field665];
                    field671++;
                    class274.method1602(14, class308.field4184);
                    class17.field275.method1891(false, var92.length() + 1);
                    class17.field275.method1879(32767, var92);
                    return;
                }
                if (arg0 == 3107) {
                    int var93 = field659[--field676];
                    String var94 = field674[--field665];
                    class455.method2666(var93, 0, var94);
                    return;
                }
                if (arg0 == 3108) {
                    field676 -= 3;
                    int var95 = field659[field676];
                    int var96 = field659[field676 + 1];
                    int var97 = field659[field676 + 2];
                    class444 var98 = class22.method138(-111, var97);
                    class129.method931(var96, var98, var95, 0);
                    return;
                }
                if (arg0 == 3109) {
                    field676 -= 2;
                    int var99 = field659[field676];
                    int var100 = field659[field676 + 1];
                    class444 var101 = arg1 ? field663 : field657;
                    class129.method931(var100, var101, var99, 0);
                    return;
                }
                if (arg0 == 3110) {
                    int var102 = field659[--field676];
                    field658++;
                    class274.method1602(14, class389.field5611);
                    class17.field275.method1857(561746448, var102);
                    return;
                }
                if (arg0 == 3111) {
                    field676 -= 2;
                    int var103 = field659[field676];
                    int var104 = field659[field676 + 1];
                    class91 var105 = (class91) class425.field6168.method1592((byte) -25, (long) var103);
                    if (var105 != null) {
                        class147.method1052(var105, true, var105.field1460 != var104, -4);
                    }
                    class317.method1827(var104, 3, var103, true, 1);
                    return;
                }
                if (arg0 == 3112) {
                    field676--;
                    int var106 = field659[field676];
                    class91 var107 = (class91) class425.field6168.method1592((byte) -25, (long) var106);
                    if (var107 != null && var107.field1461 == 3) {
                        class147.method1052(var107, true, true, -4);
                    }
                    return;
                }
                if (arg0 == 3113) {
                    class416.method2458(-65, field674[--field665]);
                    return;
                }
                if (arg0 == 3114) {
                    field676 -= 2;
                    int var108 = field659[field676];
                    int var109 = field659[field676 + 1];
                    String var110 = field674[--field665];
                    class9.method68("", var109, var108, -1, var110, "");
                    return;
                }
            } else if (arg0 < 3300) {
                if (arg0 == 3200) {
                    field676 -= 3;
                    class431.method2558(255, field659[field676 + 2], -1, field659[field676], field659[field676 + 1]);
                    return;
                }
                if (arg0 == 3201) {
                    class60.method403(50, 255, 0, field659[--field676]);
                    return;
                }
                if (arg0 == 3202) {
                    field676 -= 2;
                    class259.method1537(field659[field676], field659[field676 + 1], 255, true);
                    return;
                }
                if (arg0 == 3203) {
                    field676 -= 4;
                    class431.method2558(field659[field676 + 3], field659[field676 + 2], -1, field659[field676], field659[field676 + 1]);
                    return;
                }
                if (arg0 == 3204) {
                    field676 -= 3;
                    class60.method403(field659[field676 + 2], field659[field676 + 1], 0, field659[field676]);
                    return;
                }
                if (arg0 == 3205) {
                    field676 -= 3;
                    class259.method1537(field659[field676], field659[field676 + 1], field659[field676 + 2], true);
                    return;
                }
                if (arg0 == 3206) {
                    field676 -= 4;
                    class329.method1944(field659[field676 + 2], 37, field659[field676], field659[field676 + 3], field659[field676 + 1]);
                    return;
                }
            } else if (arg0 < 3400) {
                if (arg0 == 3300) {
                    field659[field676++] = class28.field417;
                    return;
                }
                if (arg0 == 3301) {
                    field676 -= 2;
                    int var111 = field659[field676];
                    int var112 = field659[field676 + 1];
                    field659[field676++] = class351.method2104(var112, 103, var111, false);
                    return;
                }
                if (arg0 == 3302) {
                    field676 -= 2;
                    int var113 = field659[field676];
                    int var114 = field659[field676 + 1];
                    field659[field676++] = class486.method2877(var114, false, var113, (byte) 2);
                    return;
                }
                if (arg0 == 3303) {
                    field676 -= 2;
                    int var115 = field659[field676];
                    int var116 = field659[field676 + 1];
                    field659[field676++] = class356.method2129(false, var115, false, var116);
                    return;
                }
                if (arg0 == 3304) {
                    int var117 = field659[--field676];
                    field659[field676++] = class486.field6993.method121(var117, (byte) -112).field3573;
                    return;
                }
                if (arg0 == 3305) {
                    int var118 = field659[--field676];
                    field659[field676++] = class391.field5645[var118];
                    return;
                }
                if (arg0 == 3306) {
                    int var119 = field659[--field676];
                    field659[field676++] = class497.field7279[var119];
                    return;
                }
                if (arg0 == 3307) {
                    int var120 = field659[--field676];
                    field659[field676++] = class206.field2964[var120];
                    return;
                }
                if (arg0 == 3308) {
                    byte var121 = class81.field1158.field6279;
                    int var122 = (class81.field1158.field6284 >> 7) + class110.field1775;
                    int var123 = (class81.field1158.field6287 >> 7) + class399.field5727;
                    field659[field676++] = (var121 << 28) + (var122 << 14) + var123;
                    return;
                }
                if (arg0 == 3309) {
                    int var124 = field659[--field676];
                    field659[field676++] = var124 >> 14 & 0x3FFF;
                    return;
                }
                if (arg0 == 3310) {
                    int var125 = field659[--field676];
                    field659[field676++] = var125 >> 28;
                    return;
                }
                if (arg0 == 3311) {
                    int var126 = field659[--field676];
                    field659[field676++] = var126 & 0x3FFF;
                    return;
                }
                if (arg0 == 3312) {
                    field659[field676++] = class65.field938 ? 1 : 0;
                    return;
                }
                if (arg0 == 3313) {
                    field676 -= 2;
                    int var127 = field659[field676];
                    int var128 = field659[field676 + 1];
                    field659[field676++] = class351.method2104(var128, -63, var127, true);
                    return;
                }
                if (arg0 == 3314) {
                    field676 -= 2;
                    int var129 = field659[field676];
                    int var130 = field659[field676 + 1];
                    field659[field676++] = class486.method2877(var130, true, var129, (byte) 2);
                    return;
                }
                if (arg0 == 3315) {
                    field676 -= 2;
                    int var131 = field659[field676];
                    int var132 = field659[field676 + 1];
                    field659[field676++] = class356.method2129(false, var131, true, var132);
                    return;
                }
                if (arg0 == 3316) {
                    if (class136.field2064 >= 2) {
                        field659[field676++] = class136.field2064;
                        return;
                    }
                    field659[field676++] = 0;
                    return;
                }
                if (arg0 == 3317) {
                    field659[field676++] = class104.field1705;
                    return;
                }
                if (arg0 == 3318) {
                    field659[field676++] = class184.field2737.field609;
                    return;
                }
                if (arg0 == 3321) {
                    field659[field676++] = class275.field3735;
                    return;
                }
                if (arg0 == 3322) {
                    field659[field676++] = class525.field7672;
                    return;
                }
                if (arg0 == 3323) {
                    if (class3.field35 >= 5 && class3.field35 <= 9) {
                        field659[field676++] = 1;
                        return;
                    }
                    field659[field676++] = 0;
                    return;
                }
                if (arg0 == 3324) {
                    if (class3.field35 >= 5 && class3.field35 <= 9) {
                        field659[field676++] = class3.field35;
                        return;
                    }
                    field659[field676++] = 0;
                    return;
                }
                if (arg0 == 3325) {
                    field659[field676++] = class296.field3998 ? 1 : 0;
                    return;
                }
                if (arg0 == 3326) {
                    field659[field676++] = class81.field1158.field7028;
                    return;
                }
                if (arg0 == 3327) {
                    field659[field676++] = class81.field1158.field7015.field3933 ? 1 : 0;
                    return;
                }
                if (arg0 == 3329) {
                    field659[field676++] = class185.field2739 ? 1 : 0;
                    return;
                }
                if (arg0 == 3330) {
                    int var133 = field659[--field676];
                    field659[field676++] = class523.method3108(false, var133, true);
                    return;
                }
                if (arg0 == 3331) {
                    field676 -= 2;
                    int var134 = field659[field676];
                    int var135 = field659[field676 + 1];
                    field659[field676++] = class419.method2478((byte) -12, false, false, var134, var135);
                    return;
                }
                if (arg0 == 3332) {
                    field676 -= 2;
                    int var136 = field659[field676];
                    int var137 = field659[field676 + 1];
                    field659[field676++] = class419.method2478((byte) -12, false, true, var136, var137);
                    return;
                }
                if (arg0 == 3333) {
                    field659[field676++] = class61.field899;
                    return;
                }
                if (arg0 == 3335) {
                    field659[field676++] = class486.field6998;
                    return;
                }
                if (arg0 == 3336) {
                    field676 -= 4;
                    int var138 = field659[field676];
                    int var139 = field659[field676 + 1];
                    int var140 = field659[field676 + 2];
                    int var141 = field659[field676 + 3];
                    int var142 = (var139 << 14) + var138;
                    int var143 = (var140 << 28) + var142;
                    int var144 = var141 + var143;
                    field659[field676++] = var144;
                    return;
                }
                if (arg0 == 3337) {
                    field659[field676++] = class387.field5536;
                    return;
                }
                if (arg0 == 3338) {
                    field659[field676++] = class419.method2480(-79);
                    return;
                }
                if (arg0 == 3339) {
                    field659[field676++] = class338.field4904 ? 1 : 0;
                    return;
                }
                if (arg0 == 3340) {
                    field659[field676++] = class508.field7419 ? 1 : 0;
                    return;
                }
                if (arg0 == 3341) {
                    field659[field676++] = class520.field7640 ? 1 : 0;
                    return;
                }
            } else if (arg0 < 3500) {
                if (arg0 == 3400) {
                    field676 -= 2;
                    int var145 = field659[field676];
                    int var146 = field659[field676 + 1];
                    class488 var147 = class196.field2877.method1243(var145, (byte) -97);
                    field674[field665++] = var147.method2894(var146, false);
                    return;
                }
                if (arg0 == 3408) {
                    field676 -= 4;
                    int var148 = field659[field676];
                    int var149 = field659[field676 + 1];
                    int var150 = field659[field676 + 2];
                    int var151 = field659[field676 + 3];
                    class488 var152 = class196.field2877.method1243(var150, (byte) -104);
                    if (var152.field7064 == var148 && var152.field7059 == var149) {
                        if (var149 == 115) {
                            field674[field665++] = var152.method2894(var151, false);
                            return;
                        }
                        field659[field676++] = var152.method2900(true, var151);
                        return;
                    }
                    throw new RuntimeException("C3408-1");
                }
                if (arg0 == 3409) {
                    field676 -= 3;
                    int var153 = field659[field676];
                    int var154 = field659[field676 + 1];
                    int var155 = field659[field676 + 2];
                    if (var154 == -1) {
                        throw new RuntimeException("C3409-2");
                    }
                    class488 var156 = class196.field2877.method1243(var154, (byte) -98);
                    if (var156.field7059 != var153) {
                        throw new RuntimeException("C3409-1");
                    }
                    field659[field676++] = var156.method2903(-121, var155) ? 1 : 0;
                    return;
                }
                if (arg0 == 3410) {
                    int var157 = field659[--field676];
                    String var158 = field674[--field665];
                    if (var157 == -1) {
                        throw new RuntimeException("C3410-2");
                    }
                    class488 var159 = class196.field2877.method1243(var157, (byte) -107);
                    if (var159.field7059 != 's') {
                        throw new RuntimeException("C3410-1");
                    }
                    field659[field676++] = var159.method2899(var158, -6) ? 1 : 0;
                    return;
                }
                if (arg0 == 3411) {
                    int var160 = field659[--field676];
                    class488 var161 = class196.field2877.method1243(var160, (byte) -98);
                    field659[field676++] = var161.field7073.method1585((byte) 89);
                    return;
                }
            } else if (arg0 < 3700) {
                if (arg0 == 3600) {
                    if (class382.field5486 == 0) {
                        field659[field676++] = -2;
                        return;
                    }
                    if (class382.field5486 == 1) {
                        field659[field676++] = -1;
                        return;
                    }
                    field659[field676++] = class399.field5724;
                    return;
                }
                if (arg0 == 3601) {
                    int var162 = field659[--field676];
                    if (class382.field5486 == 2 && var162 < class399.field5724) {
                        field674[field665++] = class494.field7148[var162];
                        if (class384.field5510[var162] != null) {
                            field674[field665++] = class384.field5510[var162];
                            return;
                        }
                        field674[field665++] = "";
                        return;
                    }
                    field674[field665++] = "";
                    field674[field665++] = "";
                    return;
                }
                if (arg0 == 3602) {
                    int var163 = field659[--field676];
                    if (class382.field5486 == 2 && var163 < class399.field5724) {
                        field659[field676++] = class423.field6155[var163];
                        return;
                    }
                    field659[field676++] = 0;
                    return;
                }
                if (arg0 == 3603) {
                    int var164 = field659[--field676];
                    if (class382.field5486 == 2 && var164 < class399.field5724) {
                        field659[field676++] = class342.field4949[var164];
                        return;
                    }
                    field659[field676++] = 0;
                    return;
                }
                if (arg0 == 3604) {
                    String var165 = field674[--field665];
                    int var166 = field659[--field676];
                    class187.method1254(var166, var165, -31569);
                    return;
                }
                if (arg0 == 3605) {
                    String var167 = field674[--field665];
                    class369.method2203(-72, var167);
                    return;
                }
                if (arg0 == 3606) {
                    String var168 = field674[--field665];
                    class125.method904(1, var168);
                    return;
                }
                if (arg0 == 3607) {
                    String var169 = field674[--field665];
                    class55.method357(false, var169, false);
                    return;
                }
                if (arg0 == 3608) {
                    String var170 = field674[--field665];
                    class86.method727(var170, -1);
                    return;
                }
                if (arg0 == 3609) {
                    String var171 = field674[--field665];
                    if (var171.startsWith("<img=0>") || var171.startsWith("<img=1>")) {
                        var171 = var171.substring(7);
                    }
                    field659[field676++] = class488.method2898((byte) -71, var171) ? 1 : 0;
                    return;
                }
                if (arg0 == 3610) {
                    int var172 = field659[--field676];
                    if (class382.field5486 == 2 && var172 < class399.field5724) {
                        field674[field665++] = class184.field2736[var172];
                        return;
                    }
                    field674[field665++] = "";
                    return;
                }
                if (arg0 == 3611) {
                    if (class372.field5340 != null) {
                        field674[field665++] = class220.method1374(class372.field5340, (byte) -110);
                        return;
                    }
                    field674[field665++] = "";
                    return;
                }
                if (arg0 == 3612) {
                    if (class372.field5340 != null) {
                        field659[field676++] = class167.field2554;
                        return;
                    }
                    field659[field676++] = 0;
                    return;
                }
                if (arg0 == 3613) {
                    int var173 = field659[--field676];
                    if (class372.field5340 != null && var173 < class167.field2554) {
                        field674[field665++] = class347.field4994[var173].field3343;
                        return;
                    }
                    field674[field665++] = "";
                    return;
                }
                if (arg0 == 3614) {
                    int var174 = field659[--field676];
                    if (class372.field5340 != null && var174 < class167.field2554) {
                        field659[field676++] = class347.field4994[var174].field3348;
                        return;
                    }
                    field659[field676++] = 0;
                    return;
                }
                if (arg0 == 3615) {
                    int var175 = field659[--field676];
                    if (class372.field5340 != null && var175 < class167.field2554) {
                        field659[field676++] = class347.field4994[var175].field3346;
                        return;
                    }
                    field659[field676++] = 0;
                    return;
                }
                if (arg0 == 3616) {
                    field659[field676++] = class366.field5258;
                    return;
                }
                if (arg0 == 3617) {
                    String var176 = field674[--field665];
                    class395.method2340(-9480, var176);
                    return;
                }
                if (arg0 == 3618) {
                    field659[field676++] = class428.field6219;
                    return;
                }
                if (arg0 == 3619) {
                    String var177 = field674[--field665];
                    class214.method1351(25, var177);
                    return;
                }
                if (arg0 == 3620) {
                    class139.method981(-115);
                    return;
                }
                if (arg0 == 3621) {
                    if (class382.field5486 == 0) {
                        field659[field676++] = -1;
                        return;
                    }
                    field659[field676++] = class296.field3993;
                    return;
                }
                if (arg0 == 3622) {
                    int var178 = field659[--field676];
                    if (class382.field5486 != 0 && var178 < class296.field3993) {
                        field674[field665++] = class169.field2579[var178];
                        if (class148.field2266[var178] != null) {
                            field674[field665++] = class148.field2266[var178];
                            return;
                        }
                        field674[field665++] = "";
                        return;
                    }
                    field674[field665++] = "";
                    field674[field665++] = "";
                    return;
                }
                if (arg0 == 3623) {
                    String var179 = field674[--field665];
                    if (var179.startsWith("<img=0>") || var179.startsWith("<img=1>")) {
                        var179 = var179.substring(7);
                    }
                    field659[field676++] = class95.method772(0, var179) ? 1 : 0;
                    return;
                }
                if (arg0 == 3624) {
                    int var180 = field659[--field676];
                    if (class347.field4994 != null && var180 < class167.field2554 && class347.field4994[var180].field3345.equalsIgnoreCase(class81.field1158.field7036)) {
                        field659[field676++] = 1;
                        return;
                    }
                    field659[field676++] = 0;
                    return;
                }
                if (arg0 == 3625) {
                    if (class511.field7488 != null) {
                        field674[field665++] = class511.field7488;
                        return;
                    }
                    field674[field665++] = "";
                    return;
                }
                if (arg0 == 3626) {
                    int var181 = field659[--field676];
                    if (class372.field5340 != null && var181 < class167.field2554) {
                        field674[field665++] = class347.field4994[var181].field3347;
                        return;
                    }
                    field674[field665++] = "";
                    return;
                }
                if (arg0 == 3627) {
                    int var182 = field659[--field676];
                    if (class382.field5486 == 2 && var182 >= 0 && var182 < class399.field5724) {
                        field659[field676++] = class529.field7782[var182] ? 1 : 0;
                        return;
                    }
                    field659[field676++] = 0;
                    return;
                }
                if (arg0 == 3628) {
                    String var183 = field674[--field665];
                    if (var183.startsWith("<img=0>") || var183.startsWith("<img=1>")) {
                        var183 = var183.substring(7);
                    }
                    field659[field676++] = class336.method2048(120, var183);
                    return;
                }
                if (arg0 == 3629) {
                    field659[field676++] = class153.field2362;
                    return;
                }
                if (arg0 == 3630) {
                    String var184 = field674[--field665];
                    class55.method357(false, var184, true);
                    return;
                }
                if (arg0 == 3631) {
                    int var185 = field659[--field676];
                    field659[field676++] = class76.field1077[var185] ? 1 : 0;
                    return;
                }
                if (arg0 == 3632) {
                    int var186 = field659[--field676];
                    if (class372.field5340 != null && var186 < class167.field2554) {
                        field674[field665++] = class347.field4994[var186].field3345;
                        return;
                    }
                    field674[field665++] = "";
                    return;
                }
                if (arg0 == 3633) {
                    int var187 = field659[--field676];
                    if (class382.field5486 != 0 && var187 < class296.field3993) {
                        field674[field665++] = class508.field7421[var187];
                        return;
                    }
                    field674[field665++] = "";
                    return;
                }
            } else if (arg0 < 4000) {
                if (arg0 == 3903) {
                    int var188 = field659[--field676];
                    field659[field676++] = class304.field4129[var188].method2880(-9);
                    return;
                }
                if (arg0 == 3904) {
                    int var189 = field659[--field676];
                    field659[field676++] = class304.field4129[var189].field6986;
                    return;
                }
                if (arg0 == 3905) {
                    int var190 = field659[--field676];
                    field659[field676++] = class304.field4129[var190].field6982;
                    return;
                }
                if (arg0 == 3906) {
                    int var191 = field659[--field676];
                    field659[field676++] = class304.field4129[var191].field6991;
                    return;
                }
                if (arg0 == 3907) {
                    int var192 = field659[--field676];
                    field659[field676++] = class304.field4129[var192].field6994;
                    return;
                }
                if (arg0 == 3908) {
                    int var193 = field659[--field676];
                    field659[field676++] = class304.field4129[var193].field6992;
                    return;
                }
                if (arg0 == 3910) {
                    int var194 = field659[--field676];
                    int var195 = class304.field4129[var194].method2881((byte) -111);
                    field659[field676++] = var195 == 0 ? 1 : 0;
                    return;
                }
                if (arg0 == 3911) {
                    int var196 = field659[--field676];
                    int var197 = class304.field4129[var196].method2881((byte) -111);
                    field659[field676++] = var197 == 2 ? 1 : 0;
                    return;
                }
                if (arg0 == 3912) {
                    int var198 = field659[--field676];
                    int var199 = class304.field4129[var198].method2881((byte) -111);
                    field659[field676++] = var199 == 5 ? 1 : 0;
                    return;
                }
                if (arg0 == 3913) {
                    int var200 = field659[--field676];
                    int var201 = class304.field4129[var200].method2881((byte) -111);
                    field659[field676++] = var201 == 1 ? 1 : 0;
                    return;
                }
            } else if (arg0 < 4100) {
                if (arg0 == 4000) {
                    field676 -= 2;
                    int var202 = field659[field676];
                    int var203 = field659[field676 + 1];
                    field659[field676++] = var202 + var203;
                    return;
                }
                if (arg0 == 4001) {
                    field676 -= 2;
                    int var204 = field659[field676];
                    int var205 = field659[field676 + 1];
                    field659[field676++] = var204 - var205;
                    return;
                }
                if (arg0 == 4002) {
                    field676 -= 2;
                    int var206 = field659[field676];
                    int var207 = field659[field676 + 1];
                    field659[field676++] = var206 * var207;
                    return;
                }
                if (arg0 == 4003) {
                    field676 -= 2;
                    int var208 = field659[field676];
                    int var209 = field659[field676 + 1];
                    field659[field676++] = var208 / var209;
                    return;
                }
                if (arg0 == 4004) {
                    int var210 = field659[--field676];
                    field659[field676++] = (int) (Math.random() * (double) var210);
                    return;
                }
                if (arg0 == 4005) {
                    int var211 = field659[--field676];
                    field659[field676++] = (int) (Math.random() * (double) (var211 + 1));
                    return;
                }
                if (arg0 == 4006) {
                    field676 -= 5;
                    int var212 = field659[field676];
                    int var213 = field659[field676 + 1];
                    int var214 = field659[field676 + 2];
                    int var215 = field659[field676 + 3];
                    int var216 = field659[field676 + 4];
                    field659[field676++] = (var213 - var212) * (var216 - var214) / (var215 - var214) + var212;
                    return;
                }
                if (arg0 == 4007) {
                    field676 -= 2;
                    long var217 = (long) field659[field676];
                    long var219 = (long) field659[field676 + 1];
                    field659[field676++] = (int) (var217 * var219 / 100L + var217);
                    return;
                }
                if (arg0 == 4008) {
                    field676 -= 2;
                    int var221 = field659[field676];
                    int var222 = field659[field676 + 1];
                    field659[field676++] = var221 | 0x1 << var222;
                    return;
                }
                if (arg0 == 4009) {
                    field676 -= 2;
                    int var223 = field659[field676];
                    int var224 = field659[field676 + 1];
                    field659[field676++] = var223 & -(0x1 << var224) - 1;
                    return;
                }
                if (arg0 == 4010) {
                    field676 -= 2;
                    int var225 = field659[field676];
                    int var226 = field659[field676 + 1];
                    field659[field676++] = (var225 & 0x1 << var226) == 0 ? 0 : 1;
                    return;
                }
                if (arg0 == 4011) {
                    field676 -= 2;
                    int var227 = field659[field676];
                    int var228 = field659[field676 + 1];
                    field659[field676++] = var227 % var228;
                    return;
                }
                if (arg0 == 4012) {
                    field676 -= 2;
                    int var229 = field659[field676];
                    int var230 = field659[field676 + 1];
                    if (var229 == 0) {
                        field659[field676++] = 0;
                        return;
                    }
                    field659[field676++] = (int) Math.pow((double) var229, (double) var230);
                    return;
                }
                if (arg0 == 4013) {
                    field676 -= 2;
                    int var231 = field659[field676];
                    int var232 = field659[field676 + 1];
                    if (var231 == 0) {
                        field659[field676++] = 0;
                        return;
                    }
                    if (var232 == 0) {
                        field659[field676++] = Integer.MAX_VALUE;
                        return;
                    }
                    field659[field676++] = (int) Math.pow((double) var231, 1.0D / (double) var232);
                    return;
                }
                if (arg0 == 4014) {
                    field676 -= 2;
                    int var233 = field659[field676];
                    int var234 = field659[field676 + 1];
                    field659[field676++] = var233 & var234;
                    return;
                }
                if (arg0 == 4015) {
                    field676 -= 2;
                    int var235 = field659[field676];
                    int var236 = field659[field676 + 1];
                    field659[field676++] = var235 | var236;
                    return;
                }
                if (arg0 == 4016) {
                    field676 -= 2;
                    int var237 = field659[field676];
                    int var238 = field659[field676 + 1];
                    field659[field676++] = var237 < var238 ? var237 : var238;
                    return;
                }
                if (arg0 == 4017) {
                    field676 -= 2;
                    int var239 = field659[field676];
                    int var240 = field659[field676 + 1];
                    field659[field676++] = var239 > var240 ? var239 : var240;
                    return;
                }
                if (arg0 == 4018) {
                    field676 -= 3;
                    long var241 = (long) field659[field676];
                    long var243 = (long) field659[field676 + 1];
                    long var245 = (long) field659[field676 + 2];
                    field659[field676++] = (int) (var241 * var245 / var243);
                    return;
                }
            } else if (arg0 < 4200) {
                if (arg0 == 4100) {
                    String var247 = field674[--field665];
                    int var248 = field659[--field676];
                    field674[field665++] = var247 + var248;
                    return;
                }
                if (arg0 == 4101) {
                    field665 -= 2;
                    String var249 = field674[field665];
                    String var250 = field674[field665 + 1];
                    field674[field665++] = var249 + var250;
                    return;
                }
                if (arg0 == 4102) {
                    String var251 = field674[--field665];
                    int var252 = field659[--field676];
                    field674[field665++] = var251 + class480.method2855(var252, true, (byte) 67);
                    return;
                }
                if (arg0 == 4103) {
                    String var253 = field674[--field665];
                    field674[field665++] = var253.toLowerCase();
                    return;
                }
                if (arg0 == 4104) {
                    field674[field665++] = method308(field659[--field676]);
                    return;
                }
                if (arg0 == 4105) {
                    field665 -= 2;
                    String var254 = field674[field665];
                    String var255 = field674[field665 + 1];
                    if (class81.field1158.field7015 != null && class81.field1158.field7015.field3933) {
                        field674[field665++] = var255;
                        return;
                    }
                    field674[field665++] = var254;
                    return;
                }
                if (arg0 == 4106) {
                    int var256 = field659[--field676];
                    field674[field665++] = Integer.toString(var256);
                    return;
                }
                if (arg0 == 4107) {
                    field665 -= 2;
                    field659[field676++] = class8.method53(class486.field6998, field674[field665], (byte) -109, field674[field665 + 1]);
                    return;
                }
                if (arg0 == 4108) {
                    String var257 = field674[--field665];
                    field676 -= 2;
                    int var258 = field659[field676];
                    int var259 = field659[field676 + 1];
                    class61 var260 = class130.method938(var259, 0, class300.field4107, (byte) 32);
                    field659[field676++] = var260.method407(class409.field5790, var258, (byte) 29, var257);
                    return;
                }
                if (arg0 == 4109) {
                    String var261 = field674[--field665];
                    field676 -= 2;
                    int var262 = field659[field676];
                    int var263 = field659[field676 + 1];
                    class61 var264 = class130.method938(var263, 0, class300.field4107, (byte) 32);
                    field659[field676++] = var264.method408(0, class409.field5790, var262, var261);
                    return;
                }
                if (arg0 == 4110) {
                    field665 -= 2;
                    String var265 = field674[field665];
                    String var266 = field674[field665 + 1];
                    if (field659[--field676] == 1) {
                        field674[field665++] = var265;
                        return;
                    }
                    field674[field665++] = var266;
                    return;
                }
                if (arg0 == 4111) {
                    String var267 = field674[--field665];
                    field674[field665++] = class112.method850(-63, var267);
                    return;
                }
                if (arg0 == 4112) {
                    String var268 = field674[--field665];
                    int var269 = field659[--field676];
                    if (var269 == -1) {
                        throw new RuntimeException("null char");
                    }
                    field674[field665++] = var268 + (char) var269;
                    return;
                }
                if (arg0 == 4113) {
                    int var270 = field659[--field676];
                    field659[field676++] = class28.method187((byte) -36, (char) var270) ? 1 : 0;
                    return;
                }
                if (arg0 == 4114) {
                    int var271 = field659[--field676];
                    field659[field676++] = class280.method1619(34336, (char) var271) ? 1 : 0;
                    return;
                }
                if (arg0 == 4115) {
                    int var272 = field659[--field676];
                    field659[field676++] = class143.method998((char) var272, -52) ? 1 : 0;
                    return;
                }
                if (arg0 == 4116) {
                    int var273 = field659[--field676];
                    field659[field676++] = class348.method2090((char) var273, -1965) ? 1 : 0;
                    return;
                }
                if (arg0 == 4117) {
                    String var274 = field674[--field665];
                    if (var274 != null) {
                        field659[field676++] = var274.length();
                        return;
                    }
                    field659[field676++] = 0;
                    return;
                }
                if (arg0 == 4118) {
                    String var275 = field674[--field665];
                    field676 -= 2;
                    int var276 = field659[field676];
                    int var277 = field659[field676 + 1];
                    field674[field665++] = var275.substring(var276, var277);
                    return;
                }
                if (arg0 == 4119) {
                    String var278 = field674[--field665];
                    StringBuffer var279 = new StringBuffer(var278.length());
                    boolean var280 = false;
                    for (int var281 = 0; var281 < var278.length(); var281++) {
                        char var282 = var278.charAt(var281);
                        if (var282 == '<') {
                            var280 = true;
                        } else if (var282 == '>') {
                            var280 = false;
                        } else if (!var280) {
                            var279.append(var282);
                        }
                    }
                    field674[field665++] = var279.toString();
                    return;
                }
                if (arg0 == 4120) {
                    String var283 = field674[--field665];
                    field676 -= 2;
                    int var284 = field659[field676];
                    int var285 = field659[field676 + 1];
                    field659[field676++] = var283.indexOf(var284, var285);
                    return;
                }
                if (arg0 == 4121) {
                    field665 -= 2;
                    String var286 = field674[field665];
                    String var287 = field674[field665 + 1];
                    int var288 = field659[--field676];
                    field659[field676++] = var286.indexOf(var287, var288);
                    return;
                }
                if (arg0 == 4122) {
                    int var289 = field659[--field676];
                    field659[field676++] = Character.toLowerCase((char) var289);
                    return;
                }
                if (arg0 == 4123) {
                    int var290 = field659[--field676];
                    field659[field676++] = Character.toUpperCase((char) var290);
                    return;
                }
                if (arg0 == 4124) {
                    boolean var291 = field659[--field676] != 0;
                    int var292 = field659[--field676];
                    field674[field665++] = class443.method2613(class486.field6998, var291, true, 0, (long) var292);
                    return;
                }
                if (arg0 == 4125) {
                    String var293 = field674[--field665];
                    int var294 = field659[--field676];
                    class61 var295 = class130.method938(var294, 0, class300.field4107, (byte) 32);
                    field659[field676++] = var295.method411(var293, class409.field5790, -1);
                    return;
                }
            } else if (arg0 < 4300) {
                if (arg0 == 4200) {
                    int var296 = field659[--field676];
                    field674[field665++] = class534.field7872.method3089(var296, -76).field4068;
                    return;
                }
                if (arg0 == 4201) {
                    field676 -= 2;
                    int var297 = field659[field676];
                    int var298 = field659[field676 + 1];
                    class297 var299 = class534.field7872.method3089(var297, -3);
                    if (var298 >= 1 && var298 <= 5 && var299.field4039[var298 - 1] != null) {
                        field674[field665++] = var299.field4039[var298 - 1];
                        return;
                    }
                    field674[field665++] = "";
                    return;
                }
                if (arg0 == 4202) {
                    field676 -= 2;
                    int var300 = field659[field676];
                    int var301 = field659[field676 + 1];
                    class297 var302 = class534.field7872.method3089(var300, -80);
                    if (var301 >= 1 && var301 <= 5 && var302.field4082[var301 - 1] != null) {
                        field674[field665++] = var302.field4082[var301 - 1];
                        return;
                    }
                    field674[field665++] = "";
                    return;
                }
                if (arg0 == 4203) {
                    int var303 = field659[--field676];
                    field659[field676++] = class534.field7872.method3089(var303, -112).field4013;
                    return;
                }
                if (arg0 == 4204) {
                    int var304 = field659[--field676];
                    field659[field676++] = class534.field7872.method3089(var304, -94).field4044 == 1 ? 1 : 0;
                    return;
                }
                if (arg0 == 4205) {
                    int var305 = field659[--field676];
                    class297 var306 = class534.field7872.method3089(var305, 126);
                    if (var306.field4050 == -1 && var306.field4075 >= 0) {
                        field659[field676++] = var306.field4075;
                        return;
                    }
                    field659[field676++] = var305;
                    return;
                }
                if (arg0 == 4206) {
                    int var307 = field659[--field676];
                    class297 var308 = class534.field7872.method3089(var307, -45);
                    if (var308.field4050 >= 0 && var308.field4075 >= 0) {
                        field659[field676++] = var308.field4075;
                        return;
                    }
                    field659[field676++] = var307;
                    return;
                }
                if (arg0 == 4207) {
                    int var309 = field659[--field676];
                    field659[field676++] = class534.field7872.method3089(var309, -15).field4024 ? 1 : 0;
                    return;
                }
                if (arg0 == 4208) {
                    field676 -= 2;
                    int var310 = field659[field676];
                    int var311 = field659[field676 + 1];
                    class145 var312 = class365.field5241.method2181((byte) 119, var311);
                    if (var312.method1003((byte) 122)) {
                        field674[field665++] = class534.field7872.method3089(var310, 127).method1731(var312.field2141, var311, -51);
                        return;
                    }
                    field659[field676++] = class534.field7872.method3089(var310, -106).method1730(var312.field2140, var311, (byte) -72);
                    return;
                }
                if (arg0 == 4209) {
                    field676 -= 2;
                    int var313 = field659[field676];
                    int var314 = field659[field676 + 1] - 1;
                    class297 var315 = class534.field7872.method3089(var313, 117);
                    if (var315.field4056 == var314) {
                        field659[field676++] = var315.field4015;
                        return;
                    }
                    if (var315.field4010 == var314) {
                        field659[field676++] = var315.field4008;
                        return;
                    }
                    field659[field676++] = -1;
                    return;
                }
                if (arg0 == 4210) {
                    String var316 = field674[--field665];
                    int var317 = field659[--field676];
                    class18.method127(var316, 2, var317 == 1);
                    field659[field676++] = class88.field1426;
                    return;
                }
                if (arg0 == 4211) {
                    if (class145.field2136 != null && class515.field7538 < class88.field1426) {
                        field659[field676++] = class145.field2136[class515.field7538++] & 0xFFFF;
                        return;
                    }
                    field659[field676++] = -1;
                    return;
                }
                if (arg0 == 4212) {
                    class515.field7538 = 0;
                    return;
                }
            } else if (arg0 < 4400) {
                if (arg0 == 4300) {
                    field676 -= 2;
                    int var318 = field659[field676];
                    int var319 = field659[field676 + 1];
                    class145 var320 = class365.field5241.method2181((byte) 104, var319);
                    if (var320.method1003((byte) 122)) {
                        field674[field665++] = class233.field3248.method2222((byte) -116, var318).method657(var319, var320.field2141, (byte) -109);
                        return;
                    }
                    field659[field676++] = class233.field3248.method2222((byte) -124, var318).method650(var320.field2140, var319, -99);
                    return;
                }
            } else if (arg0 < 4500) {
                if (arg0 == 4400) {
                    field676 -= 2;
                    int var321 = field659[field676];
                    int var322 = field659[field676 + 1];
                    class145 var323 = class365.field5241.method2181((byte) 107, var322);
                    if (var323.method1003((byte) 122)) {
                        field674[field665++] = class452.field6629.method603((byte) 122, var321).method808(117, var322, var323.field2141);
                        return;
                    }
                    field659[field676++] = class452.field6629.method603((byte) 123, var321).method804(var322, 30052, var323.field2140);
                    return;
                }
            } else if (arg0 < 4600) {
                if (arg0 == 4500) {
                    field676 -= 2;
                    int var324 = field659[field676];
                    int var325 = field659[field676 + 1];
                    class145 var326 = class365.field5241.method2181((byte) 125, var325);
                    if (var326.method1003((byte) 122)) {
                        field674[field665++] = class32.field485.method1224(var324, false).method759(var325, false, var326.field2141);
                        return;
                    }
                    field659[field676++] = class32.field485.method1224(var324, false).method764(var325, 107, var326.field2140);
                    return;
                }
            } else if (arg0 < 4700 && arg0 == 4600) {
                int var327 = field659[--field676];
                class495 var328 = class438.field6318.method2058(98, var327);
                if (var328.field7199 != null && var328.field7199.length > 0) {
                    int var329 = 0;
                    int var330 = var328.field7170[0];
                    for (int var331 = 1; var331 < var328.field7199.length; var331++) {
                        if (var328.field7170[var331] > var330) {
                            var329 = var331;
                            var330 = var328.field7170[var331];
                        }
                    }
                    field659[field676++] = var328.field7199[var329];
                    return;
                }
                field659[field676++] = var328.field7208;
                return;
            }
        } else {
            class444 var47;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var47 = class22.method138(-115, field659[--field676]);
            } else {
                var47 = arg1 ? field663 : field657;
            }
            if (arg0 == 1300) {
                int var48 = field659[--field676] - 1;
                if (var48 >= 0 && var48 <= 9) {
                    var47.method2622(field674[--field665], (byte) 31, var48);
                    return;
                } else {
                    field665--;
                    return;
                }
            }
            if (arg0 == 1301) {
                field676 -= 2;
                int var49 = field659[field676];
                int var50 = field659[field676 + 1];
                if (var49 == -1 && var50 == -1) {
                    var47.field6404 = null;
                    return;
                }
                var47.field6404 = class222.method1381(var49, var50, -97);
                return;
            }
            if (arg0 == 1302) {
                int var51 = field659[--field676];
                if (class207.field2968 != var51 && class144.field2132 != var51 && class39.field580 != var51) {
                    return;
                }
                var47.field6495 = var51;
                return;
            }
            if (arg0 == 1303) {
                var47.field6455 = field659[--field676];
                return;
            }
            if (arg0 == 1304) {
                var47.field6497 = field659[--field676];
                return;
            }
            if (arg0 == 1305) {
                var47.field6409 = field674[--field665];
                return;
            }
            if (arg0 == 1306) {
                var47.field6505 = field674[--field665];
                return;
            }
            if (arg0 == 1307) {
                var47.field6405 = null;
                return;
            }
            if (arg0 == 1308) {
                var47.field6483 = field659[--field676];
                var47.field6392 = field659[--field676];
                return;
            }
            if (arg0 == 1309) {
                int var52 = field659[--field676];
                int var53 = field659[--field676];
                if (var53 >= 1 && var53 <= 10) {
                    var47.method2621(var53 - 1, var52, true);
                }
                return;
            }
            if (arg0 == 1310) {
                var47.field6388 = field674[--field665];
                return;
            }
            if (arg0 == 1311) {
                var47.field6545 = field659[--field676];
                return;
            }
            if (arg0 == 1312 || arg0 == 1313) {
                int var54;
                int var55;
                int var56;
                if (arg0 == 1312) {
                    field676 -= 3;
                    var54 = field659[field676] - 1;
                    var55 = field659[field676 + 1];
                    var56 = field659[field676 + 2];
                    if (var54 < 0 || var54 > 9) {
                        throw new RuntimeException("IOR13121313");
                    }
                } else {
                    field676 -= 2;
                    var54 = 10;
                    var55 = field659[field676];
                    var56 = field659[field676 + 1];
                }
                if (var47.field6471 == null) {
                    if (var55 == 0) {
                        return;
                    }
                    var47.field6471 = new byte[11];
                    var47.field6389 = new byte[11];
                    var47.field6529 = new int[11];
                }
                var47.field6471[var54] = (byte) var55;
                if (var55 == 0) {
                    var47.field6485 = false;
                    for (int var57 = 0; var57 < var47.field6471.length; var57++) {
                        if (var47.field6471[var57] != 0) {
                            var47.field6485 = true;
                            break;
                        }
                    }
                } else {
                    var47.field6485 = true;
                }
                var47.field6389[var54] = (byte) var56;
                return;
            }
            if (arg0 == 1314) {
                var47.field6436 = field659[--field676];
                return;
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lho;I)V", line = 4037)
    private static final void method316(class343 arg0, int arg1) {
        field676 = 0;
        field665 = 0;
        int var2 = -1;
        int[] var3 = arg0.field4953;
        int[] var4 = arg0.field4952;
        byte var5 = -1;
        field677 = 0;
        try {
            int var6 = 0;
            label260: while (true) {
                var6++;
                if (var6 > arg1) {
                    throw new RuntimeException("slow");
                }
                var2++;
                int var43 = var3[var2];
                if (var43 >= 100) {
                    boolean var35;
                    if (var4[var2] == 1) {
                        var35 = true;
                    } else {
                        var35 = false;
                    }
                    if (var43 >= 100 && var43 < 5000) {
                        method315(var43, var35);
                    } else if (var43 >= 5000 && var43 < 10000) {
                        method320(var43, var35);
                    } else {
                        throw new IllegalStateException("Command: " + var43);
                    }
                } else if (var43 == 0) {
                    field659[field676++] = var4[var2];
                } else if (var43 == 1) {
                    int var7 = var4[var2];
                    field659[field676++] = class309.field4200.field7581[var7];
                } else if (var43 == 2) {
                    int var8 = var4[var2];
                    class309.field4200.method3075(field659[--field676], 0, var8);
                } else if (var43 == 3) {
                    field674[field665++] = arg0.field4962[var2];
                } else if (var43 == 6) {
                    var2 += var4[var2];
                } else if (var43 == 7) {
                    field676 -= 2;
                    if (field659[field676 + 1] != field659[field676]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 8) {
                    field676 -= 2;
                    if (field659[field676 + 1] == field659[field676]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 9) {
                    field676 -= 2;
                    if (field659[field676] < field659[field676 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 10) {
                    field676 -= 2;
                    if (field659[field676] > field659[field676 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 21) {
                    if (field677 == 0) {
                        return;
                    }
                    class75 var9 = field672[--field677];
                    arg0 = var9.field1062;
                    var3 = arg0.field4953;
                    var4 = arg0.field4952;
                    var2 = var9.field1068;
                    field673 = var9.field1065;
                    field670 = var9.field1064;
                } else if (var43 == 25) {
                    int var10 = var4[var2];
                    field659[field676++] = class309.field4200.method1206(var10, (byte) 55);
                } else if (var43 == 27) {
                    int var11 = var4[var2];
                    class309.field4200.method3070((byte) -91, field659[--field676], var11);
                } else if (var43 == 31) {
                    field676 -= 2;
                    if (field659[field676] <= field659[field676 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 32) {
                    field676 -= 2;
                    if (field659[field676] >= field659[field676 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 33) {
                    field659[field676++] = field673[var4[var2]];
                } else if (var43 == 34) {
                    field673[var4[var2]] = field659[--field676];
                } else if (var43 == 35) {
                    field674[field665++] = field670[var4[var2]];
                } else if (var43 == 36) {
                    field670[var4[var2]] = field674[--field665];
                } else if (var43 == 37) {
                    int var12 = var4[var2];
                    field665 -= var12;
                    String var13 = class94.method769(field665, field674, (byte) -125, var12);
                    field674[field665++] = var13;
                } else if (var43 == 38) {
                    field676--;
                } else if (var43 == 39) {
                    field665--;
                } else if (var43 == 40) {
                    int var14 = var4[var2];
                    class343 var15 = class302.method1753(var14, 74);
                    if (var15 == null) {
                        throw new RuntimeException();
                    }
                    int[] var16 = new int[var15.field4960];
                    String[] var17 = new String[var15.field4958];
                    for (int var18 = 0; var18 < var15.field4954; var18++) {
                        var16[var18] = field659[field676 + var18 - var15.field4954];
                    }
                    for (int var19 = 0; var19 < var15.field4951; var19++) {
                        var17[var19] = field674[field665 + var19 - var15.field4951];
                    }
                    field676 -= var15.field4954;
                    field665 -= var15.field4951;
                    class75 var20 = new class75();
                    var20.field1062 = arg0;
                    var20.field1068 = var2;
                    var20.field1065 = field673;
                    var20.field1064 = field670;
                    if (field677 >= field672.length) {
                        throw new RuntimeException();
                    }
                    field672[field677++] = var20;
                    arg0 = var15;
                    var3 = var15.field4953;
                    var4 = var15.field4952;
                    var2 = -1;
                    field673 = var16;
                    field670 = var17;
                } else if (var43 == 42) {
                    field659[field676++] = class451.field6614[var4[var2]];
                } else if (var43 == 43) {
                    int var21 = var4[var2];
                    class451.field6614[var21] = field659[--field676];
                    class274.method1605(var21, 1);
                    class267.field3590 |= class308.field4189[var21];
                } else if (var43 == 44) {
                    int var22 = var4[var2] >> 16;
                    int var23 = var4[var2] & 0xFFFF;
                    int var24 = field659[--field676];
                    if (var24 >= 0 && var24 <= 5000) {
                        field660[var22] = var24;
                        byte var25 = -1;
                        if (var23 == 105) {
                            var25 = 0;
                        }
                        int var26 = 0;
                        while (true) {
                            if (var26 >= var24) {
                                continue label260;
                            }
                            field667[var22][var26] = var25;
                            var26++;
                        }
                    }
                    throw new RuntimeException();
                } else if (var43 == 45) {
                    int var27 = var4[var2];
                    int var28 = field659[--field676];
                    if (var28 < 0 || var28 >= field660[var27]) {
                        throw new RuntimeException();
                    }
                    field659[field676++] = field667[var27][var28];
                } else if (var43 == 46) {
                    int var29 = var4[var2];
                    field676 -= 2;
                    int var30 = field659[field676];
                    if (var30 < 0 || var30 >= field660[var29]) {
                        throw new RuntimeException();
                    }
                    field667[var29][var30] = field659[field676 + 1];
                } else if (var43 == 47) {
                    String var31 = class1.field25[var4[var2]];
                    if (var31 == null) {
                        var31 = "null";
                    }
                    field674[field665++] = var31;
                } else if (var43 == 48) {
                    int var32 = var4[var2];
                    class1.field25[var32] = field674[--field665];
                    class360.method2150((byte) 76, var32);
                } else if (var43 == 51) {
                    class270 var33 = arg0.field4956[var4[var2]];
                    class437 var34 = (class437) var33.method1592((byte) -25, (long) field659[--field676]);
                    if (var34 != null) {
                        var2 += var34.field6308;
                    }
                }
            }
        } catch (Exception var42) {
            if (arg0.field4959 == null) {
                StringBuffer var40 = new StringBuffer(30);
                var40.append("CS2: ").append(arg0.field6883).append(" ");
                for (int var41 = field677 - 1; var41 >= 0; var41--) {
                    var40.append("v: ").append(field672[var41].field1062.field6883).append(" ");
                }
                var40.append("op: ").append(var5);
                class187.method1255(var42, var40.toString(), -109);
            } else {
                class35.method256((byte) 120, "Clientscript error in: " + arg0.field4959);
                StringBuffer var37 = new StringBuffer(30);
                var37.append("Clientscript error in: ").append(arg0.field4959).append("\n");
                for (int var38 = field677 - 1; var38 >= 0; var38--) {
                    var37.append("via: ").append(field672[var38].field1062.field4959).append("\n");
                }
                var37.append("Op: ").append(var5).append("\n");
                String var39 = var42.getMessage();
                if (var39 != null && var39.length() > 0) {
                    var37.append("Message: ").append(var39).append("\n");
                }
                class187.method1255(var42, var37.toString(), -93);
                class353.method2116(var37.toString(), false);
            }
        }
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(I)V", line = 4472)
    public static final void method317(int arg0) {
        if (arg0 == -1 || !class523.method3109((byte) -65, arg0)) {
            return;
        }
        class444[] var1 = class505.field7387[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class444 var3 = var1[var2];
            if (var3.field6507 != null) {
                class414 var4 = new class414();
                var4.field5896 = var3;
                var4.field5900 = var3.field6507;
                method309(var4, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "(I)V", line = 4502)
    private static final void method318(int arg0) {
        class444 var1 = class22.method138(-85, arg0);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class444[] var3 = class302.field4121[var2];
        if (var3 == null) {
            class444[] var4 = class505.field7387[var2];
            int var5 = var4.length;
            var3 = class302.field4121[var2] = new class444[var5];
            class57.method371(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class57.method371(var3, var6 + 1, var3, var6, var3.length - var6 - 1);
        var3[var3.length - 1] = var1;
    }

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "(I)V", line = 4542)
    private static final void method319(int arg0) {
        class444 var1 = class22.method138(95, arg0);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class444[] var3 = class302.field4121[var2];
        if (var3 == null) {
            class444[] var4 = class505.field7387[var2];
            int var5 = var4.length;
            var3 = class302.field4121[var2] = new class444[var5];
            class57.method371(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class57.method371(var3, 0, var3, 1, var6);
        var3[0] = var1;
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(IZ)V", line = 4588)
    private static final void method320(int arg0, boolean arg1) {
        if (arg0 < 5100) {
            if (arg0 == 5000) {
                field659[field676++] = class206.field2963;
                return;
            }
            if (arg0 == 5001) {
                field676 -= 3;
                class206.field2963 = field659[field676];
                class121.field1889 = class265.method1561(field659[field676 + 1], -105);
                if (class121.field1889 == null) {
                    class121.field1889 = class170.field2587;
                }
                class369.field5285 = field659[field676 + 2];
                field662++;
                class274.method1602(14, class392.field5664);
                class17.field275.method1891(false, class206.field2963);
                class17.field275.method1891(false, class121.field1889.field2082);
                class17.field275.method1891(false, class369.field5285);
                return;
            }
            if (arg0 == 5002) {
                field665 -= 2;
                String var2 = field674[field665];
                String var3 = field674[field665 + 1];
                field676 -= 2;
                int var4 = field659[field676];
                int var5 = field659[field676 + 1];
                if (var3 == null) {
                    var3 = "";
                }
                if (var3.length() > 80) {
                    var3 = var3.substring(0, 80);
                }
                field661++;
                class274.method1602(14, class200.field2909);
                class17.field275.method1891(false, class515.method3047((byte) -67, var2) + class515.method3047((byte) -76, var3) + 2);
                class17.field275.method1879(32767, var2);
                class17.field275.method1891(false, var4 - 1);
                class17.field275.method1891(false, var5);
                class17.field275.method1879(32767, var3);
                return;
            }
            if (arg0 == 5003) {
                int var6 = field659[--field676];
                String var7 = null;
                if (var6 < 100) {
                    var7 = class529.field7736[var6];
                }
                if (var7 == null) {
                    var7 = "";
                }
                field674[field665++] = var7;
                return;
            }
            if (arg0 == 5004) {
                int var8 = field659[--field676];
                int var9 = -1;
                if (var8 < 100 && class529.field7736[var8] != null) {
                    var9 = class403.field5762[var8];
                }
                field659[field676++] = var9;
                return;
            }
            if (arg0 == 5005) {
                if (class121.field1889 == null) {
                    field659[field676++] = -1;
                    return;
                }
                field659[field676++] = class121.field1889.field2082;
                return;
            }
            if (arg0 == 5008 || arg0 == 5021 || arg0 == 5022) {
                String var10 = field674[--field665];
                method312(var10, arg0);
                return;
            }
            if (arg0 == 5009) {
                field665 -= 2;
                String var11 = field674[field665];
                String var12 = field674[field665 + 1];
                if (class136.field2064 != 0 || (!class355.field5134 || class345.field4970) && !class185.field2739) {
                    field664++;
                    class274.method1602(14, class412.field5860);
                    class17.field275.method1891(false, 0);
                    int var13 = class17.field275.field4360;
                    class17.field275.method1879(32767, var11);
                    class416.method2455(var12, 0, class17.field275);
                    class17.field275.method1851(class17.field275.field4360 - var13, 0);
                    return;
                }
                return;
            }
            if (arg0 == 5010) {
                int var14 = field659[--field676];
                String var15 = null;
                if (var14 < 100) {
                    var15 = class10.field118[var14];
                }
                if (var15 == null) {
                    var15 = "";
                }
                field674[field665++] = var15;
                return;
            }
            if (arg0 == 5011) {
                int var16 = field659[--field676];
                String var17 = null;
                if (var16 < 100) {
                    var17 = class320.field4404[var16];
                }
                if (var17 == null) {
                    var17 = "";
                }
                field674[field665++] = var17;
                return;
            }
            if (arg0 == 5012) {
                int var18 = field659[--field676];
                int var19 = -1;
                if (var18 < 100) {
                    var19 = class125.field1939[var18];
                }
                field659[field676++] = var19;
                return;
            }
            if (arg0 == 5015) {
                String var20;
                if (class81.field1158 == null || class81.field1158.field7033 == null) {
                    var20 = class481.field6957;
                } else {
                    var20 = class81.field1158.method2885(true, -110);
                }
                field674[field665++] = var20;
                return;
            }
            if (arg0 == 5016) {
                field659[field676++] = class369.field5285;
                return;
            }
            if (arg0 == 5017) {
                field659[field676++] = class499.field7304;
                return;
            }
            if (arg0 == 5018) {
                int var21 = field659[--field676];
                int var22 = 0;
                if (var21 < 100 && class529.field7736[var21] != null) {
                    var22 = class135.field2052[var21];
                }
                field659[field676++] = var22;
                return;
            }
            if (arg0 == 5019) {
                int var23 = field659[--field676];
                String var24 = null;
                if (var23 < 100) {
                    var24 = class36.field549[var23];
                }
                if (var24 == null) {
                    var24 = "";
                }
                field674[field665++] = var24;
                return;
            }
            if (arg0 == 5020) {
                String var25;
                if (class81.field1158 == null || class81.field1158.field7033 == null) {
                    var25 = class481.field6957;
                } else {
                    var25 = class81.field1158.method2883(false, -76);
                }
                field674[field665++] = var25;
                return;
            }
            if (arg0 == 5050) {
                int var26 = field659[--field676];
                field674[field665++] = class17.field277.method1527(var26, -126).field1996;
                return;
            }
            if (arg0 == 5051) {
                int var27 = field659[--field676];
                class130 var28 = class17.field277.method1527(var27, -128);
                if (var28.field1989 == null) {
                    field659[field676++] = 0;
                    return;
                }
                field659[field676++] = var28.field1989.length;
                return;
            }
            if (arg0 == 5052) {
                field676 -= 2;
                int var29 = field659[field676];
                int var30 = field659[field676 + 1];
                class130 var31 = class17.field277.method1527(var29, -128);
                int var32 = var31.field1989[var30];
                field659[field676++] = var32;
                return;
            }
            if (arg0 == 5053) {
                int var33 = field659[--field676];
                class130 var34 = class17.field277.method1527(var33, -126);
                if (var34.field1997 == null) {
                    field659[field676++] = 0;
                    return;
                }
                field659[field676++] = var34.field1997.length;
                return;
            }
            if (arg0 == 5054) {
                field676 -= 2;
                int var35 = field659[field676];
                int var36 = field659[field676 + 1];
                field659[field676++] = class17.field277.method1527(var35, -123).field1997[var36];
                return;
            }
            if (arg0 == 5055) {
                int var37 = field659[--field676];
                field674[field665++] = class188.field2772.method1387((byte) 109, var37).method1063(93);
                return;
            }
            if (arg0 == 5056) {
                int var38 = field659[--field676];
                class148 var39 = class188.field2772.method1387((byte) 109, var38);
                if (var39.field2275 == null) {
                    field659[field676++] = 0;
                    return;
                }
                field659[field676++] = var39.field2275.length;
                return;
            }
            if (arg0 == 5057) {
                field676 -= 2;
                int var40 = field659[field676];
                int var41 = field659[field676 + 1];
                field659[field676++] = class188.field2772.method1387((byte) 109, var40).field2275[var41];
                return;
            }
            if (arg0 == 5058) {
                field668 = new class104();
                field668.field1706 = field659[--field676];
                field668.field1709 = class188.field2772.method1387((byte) 109, field668.field1706);
                field668.field1708 = new int[field668.field1709.method1072((byte) 121)];
                return;
            }
            if (arg0 == 5059) {
                field682++;
                class274.method1602(14, class192.field2808);
                class17.field275.method1891(false, 0);
                int var42 = class17.field275.field4360;
                class17.field275.method1891(false, 0);
                class17.field275.method1857(561746448, field668.field1706);
                field668.field1709.method1062((byte) -77, field668.field1708, class17.field275);
                class17.field275.method1851(class17.field275.field4360 - var42, 0);
                return;
            }
            if (arg0 == 5060) {
                String var43 = field674[--field665];
                field669++;
                class274.method1602(14, class291.field3929);
                class17.field275.method1891(false, 0);
                int var44 = class17.field275.field4360;
                class17.field275.method1879(32767, var43);
                class17.field275.method1857(561746448, field668.field1706);
                field668.field1709.method1062((byte) -77, field668.field1708, class17.field275);
                class17.field275.method1851(class17.field275.field4360 - var44, 0);
                return;
            }
            if (arg0 == 5061) {
                field682++;
                class274.method1602(14, class192.field2808);
                class17.field275.method1891(false, 0);
                int var45 = class17.field275.field4360;
                class17.field275.method1891(false, 1);
                class17.field275.method1857(561746448, field668.field1706);
                field668.field1709.method1062((byte) -77, field668.field1708, class17.field275);
                class17.field275.method1851(class17.field275.field4360 - var45, 0);
                return;
            }
            if (arg0 == 5062) {
                field676 -= 2;
                int var46 = field659[field676];
                int var47 = field659[field676 + 1];
                field659[field676++] = class17.field277.method1527(var46, -123).field1995[var47];
                return;
            }
            if (arg0 == 5063) {
                field676 -= 2;
                int var48 = field659[field676];
                int var49 = field659[field676 + 1];
                field659[field676++] = class17.field277.method1527(var48, -124).field1999[var49];
                return;
            }
            if (arg0 == 5064) {
                field676 -= 2;
                int var50 = field659[field676];
                int var51 = field659[field676 + 1];
                if (var51 == -1) {
                    field659[field676++] = -1;
                    return;
                }
                field659[field676++] = class17.field277.method1527(var50, -128).method933((byte) -25, (char) var51);
                return;
            }
            if (arg0 == 5065) {
                field676 -= 2;
                int var52 = field659[field676];
                int var53 = field659[field676 + 1];
                if (var53 == -1) {
                    field659[field676++] = -1;
                    return;
                }
                field659[field676++] = class17.field277.method1527(var52, -127).method935(0, (char) var53);
                return;
            }
            if (arg0 == 5066) {
                int var54 = field659[--field676];
                field659[field676++] = class188.field2772.method1387((byte) 109, var54).method1072((byte) 125);
                return;
            }
            if (arg0 == 5067) {
                field676 -= 2;
                int var55 = field659[field676];
                int var56 = field659[field676 + 1];
                int var57 = class188.field2772.method1387((byte) 109, var55).method1064(var56, (byte) -117).field115;
                field659[field676++] = var57;
                return;
            }
            if (arg0 == 5068) {
                field676 -= 2;
                int var58 = field659[field676];
                int var59 = field659[field676 + 1];
                field668.field1708[var58] = var59;
                return;
            }
            if (arg0 == 5069) {
                field676 -= 2;
                int var60 = field659[field676];
                int var61 = field659[field676 + 1];
                field668.field1708[var60] = var61;
                return;
            }
            if (arg0 == 5070) {
                field676 -= 3;
                int var62 = field659[field676];
                int var63 = field659[field676 + 1];
                int var64 = field659[field676 + 2];
                class148 var65 = class188.field2772.method1387((byte) 109, var62);
                if (var65.method1064(var63, (byte) -119).field115 != 0) {
                    throw new RuntimeException("bad command");
                }
                field659[field676++] = var65.method1065(var63, (byte) 58, var64);
                return;
            }
            if (arg0 == 5071) {
                String var66 = field674[--field665];
                boolean var67 = field659[--field676] == 1;
                class172.method1172(var66, (byte) -126, var67);
                field659[field676++] = class88.field1426;
                return;
            }
            if (arg0 == 5072) {
                if (class145.field2136 != null && class515.field7538 < class88.field1426) {
                    field659[field676++] = class145.field2136[class515.field7538++] & 0xFFFF;
                    return;
                }
                field659[field676++] = -1;
                return;
            }
            if (arg0 == 5073) {
                class515.field7538 = 0;
                return;
            }
            if (arg0 == 5074) {
                field682++;
                class274.method1602(14, class192.field2808);
                class17.field275.method1891(false, 0);
                int var68 = class17.field275.field4360;
                class17.field275.method1891(false, 2);
                class17.field275.method1857(561746448, field668.field1706);
                field668.field1709.method1062((byte) -77, field668.field1708, class17.field275);
                class17.field275.method1851(class17.field275.field4360 - var68, 0);
                return;
            }
        } else if (arg0 < 5200) {
            if (arg0 == 5100) {
                if (class78.field1106.method2585(86, (byte) 60)) {
                    field659[field676++] = 1;
                    return;
                }
                field659[field676++] = 0;
                return;
            }
            if (arg0 == 5101) {
                if (class78.field1106.method2585(82, (byte) 67)) {
                    field659[field676++] = 1;
                    return;
                }
                field659[field676++] = 0;
                return;
            }
            if (arg0 == 5102) {
                if (class78.field1106.method2585(81, (byte) 113)) {
                    field659[field676++] = 1;
                    return;
                }
                field659[field676++] = 0;
                return;
            }
        } else if (arg0 < 5300) {
            if (arg0 == 5200) {
                class92.method754(field659[--field676], false);
                return;
            }
            if (arg0 == 5201) {
                field659[field676++] = class36.method263(15737);
                return;
            }
            if (arg0 == 5205) {
                class23.method144(false, -1, -1, 23065, field659[--field676]);
                return;
            }
            if (arg0 == 5206) {
                int var69 = field659[--field676];
                class465 var70 = class472.method2762(var69 >> 14 & 0x3FFF, var69 & 0x3FFF);
                if (var70 == null) {
                    field659[field676++] = -1;
                    return;
                }
                field659[field676++] = var70.field6714;
                return;
            }
            if (arg0 == 5207) {
                class465 var71 = class472.method2742(field659[--field676]);
                if (var71 != null && var71.field6706 != null) {
                    field674[field665++] = var71.field6706;
                    return;
                }
                field674[field665++] = "";
                return;
            }
            if (arg0 == 5208) {
                field659[field676++] = class426.field6205;
                field659[field676++] = class27.field398;
                return;
            }
            if (arg0 == 5209) {
                field659[field676++] = class472.field6838 + class336.field4899;
                field659[field676++] = class472.field6835 + class321.field4414;
                return;
            }
            if (arg0 == 5210) {
                int var72 = field659[--field676];
                class465 var73 = class472.method2742(var72);
                if (var73 == null) {
                    field659[field676++] = 0;
                    field659[field676++] = 0;
                    return;
                }
                field659[field676++] = var73.field6719 >> 14 & 0x3FFF;
                field659[field676++] = var73.field6719 & 0x3FFF;
                return;
            }
            if (arg0 == 5211) {
                int var74 = field659[--field676];
                class465 var75 = class472.method2742(var74);
                if (var75 == null) {
                    field659[field676++] = 0;
                    field659[field676++] = 0;
                    return;
                }
                field659[field676++] = var75.field6721 - var75.field6701;
                field659[field676++] = var75.field6712 - var75.field6717;
                return;
            }
            if (arg0 == 5212) {
                class237 var76 = class146.method1022(-41);
                if (var76 == null) {
                    field659[field676++] = -1;
                    field659[field676++] = -1;
                    return;
                }
                field659[field676++] = var76.field3280;
                int var77 = var76.field3278 << 28 | class472.field6838 + var76.field3277 << 14 | class472.field6835 + var76.field3274;
                field659[field676++] = var77;
                return;
            }
            if (arg0 == 5213) {
                class237 var78 = class415.method2452((byte) -63);
                if (var78 == null) {
                    field659[field676++] = -1;
                    field659[field676++] = -1;
                    return;
                }
                field659[field676++] = var78.field3280;
                int var79 = var78.field3278 << 28 | class472.field6838 + var78.field3277 << 14 | class472.field6835 + var78.field3274;
                field659[field676++] = var79;
                return;
            }
            if (arg0 == 5214) {
                int var80 = field659[--field676];
                class465 var81 = class28.method188(255);
                if (var81 != null) {
                    boolean var82 = var81.method2697(var80 >> 28 & 0x3, var80 >> 14 & 0x3FFF, -123, var80 & 0x3FFF, field681);
                    if (var82) {
                        class35.method260(field681[1], (byte) 109, field681[2]);
                    }
                }
                return;
            }
            if (arg0 == 5215) {
                field676 -= 2;
                int var83 = field659[field676];
                int var84 = field659[field676 + 1];
                class531 var85 = class472.method2752(var83 >> 14 & 0x3FFF, var83 & 0x3FFF);
                boolean var86 = false;
                for (class465 var87 = (class465) var85.method3152(false); var87 != null; var87 = (class465) var85.method3153((byte) -112)) {
                    if (var87.field6714 == var84) {
                        var86 = true;
                        break;
                    }
                }
                if (var86) {
                    field659[field676++] = 1;
                    return;
                }
                field659[field676++] = 0;
                return;
            }
            if (arg0 == 5218) {
                int var88 = field659[--field676];
                class465 var89 = class472.method2742(var88);
                if (var89 == null) {
                    field659[field676++] = -1;
                    return;
                }
                field659[field676++] = var89.field6716;
                return;
            }
            if (arg0 == 5220) {
                field659[field676++] = class1.field16 == 100 ? 1 : 0;
                return;
            }
            if (arg0 == 5221) {
                int var90 = field659[--field676];
                class35.method260(var90 >> 14 & 0x3FFF, (byte) 92, var90 & 0x3FFF);
                return;
            }
            if (arg0 == 5222) {
                class465 var91 = class28.method188(255);
                if (var91 != null) {
                    boolean var92 = var91.method2693(class472.field6835 + class321.field4414, field681, 0, class472.field6838 + class336.field4899);
                    if (var92) {
                        field659[field676++] = field681[1];
                        field659[field676++] = field681[2];
                        return;
                    }
                    field659[field676++] = -1;
                    field659[field676++] = -1;
                    return;
                }
                field659[field676++] = -1;
                field659[field676++] = -1;
                return;
            }
            if (arg0 == 5223) {
                field676 -= 2;
                int var93 = field659[field676];
                int var94 = field659[field676 + 1];
                class23.method144(false, var94 & 0x3FFF, var94 >> 14 & 0x3FFF, 23065, var93);
                return;
            }
            if (arg0 == 5224) {
                int var95 = field659[--field676];
                class465 var96 = class28.method188(255);
                if (var96 != null) {
                    boolean var97 = var96.method2697(var95 >> 28 & 0x3, var95 >> 14 & 0x3FFF, -112, var95 & 0x3FFF, field681);
                    if (var97) {
                        field659[field676++] = field681[1];
                        field659[field676++] = field681[2];
                        return;
                    }
                    field659[field676++] = -1;
                    field659[field676++] = -1;
                    return;
                }
                field659[field676++] = -1;
                field659[field676++] = -1;
                return;
            }
            if (arg0 == 5225) {
                int var98 = field659[--field676];
                class465 var99 = class28.method188(255);
                if (var99 != null) {
                    boolean var100 = var99.method2693(var98 & 0x3FFF, field681, 0, var98 >> 14 & 0x3FFF);
                    if (var100) {
                        field659[field676++] = field681[1];
                        field659[field676++] = field681[2];
                        return;
                    }
                    field659[field676++] = -1;
                    field659[field676++] = -1;
                    return;
                }
                field659[field676++] = -1;
                field659[field676++] = -1;
                return;
            }
            if (arg0 == 5226) {
                class422.method2522(field659[--field676], 1);
                return;
            }
            if (arg0 == 5227) {
                field676 -= 2;
                int var101 = field659[field676];
                int var102 = field659[field676 + 1];
                class23.method144(true, var102 & 0x3FFF, var102 >> 14 & 0x3FFF, 23065, var101);
                return;
            }
            if (arg0 == 5228) {
                class407.field5772 = field659[--field676] == 1;
                return;
            }
            if (arg0 == 5229) {
                field659[field676++] = class407.field5772 ? 1 : 0;
                return;
            }
            if (arg0 == 5230) {
                int var103 = field659[--field676];
                class87.method732(var103, 3);
                return;
            }
            if (arg0 == 5231) {
                field676 -= 2;
                int var104 = field659[field676];
                boolean var105 = field659[field676 + 1] == 1;
                if (class345.field4975 != null) {
                    class476 var106 = class345.field4975.method1592((byte) -25, (long) var104);
                    if (var106 != null && !var105) {
                        var106.method2791((byte) 112);
                        return;
                    }
                    if (var106 == null && var105) {
                        class476 var107 = new class476();
                        class345.field4975.method1586(var107, (long) var104, 1);
                    }
                }
                return;
            }
            if (arg0 == 5232) {
                int var108 = field659[--field676];
                if (class345.field4975 != null) {
                    class476 var109 = class345.field4975.method1592((byte) -25, (long) var108);
                    field659[field676++] = var109 == null ? 0 : 1;
                    return;
                }
                field659[field676++] = 0;
                return;
            }
            if (arg0 == 5233) {
                field676 -= 2;
                int var110 = field659[field676];
                boolean var111 = field659[field676 + 1] == 1;
                if (class316.field4301 != null) {
                    class476 var112 = class316.field4301.method1592((byte) -25, (long) var110);
                    if (var112 != null && !var111) {
                        var112.method2791((byte) 112);
                        return;
                    }
                    if (var112 == null && var111) {
                        class476 var113 = new class476();
                        class316.field4301.method1586(var113, (long) var110, 1);
                    }
                }
                return;
            }
            if (arg0 == 5234) {
                int var114 = field659[--field676];
                if (class316.field4301 != null) {
                    class476 var115 = class316.field4301.method1592((byte) -25, (long) var114);
                    field659[field676++] = var115 == null ? 0 : 1;
                    return;
                }
                field659[field676++] = 0;
                return;
            }
            if (arg0 == 5235) {
                field659[field676++] = class472.field6807 == null ? -1 : class472.field6807.field6714;
                return;
            }
            if (arg0 == 5236) {
                field676 -= 2;
                int var116 = field659[field676];
                int var117 = field659[field676 + 1];
                int var118 = var117 >> 14 & 0x3FFF;
                int var119 = var117 & 0x3FFF;
                int var120 = class116.method864(var118, var116, var119, 7528);
                if (var120 < 0) {
                    field659[field676++] = -1;
                    return;
                }
                field659[field676++] = var120;
                return;
            }
            if (arg0 == 5237) {
                class39.method271(true);
                return;
            }
        } else if (arg0 < 5400) {
            if (arg0 == 5300) {
                field676 -= 2;
                int var121 = field659[field676];
                int var122 = field659[field676 + 1];
                class133.method964(3, false, var122, -4, var121);
                field659[field676++] = class26.field358 == null ? 0 : 1;
                return;
            }
            if (arg0 == 5301) {
                if (class26.field358 != null) {
                    class133.method964(class76.field1075.field3676, false, -1, -4, -1);
                }
                return;
            }
            if (arg0 == 5302) {
                class293[] var123 = class437.method2589(-49);
                field659[field676++] = var123.length;
                return;
            }
            if (arg0 == 5303) {
                int var124 = field659[--field676];
                class293[] var125 = class437.method2589(-64);
                field659[field676++] = var125[var124].field3959;
                field659[field676++] = var125[var124].field3958;
                return;
            }
            if (arg0 == 5305) {
                int var126 = class76.field1075.field3653;
                int var127 = class76.field1075.field3650;
                int var128 = -1;
                class293[] var129 = class437.method2589(-104);
                for (int var130 = 0; var130 < var129.length; var130++) {
                    class293 var131 = var129[var130];
                    if (var131.field3959 == var126 && var131.field3958 == var127) {
                        var128 = var130;
                        break;
                    }
                }
                field659[field676++] = var128;
                return;
            }
            if (arg0 == 5306) {
                field659[field676++] = class75.method586((byte) 72);
                return;
            }
            if (arg0 == 5307) {
                int var132 = field659[--field676];
                if (var132 >= 1 && var132 <= 2) {
                    class133.method964(var132, false, -1, -4, -1);
                    return;
                }
                return;
            }
            if (arg0 == 5308) {
                field659[field676++] = class76.field1075.field3676;
                return;
            }
            if (arg0 == 5309) {
                int var133 = field659[--field676];
                if (var133 >= 1 && var133 <= 2) {
                    class76.field1075.field3676 = var133;
                    class76.field1075.method1098(-9, class346.field4985);
                    return;
                }
                return;
            }
        } else if (arg0 < 5500) {
            if (arg0 == 5400) {
                field665 -= 2;
                String var134 = field674[field665];
                String var135 = field674[field665 + 1];
                int var136 = field659[--field676];
                field678++;
                class274.method1602(14, class415.field5982);
                class17.field275.method1891(false, class515.method3047((byte) -118, var134) + class515.method3047((byte) -120, var135) + 1);
                class17.field275.method1879(32767, var134);
                class17.field275.method1879(32767, var135);
                class17.field275.method1891(false, var136);
                return;
            }
            if (arg0 == 5401) {
                field676 -= 2;
                class485.field6980[field659[field676]] = (short) class353.method2117(8, field659[field676 + 1]);
                class534.field7872.method3092(true);
                class534.field7872.method3093((byte) 69);
                class233.field3248.method2225(0);
                class157.method1127(1508614222);
                return;
            }
            if (arg0 == 5405) {
                field676 -= 2;
                int var137 = field659[field676];
                int var138 = field659[field676 + 1];
                if (var137 >= 0 && var137 < 2) {
                    class32.field494[var137] = new int[var138 << 1][4];
                }
                return;
            }
            if (arg0 == 5406) {
                field676 -= 7;
                int var139 = field659[field676];
                int var140 = field659[field676 + 1] << 1;
                int var141 = field659[field676 + 2];
                int var142 = field659[field676 + 3];
                int var143 = field659[field676 + 4];
                int var144 = field659[field676 + 5];
                int var145 = field659[field676 + 6];
                if (var139 >= 0 && var139 < 2 && class32.field494[var139] != null && var140 >= 0 && var140 < class32.field494[var139].length) {
                    class32.field494[var139][var140] = new int[] { (var141 >> 14 & 0x3FFF) << 7, var142, (var141 & 0x3FFF) << 7, var145 };
                    class32.field494[var139][var140 + 1] = new int[] { (var143 >> 14 & 0x3FFF) << 7, var144, (var143 & 0x3FFF) << 7 };
                }
                return;
            }
            if (arg0 == 5407) {
                int var146 = class32.field494[field659[--field676]].length >> 1;
                field659[field676++] = var146;
                return;
            }
            if (arg0 == 5411) {
                if (class26.field358 != null) {
                    class133.method964(class76.field1075.field3676, false, -1, -4, -1);
                }
                if (class391.field5642 != null) {
                    class294.method1701((byte) -112);
                    System.exit(0);
                    return;
                }
                String var147 = class360.field5179 == null ? class180.method1228(true) : class360.field5179;
                class311.method1796(var147, false, class195.field2849 == 1, (byte) -127, class346.field4985);
                return;
            }
            if (arg0 == 5419) {
                String var148 = "";
                if (class454.field6635 != null) {
                    if (class454.field6635.field6695 == null) {
                        var148 = class293.method1698(class454.field6635.field6698, 78);
                    } else {
                        var148 = (String) class454.field6635.field6695;
                    }
                }
                field674[field665++] = var148;
                return;
            }
            if (arg0 == 5420) {
                field659[field676++] = class173.field2628 == 3 ? 1 : 0;
                return;
            }
            if (arg0 == 5421) {
                if (class26.field358 != null) {
                    class133.method964(class76.field1075.field3676, false, -1, -4, -1);
                }
                String var149 = field674[--field665];
                boolean var150 = field659[--field676] == 1;
                String var151 = class180.method1228(true) + var149;
                class311.method1796(var151, var150, class195.field2849 == 1, (byte) -128, class346.field4985);
                return;
            }
            if (arg0 == 5422) {
                field665 -= 2;
                String var152 = field674[field665];
                String var153 = field674[field665 + 1];
                int var154 = field659[--field676];
                if (var152.length() > 0) {
                    if (class382.field5487 == null) {
                        class382.field5487 = new String[class124.field1918[class152.field2343.field134]];
                    }
                    class382.field5487[var154] = var152;
                }
                if (var153.length() > 0) {
                    if (class414.field5903 == null) {
                        class414.field5903 = new String[class124.field1918[class152.field2343.field134]];
                    }
                    class414.field5903[var154] = var153;
                }
                return;
            }
            if (arg0 == 5423) {
                System.out.println(field674[--field665]);
                return;
            }
            if (arg0 == 5424) {
                field676 -= 11;
                class230.field3219 = field659[field676];
                class224.field3170 = field659[field676 + 1];
                class92.field1515 = field659[field676 + 2];
                class102.field1609 = field659[field676 + 3];
                class437.field6307 = field659[field676 + 4];
                class410.field5804 = field659[field676 + 5];
                class421.field6089 = field659[field676 + 6];
                class301.field4114 = field659[field676 + 7];
                class358.field5163 = field659[field676 + 8];
                class351.field5102 = field659[field676 + 9];
                class426.field6203 = field659[field676 + 10];
                class509.field7453.method2517(class437.field6307, (byte) -41);
                class509.field7453.method2517(class410.field5804, (byte) -102);
                class509.field7453.method2517(class421.field6089, (byte) -53);
                class509.field7453.method2517(class301.field4114, (byte) -31);
                class509.field7453.method2517(class358.field5163, (byte) -121);
                class296.field4001 = null;
                class487.field7055 = null;
                class203.field2934 = null;
                class83.field1271 = null;
                class38.field573 = null;
                class418.field6058 = null;
                class97.field1553 = null;
                class533.field7852 = null;
                class170.field2591 = true;
                return;
            }
            if (arg0 == 5425) {
                class49.method324(true);
                class170.field2591 = false;
                return;
            }
            if (arg0 == 5426) {
                field676 -= 2;
                class275.field3733 = field659[field676];
                class153.field2359 = field659[field676 + 1];
                return;
            }
            if (arg0 == 5427) {
                field676 -= 2;
                class480.field6947 = field659[field676 + 1];
                return;
            }
            if (arg0 == 5428) {
                field676 -= 2;
                int var155 = field659[field676];
                int var156 = field659[field676 + 1];
                field659[field676++] = class133.method968(var155, -9, var156) ? 1 : 0;
                return;
            }
            if (arg0 == 5429) {
                class142.method989(false, field674[--field665], -10, false);
                return;
            }
            if (arg0 == 5430) {
                try {
                    class344.method2077(false, "accountcreated", class346.field4985.field2623);
                    return;
                } catch (Throwable var278) {
                    return;
                }
            }
        } else if (arg0 < 5600) {
            if (arg0 == 5500) {
                field676 -= 4;
                int var157 = field659[field676];
                int var158 = field659[field676 + 1];
                int var159 = field659[field676 + 2];
                int var160 = field659[field676 + 3];
                class29.method199((var157 & 0x3FFF) - class399.field5727, var160, (var157 >> 14 & 0x3FFF) - class110.field1775, -41, var158, false, var159);
                return;
            }
            if (arg0 == 5501) {
                field676 -= 4;
                int var161 = field659[field676];
                int var162 = field659[field676 + 1];
                int var163 = field659[field676 + 2];
                int var164 = field659[field676 + 3];
                class423.method2530(var164, (var161 >> 14 & 0x3FFF) - class110.field1775, 16631, var163, var162, (var161 & 0x3FFF) - class399.field5727);
                return;
            }
            if (arg0 == 5502) {
                field676 -= 6;
                int var165 = field659[field676];
                if (var165 >= 2) {
                    throw new RuntimeException();
                }
                class142.field2115 = var165;
                int var166 = field659[field676 + 1];
                if (var166 + 1 >= class32.field494[class142.field2115].length >> 1) {
                    throw new RuntimeException();
                }
                class3.field36 = var166;
                class80.field1129 = 0;
                class502.field7348 = field659[field676 + 2];
                class408.field5774 = field659[field676 + 3];
                int var167 = field659[field676 + 4];
                if (var167 >= 2) {
                    throw new RuntimeException();
                }
                class358.field5167 = var167;
                int var168 = field659[field676 + 5];
                if (var168 + 1 >= class32.field494[class358.field5167].length >> 1) {
                    throw new RuntimeException();
                }
                class312.field4238 = var168;
                class247.field3363 = 3;
                return;
            }
            if (arg0 == 5503) {
                class168.method1164((byte) -111);
                return;
            }
            if (arg0 == 5504) {
                field676 -= 2;
                class55.method358(field659[field676], 0, field659[field676 + 1], (byte) -122);
                return;
            }
            if (arg0 == 5505) {
                field659[field676++] = (int) class496.field7236 >> 3;
                return;
            }
            if (arg0 == 5506) {
                field659[field676++] = (int) class191.field2797 >> 3;
                return;
            }
            if (arg0 == 5507) {
                class228.method1405((byte) -118);
                return;
            }
            if (arg0 == 5508) {
                class395.method2338((byte) 106);
                return;
            }
            if (arg0 == 5509) {
                class5.method31(191);
                return;
            }
            if (arg0 == 5510) {
                class191.method1268(false);
                return;
            }
            if (arg0 == 5511) {
                int var169 = field659[--field676];
                int var170 = var169 >> 14 & 0x3FFF;
                int var171 = var169 & 0x3FFF;
                int var172 = var170 - class110.field1775;
                if (var172 < 0) {
                    var172 = 0;
                } else if (var172 >= class9.field111) {
                    var172 = class9.field111;
                }
                int var173 = var171 - class399.field5727;
                if (var173 < 0) {
                    var173 = 0;
                } else if (var173 >= class192.field2809) {
                    var173 = class192.field2809;
                }
                class387.field5569 = (var172 << 7) + 64;
                class102.field1606 = (var173 << 7) + 64;
                class247.field3363 = 4;
                return;
            }
            if (arg0 == 5512) {
                class27.method179((byte) -115);
                return;
            }
        } else if (arg0 < 5700) {
            if (arg0 == 5600) {
                field665 -= 2;
                String var174 = field674[field665];
                String var175 = field674[field665 + 1];
                int var176 = field659[--field676];
                if (class494.field7155 != 2) {
                    return;
                }
                if (class516.field7579 == 0 && class196.field2876 == 0) {
                    class481.field6957 = var174;
                    class518.field7611 = var175;
                    class61.field899 = var176;
                    class63.method421(5, true);
                    return;
                }
                return;
            }
            if (arg0 == 5601) {
                class494.method2920(-11461);
                return;
            }
            if (arg0 == 5602) {
                if (class516.field7579 == 0) {
                    class257.field3494 = -2;
                    class382.field5489 = -2;
                }
                return;
            }
            if (arg0 == 5603) {
                field676 -= 4;
                if (class494.field7155 != 2) {
                    return;
                }
                if (class516.field7579 == 0 && class196.field2876 == 0) {
                    class437.method2587(field659[field676 + 1], 16175, field659[field676], field659[field676 + 2], field659[field676 + 3]);
                    return;
                }
                return;
            }
            if (arg0 == 5604) {
                field665--;
                if (class494.field7155 != 2) {
                    return;
                }
                if (class516.field7579 == 0 && class196.field2876 == 0) {
                    class266.method1570(class329.method1942(false, field674[field665]), 111);
                    return;
                }
                return;
            }
            if (arg0 == 5605) {
                field665 -= 2;
                if (class494.field7155 != 2) {
                    return;
                }
                if (class516.field7579 == 0 && class196.field2876 == 0) {
                    class4.method30(98, false, class329.method1942(false, field674[field665]), field674[field665 + 1]);
                    return;
                }
                return;
            }
            if (arg0 == 5606) {
                if (class196.field2876 == 0) {
                    class49.field703 = -2;
                }
                return;
            }
            if (arg0 == 5607) {
                field659[field676++] = class382.field5489;
                return;
            }
            if (arg0 == 5608) {
                field659[field676++] = class331.field4505;
                return;
            }
            if (arg0 == 5609) {
                field659[field676++] = class49.field703;
                return;
            }
            if (arg0 == 5610) {
                for (int var177 = 0; var177 < 5; var177++) {
                    field674[field665++] = class33.field517.length > var177 ? class220.method1374(class33.field517[var177], (byte) -110) : "";
                }
                class33.field517 = null;
                return;
            }
            if (arg0 == 5611) {
                field659[field676++] = class307.field4171;
                return;
            }
            if (arg0 == 5612) {
                int var178 = field659[--field676];
                if (class494.field7155 != 6) {
                    return;
                }
                if (class516.field7579 == 0 && class196.field2876 == 0) {
                    if (class104.field1702 != null) {
                        class104.field1702.method172(12292);
                        class104.field1702 = null;
                    }
                    class61.field899 = var178;
                    class63.method421(8, true);
                    return;
                }
                return;
            }
            if (arg0 == 5613) {
                field659[field676++] = class382.field5489;
                return;
            }
            if (arg0 == 5615) {
                field665 -= 2;
                String var179 = field674[field665];
                String var180 = field674[field665 + 1];
                if (class494.field7155 != 2) {
                    return;
                }
                if (class516.field7579 == 0 && class196.field2876 == 0) {
                    if (class104.field1702 != null) {
                        class104.field1702.method172(12292);
                        class104.field1702 = null;
                    }
                    class481.field6957 = var179;
                    class518.field7611 = var180;
                    class63.method421(4, true);
                    return;
                }
                return;
            }
            if (arg0 == 5616) {
                class384.method2276(0, false);
                return;
            }
            if (arg0 == 5617) {
                field659[field676++] = class257.field3494;
                return;
            }
            if (arg0 == 5618) {
                int var181 = field659[--field676];
                class17.method124(false, var181, (byte) 76);
                return;
            }
            if (arg0 == 5619) {
                int var182 = field659[--field676];
                class17.method124(true, var182, (byte) 30);
                return;
            }
            if (arg0 == 5620) {
                class340.method2064(1);
                if (class154.field2375 != "" && class154.field2375 != "") {
                    field659[field676++] = 1;
                    return;
                }
                field659[field676++] = 0;
                return;
            }
            if (arg0 == 5621) {
                field665 -= 2;
                if (class494.field7155 != 2) {
                    return;
                }
                if (class516.field7579 == 0 && class196.field2876 == 0) {
                    class4.method30(73, true, class329.method1942(false, field674[field665]), field674[field665 + 1]);
                    return;
                }
                return;
            }
            if (arg0 == 5622) {
                class464 var183 = class346.field4985.method1199(-14340, "3", false);
                while (var183.field6699 == 0) {
                    class334.method2047(1L, 0);
                }
                if (var183.field6699 == 2) {
                    throw new RuntimeException("Error opening file");
                }
                class453 var184 = (class453) var183.field6695;
                if (var184.method2661(-27008).exists()) {
                    class319 var185 = new class319(50);
                    try {
                        var184.method2662(50, (byte) -99, var185.field4336, 0);
                    } catch (IOException var280) {
                    }
                }
                try {
                    var184.method2659(-1);
                    return;
                } catch (Exception var279) {
                    return;
                }
            }
        } else if (arg0 < 6100) {
            if (arg0 == 6001) {
                int var186 = field659[--field676];
                if (var186 < 1) {
                    var186 = 1;
                }
                if (var186 > 4) {
                    var186 = 4;
                }
                class76.field1075.field3666 = var186;
                class75.method590(117);
                class76.field1075.method1098(-9, class346.field4985);
                class425.field6186 = false;
                return;
            }
            if (arg0 == 6002) {
                class76.field1075.method1107(41, field659[--field676] == 1);
                class75.method590(95);
                class432.method2562((byte) -81);
                class76.field1075.method1098(-9, class346.field4985);
                class425.field6186 = false;
                return;
            }
            if (arg0 == 6003) {
                class76.field1075.field3672 = field659[--field676] == 1;
                class432.method2562((byte) -119);
                class76.field1075.method1098(-9, class346.field4985);
                class425.field6186 = false;
                return;
            }
            if (arg0 == 6005) {
                class76.field1075.field3667 = field659[--field676] == 1;
                class75.method590(102);
                class76.field1075.method1098(-9, class346.field4985);
                class425.field6186 = false;
                return;
            }
            if (arg0 == 6006) {
                class76.field1075.field3674 = field659[--field676] == 1;
                class275.field3737.method524(!class76.field1075.field3674);
                class76.field1075.method1098(-9, class346.field4985);
                class425.field6186 = false;
                return;
            }
            if (arg0 == 6007) {
                class76.field1075.field3665 = field659[--field676];
                class76.field1075.method1098(-9, class346.field4985);
                class425.field6186 = false;
                return;
            }
            if (arg0 == 6008) {
                class76.field1075.field3658 = field659[--field676] == 1;
                class76.field1075.method1098(-9, class346.field4985);
                class425.field6186 = false;
                return;
            }
            if (arg0 == 6009) {
                class76.field1075.field3664 = field659[--field676] == 1;
                class75.method590(122);
                class76.field1075.method1098(-9, class346.field4985);
                class425.field6186 = false;
                return;
            }
            if (arg0 == 6010) {
                class76.field1075.field3669 = field659[--field676] == 1;
                class76.field1075.method1098(-9, class346.field4985);
                class425.field6186 = false;
                return;
            }
            if (arg0 == 6011) {
                int var187 = field659[--field676];
                if (var187 < 0 || var187 > 2) {
                    var187 = 0;
                }
                class76.field1075.method1596(var187, (byte) -81, class195.field2849);
                class75.method590(111);
                class76.field1075.method1098(-9, class346.field4985);
                class425.field6186 = false;
                return;
            }
            if (arg0 == 6012) {
                class76.field1075.method1594(0, class195.field2849, field659[--field676] == 1);
                class264.method1552(5);
                class325.method1925((byte) -92);
                class76.field1075.method1098(-9, class346.field4985);
                class425.field6186 = false;
                return;
            }
            if (arg0 == 6014) {
                class76.field1075.field3654 = field659[--field676] == 1;
                class75.method590(104);
                class76.field1075.method1098(-9, class346.field4985);
                class425.field6186 = false;
                return;
            }
            if (arg0 == 6015) {
                class76.field1075.field3655 = field659[--field676] == 1;
                class75.method590(99);
                class76.field1075.method1098(-9, class346.field4985);
                class425.field6186 = false;
                return;
            }
            if (arg0 == 6016) {
                int var188 = field659[--field676];
                if (var188 < 0 || var188 > 2) {
                    var188 = 0;
                }
                class76.field1075.field3689 = var188;
                class54.method349(21, class195.field2849);
                class76.field1075.method1098(-9, class346.field4985);
                return;
            }
            if (arg0 == 6017) {
                class76.field1075.field3656 = field659[--field676] == 1;
                class468.method2721(0);
                class76.field1075.method1098(-9, class346.field4985);
                class425.field6186 = false;
                return;
            }
            if (arg0 == 6018) {
                int var189 = field659[--field676];
                if (var189 < 0) {
                    var189 = 0;
                }
                if (var189 > 127) {
                    var189 = 127;
                }
                class76.field1075.field3651 = var189;
                class76.field1075.method1098(-9, class346.field4985);
                class425.field6186 = false;
                return;
            }
            if (arg0 == 6019) {
                int var190 = field659[--field676];
                if (var190 < 0) {
                    var190 = 0;
                }
                if (var190 > 255) {
                    var190 = 255;
                }
                if (class76.field1075.field3685 != var190) {
                    if (class76.field1075.field3685 == 0 && class72.field1027 != -1) {
                        class188.method1258(class437.field6309, -113, class72.field1027, false, 0, var190);
                        class363.field5221 = false;
                    } else if (var190 == 0) {
                        class50.method336(-20439);
                        class363.field5221 = false;
                    } else {
                        class81.method620(var190, 0);
                    }
                    class76.field1075.field3685 = var190;
                }
                class76.field1075.method1098(-9, class346.field4985);
                class425.field6186 = false;
                return;
            }
            if (arg0 == 6020) {
                int var191 = field659[--field676];
                if (var191 < 0) {
                    var191 = 0;
                }
                if (var191 > 127) {
                    var191 = 127;
                }
                class76.field1075.field3682 = var191;
                class76.field1075.method1098(-9, class346.field4985);
                class425.field6186 = false;
                return;
            }
            if (arg0 == 6021) {
                class76.field1075.field2346 = field659[--field676] == 1;
                class432.method2562((byte) -92);
                return;
            }
            if (arg0 == 6023) {
                int var192 = field659[--field676];
                boolean var193 = false;
                if (var192 < 0) {
                    var192 = 0;
                }
                if (var192 > 2) {
                    var192 = 2;
                }
                if (class20.field294 < 96) {
                    var192 = 0;
                    var193 = true;
                }
                class407.method2389((byte) 63, var192);
                class76.field1075.method1098(-9, class346.field4985);
                class425.field6186 = false;
                field659[field676++] = var193 ? 0 : 1;
                return;
            }
            if (arg0 == 6024) {
                int var194 = field659[--field676];
                if (var194 < 0 || var194 > 2) {
                    var194 = 0;
                }
                class76.field1075.field3661 = var194;
                class76.field1075.method1098(-9, class346.field4985);
                return;
            }
            if (arg0 == 6025) {
                int var195 = field659[--field676];
                if (var195 < 0 || var195 > class275.method1607(true, class20.field294)) {
                    var195 = 0;
                }
                class76.field1075.field3648 = var195;
                class76.field1075.method1098(-9, class346.field4985);
                class425.field6186 = false;
                return;
            }
            if (arg0 == 6027) {
                int var196 = field659[--field676];
                if (var196 < 0 || var196 > 1) {
                    var196 = 0;
                }
                class148.method1067(true, var196 == 1);
                return;
            }
            if (arg0 == 6028) {
                class76.field1075.field3673 = field659[--field676] != 0;
                class76.field1075.method1098(-9, class346.field4985);
                return;
            }
            if (arg0 == 6029) {
                class76.field1075.field3665 = field659[--field676];
                class76.field1075.method1098(-9, class346.field4985);
                return;
            }
            if (arg0 == 6030) {
                class76.field1075.field3652 = field659[--field676] != 0;
                class76.field1075.method1098(-9, class346.field4985);
                class75.method590(94);
                return;
            }
            if (arg0 == 6031) {
                int var197 = field659[--field676];
                if (var197 < 0 || var197 > 3) {
                    var197 = 2;
                }
                class54.method349(-122, var197);
                return;
            }
            if (arg0 == 6032) {
                int var198 = field659[--field676];
                if (var198 < 0 || var198 > 3) {
                    var198 = 2;
                }
                class76.field1075.field3688 = var198;
                class76.field1075.method1098(-9, class346.field4985);
                class425.field6186 = false;
                return;
            }
            if (arg0 == 6033) {
                int var199 = field659[--field676];
                if (var199 < 0 || var199 > 4) {
                    var199 = 2;
                }
                class76.field1075.field3686 = var199;
                class76.field1075.method1098(-9, class346.field4985);
                return;
            }
            if (arg0 == 6034) {
                class76.field1075.field3677 = field659[--field676] == 1;
                class76.field1075.method1098(-9, class346.field4985);
                class264.method1552(5);
                class425.field6186 = false;
                return;
            }
            if (arg0 == 6035) {
                class76.field1075.field2354 = field659[--field676] == 1;
                class75.method590(97);
                class432.method2562((byte) -87);
                return;
            }
        } else if (arg0 < 6200) {
            if (arg0 == 6101) {
                field659[field676++] = class76.field1075.field3666;
                return;
            }
            if (arg0 == 6102) {
                field659[field676++] = class76.field1075.method1099(3706, class195.field2849) ? 1 : 0;
                return;
            }
            if (arg0 == 6103) {
                field659[field676++] = class76.field1075.field3672 ? 1 : 0;
                return;
            }
            if (arg0 == 6105) {
                field659[field676++] = class76.field1075.field3667 ? 1 : 0;
                return;
            }
            if (arg0 == 6106) {
                field659[field676++] = class76.field1075.field3674 ? 1 : 0;
                return;
            }
            if (arg0 == 6107) {
                field659[field676++] = class76.field1075.field3665;
                return;
            }
            if (arg0 == 6108) {
                field659[field676++] = class76.field1075.field3658 ? 1 : 0;
                return;
            }
            if (arg0 == 6109) {
                field659[field676++] = class76.field1075.field3664 ? 1 : 0;
                return;
            }
            if (arg0 == 6110) {
                field659[field676++] = class76.field1075.field3669 ? 1 : 0;
                return;
            }
            if (arg0 == 6111) {
                field659[field676++] = class76.field1075.method1593(class195.field2849, 88);
                return;
            }
            if (arg0 == 6112) {
                field659[field676++] = class76.field1075.method1597(false, class195.field2849) ? 1 : 0;
                return;
            }
            if (arg0 == 6114) {
                field659[field676++] = class76.field1075.field3654 ? 1 : 0;
                return;
            }
            if (arg0 == 6115) {
                field659[field676++] = class76.field1075.field3655 ? 1 : 0;
                return;
            }
            if (arg0 == 6116) {
                field659[field676++] = class76.field1075.field3689;
                return;
            }
            if (arg0 == 6117) {
                field659[field676++] = class76.field1075.field3656 ? 1 : 0;
                return;
            }
            if (arg0 == 6118) {
                field659[field676++] = class76.field1075.field3651;
                return;
            }
            if (arg0 == 6119) {
                field659[field676++] = class76.field1075.field3685;
                return;
            }
            if (arg0 == 6120) {
                field659[field676++] = class76.field1075.field3682;
                return;
            }
            if (arg0 == 6121) {
                field659[field676++] = class275.field3737.method466() ? 1 : 0;
                return;
            }
            if (arg0 == 6123) {
                field659[field676++] = class209.method1332((byte) 102);
                return;
            }
            if (arg0 == 6124) {
                field659[field676++] = class76.field1075.field3661;
                return;
            }
            if (arg0 == 6125) {
                field659[field676++] = class76.field1075.field3648;
                return;
            }
            if (arg0 == 6126) {
                field659[field676++] = class275.field3737.method519() ? 1 : 0;
                return;
            }
            if (arg0 == 6127) {
                field659[field676++] = class76.field1075.field3679 ? 1 : 0;
                return;
            }
            if (arg0 == 6128) {
                field659[field676++] = class76.field1075.field3673 ? 1 : 0;
                return;
            }
            if (arg0 == 6129) {
                field659[field676++] = class76.field1075.field3665;
                return;
            }
            if (arg0 == 6130) {
                field659[field676++] = class76.field1075.field3652 ? 1 : 0;
                return;
            }
            if (arg0 == 6131) {
                field659[field676++] = class195.field2849;
                return;
            }
            if (arg0 == 6132) {
                field659[field676++] = class76.field1075.field3688;
                return;
            }
            if (arg0 == 6133) {
                field659[field676++] = class173.field2628 == 1 || class173.field2628 == 4 ? 1 : 0;
                return;
            }
            if (arg0 == 6134) {
                field659[field676++] = class275.method1607(true, class20.field294);
                return;
            }
            if (arg0 == 6135) {
                field659[field676++] = class76.field1075.field3686;
                return;
            }
            if (arg0 == 6136) {
                field659[field676++] = class76.field1075.field3677 ? 1 : 0;
                return;
            }
            if (arg0 == 6137) {
                boolean var200 = true;
                try {
                    var200 = jagmisc.getTotalPhysicalMemory() > 268435456L;
                } catch (Throwable var281) {
                }
                field659[field676++] = var200 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6300) {
            if (arg0 == 6200) {
                field676 -= 2;
                class313.field4242 = (short) field659[field676];
                if (class313.field4242 <= 0) {
                    class313.field4242 = 256;
                }
                class243.field3341 = (short) field659[field676 + 1];
                if (class243.field3341 <= 0) {
                    class243.field3341 = 205;
                }
                return;
            }
            if (arg0 == 6201) {
                field676 -= 2;
                class486.field6996 = (short) field659[field676];
                if (class486.field6996 <= 0) {
                    class486.field6996 = 256;
                }
                class97.field1557 = (short) field659[field676 + 1];
                if (class97.field1557 <= 0) {
                    class97.field1557 = 320;
                }
                return;
            }
            if (arg0 == 6202) {
                field676 -= 4;
                class274.field3708 = (short) field659[field676];
                if (class274.field3708 <= 0) {
                    class274.field3708 = 1;
                }
                class518.field7615 = (short) field659[field676 + 1];
                if (class518.field7615 <= 0) {
                    class518.field7615 = 32767;
                } else if (class518.field7615 < class274.field3708) {
                    class518.field7615 = class274.field3708;
                }
                class51.field746 = (short) field659[field676 + 2];
                if (class51.field746 <= 0) {
                    class51.field746 = 1;
                }
                class317.field4318 = (short) field659[field676 + 3];
                if (class317.field4318 <= 0) {
                    class317.field4318 = 32767;
                    return;
                }
                if (class317.field4318 < class51.field746) {
                    class317.field4318 = class51.field746;
                }
                return;
            }
            if (arg0 == 6203) {
                class241.method1466(0, class302.field4126.field6453, 0, class302.field4126.field6470, -2731, false);
                field659[field676++] = class367.field5266;
                field659[field676++] = class510.field7460;
                return;
            }
            if (arg0 == 6204) {
                field659[field676++] = class486.field6996;
                field659[field676++] = class97.field1557;
                return;
            }
            if (arg0 == 6205) {
                field659[field676++] = class313.field4242;
                field659[field676++] = class243.field3341;
                return;
            }
        } else if (arg0 < 6400) {
            if (arg0 == 6300) {
                field659[field676++] = (int) (class254.method1522((byte) -51) / 60000L);
                return;
            }
            if (arg0 == 6301) {
                field659[field676++] = (int) (class254.method1522((byte) -51) / 86400000L) - 11745;
                return;
            }
            if (arg0 == 6302) {
                field676 -= 3;
                int var201 = field659[field676];
                int var202 = field659[field676 + 1];
                int var203 = field659[field676 + 2];
                field656.clear();
                field656.set(11, 12);
                field656.set(var203, var202, var201);
                int var204 = (int) (field656.getTime().getTime() / 86400000L) - 11745;
                if (var203 < 1970) {
                    var204--;
                }
                field659[field676++] = var204;
                return;
            }
            if (arg0 == 6303) {
                field656.clear();
                field656.setTime(new Date(class254.method1522((byte) -51)));
                field659[field676++] = field656.get(1);
                return;
            }
            if (arg0 == 6304) {
                int var205 = field659[--field676];
                boolean var206 = true;
                if (var205 < 0) {
                    var206 = (var205 + 1) % 4 == 0;
                } else if (var205 < 1582) {
                    var206 = var205 % 4 == 0;
                } else if (var205 % 4 != 0) {
                    var206 = false;
                } else if (var205 % 100 != 0) {
                    var206 = true;
                } else if (var205 % 400 != 0) {
                    var206 = false;
                }
                field659[field676++] = var206 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6500) {
            if (arg0 == 6405) {
                field659[field676++] = class2.method16((byte) 69) ? 1 : 0;
                return;
            }
            if (arg0 == 6406) {
                field659[field676++] = class516.method3076(false) ? 1 : 0;
                return;
            }
        } else if (arg0 < 6600) {
            if (arg0 == 6500) {
                if (class494.field7155 == 6 && class516.field7579 == 0 && class196.field2876 == 0) {
                    if (class425.field6184) {
                        field659[field676++] = 0;
                        return;
                    }
                    if (class314.field4256 > class254.method1522((byte) -51) - 1000L) {
                        field659[field676++] = 1;
                        return;
                    }
                    class425.field6184 = true;
                    class274.method1602(14, class16.field253);
                    class17.field275.method1858(class519.field7632, (byte) -99);
                    field659[field676++] = 0;
                    return;
                }
                field659[field676++] = 1;
                return;
            }
            if (arg0 == 6501) {
                class468 var207 = class334.method2046(-15401);
                if (var207 != null) {
                    field659[field676++] = var207.field6762;
                    field659[field676++] = var207.field2687;
                    field674[field665++] = var207.field6767;
                    class279 var208 = var207.method2720(-13708);
                    field659[field676++] = var208.field3792;
                    field674[field665++] = var208.field3796;
                    field659[field676++] = var207.field2691;
                    field659[field676++] = var207.field6770;
                    field674[field665++] = var207.field6766;
                    return;
                }
                field659[field676++] = -1;
                field659[field676++] = 0;
                field674[field665++] = "";
                field659[field676++] = 0;
                field674[field665++] = "";
                field659[field676++] = 0;
                field659[field676++] = 0;
                field674[field665++] = "";
                return;
            }
            if (arg0 == 6502) {
                class468 var209 = class225.method1399(0);
                if (var209 != null) {
                    field659[field676++] = var209.field6762;
                    field659[field676++] = var209.field2687;
                    field674[field665++] = var209.field6767;
                    class279 var210 = var209.method2720(-13708);
                    field659[field676++] = var210.field3792;
                    field674[field665++] = var210.field3796;
                    field659[field676++] = var209.field2691;
                    field659[field676++] = var209.field6770;
                    field674[field665++] = var209.field6766;
                    return;
                }
                field659[field676++] = -1;
                field659[field676++] = 0;
                field674[field665++] = "";
                field659[field676++] = 0;
                field674[field665++] = "";
                field659[field676++] = 0;
                field659[field676++] = 0;
                field674[field665++] = "";
                return;
            }
            if (arg0 == 6503) {
                int var211 = field659[--field676];
                String var212 = field674[--field665];
                if (class494.field7155 == 6 && class516.field7579 == 0 && class196.field2876 == 0) {
                    field659[field676++] = class193.method1273(var212, 40000, var211) ? 1 : 0;
                    return;
                }
                field659[field676++] = 0;
                return;
            }
            if (arg0 == 6504) {
                class76.field1075.field3683 = field659[--field676];
                class76.field1075.method1098(-9, class346.field4985);
                return;
            }
            if (arg0 == 6505) {
                field659[field676++] = class76.field1075.field3683;
                return;
            }
            if (arg0 == 6506) {
                int var213 = field659[--field676];
                class468 var214 = class184.method1242(var213, 123);
                if (var214 != null) {
                    field659[field676++] = var214.field2687;
                    field674[field665++] = var214.field6767;
                    class279 var215 = var214.method2720(-13708);
                    field659[field676++] = var215.field3792;
                    field674[field665++] = var215.field3796;
                    field659[field676++] = var214.field2691;
                    field659[field676++] = var214.field6770;
                    field674[field665++] = var214.field6766;
                    return;
                }
                field659[field676++] = -1;
                field674[field665++] = "";
                field659[field676++] = 0;
                field674[field665++] = "";
                field659[field676++] = 0;
                field659[field676++] = 0;
                field674[field665++] = "";
                return;
            }
            if (arg0 == 6507) {
                field676 -= 4;
                int var216 = field659[field676];
                boolean var217 = field659[field676 + 1] == 1;
                int var218 = field659[field676 + 2];
                boolean var219 = field659[field676 + 3] == 1;
                class29.method213(var216, (byte) -21, var218, var217, var219);
                return;
            }
            if (arg0 == 6508) {
                class371.method2213(26306);
                return;
            }
            if (arg0 == 6509) {
                if (class494.field7155 != 6) {
                    return;
                }
                class511.field7470 = field659[--field676] == 1;
                return;
            }
        } else if (arg0 < 6700) {
            if (arg0 == 6600) {
                class76.field1075.field3649 = field659[--field676] == 1;
                class76.field1075.method1098(-9, class346.field4985);
                return;
            }
            if (arg0 == 6601) {
                field659[field676++] = class76.field1075.field3649 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6800 && class455.field6645 == class394.field5682) {
            if (arg0 == 6700) {
                int var220 = class425.field6168.method1585((byte) 95);
                if (class236.field3268 != -1) {
                    var220++;
                }
                field659[field676++] = var220;
                return;
            }
            if (arg0 == 6701) {
                int var221 = field659[--field676];
                if (class236.field3268 != -1) {
                    if (var221 == 0) {
                        field659[field676++] = class236.field3268;
                        return;
                    }
                    var221--;
                }
                class91 var222 = (class91) class425.field6168.method1588(79);
                while (var221-- > 0) {
                    var222 = (class91) class425.field6168.method1582(-101);
                }
                field659[field676++] = var222.field1460;
                return;
            }
            if (arg0 == 6702) {
                int var223 = field659[--field676];
                if (class505.field7387[var223] == null) {
                    field674[field665++] = "";
                    return;
                }
                String var224 = class505.field7387[var223][0].field6473;
                if (var224 == null) {
                    field674[field665++] = "";
                    return;
                }
                field674[field665++] = var224.substring(0, var224.indexOf(58));
                return;
            }
            if (arg0 == 6703) {
                int var225 = field659[--field676];
                if (class505.field7387[var225] == null) {
                    field659[field676++] = 0;
                    return;
                }
                field659[field676++] = class505.field7387[var225].length;
                return;
            }
            if (arg0 == 6704) {
                field676 -= 2;
                int var226 = field659[field676];
                int var227 = field659[field676 + 1];
                if (class505.field7387[var226] == null) {
                    field674[field665++] = "";
                    return;
                }
                String var228 = class505.field7387[var226][var227].field6473;
                if (var228 == null) {
                    field674[field665++] = "";
                    return;
                }
                field674[field665++] = var228;
                return;
            }
            if (arg0 == 6705) {
                field676 -= 2;
                int var229 = field659[field676];
                int var230 = field659[field676 + 1];
                if (class505.field7387[var229] == null) {
                    field659[field676++] = 0;
                    return;
                }
                field659[field676++] = class505.field7387[var229][var230].field6385;
                return;
            }
            if (arg0 == 6706) {
                return;
            }
            if (arg0 == 6707) {
                field676 -= 3;
                int var231 = field659[field676];
                int var232 = field659[field676 + 1];
                int var233 = field659[field676 + 2];
                class237.method1449(var233, "", var231 << 16 | var232, 1, true);
                return;
            }
            if (arg0 == 6708) {
                field676 -= 3;
                int var234 = field659[field676];
                int var235 = field659[field676 + 1];
                int var236 = field659[field676 + 2];
                class237.method1449(var236, "", var234 << 16 | var235, 2, true);
                return;
            }
            if (arg0 == 6709) {
                field676 -= 3;
                int var237 = field659[field676];
                int var238 = field659[field676 + 1];
                int var239 = field659[field676 + 2];
                class237.method1449(var239, "", var237 << 16 | var238, 3, true);
                return;
            }
            if (arg0 == 6710) {
                field676 -= 3;
                int var240 = field659[field676];
                int var241 = field659[field676 + 1];
                int var242 = field659[field676 + 2];
                class237.method1449(var242, "", var240 << 16 | var241, 4, true);
                return;
            }
            if (arg0 == 6711) {
                field676 -= 3;
                int var243 = field659[field676];
                int var244 = field659[field676 + 1];
                int var245 = field659[field676 + 2];
                class237.method1449(var245, "", var243 << 16 | var244, 5, true);
                return;
            }
            if (arg0 == 6712) {
                field676 -= 3;
                int var246 = field659[field676];
                int var247 = field659[field676 + 1];
                int var248 = field659[field676 + 2];
                class237.method1449(var248, "", var246 << 16 | var247, 6, true);
                return;
            }
            if (arg0 == 6713) {
                field676 -= 3;
                int var249 = field659[field676];
                int var250 = field659[field676 + 1];
                int var251 = field659[field676 + 2];
                class237.method1449(var251, "", var249 << 16 | var250, 7, true);
                return;
            }
            if (arg0 == 6714) {
                field676 -= 3;
                int var252 = field659[field676];
                int var253 = field659[field676 + 1];
                int var254 = field659[field676 + 2];
                class237.method1449(var254, "", var252 << 16 | var253, 8, true);
                return;
            }
            if (arg0 == 6715) {
                field676 -= 3;
                int var255 = field659[field676];
                int var256 = field659[field676 + 1];
                int var257 = field659[field676 + 2];
                class237.method1449(var257, "", var255 << 16 | var256, 9, true);
                return;
            }
            if (arg0 == 6716) {
                field676 -= 3;
                int var258 = field659[field676];
                int var259 = field659[field676 + 1];
                int var260 = field659[field676 + 2];
                class237.method1449(var260, "", var258 << 16 | var259, 10, true);
                return;
            }
            if (arg0 == 6717) {
                field676 -= 3;
                int var261 = field659[field676];
                int var262 = field659[field676 + 1];
                int var263 = field659[field676 + 2];
                class444 var264 = class222.method1381(var261 << 16 | var262, var263, -110);
                class319.method1893(127);
                class428 var265 = client.method3067(var264);
                class39.method275(true, var265.method2554(121), var264, var265.field6211);
                return;
            }
        } else if (arg0 < 6900) {
            if (arg0 == 6800) {
                int var266 = field659[--field676];
                class92 var267 = class98.field1563.method1655(var266, (byte) -127);
                if (var267.field1495 == null) {
                    field674[field665++] = "";
                    return;
                }
                field674[field665++] = var267.field1495;
                return;
            }
            if (arg0 == 6801) {
                int var268 = field659[--field676];
                class92 var269 = class98.field1563.method1655(var268, (byte) -128);
                field659[field676++] = var269.field1471;
                return;
            }
            if (arg0 == 6802) {
                int var270 = field659[--field676];
                class92 var271 = class98.field1563.method1655(var270, (byte) -127);
                field659[field676++] = var271.field1504;
                return;
            }
            if (arg0 == 6803) {
                int var272 = field659[--field676];
                class92 var273 = class98.field1563.method1655(var272, (byte) -116);
                field659[field676++] = var273.field1502;
                return;
            }
            if (arg0 == 6804) {
                field676 -= 2;
                int var274 = field659[field676];
                int var275 = field659[field676 + 1];
                class145 var276 = class365.field5241.method2181((byte) 126, var275);
                if (var276.method1003((byte) 122)) {
                    field674[field665++] = class98.field1563.method1655(var274, (byte) -115).method755(var275, -111, var276.field2141);
                    return;
                }
                field659[field676++] = class98.field1563.method1655(var274, (byte) -123).method758((byte) -13, var275, var276.field2140);
                return;
            }
        } else if (arg0 < 7000) {
            if (arg0 == 6900) {
                field659[field676++] = class355.field5134 && !class345.field4970 ? 1 : 0;
                return;
            }
            if (arg0 == 6901) {
                field659[field676++] = class220.field3106;
                return;
            }
            if (arg0 == 6902) {
                field659[field676++] = class276.field3758;
                return;
            }
            if (arg0 == 6903) {
                field659[field676++] = class13.field144;
                return;
            }
            if (arg0 == 6904) {
                field659[field676++] = class267.field3595;
                return;
            }
            if (arg0 == 6905) {
                String var277 = "";
                if (class454.field6635 != null) {
                    if (class454.field6635.field6695 == null) {
                        var277 = class293.method1698(class454.field6635.field6698, 94);
                    } else {
                        var277 = (String) class454.field6635.field6695;
                    }
                }
                field674[field665++] = var277;
                return;
            }
            if (arg0 == 6906) {
                field659[field676++] = class271.field3662;
                return;
            }
            if (arg0 == 6907) {
                field659[field676++] = class72.field1033;
                return;
            }
            if (arg0 == 6908) {
                field659[field676++] = class360.field5178;
                return;
            }
            if (arg0 == 6909) {
                field659[field676++] = class250.field3398 ? 1 : 0;
                return;
            }
            if (arg0 == 6910) {
                field659[field676++] = class76.field1076;
                return;
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "(IZ)V", line = 7818)
    public static final void method321(int arg0, boolean arg1) {
    }
}
