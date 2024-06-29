import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public abstract class class440 {

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "I")
    public static int field6566;

    @OriginalMember(owner = "client!mq", name = "c", descriptor = "I")
    public static int field6568;

    @OriginalMember(owner = "client!mq", name = "d", descriptor = "I")
    public static int field6569;

    @OriginalMember(owner = "client!mq", name = "e", descriptor = "I")
    public static int field6570;

    @OriginalMember(owner = "client!mq", name = "f", descriptor = "I")
    public static int field6571;

    @OriginalMember(owner = "client!mq", name = "g", descriptor = "I")
    public int field6572;

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "Ljava/lang/String;")
    public String field6567;

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(IB)I")
    public static final int method2739(int arg0, byte arg1) {
        if (arg1 != -48) {
            field6570 = 97;
        }
        field6569++;
        return arg0 & 0x3FF;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method2740(int arg0) throws IOException {
        if (arg0 == -2001) {
            field6566++;
            return new Socket(this.field6567, this.field6572);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(B)Ljava/net/Socket;")
    public abstract Socket method893(byte arg0) throws IOException;

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(CII)C")
    public static final char method2741(char arg0, int arg1, int arg2) {
        field6571++;
        if (arg1 != 253) {
            field6570 = -60;
        }
        if (arg0 >= 'À' && arg0 <= 'ÿ') {
            if (arg0 >= 'À' && arg0 <= 'Æ') {
                return 'A';
            }
            if (arg0 == 'Ç') {
                return 'C';
            }
            if (arg0 >= 'È' && arg0 <= 'Ë') {
                return 'E';
            }
            if (arg0 >= 'Ì' && arg0 <= 'Ï') {
                return 'I';
            }
            if (arg0 == 'Ñ' && arg2 != 0) {
                return 'N';
            }
            if (arg0 >= 'Ò' && arg0 <= 'Ö') {
                return 'O';
            }
            if (arg0 >= 'Ù' && arg0 <= 'Ü') {
                return 'U';
            }
            if (arg0 == 'Ý') {
                return 'Y';
            }
            if (arg0 == 'ß') {
                return 's';
            }
            if (arg0 >= 'à' && arg0 <= 'æ') {
                return 'a';
            }
            if (arg0 == 'ç') {
                return 'c';
            }
            if (arg0 >= 'è' && arg0 <= 'ë') {
                return 'e';
            }
            if (arg0 >= 'ì' && arg0 <= 'ï') {
                return 'i';
            }
            if (arg0 == 'ñ' && arg2 != 0) {
                return 'n';
            }
            if (arg0 >= 'ò' && arg0 <= 'ö') {
                return 'o';
            }
            if (arg0 >= 'ù' && arg0 <= 'ü') {
                return 'u';
            }
            if (arg0 == 'ý' || arg0 == 'ÿ') {
                return 'y';
            }
        }
        if (arg0 == 'Œ') {
            return 'O';
        } else if (arg0 == 'œ') {
            return 'o';
        } else if (arg0 == 'Ÿ') {
            return 'Y';
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(IIBLcm;)V")
    public static final void method2742(int arg0, int arg1, byte arg2, class631 arg3) {
        field6568++;
        if (arg3 == null || class436.field6487.field1413 == arg3) {
            return;
        }
        int var4 = arg3.field9103;
        int var5 = arg3.field9096;
        if (arg2 != 110) {
            return;
        }
        int var6 = arg3.field9100;
        int var7 = (int) arg3.field9099;
        if (var6 >= 2000) {
            var6 -= 2000;
        }
        long var8 = arg3.field9099;
        if (var6 == 3) {
            class655 var10 = class142.field1749[var7];
            if (var10 != null) {
                class572.field8268++;
                class613.field8923 = 0;
                class464.field6908 = arg1;
                class30.field343 = 2;
                class289.field3991 = arg0;
                class308.method2044(class257.field3667, -7434);
                class468.field6960.method1205((byte) -69, class280.field3915.method284(-89, 82) ? 1 : 0);
                class468.field6960.method1235(var7, (byte) 11);
                class242.method1612(var10.field2515[0], var10.method1153(true), true, 0, -2, var10.method1153(true), 0, (byte) 95, var10.field2524[0]);
            }
        }
        if (var6 == 9) {
            class30.field343 = 2;
            class464.field6908 = arg1;
            class613.field8923 = 0;
            class289.field3991 = arg0;
            class258.field3680++;
            class308.method2044(class379.field5759, arg2 ^ 0xFFFFE298);
            class468.field6960.method1231((byte) -93, class280.field3915.method284(112, 82) ? 1 : 0);
            class468.field6960.method1235(class287.field3980 + var4, (byte) 11);
            class468.field6960.method1203(0, class405.field6120);
            class468.field6960.method1229(class238.field3397, 30364);
            class468.field6960.method1235(class250.field3549 + var5, (byte) 11);
            class468.field6960.method1235(class192.field2529, (byte) 11);
            class468.field6960.method1235(Integer.MAX_VALUE & (int) (var8 >>> 32), (byte) 11);
            class576.method3342(arg2 - 236, var5, var4, var8);
        }
        if (var6 == 2) {
            class411 var11 = (class411) class42.field456.method524((byte) 124, (long) var7);
            if (var11 != null) {
                class464.field6908 = arg1;
                class78 var12 = var11.field6254;
                class30.field343 = 2;
                class289.field3991 = arg0;
                class340.field4851++;
                class613.field8923 = 0;
                class308.method2044(class268.field3763, -7434);
                class468.field6960.method1229(class192.field2529, 30364);
                class468.field6960.method1203(0, class405.field6120);
                class468.field6960.method1205((byte) -69, class280.field3915.method284(arg2 ^ 0xFFFFFFDB, 82) ? 1 : 0);
                class468.field6960.method1196((byte) 54, var7);
                class468.field6960.method1235(class238.field3397, (byte) 11);
                class242.method1612(var12.field2515[0], var12.method1153(true), true, 0, -2, var12.method1153(true), 0, (byte) 76, var12.field2524[0]);
            }
        }
        if (var6 == 47) {
            class411 var13 = (class411) class42.field456.method524((byte) 87, (long) var7);
            if (var13 != null) {
                class464.field6908 = arg1;
                class613.field8923 = 0;
                class30.field343 = 2;
                class78 var14 = var13.field6254;
                class289.field3991 = arg0;
                class167.field2046++;
                class308.method2044(class427.field6349, -7434);
                class468.field6960.method1205((byte) -69, class280.field3915.method284(-91, 82) ? 1 : 0);
                class468.field6960.method1235(var7, (byte) 11);
                class242.method1612(var14.field2515[0], var14.method1153(true), true, 0, -2, var14.method1153(true), 0, (byte) 117, var14.field2524[0]);
            }
        }
        if (var6 == 6) {
            class30.field343 = 2;
            class507.field7366++;
            class289.field3991 = arg0;
            class613.field8923 = 0;
            class464.field6908 = arg1;
            class308.method2044(class114.field1414, -7434);
            class468.field6960.method1216(class287.field3980 + var4, -13119);
            class468.field6960.method1222(class280.field3915.method284(62, 82) ? 1 : 0, true);
            class468.field6960.method1216(class250.field3549 + var5, -13119);
            class468.field6960.method1216(Integer.MAX_VALUE & (int) (var8 >>> 32), -13119);
            class576.method3342(-92, var5, var4, var8);
        }
        if (var6 == 19) {
            class411 var15 = (class411) class42.field456.method524((byte) 108, (long) var7);
            if (var15 != null) {
                class613.field8923 = 0;
                class289.field3991 = arg0;
                class464.field6908 = arg1;
                class30.field343 = 2;
                class310.field4557++;
                class78 var16 = var15.field6254;
                class308.method2044(class99.field1157, -7434);
                class468.field6960.method1229(var7, 30364);
                class468.field6960.method1202((byte) 84, class280.field3915.method284(95, 82) ? 1 : 0);
                class242.method1612(var16.field2515[0], var16.method1153(true), true, 0, -2, var16.method1153(true), 0, (byte) 110, var16.field2524[0]);
            }
        }
        if (var6 == 59) {
            class24.field255++;
            class30.field343 = 2;
            class613.field8923 = 0;
            class289.field3991 = arg0;
            class464.field6908 = arg1;
            class308.method2044(class61.field700, -7434);
            class468.field6960.method1196((byte) 54, class287.field3980 + var4);
            class468.field6960.method1231((byte) -93, class280.field3915.method284(arg2 - 24, 82) ? 1 : 0);
            class468.field6960.method1229(var7, 30364);
            class468.field6960.method1235(var5 + class250.field3549, (byte) 11);
            class352.method2233((byte) 102, var5, var4);
        }
        if (var6 == 13) {
            class593 var17 = class322.method2103(var4, false, var5);
            if (var17 != null) {
                class375.method2413((byte) 75, var17);
            }
        }
        if (var6 == 48) {
            class655 var18 = class142.field1749[var7];
            if (var18 != null) {
                class464.field6908 = arg1;
                class289.field3991 = arg0;
                class172.field2113++;
                class30.field343 = 2;
                class613.field8923 = 0;
                class308.method2044(class141.field1744, -7434);
                class468.field6960.method1235(var7, (byte) 11);
                class468.field6960.method1222(class280.field3915.method284(arg2 - 234, 82) ? 1 : 0, true);
                class242.method1612(var18.field2515[0], var18.method1153(true), true, 0, -2, var18.method1153(true), 0, (byte) 86, var18.field2524[0]);
            }
        }
        if (var6 == 49) {
            class655 var19 = class142.field1749[var7];
            if (var19 != null) {
                class613.field8923 = 0;
                class119.field1497++;
                class30.field343 = 2;
                class289.field3991 = arg0;
                class464.field6908 = arg1;
                class308.method2044(class280.field3913, -7434);
                class468.field6960.method1229(var7, 30364);
                class468.field6960.method1231((byte) -93, class280.field3915.method284(82, 82) ? 1 : 0);
                class242.method1612(var19.field2515[0], var19.method1153(true), true, 0, -2, var19.method1153(true), 0, (byte) 121, var19.field2524[0]);
            }
        }
        if (var6 == 22) {
            class289.field3991 = arg0;
            class30.field343 = 2;
            class613.field8923 = 0;
            class173.field2119++;
            class464.field6908 = arg1;
            class308.method2044(class19.field192, -7434);
            class468.field6960.method1196((byte) 54, class287.field3980 + var4);
            class468.field6960.method1231((byte) -93, class280.field3915.method284(-114, 82) ? 1 : 0);
            class468.field6960.method1235(class250.field3549 + var5, (byte) 11);
            class468.field6960.method1229(Integer.MAX_VALUE & (int) (var8 >>> 32), 30364);
            class576.method3342(-104, var5, var4, var8);
        }
        if (var6 == 11) {
            class464.field6908 = arg1;
            class289.field3991 = arg0;
            class30.field343 = 2;
            class81.field897++;
            class613.field8923 = 0;
            class308.method2044(class208.field2792, -7434);
            class468.field6960.method1235(var5 + class250.field3549, (byte) 11);
            class468.field6960.method1202((byte) 84, class280.field3915.method284(104, 82) ? 1 : 0);
            class468.field6960.method1196((byte) 54, class287.field3980 + var4);
            class468.field6960.method1229(var7, 30364);
            class352.method2233((byte) 108, var5, var4);
        }
        if (var6 == 1002 || var6 == 1001 || var6 == 1007 || var6 == 1009 || var6 == 1011) {
            class340.method2189(var7, var6, var4, -125);
        }
        if (var6 == 46) {
            class655 var20 = class142.field1749[var7];
            if (var20 != null) {
                class464.field6908 = arg1;
                class289.field3991 = arg0;
                class613.field8923 = 0;
                class30.field343 = 2;
                class67.field742++;
                class308.method2044(class197.field2658, arg2 - 7544);
                class468.field6960.method1235(class192.field2529, (byte) 11);
                class468.field6960.method1223(true, class405.field6120);
                class468.field6960.method1205((byte) -69, class280.field3915.method284(73, 82) ? 1 : 0);
                class468.field6960.method1229(var7, 30364);
                class468.field6960.method1216(class238.field3397, arg2 - 13229);
                class242.method1612(var20.field2515[0], var20.method1153(true), true, 0, -2, var20.method1153(true), 0, (byte) 66, var20.field2524[0]);
            }
        }
        if (var6 == 12) {
            class289.field3991 = arg0;
            class320.field4624++;
            class464.field6908 = arg1;
            class613.field8923 = 0;
            class30.field343 = 2;
            class308.method2044(class260.field3701, -7434);
            class468.field6960.method1222(class280.field3915.method284(118, 82) ? 1 : 0, true);
            class468.field6960.method1216(class250.field3549 + var5, -13119);
            class468.field6960.method1216(var7, -13119);
            class468.field6960.method1235(var4 + class287.field3980, (byte) 11);
            class352.method2233((byte) 103, var5, var4);
        }
        if (var6 == 20) {
            class593 var21 = class322.method2103(var4, false, var5);
            if (var21 != null) {
                class650.method3713(true);
                class271 var22 = client.method1682(var21);
                class93.method589(var22.method1771((byte) 34), (byte) -27, var22.field3804, var21);
                class442.field6600 = class309.method2051(var21, (byte) 102);
                if (class442.field6600 == null) {
                    class442.field6600 = "Null";
                }
                class180.field2210 = var21.field8563 + "<col=ffffff>";
            }
            return;
        }
        if (var6 == 1012) {
            class464.field6908 = arg1;
            class289.field3991 = arg0;
            class613.field8923 = 0;
            class30.field343 = 2;
            class438.field6511++;
            class308.method2044(class485.field7099, -7434);
            class468.field6960.method1205((byte) -69, class280.field3915.method284(45, 82) ? 1 : 0);
            class468.field6960.method1235(var4 + class287.field3980, (byte) 11);
            class468.field6960.method1229(class250.field3549 + var5, arg2 ^ 0x76F2);
            class468.field6960.method1196((byte) 54, (int) (var8 >>> 32) & Integer.MAX_VALUE);
            class576.method3342(-98, var5, var4, var8);
        }
        if (var6 == 60) {
            class655 var23 = class142.field1749[var7];
            if (var23 != null) {
                class30.field343 = 2;
                class289.field3991 = arg0;
                class528.field7645++;
                class613.field8923 = 0;
                class464.field6908 = arg1;
                class308.method2044(class247.field3504, -7434);
                class468.field6960.method1229(var7, 30364);
                class468.field6960.method1205((byte) -69, class280.field3915.method284(-84, 82) ? 1 : 0);
                class242.method1612(var23.field2515[0], var23.method1153(true), true, 0, -2, var23.method1153(true), 0, (byte) 93, var23.field2524[0]);
            }
        }
        if (var6 == 16) {
            class655 var24 = class142.field1749[var7];
            if (var24 != null) {
                class93.field1097++;
                class289.field3991 = arg0;
                class464.field6908 = arg1;
                class613.field8923 = 0;
                class30.field343 = 2;
                class308.method2044(class445.field6663, arg2 ^ 0xFFFFE298);
                class468.field6960.method1229(var7, 30364);
                class468.field6960.method1231((byte) -93, class280.field3915.method284(46, 82) ? 1 : 0);
                class242.method1612(var24.field2515[0], var24.method1153(true), true, 0, -2, var24.method1153(true), 0, (byte) 106, var24.field2524[0]);
            }
        }
        if (var6 == 1010) {
            class30.field343 = 2;
            class613.field8923 = 0;
            class289.field3991 = arg0;
            class49.field528++;
            class464.field6908 = arg1;
            class308.method2044(class208.field2794, -7434);
            class468.field6960.method1229(var7, arg2 ^ 0x76F2);
        }
        if (var6 == 4) {
            class411 var25 = (class411) class42.field456.method524((byte) 89, (long) var7);
            if (var25 != null) {
                class30.field343 = 2;
                class78 var26 = var25.field6254;
                class341.field4856++;
                class464.field6908 = arg1;
                class289.field3991 = arg0;
                class613.field8923 = 0;
                class308.method2044(class264.field3745, -7434);
                class468.field6960.method1216(var7, -13119);
                class468.field6960.method1202((byte) 84, class280.field3915.method284(49, 82) ? 1 : 0);
                class242.method1612(var26.field2515[0], var26.method1153(true), true, 0, -2, var26.method1153(true), 0, (byte) 87, var26.field2524[0]);
            }
        }
        if (var6 == 21) {
            if (class315.field4597 > 0 && class280.field3915.method284(arg2 - 204, 82) && class280.field3915.method284(-71, 81)) {
                class212.method1386(class439.field6548.field1757, 32, class287.field3980 + var4, class250.field3549 - -var5);
            } else {
                class165.method957(var4, 0, var5, var7);
                if (var7 == 1) {
                    class468.field6960.method1205((byte) -69, -1);
                    class468.field6960.method1205((byte) -69, -1);
                    class468.field6960.method1229((int) class388.field5967, arg2 ^ 0x76F2);
                    class468.field6960.method1205((byte) -69, 57);
                    class468.field6960.method1205((byte) -69, class17.field173);
                    class468.field6960.method1205((byte) -69, class34.field389);
                    class468.field6960.method1205((byte) -69, 89);
                    class468.field6960.method1229(class439.field6548.field1764, 30364);
                    class468.field6960.method1229(class439.field6548.field1768, arg2 + 30254);
                    class468.field6960.method1205((byte) -69, 63);
                } else {
                    class289.field3991 = arg0;
                    class613.field8923 = 0;
                    class30.field343 = 1;
                    class464.field6908 = arg1;
                }
                class242.method1612(var4, 1, true, 0, -4, 1, 0, (byte) 80, var5);
            }
        }
        if (var6 == 1006) {
            class30.field343 = 2;
            class464.field6908 = arg1;
            class613.field8923 = 0;
            class289.field3991 = arg0;
            class411 var27 = (class411) class42.field456.method524((byte) 117, (long) var7);
            if (var27 != null) {
                class78 var28 = var27.field6254;
                class566 var29 = var28.field864;
                if (var29.field8121 != null) {
                    var29 = var29.method3287(124, class23.field243);
                }
                if (var29 != null) {
                    class276.field3855++;
                    class308.method2044(class355.field5055, -7434);
                    class468.field6960.method1229(var29.field8085, 30364);
                }
            }
        }
        if (var6 == 5) {
            class464.field6908 = arg1;
            class289.field3991 = arg0;
            class613.field8923 = 0;
            class381.field5775++;
            class30.field343 = 2;
            class308.method2044(class300.field4416, -7434);
            class468.field6960.method1235(class250.field3549 + var5, (byte) 11);
            class468.field6960.method1231((byte) -93, class280.field3915.method284(arg2 ^ 0x2E, 82) ? 1 : 0);
            class468.field6960.method1235(class287.field3980 + var4, (byte) 11);
            class468.field6960.method1196((byte) 54, Integer.MAX_VALUE & (int) (var8 >>> 32));
            class576.method3342(-64, var5, var4, var8);
        }
        if (var6 == 44) {
            class613.field8923 = 0;
            class30.field343 = 1;
            class289.field3991 = arg0;
            class159.field1961++;
            class464.field6908 = arg1;
            class308.method2044(class529.field7653, -7434);
            class468.field6960.method1235(class192.field2529, (byte) 11);
            class468.field6960.method1235(class287.field3980 + var4, (byte) 11);
            class468.field6960.method1223(true, class405.field6120);
            class468.field6960.method1235(class250.field3549 + var5, (byte) 11);
            class468.field6960.method1216(class238.field3397, arg2 - 13229);
            class242.method1612(var4, 1, true, 0, -4, 1, 0, (byte) 94, var5);
        }
        if (var6 == 51) {
            class464.field6908 = arg1;
            class289.field3991 = arg0;
            class30.field343 = 2;
            class611.field8896++;
            class613.field8923 = 0;
            class308.method2044(class509.field7403, arg2 - 7544);
            class468.field6960.method1216(class287.field3980 + var4, -13119);
            class468.field6960.method1202((byte) 84, class280.field3915.method284(-91, 82) ? 1 : 0);
            class468.field6960.method1216(class250.field3549 + var5, arg2 + -13229);
            class468.field6960.method1229(var7, arg2 ^ 0x76F2);
            class352.method2233((byte) 124, var5, var4);
        }
        if (var6 == 15) {
            class101.field1198++;
            class613.field8923 = 0;
            class289.field3991 = arg0;
            class464.field6908 = arg1;
            class30.field343 = 2;
            class308.method2044(class270.field3790, -7434);
            class468.field6960.method1196((byte) 54, class192.field2529);
            class468.field6960.method1196((byte) 54, var5 + class250.field3549);
            class468.field6960.method1235(class287.field3980 + var4, (byte) 11);
            class468.field6960.method1203(0, class405.field6120);
            class468.field6960.method1222(class280.field3915.method284(arg2 - 4, 82) ? 1 : 0, true);
            class468.field6960.method1235(class238.field3397, (byte) 11);
            class468.field6960.method1216(var7, arg2 - 13229);
            class352.method2233((byte) 95, var5, var4);
        }
        if (var6 == 17) {
            class655 var30 = class142.field1749[var7];
            if (var30 != null) {
                class613.field8923 = 0;
                class30.field343 = 2;
                class464.field6908 = arg1;
                class400.field6057++;
                class289.field3991 = arg0;
                class308.method2044(class82.field924, -7434);
                class468.field6960.method1202((byte) 84, class280.field3915.method284(73, 82) ? 1 : 0);
                class468.field6960.method1235(var7, (byte) 11);
                class242.method1612(var30.field2515[0], var30.method1153(true), true, 0, -2, var30.method1153(true), 0, (byte) 104, var30.field2524[0]);
            }
        }
        if (var6 == 30) {
            class289.field3991 = arg0;
            class613.field8923 = 0;
            class30.field343 = 2;
            class375.field5703++;
            class464.field6908 = arg1;
            class308.method2044(class564.field8045, arg2 ^ 0xFFFFE298);
            class468.field6960.method1235(class250.field3549 + var5, (byte) 11);
            class468.field6960.method1229(class287.field3980 + var4, 30364);
            class468.field6960.method1222(class280.field3915.method284(69, 82) ? 1 : 0, true);
            class468.field6960.method1235(var7, (byte) 11);
            class352.method2233((byte) 126, var5, var4);
        }
        if (var6 == 50 || var6 == 1003) {
            class471.method2887(var5, arg3.field9107, var7, var4, (byte) 125);
        }
        if (var6 == 57) {
            class411 var31 = (class411) class42.field456.method524((byte) 110, (long) var7);
            if (var31 != null) {
                class30.field343 = 2;
                class613.field8923 = 0;
                class289.field3991 = arg0;
                class380.field5766++;
                class464.field6908 = arg1;
                class78 var32 = var31.field6254;
                class308.method2044(class501.field7288, -7434);
                class468.field6960.method1216(var7, arg2 - 13229);
                class468.field6960.method1231((byte) -93, class280.field3915.method284(-106, 82) ? 1 : 0);
                class242.method1612(var32.field2515[0], var32.method1153(true), true, 0, -2, var32.method1153(true), 0, (byte) 109, var32.field2524[0]);
            }
        }
        if (var6 == 45) {
            class613.field8923 = 0;
            class464.field6908 = arg1;
            class30.field343 = 2;
            class289.field3991 = arg0;
            class67.field742++;
            class308.method2044(class197.field2658, -7434);
            class468.field6960.method1235(class192.field2529, (byte) 11);
            class468.field6960.method1223(true, class405.field6120);
            class468.field6960.method1205((byte) -69, class280.field3915.method284(-71, 82) ? 1 : 0);
            class468.field6960.method1229(class439.field6548.field2495, 30364);
            class468.field6960.method1216(class238.field3397, -13119);
        }
        if (var6 == 23) {
            if (class315.field4597 > 0 && class280.field3915.method284(34, 82) && class280.field3915.method284(arg2 - 51, 81)) {
                class212.method1386(class439.field6548.field1757, 49, class287.field3980 + var4, class250.field3549 + var5);
            } else {
                class291.field4033++;
                class30.field343 = 1;
                class289.field3991 = arg0;
                class613.field8923 = 0;
                class464.field6908 = arg1;
                class308.method2044(class86.field971, arg2 - 7544);
                class468.field6960.method1229(class287.field3980 + var4, 30364);
                class468.field6960.method1196((byte) 54, class250.field3549 + var5);
            }
        }
        if (var6 == 10) {
            class613.field8923 = 0;
            class30.field343 = 2;
            class289.field3991 = arg0;
            class464.field6908 = arg1;
            class411.field6252++;
            class308.method2044(class600.field8760, arg2 - 7544);
            class468.field6960.method1231((byte) -93, class280.field3915.method284(arg2 - 207, 82) ? 1 : 0);
            class468.field6960.method1216(var5 + class250.field3549, -13119);
            class468.field6960.method1216(var4 + class287.field3980, -13119);
            class468.field6960.method1229(Integer.MAX_VALUE & (int) (var8 >>> 32), arg2 + 30254);
            class576.method3342(arg2 - 115, var5, var4, var8);
        }
        if (var6 == 8) {
            class655 var33 = class142.field1749[var7];
            if (var33 != null) {
                class464.field6908 = arg1;
                class30.field343 = 2;
                client.field3603++;
                class613.field8923 = 0;
                class289.field3991 = arg0;
                class308.method2044(class535.field7736, -7434);
                class468.field6960.method1235(var7, (byte) 11);
                class468.field6960.method1222(class280.field3915.method284(104, 82) ? 1 : 0, true);
                class242.method1612(var33.field2515[0], var33.method1153(true), true, 0, -2, var33.method1153(true), 0, (byte) 86, var33.field2524[0]);
            }
        }
        if (var6 == 58 && class636.field9141 == null) {
            class452.method2793((byte) -52, var5, var4);
            class636.field9141 = class322.method2103(var4, false, var5);
            class33.method187(class636.field9141, (byte) -93);
        }
        if (var6 == 25) {
            class655 var34 = class142.field1749[var7];
            if (var34 != null) {
                class289.field3991 = arg0;
                class510.field7465++;
                class30.field343 = 2;
                class613.field8923 = 0;
                class464.field6908 = arg1;
                class308.method2044(class70.field750, -7434);
                class468.field6960.method1216(var7, -13119);
                class468.field6960.method1202((byte) 84, class280.field3915.method284(arg2 ^ 0x1E, 82) ? 1 : 0);
                class242.method1612(var34.field2515[0], var34.method1153(true), true, 0, -2, var34.method1153(true), 0, (byte) 73, var34.field2524[0]);
            }
        }
        if (var6 == 1008) {
            class613.field8923 = 0;
            class289.field3991 = arg0;
            class535.field7722++;
            class464.field6908 = arg1;
            class30.field343 = 2;
            class308.method2044(class59.field671, -7434);
            class468.field6960.method1229(var7, 30364);
        }
        if (var6 == 18) {
            class411 var35 = (class411) class42.field456.method524((byte) 84, (long) var7);
            if (var35 != null) {
                class289.field3991 = arg0;
                class78 var36 = var35.field6254;
                class613.field8923 = 0;
                class612.field8903++;
                class464.field6908 = arg1;
                class30.field343 = 2;
                class308.method2044(class560.field7966, -7434);
                class468.field6960.method1231((byte) -93, class280.field3915.method284(-97, 82) ? 1 : 0);
                class468.field6960.method1235(var7, (byte) 11);
                class242.method1612(var36.field2515[0], var36.method1153(true), true, 0, -2, var36.method1153(true), 0, (byte) 99, var36.field2524[0]);
            }
        }
        if (class169.field2063) {
            class650.method3713(true);
        }
        if (class561.field8013 != null && class647.field9370 == 0) {
            class33.method187(class561.field8013, (byte) -91);
        }
    }
}
