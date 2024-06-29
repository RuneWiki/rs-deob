import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.PrintWriter;
import java.io.StreamCorruptedException;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class189 extends class195 {

    @OriginalMember(owner = "client!gd", name = "U", descriptor = "I")
    public static int field2977 = 3353893;

    @OriginalMember(owner = "client!gd", name = "W", descriptor = "Lck;")
    public static class119 field2979 = class298.method1987((byte) 42, "Spieler kann nicht gefunden werden: ");

    @OriginalMember(owner = "client!gd", name = "Y", descriptor = "Lck;")
    private static class119 field2981 = class298.method1987((byte) 124, "glow1:");

    @OriginalMember(owner = "client!gd", name = "gb", descriptor = "Lck;")
    public static class119 field2989 = field2981;

    @OriginalMember(owner = "client!gd", name = "hb", descriptor = "Lck;")
    public static class119 field2990 = field2981;

    @OriginalMember(owner = "client!gd", name = "bb", descriptor = "Lpi;")
    public static class73 field2984 = new class73(128);

    @OriginalMember(owner = "client!gd", name = "nb", descriptor = "[[S")
    public static short[][] field2996 = new short[][] { { 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, -22182, -27211, -27198, -27186, -27302, 542, 555, 941, 951, 8076, 6936, 5675, 5440, 10014, 11179, 11197, 11096, 10258, 10776, 10661, 10419, -10984, -11095, -11072, -6630, -5467, -6473, -6838, -32318, -26069, -25925, -25669, 11202, 22193, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 119, 92, 66, 39, 20, 4, 955, 1845, 4032, 7101, 10178, 14272, 17341, 21433, 27581, 30651, -31811, -27717, -24640, -21581, -17603, -13383, 794, 5020, 7062, 1160, 15128, 17940, 30614, -30952, -26728, -23662, -18536, -14440, -9324, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 119, 92, 66, 39, 20, 4, 955, 1845, 4032, 7101, 10178, 14272, 17341, 21433, 27581, 30651, -31811, -27717, -24640, -21581, -17603, -13383, 794, 5020, 7062, 1160, 15128, 17940, 30614, -30952, -26728, -23662, -18536, -14440, -9324, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 119, 92, 66, 39, 20, 4, 955, 1845, 4032, 7101, 10178, 14272, 17341, 21433, 27581, 30651, -31811, -27717, -24640, -21581, -17603, -13383, 794, 5020, 7062, 1160, 15128, 17940, 30614, -30952, -26728, -23662, -18536, -14440, -9324, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, -22182, -27211, -27198, -27186, -27302, 542, 555, 941, 951, 8076, 6936, 5675, 5440, 10014, 11179, 11197, 11096, 10258, 10776, 10661, 10419, -10984, -11095, -11072, -6630, -5467, -6473, -6838, -32318, -26069, -25925, -25669, 11202, 22193, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 22461, -21571, 11200, 957, -10317, 5056, -31808, 123, 22453, -21579, 11191, 949, -10325, 4023, -31817, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 119, 92, 66, 39, 20, 4, 823, 809, 796, 2749, 2733, 2712, 4934, 4911, 4888, 8004, 8099, 11078, 11053, 10008, 18231, 18339, 18196, 30402, 30379, 29458, -31168, -32217, -32238, -25916, -25933, -25956, -21824, -22869, -21864, -17980, -18005, -18026, -11838, -11861, -10858, 23318, 21910, 21776, 1502, 4570, 8670, 13788, 25827, 31969, -28196, -21028, -15908, -7466, 7977, 8732, 8596, 4894, 5908, 794, 1686, -22623, -23014, 14866, 10347, 10582, 10429, 10407, 10359, 8414, 9540, 10456, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, -22182, -27211, -27198, -27186, -27302, 542, 555, 941, 951, 8076, 6936, 5675, 5440, 10014, 11179, 11197, 11096, 10258, 10776, 10661, 10419, -10984, -11095, -11072, -6630, -5467, -6473, -6838, -32318, -26069, -25925, -25669, 11202, 22193, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 119, 92, 66, 39, 20, 4, 823, 809, 796, 2749, 2733, 2712, 4934, 4911, 4888, 8004, 8099, 11078, 11053, 10008, 18231, 18339, 18196, 30402, 30379, 29458, -31168, -32217, -32238, -25916, -25933, -25956, -21824, -22869, -21864, -17980, -18005, -18026, -11838, -11861, -10858, 23318, 21910, 21776, 1502, 4570, 8670, 13788, 25827, 31969, -28196, -21028, -15908, -7466, 7977, 8732, 8596, 4894, 5908, 794, 1686, -22623, -23014, 14866, 119, 92, 66, 39, 20, 4, 823, 809, 796, 2749, 2733, 2712, 4934, 4911, 4888, 8004, 8099, 11078, 11053, 10008, 18231, 18339, 18196, 30402, 30379, 29458, -31168, -32217, -32238, -25916, -25933, -25956, -21824, -22869, -21864, -17980, -18005, -18026, -11838, -11861, -10858, 23318, 21910, 21776, 1502, 4570, 8670, 13788, 25827, 31969, -28196, -21028, -15908, -7466, 7977, 8732, 8596, 4894, 5908, 794, 1686, -22623, -23014, 14866, 119, 92, 66, 39, 20, 4, 823, 809, 796, 2749, 2733, 2712, 4934, 4911, 4888, 8004, 8099, 11078, 11053, 10008, 18231, 18339, 18196, 30402, 30379, 29458, -31168, -32217, -32238, -25916, -25933, -25956, -21824, -22869, -21864, -17980, -18005, -18026, -11838, -11861, -10858, 23318, 21910, 21776, 1502, 4570, 8670, 13788, 25827, 31969, -28196, -21028, -15908, -7466, 7977, 8732, 8596, 4894, 5908, 794, 1686, -22623, -23014, 14866 }, { 4300, 3294, 3303, 3264, 4506, 4382, 4387, 5293, 7622, 7384, 8412, 7496, 86, 123, 111, 99, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 119, 92, 66, 39, 20, 4, 823, 809, 796, 2749, 2733, 2712, 4934, 4911, 4888, 8004, 8099, 11078, 11053, 10008, 18231, 18339, 18196, 30402, 30379, 29458, -31168, -32217, -32238, -25916, -25933, -25956, -21824, -22869, -21864, -17980, -18005, -18026, -11838, -11861, -10858, 23318, 21910, 21776, 1502, 4570, 8670, 13788, 25827, 31969, -28196, -21028, -15908, -7466, 7977, 8732, 8596, 4894, 5908, 794, 1686, -22623, -23014, 14866, 119, 92, 66, 39, 20, 4, 823, 809, 796, 2749, 2733, 2712, 4934, 4911, 4888, 8004, 8099, 11078, 11053, 10008, 18231, 18339, 18196, 30402, 30379, 29458, -31168, -32217, -32238, -25916, -25933, -25956, -21824, -22869, -21864, -17980, -18005, -18026, -11838, -11861, -10858, 23318, 21910, 21776, 1502, 4570, 8670, 13788, 25827, 31969, -28196, -21028, -15908, -7466, 7977, 8732, 8596, 4894, 5908, 794, 1686, -22623, -23014, 14866, 13766, 13745, 13726, 13890, 13743, 13852, 17602, 18605, 21660, 24000, 24997, 24088, 27972, 25903, 26904, 27193, 27175, 27156, 30020, 28975, 29976, 12482, 13485, 10392, 10692, 10669, 10776, 6717, 6695, 7830, 6971, 6951, 5910, 3389, 3369, 3356, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, -22182, -27211, -27198, -27186, -27302, 542, 555, 941, 951, 8076, 6936, 5675, 5440, 10014, 11179, 11197, 11096, 10258, 10776, 10661, 10419, -10984, -11095, -11072, -6630, -5467, -6473, -6838, -32318, -26069, -25925, -25669, 11202, 22193, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 119, 92, 66, 39, 20, 4, 823, 809, 796, 2749, 2733, 2712, 4934, 4911, 4888, 8004, 8099, 11078, 11053, 10008, 18231, 18339, 18196, 30402, 30379, 29458, -31168, -32217, -32238, -25916, -25933, -25956, -21824, -22869, -21864, -17980, -18005, -18026, -11838, -11861, -10858, 23318, 21910, 21776, 1502, 4570, 8670, 13788, 25827, 31969, -28196, -21028, -15908, -7466, 7977, 8732, 8596, 4894, 5908, 794, 1686, -22623, -23014, 14866, 119, 92, 66, 39, 20, 4, 823, 809, 796, 2749, 2733, 2712, 4934, 4911, 4888, 8004, 8099, 11078, 11053, 10008, 18231, 18339, 18196, 30402, 30379, 29458, -31168, -32217, -32238, -25916, -25933, -25956, -21824, -22869, -21864, -17980, -18005, -18026, -11838, -11861, -10858, 23318, 21910, 21776, 1502, 4570, 8670, 13788, 25827, 31969, -28196, -21028, -15908, -7466, 7977, 8732, 8596, 4894, 5908, 794, 1686, -22623, -23014, 14866, 119, 92, 66, 39, 20, 4, 823, 809, 796, 2749, 2733, 2712, 4934, 4911, 4888, 8004, 8099, 11078, 11053, 10008, 18231, 18339, 18196, 30402, 30379, 29458, -31168, -32217, -32238, -25916, -25933, -25956, -21824, -22869, -21864, -17980, -18005, -18026, -11838, -11861, -10858, 23318, 21910, 21776, 1502, 4570, 8670, 13788, 25827, 31969, -28196, -21028, -15908, -7466, 7977, 8732, 8596, 4894, 5908, 794, 1686, -22623, -23014, 14866 } };

    @OriginalMember(owner = "client!gd", name = "V", descriptor = "I")
    public static int field2978;

    @OriginalMember(owner = "client!gd", name = "X", descriptor = "I")
    public static int field2980;

    @OriginalMember(owner = "client!gd", name = "ab", descriptor = "I")
    public static int field2983;

    @OriginalMember(owner = "client!gd", name = "cb", descriptor = "I")
    private int field2985;

    @OriginalMember(owner = "client!gd", name = "eb", descriptor = "I")
    public static int field2987;

    @OriginalMember(owner = "client!gd", name = "fb", descriptor = "I")
    public static int field2988;

    @OriginalMember(owner = "client!gd", name = "ib", descriptor = "I")
    public static int field2991;

    @OriginalMember(owner = "client!gd", name = "jb", descriptor = "I")
    private int field2992;

    @OriginalMember(owner = "client!gd", name = "kb", descriptor = "I")
    private int field2993;

    @OriginalMember(owner = "client!gd", name = "lb", descriptor = "I")
    public static int field2994;

    @OriginalMember(owner = "client!gd", name = "mb", descriptor = "I")
    public static int field2995;

    @OriginalMember(owner = "client!gd", name = "db", descriptor = "Lob;")
    public static class294 field2986;

    @OriginalMember(owner = "client!gd", name = "Z", descriptor = "[Lmd;")
    public static class88[] field2982;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lfj;II)V", line = 5)
    public final void method13(class3 arg0, int arg1, int arg2) {
        if (arg1 <= -117) {
            field2980++;
            if (arg2 == 0) {
                this.method1200(false, arg0.method48(64));
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(BI)[[I", line = 33)
    public final int[][] method9(byte arg0, int arg1) {
        if (arg0 != 3) {
            method1195(83, (class36) null);
        }
        field2987++;
        int[][] var3 = this.field3126.method603(arg1, -126);
        if (this.field3126.field1372) {
            int[] var4 = var3[0];
            int[] var5 = var3[2];
            int[] var6 = var3[1];
            for (int var7 = 0; var7 < class157.field2504; var7++) {
                var4[var7] = this.field2993;
                var6[var7] = this.field2985;
                var5[var7] = this.field2992;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILva;)V", line = 71)
    public static final void method1195(int arg0, class36 arg1) {
        class81.field1245 = arg1;
        if (arg0 == -18536) {
            field2994++;
        }
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(B)V", line = 94)
    public static void method1196(byte arg0) {
        field2979 = null;
        field2984 = null;
        field2996 = (short[][]) null;
        int var1 = 36 % ((arg0 - 80) / 42);
        field2989 = null;
        field2982 = null;
        field2990 = null;
        field2986 = null;
        field2981 = null;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IBLjc;)V", line = 122)
    public static final void method1197(int arg0, byte arg1, class147 arg2) {
        if (arg1 >= -5) {
            method1197(-42, (byte) -43, (class147) null);
        }
        field2978++;
        while (true) {
            class234 var3 = (class234) class238.field3814.method995(1836596936);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field3780; var5++) {
                if (var3.field3785[var5] != null) {
                    if (var3.field3785[var5].field4496 == 2) {
                        var3.field3778[var5] = -5;
                    }
                    if (var3.field3785[var5].field4496 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field3772[var5] != null) {
                    if (var3.field3772[var5].field4496 == 2) {
                        var3.field3778[var5] = -6;
                    }
                    if (var3.field3772[var5].field4496 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg2.method966(0, arg0);
            arg2.method32(0, (byte) -99);
            int var6 = arg2.field44;
            arg2.method26(var3.field3789, 118);
            for (int var7 = 0; var7 < var3.field3780; var7++) {
                if (var3.field3778[var7] == 0) {
                    try {
                        int var8 = var3.field3781[var7];
                        if (var8 == 0) {
                            Field var9 = (Field) var3.field3785[var7].field4499;
                            int var10 = var9.getInt((Object) null);
                            arg2.method32(0, (byte) -99);
                            arg2.method26(var10, 48);
                        } else if (var8 == 1) {
                            Field var13 = (Field) var3.field3785[var7].field4499;
                            var13.setInt((Object) null, var3.field3790[var7]);
                            arg2.method32(0, (byte) -99);
                        } else if (var8 == 2) {
                            Field var11 = (Field) var3.field3785[var7].field4499;
                            int var12 = var11.getModifiers();
                            arg2.method32(0, (byte) -99);
                            arg2.method26(var12, 44);
                        }
                        if (var8 == 3) {
                            byte[][] var16 = var3.field3779[var7];
                            Method var17 = (Method) var3.field3772[var7].field4499;
                            Object[] var18 = new Object[var16.length];
                            for (int var19 = 0; var19 < var16.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var16[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var17.invoke((Object) null, var18);
                            if (var21 == null) {
                                arg2.method32(0, (byte) -99);
                            } else if ((var21 instanceof Number)) {
                                arg2.method32(1, (byte) -99);
                                arg2.method29(2069, ((Number) var21).longValue());
                            } else if ((var21 instanceof class119)) {
                                arg2.method32(2, (byte) -99);
                                arg2.method61(false, (class119) var21);
                            } else {
                                arg2.method32(4, (byte) -99);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field3772[var7].field4499;
                            int var15 = var14.getModifiers();
                            arg2.method32(0, (byte) -99);
                            arg2.method26(var15, 85);
                        }
                    } catch (ClassNotFoundException var34) {
                        arg2.method32(-10, (byte) -99);
                    } catch (InvalidClassException var35) {
                        arg2.method32(-11, (byte) -99);
                    } catch (StreamCorruptedException var36) {
                        arg2.method32(-12, (byte) -99);
                    } catch (OptionalDataException var37) {
                        arg2.method32(-13, (byte) -99);
                    } catch (IllegalAccessException var38) {
                        arg2.method32(-14, (byte) -99);
                    } catch (IllegalArgumentException var39) {
                        arg2.method32(-15, (byte) -99);
                    } catch (InvocationTargetException var40) {
                        arg2.method32(-16, (byte) -99);
                    } catch (SecurityException var41) {
                        arg2.method32(-17, (byte) -99);
                    } catch (IOException var42) {
                        arg2.method32(-18, (byte) -99);
                    } catch (NullPointerException var43) {
                        arg2.method32(-19, (byte) -99);
                    } catch (Exception var44) {
                        arg2.method32(-20, (byte) -99);
                    } catch (Throwable var45) {
                        arg2.method32(-21, (byte) -99);
                    }
                } else {
                    arg2.method32(var3.field3778[var7], (byte) -99);
                }
            }
            arg2.method37(var6, 1578852788);
            arg2.method39(arg2.field44 - var6, (byte) -119);
            var3.method552((byte) -116);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;", line = 315)
    public static final String method1198(int arg0, Throwable arg1) throws IOException {
        field2988++;
        if (arg0 != -1) {
            return (String) null;
        }
        String var2;
        if ((arg1 instanceof class207)) {
            class207 var3 = (class207) arg1;
            var2 = var3.field3306 + " | ";
            arg1 = var3.field3295;
        } else {
            var2 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            while (true) {
                String var9 = var7.readLine();
                if (var9 == null) {
                    return var2 + "| " + var8;
                }
                int var10 = var9.indexOf(40);
                int var11 = var9.indexOf(41, var10 + 1);
                if (var10 >= 0 && var11 >= 0) {
                    String var12 = var9.substring(var10 + 1, var11);
                    int var13 = var12.indexOf(".java:");
                    if (var13 >= 0) {
                        String var14 = var12.substring(0, var13) + var12.substring(var13 + 5);
                        var2 = var2 + var14 + ' ';
                        continue;
                    }
                    var9 = var9.substring(0, var10);
                }
                String var15 = var9.trim();
                String var16 = var15.substring(var15.lastIndexOf(32) + 1);
                String var17 = var16.substring(var16.lastIndexOf(9) + 1);
                var2 = var2 + var17 + ' ';
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(I)V", line = 392)
    private class189(int arg0) {
        super(0, false);
        this.method1200(false, arg0);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "([[[B[[B[[F[[II[[B[[F[[BI[[F[[B[[I)[Lib;", line = 411)
    public static final class145[] method1199(byte[][][] arg0, byte[][] arg1, float[][] arg2, int[][] arg3, int arg4, byte[][] arg5, float[][] arg6, byte[][] arg7, int arg8, float[][] arg9, byte[][] arg10, int[][] arg11) {
        field2983++;
        class212 var12 = new class212(128);
        for (int var13 = 1; var13 <= 102; var13++) {
            for (int var14 = 1; var14 <= 102; var14++) {
                int var15 = arg10[var13][var14] & 0xFF;
                int var16 = arg7[var13][var14] & 0xFF;
                if (var15 != 0) {
                    class296 var17 = class158.method1009((byte) -42, var15 - 1);
                    if (var17.field4923 == -1) {
                        continue;
                    }
                    class145 var18 = class183.method1166(1174619744, var12, var17);
                    byte var19 = arg1[var13][var14];
                    int[] var20 = class55.field869[var19];
                    var18.field2317 += var20.length / 2;
                    var18.field2332++;
                    if (var17.field4932 && var16 != 0) {
                        var18.field2317 += class20.field288[var19];
                    }
                }
                if ((arg7[var13][var14] & 0xFF) != 0 || var15 != 0 && arg1[var13][var14] == 0) {
                    int var21 = 0;
                    int[] var22 = new int[8];
                    int var23 = 0;
                    int var24 = 0;
                    int var25 = 0;
                    int var26 = arg10[var13][var14 + 1] & 0xFF;
                    int var27 = 0;
                    int var28 = arg10[var13 - 1][var14] & 0xFF;
                    int var29 = arg10[var13 + 1][var14] & 0xFF;
                    int var30 = arg10[var13 - 1][var14 - 1] & 0xFF;
                    int var31 = arg10[var13 - 1][var14 + 1] & 0xFF;
                    int var32 = arg10[var13 + 1][var14 - 1] & 0xFF;
                    int var33 = arg10[var13 + 1][var14 + 1] & 0xFF;
                    int var34 = arg10[var13][var14 - 1] & 0xFF;
                    if (var31 == 0 || var15 == var31) {
                        boolean var43 = false;
                    } else {
                        class296 var35 = class158.method1009((byte) -36, var31 - 1);
                        if (var35.field4932 && var35.field4923 != -1) {
                            byte var36 = arg5[var13 - 1][var14 + 1];
                            byte var37 = arg1[var13 - 1][var14 + 1];
                            int var38 = class71.field1110[(var36 + 3 & 0x3) + var37 * 4];
                            int var39 = class71.field1110[(var36 + 2 & 0x3) + var37 * 4];
                            if (class67.field1041[var38][1] && class67.field1041[var39][0]) {
                                boolean var40 = false;
                            } else {
                                for (int var41 = 0; var41 < 8; var41++) {
                                    if (var21 == var41) {
                                        var22[var21++] = var31;
                                        break;
                                    }
                                    if (var22[var41] == var31) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            boolean var42 = false;
                        }
                    }
                    if (var30 == 0 || var15 == var30) {
                        boolean var52 = false;
                    } else {
                        class296 var44 = class158.method1009((byte) -112, var30 - 1);
                        if (var44.field4932 && var44.field4923 != -1) {
                            byte var45 = arg1[var13 - 1][var14 - 1];
                            byte var46 = arg5[var13 - 1][var14 - 1];
                            int var47 = class71.field1110[(var46 & 0x3) + var45 * 4];
                            int var48 = class71.field1110[var45 * 4 + (var46 + 3 & 0x3)];
                            if (class67.field1041[var47][1] && class67.field1041[var48][0]) {
                                boolean var49 = false;
                            } else {
                                for (int var50 = 0; var50 < 8; var50++) {
                                    if (var21 == var50) {
                                        var22[var21++] = var30;
                                        break;
                                    }
                                    if (var22[var50] == var30) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            boolean var51 = false;
                        }
                    }
                    if (var32 == 0 || var15 == var32) {
                        boolean var61 = false;
                    } else {
                        class296 var53 = class158.method1009((byte) -41, var32 - 1);
                        if (var53.field4932 && var53.field4923 != -1) {
                            byte var54 = arg5[var13 + 1][var14 - 1];
                            byte var55 = arg1[var13 + 1][var14 - 1];
                            int var56 = class71.field1110[(var54 & 0x3) + var55 * 4];
                            int var57 = class71.field1110[(var54 + 1 & 0x3) + var55 * 4];
                            if (class67.field1041[var57][1] && class67.field1041[var56][0]) {
                                boolean var58 = false;
                            } else {
                                for (int var59 = 0; var59 < 8; var59++) {
                                    if (var21 == var59) {
                                        var22[var21++] = var32;
                                        break;
                                    }
                                    if (var22[var59] == var32) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            boolean var60 = false;
                        }
                    }
                    if (var33 == 0 || var15 == var33) {
                        boolean var70 = false;
                    } else {
                        class296 var62 = class158.method1009((byte) -128, var33 - 1);
                        if (var62.field4932 && var62.field4923 != -1) {
                            byte var63 = arg5[var13 + 1][var14 + 1];
                            byte var64 = arg1[var13 + 1][var14 + 1];
                            int var65 = class71.field1110[(var63 + 2 & 0x3) + var64 * 4];
                            int var66 = class71.field1110[var64 * 4 + (var63 + 1 & 0x3)];
                            if (class67.field1041[var65][1] && class67.field1041[var66][0]) {
                                boolean var67 = false;
                            } else {
                                for (int var68 = 0; var68 < 8; var68++) {
                                    if (var21 == var68) {
                                        var22[var21++] = var33;
                                        break;
                                    }
                                    if (var22[var68] == var33) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            boolean var69 = false;
                        }
                    }
                    if (var26 != 0 && var15 != var26) {
                        class296 var71 = class158.method1009((byte) -42, var26 - 1);
                        if (var71.field4932 && var71.field4923 != -1) {
                            var25 = class71.field1110[(arg5[var13][var14 + 1] + 2 & 0x3) + arg1[var13][var14 + 1] * 4];
                            for (int var72 = 0; var72 < 8; var72++) {
                                if (var21 == var72) {
                                    var22[var21++] = var26;
                                    break;
                                }
                                if (var22[var72] == var26) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var28 != 0 && var15 != var28) {
                        class296 var73 = class158.method1009((byte) -87, var28 - 1);
                        if (var73.field4932 && var73.field4923 != -1) {
                            var23 = class71.field1110[(arg5[var13 - 1][var14] + 3 & 0x3) + arg1[var13 - 1][var14] * 4];
                            for (int var74 = 0; var74 < 8; var74++) {
                                if (var21 == var74) {
                                    var22[var21++] = var28;
                                    break;
                                }
                                if (var22[var74] == var28) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var34 != 0 && var15 != var34) {
                        class296 var75 = class158.method1009((byte) -122, var34 - 1);
                        if (var75.field4932 && var75.field4923 != -1) {
                            var27 = class71.field1110[(arg5[var13][var14 - 1] & 0x3) + arg1[var13][var14 - 1] * 4];
                            for (int var76 = 0; var76 < 8; var76++) {
                                if (var21 == var76) {
                                    var22[var21++] = var34;
                                    break;
                                }
                                if (var22[var76] == var34) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var29 != 0 && var15 != var29) {
                        class296 var77 = class158.method1009((byte) -38, var29 - 1);
                        if (var77.field4932 && var77.field4923 != -1) {
                            var24 = class71.field1110[arg1[var13 + 1][var14] * 4 + (arg5[var13 + 1][var14] + 1 & 0x3)];
                            for (int var78 = 0; var78 < 8; var78++) {
                                if (var21 == var78) {
                                    var22[var21++] = var29;
                                    break;
                                }
                                if (var22[var78] == var29) {
                                    break;
                                }
                            }
                        }
                    }
                    for (int var79 = 0; var79 < var21; var79++) {
                        int var80 = var22[var79];
                        boolean[] var81 = class67.field1041[var26 == var80 ? var25 : 0];
                        boolean[] var82 = class67.field1041[var28 == var80 ? var23 : 0];
                        boolean[] var83 = class67.field1041[var34 == var80 ? var27 : 0];
                        boolean[] var84 = class67.field1041[var29 == var80 ? var24 : 0];
                        class296 var85 = class158.method1009((byte) -66, var80 - 1);
                        class145 var86 = class183.method1166(arg4 ^ 0x46034663, var12, var85);
                        var86.field2317 += 5;
                        var86.field2317 += var81.length - 2;
                        var86.field2317 += var82.length - 2;
                        var86.field2317 += var83.length - 2;
                        var86.field2317 += var84.length - 2;
                        var86.field2332++;
                    }
                }
            }
        }
        for (class145 var87 = (class145) var12.method1325(-44); var87 != null; var87 = (class145) var12.method1332(-42)) {
            var87.method949();
        }
        for (int var88 = 1; var88 <= 102; var88++) {
            for (int var89 = 1; var89 <= 102; var89++) {
                int var90 = arg7[var88][var89] & 0xFF;
                int var91;
                if ((arg0[arg8][var88][var89] & 0x8) != 0) {
                    var91 = 0;
                } else if ((arg0[1][var88][var89] & 0x2) == 2 && arg8 > 0) {
                    var91 = arg8 - 1;
                } else {
                    var91 = arg8;
                }
                int var92 = arg10[var88][var89] & 0xFF;
                if (var92 != 0) {
                    class296 var93 = class158.method1009((byte) -89, var92 - 1);
                    if (var93.field4923 == -1) {
                        continue;
                    }
                    class145 var94 = class183.method1166(1174619744, var12, var93);
                    byte var95 = arg1[var88][var89];
                    byte var96 = arg5[var88][var89];
                    int var97 = class241.method1567(var93.field4923, false, var93.field4928, arg11[var88][var89]);
                    int var98 = class241.method1567(var93.field4923, false, var93.field4928, arg11[var88 + 1][var89]);
                    int var99 = class241.method1567(var93.field4923, false, var93.field4928, arg11[var88 + 1][var89 + 1]);
                    int var100 = class241.method1567(var93.field4923, false, var93.field4928, arg11[var88][var89 + 1]);
                    class216.method1361(var100, var98, arg2, var91, var89, var90 != 0 && var93.field4932, arg6, arg9, var88, var99, var94, var95, arg3, 14, var96, var97);
                }
                if ((arg7[var88][var89] & 0xFF) != 0 || var92 != 0 && arg1[var88][var89] == 0) {
                    int var101 = 0;
                    int[] var102 = new int[8];
                    int var103 = 0;
                    int var104 = 0;
                    int var105 = 0;
                    int var106 = arg10[var88][var89 + 1] & 0xFF;
                    int var107 = arg10[var88 - 1][var89] & 0xFF;
                    int var108 = arg10[var88 + 1][var89] & 0xFF;
                    int var109 = 0;
                    int var110 = arg10[var88][var89 - 1] & 0xFF;
                    int var111 = arg10[var88 - 1][var89 + 1] & 0xFF;
                    int var112 = arg10[var88 - 1][var89 - 1] & 0xFF;
                    int var113 = arg10[var88 + 1][var89 + 1] & 0xFF;
                    int var114 = arg10[var88 + 1][var89 - 1] & 0xFF;
                    if (var111 == 0 || var92 == var111) {
                        var111 = 0;
                    } else {
                        class296 var115 = class158.method1009((byte) -86, var111 - 1);
                        if (var115.field4932 && var115.field4923 != -1) {
                            byte var116 = arg5[var88 - 1][var89 + 1];
                            byte var117 = arg1[var88 - 1][var89 + 1];
                            int var118 = class71.field1110[(var116 + 3 & 0x3) + var117 * 4];
                            int var119 = class71.field1110[(var116 + 2 & 0x3) + var117 * 4];
                            if (class67.field1041[var118][1] && class67.field1041[var119][0]) {
                                var111 = 0;
                            } else {
                                for (int var120 = 0; var120 < 8; var120++) {
                                    if (var101 == var120) {
                                        var102[var101++] = var111;
                                        break;
                                    }
                                    if (var102[var120] == var111) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var111 = 0;
                        }
                    }
                    if (var112 == 0 || var92 == var112) {
                        var112 = 0;
                    } else {
                        class296 var121 = class158.method1009((byte) -63, var112 - 1);
                        if (var121.field4932 && var121.field4923 != -1) {
                            byte var122 = arg5[var88 - 1][var89 - 1];
                            byte var123 = arg1[var88 - 1][var89 - 1];
                            int var124 = class71.field1110[(var122 + 3 & 0x3) + var123 * 4];
                            int var125 = class71.field1110[(var122 & 0x3) + var123 * 4];
                            if (class67.field1041[var125][1] && class67.field1041[var124][0]) {
                                var112 = 0;
                            } else {
                                for (int var126 = 0; var126 < 8; var126++) {
                                    if (var101 == var126) {
                                        var102[var101++] = var112;
                                        break;
                                    }
                                    if (var102[var126] == var112) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var112 = 0;
                        }
                    }
                    if (var114 == 0 || var92 == var114) {
                        var114 = 0;
                    } else {
                        class296 var127 = class158.method1009((byte) -111, var114 - 1);
                        if (var127.field4932 && var127.field4923 != -1) {
                            byte var128 = arg5[var88 + 1][var89 - 1];
                            byte var129 = arg1[var88 + 1][var89 - 1];
                            int var130 = class71.field1110[(var128 & 0x3) + var129 * 4];
                            int var131 = class71.field1110[(var128 + 1 & 0x3) + var129 * 4];
                            if (class67.field1041[var131][1] && class67.field1041[var130][0]) {
                                var114 = 0;
                            } else {
                                for (int var132 = 0; var132 < 8; var132++) {
                                    if (var101 == var132) {
                                        var102[var101++] = var114;
                                        break;
                                    }
                                    if (var102[var132] == var114) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var114 = 0;
                        }
                    }
                    if (var113 == 0 || var92 == var113) {
                        var113 = 0;
                    } else {
                        class296 var133 = class158.method1009((byte) -125, var113 - 1);
                        if (var133.field4932 && var133.field4923 != -1) {
                            byte var134 = arg5[var88 + 1][var89 + 1];
                            byte var135 = arg1[var88 + 1][var89 + 1];
                            int var136 = class71.field1110[(var134 + 2 & 0x3) + var135 * 4];
                            int var137 = class71.field1110[(var134 + 1 & 0x3) + var135 * 4];
                            if (class67.field1041[var136][1] && class67.field1041[var137][0]) {
                                var113 = 0;
                            } else {
                                for (int var138 = 0; var138 < 8; var138++) {
                                    if (var101 == var138) {
                                        var102[var101++] = var113;
                                        break;
                                    }
                                    if (var102[var138] == var113) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var113 = 0;
                        }
                    }
                    if (var106 != 0 && var92 != var106) {
                        class296 var139 = class158.method1009((byte) -65, var106 - 1);
                        if (var139.field4932 && var139.field4923 != -1) {
                            var104 = class71.field1110[(arg5[var88][var89 + 1] + 2 & 0x3) + arg1[var88][var89 + 1] * 4];
                            for (int var140 = 0; var140 < 8; var140++) {
                                if (var101 == var140) {
                                    var102[var101++] = var106;
                                    break;
                                }
                                if (var102[var140] == var106) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var107 != 0 && var92 != var107) {
                        class296 var141 = class158.method1009((byte) -55, var107 - 1);
                        if (var141.field4932 && var141.field4923 != -1) {
                            var103 = class71.field1110[arg1[var88 - 1][var89] * 4 + (arg5[var88 - 1][var89] + 3 & 0x3)];
                            for (int var142 = 0; var142 < 8; var142++) {
                                if (var101 == var142) {
                                    var102[var101++] = var107;
                                    break;
                                }
                                if (var102[var142] == var107) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var110 != 0 && var92 != var110) {
                        class296 var143 = class158.method1009((byte) -49, var110 - 1);
                        if (var143.field4932 && var143.field4923 != -1) {
                            var105 = class71.field1110[(arg5[var88][var89 - 1] & 0x3) + arg1[var88][var89 - 1] * 4];
                            for (int var144 = 0; var144 < 8; var144++) {
                                if (var101 == var144) {
                                    var102[var101++] = var110;
                                    break;
                                }
                                if (var102[var144] == var110) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var108 != 0 && var92 != var108) {
                        class296 var145 = class158.method1009((byte) -84, var108 - 1);
                        if (var145.field4932 && var145.field4923 != -1) {
                            var109 = class71.field1110[(arg5[var88 + 1][var89] + 1 & 0x3) + arg1[var88 + 1][var89] * 4];
                            for (int var146 = 0; var146 < 8; var146++) {
                                if (var101 == var146) {
                                    var102[var101++] = var108;
                                    break;
                                }
                                if (var102[var146] == var108) {
                                    break;
                                }
                            }
                        }
                    }
                    for (int var147 = 0; var147 < var101; var147++) {
                        int var148 = var102[var147];
                        boolean[] var149 = class67.field1041[var106 == var148 ? var104 : 0];
                        boolean[] var150 = class67.field1041[var107 == var148 ? var103 : 0];
                        boolean[] var151 = class67.field1041[var110 == var148 ? var105 : 0];
                        boolean[] var152 = class67.field1041[var108 == var148 ? var109 : 0];
                        class296 var153 = class158.method1009((byte) -55, var148 - 1);
                        class145 var154 = class183.method1166(1174619744, var12, var153);
                        int var155 = class241.method1567(var153.field4923, false, var153.field4928, arg11[var88][var89]) << 8 | 0xFF;
                        int var156 = class241.method1567(var153.field4923, false, var153.field4928, arg11[var88 + 1][var89]) << 8 | 0xFF;
                        byte var157 = 6;
                        int var158 = class241.method1567(var153.field4923, false, var153.field4928, arg11[var88 + 1][var89 + 1]) << 8 | 0xFF;
                        int var159 = class241.method1567(var153.field4923, false, var153.field4928, arg11[var88][var89 + 1]) << 8 | 0xFF;
                        boolean var160 = var111 != var148 && var150[0] && var149[1];
                        boolean var161 = var112 != var148 && var151[0] && var150[1];
                        int var162 = var149.length + var157 - 2;
                        int var163 = var150.length + var162 - 2;
                        int var164 = var151.length + var163 - 2;
                        boolean var165 = var113 != var148 && var149[0] && var152[1];
                        int var166 = var152.length + var164 - 2;
                        boolean var167 = var114 != var148 && var152[0] && var151[1];
                        int[] var168 = new int[var166];
                        byte var169 = 0;
                        int var170 = class211.method1321(var89, 64, arg3, (int[][]) null, 64, 0, var159, var88, var155, true, var158, 0.0F, arg9, arg6, var154, var156, arg4 - 3, arg2);
                        int var171 = class211.method1321(var89, 128, arg3, (int[][]) null, 0, 0, var159, var88, var155, var160, var158, 0.0F, arg9, arg6, var154, var156, arg4 - 3, arg2);
                        int var172 = class211.method1321(var89, 128, arg3, (int[][]) null, 128, 0, var159, var88, var155, var165, var158, 0.0F, arg9, arg6, var154, var156, 0, arg2);
                        int var173 = class211.method1321(var89, 0, arg3, (int[][]) null, 0, 0, var159, var88, var155, var161, var158, 0.0F, arg9, arg6, var154, var156, 0, arg2);
                        int var174 = class211.method1321(var89, 0, arg3, (int[][]) null, 128, 0, var159, var88, var155, var167, var158, 0.0F, arg9, arg6, var154, var156, 0, arg2);
                        int var180 = var169 + 1;
                        var168[var169] = var170;
                        var168[var180++] = var172;
                        if (var149.length > 2) {
                            var168[var180++] = class211.method1321(var89, 128, arg3, (int[][]) null, 64, 0, var159, var88, var155, var149[2], var158, 0.0F, arg9, arg6, var154, var156, 0, arg2);
                        }
                        var168[var180++] = var171;
                        if (var150.length > 2) {
                            var168[var180++] = class211.method1321(var89, 64, arg3, (int[][]) null, 0, 0, var159, var88, var155, var150[2], var158, 0.0F, arg9, arg6, var154, var156, 0, arg2);
                        }
                        var168[var180++] = var173;
                        if (var151.length > 2) {
                            var168[var180++] = class211.method1321(var89, 0, arg3, (int[][]) null, 64, 0, var159, var88, var155, var151[2], var158, 0.0F, arg9, arg6, var154, var156, 0, arg2);
                        }
                        var168[var180++] = var174;
                        if (var152.length > 2) {
                            var168[var180++] = class211.method1321(var89, 64, arg3, (int[][]) null, 128, 0, var159, var88, var155, var152[2], var158, 0.0F, arg9, arg6, var154, var156, class81.method558(arg4, 3), arg2);
                        }
                        var168[var180++] = var172;
                        var154.method952(var91, var88, var89, var168, (int[]) null, true);
                    }
                }
            }
        }
        for (class145 var175 = (class145) var12.method1325(arg4 ^ 0xFFFFFFA4); var175 != null; var175 = (class145) var12.method1332(arg4 - 25)) {
            if (var175.field2335 == 0) {
                var175.method552((byte) 63);
            } else {
                var175.method950();
            }
        }
        int var176 = var12.method1338(-125);
        class145[] var177 = new class145[var176];
        var12.method1333(var177, 0);
        long[] var178 = new long[var176];
        for (int var179 = 0; var179 < var176; var179++) {
            var178[var179] = var177[var179].field1218;
        }
        class295.method1962(var177, var178, arg4 ^ arg4);
        return var177;
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "()V", line = 1343)
    public class189() {
        this(0);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZI)V", line = 1348)
    private final void method1200(boolean arg0, int arg1) {
        field2991++;
        this.field2992 = (arg1 & 0xFF) << 4;
        this.field2985 = arg1 >> 4 & 0xFF0;
        this.field2993 = arg1 >> 12 & 0xFF0;
        if (arg0) {
            method1196((byte) 50);
        }
    }
}
