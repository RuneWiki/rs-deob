import java.awt.Rectangle;
import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nda")
public class class476 implements Runnable {

    @OriginalMember(owner = "client!nda", name = "c", descriptor = "I")
    private int field6685 = 0;

    @OriginalMember(owner = "client!nda", name = "l", descriptor = "I")
    private int field6694 = 0;

    @OriginalMember(owner = "client!nda", name = "b", descriptor = "I")
    private int field6684;

    @OriginalMember(owner = "client!nda", name = "e", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field6687;

    @OriginalMember(owner = "client!nda", name = "f", descriptor = "[B")
    private byte[] field6688;

    @OriginalMember(owner = "client!nda", name = "j", descriptor = "Ljava/lang/Thread;")
    private Thread field6692;

    @OriginalMember(owner = "client!nda", name = "g", descriptor = "[I")
    public static int[] field6689 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!nda", name = "o", descriptor = "Lbk;")
    public static class314 field6697;

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "I")
    public static int field6683;

    @OriginalMember(owner = "client!nda", name = "d", descriptor = "I")
    public static int field6686;

    @OriginalMember(owner = "client!nda", name = "h", descriptor = "I")
    public static int field6690;

    @OriginalMember(owner = "client!nda", name = "m", descriptor = "I")
    public static int field6695;

    @OriginalMember(owner = "client!nda", name = "n", descriptor = "I")
    public static int field6696;

    @OriginalMember(owner = "client!nda", name = "p", descriptor = "I")
    public static int field6698;

    @OriginalMember(owner = "client!nda", name = "i", descriptor = "Ljava/io/IOException;")
    private IOException field6691;

    @OriginalMember(owner = "client!nda", name = "k", descriptor = "Ljava/lang/Object;")
    public static Object field6693;

    static {
        new class180("You are not allowed to join this user's clan channel.", "Du darfst den Chatraum dieses Benutzers nicht betreten.", "Vous n'êtes pas autorisé à rejoindre le canal de clan de cet utilisateur.", "Você não tem permissão para entrar no canal de clã desse usuário.");
        field6697 = new class314();
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(ILjj;II)V", line = 7)
    public static final void method2776(int arg0, class99 arg1, int arg2, int arg3) {
        field6686++;
        if (arg1 == null || class89.field1096.field2331 == arg1) {
            return;
        }
        int var4 = arg1.field1222;
        int var5 = arg1.field1237;
        int var6 = arg1.field1227;
        int var7 = (int) arg1.field1235;
        if (var6 >= 2000) {
            var6 -= 2000;
        }
        long var8 = arg1.field1235;
        if (var6 == 25) {
            class415 var10 = (class415) class309.field3938.method2645((long) var7, (byte) -113);
            if (var10 != null) {
                class148.field1775 = arg2;
                class281.field3689 = 0;
                class128.field1583 = 2;
                class459 var11 = var10.field5390;
                class448.field6213 = arg0;
                class439.field6078++;
                class418.method2378(17984, class106.field1297);
                class136.field1663.method2148(class110.field1361, 29780);
                class136.field1663.method2148(var7, 29780);
                class136.field1663.method2148(class592.field8606, 29780);
                class136.field1663.method2142(false, class443.field6109.method185(53, 82) ? 1 : 0);
                class136.field1663.method2130(0, class588.field8538);
                class546.method3204(0, true, 0, var11.method2694(28146), var11.field6483[0], var11.field6491[0], var11.method2694(28146), -2, true);
            }
        }
        if (var6 == 30 && class478.field6711 == null) {
            class447.method2619(var4, var5, 45);
            class478.field6711 = class369.method2071(var5, var4, arg3 - 48599);
            class87.method508(127, class478.field6711);
        }
        if (var6 == 15) {
            class148.field1775 = arg2;
            class622.field8965++;
            class448.field6213 = arg0;
            class128.field1583 = 1;
            class281.field3689 = 0;
            class418.method2378(17984, class237.field2901);
            class136.field1663.method2148(class110.field1361, arg3 + 1371);
            class136.field1663.method2148(class632.field9113 + var4, arg3 + 1371);
            class136.field1663.method2101(false, class119.field1504 + var5);
            class136.field1663.method2148(class592.field8606, 29780);
            class136.field1663.method2130(0, class588.field8538);
            class546.method3204(0, true, 0, 1, var4, var5, 1, -4, true);
        }
        if (var6 == 50) {
            class545 var12 = class459.field6329[var7];
            if (var12 != null) {
                class200.field2402++;
                class281.field3689 = 0;
                class128.field1583 = 2;
                class448.field6213 = arg0;
                class148.field1775 = arg2;
                class418.method2378(arg3 ^ 0x28B9, class565.field8296);
                class136.field1663.method2115(var7, 3324);
                class136.field1663.method2093(class443.field6109.method185(53, 82) ? 1 : 0, -114);
                class546.method3204(0, true, 0, var12.method2694(28146), var12.field6483[0], var12.field6491[0], var12.method2694(28146), -2, true);
            }
        }
        if (var6 == 46) {
            class281.field3689 = 0;
            class448.field6213 = arg0;
            class11.field84++;
            class128.field1583 = 2;
            class148.field1775 = arg2;
            class418.method2378(arg3 - 10425, class180.field2164);
            class136.field1663.method2088(class119.field1504 + var5, arg3 + -28488);
            class136.field1663.method2115(class632.field9113 + var4, 3324);
            class136.field1663.method2093(class443.field6109.method185(53, 82) ? 1 : 0, -121);
            class136.field1663.method2115(var7, 3324);
            class584.method3395(var4, var5, 0);
        }
        if (var6 == 45) {
            class415 var13 = (class415) class309.field3938.method2645((long) var7, (byte) -87);
            if (var13 != null) {
                class148.field1775 = arg2;
                class128.field1583 = 2;
                class459 var14 = var13.field5390;
                class448.field6213 = arg0;
                class281.field3689 = 0;
                class485.field6780++;
                class418.method2378(arg3 - 10425, class598.field8666);
                class136.field1663.method2142(false, class443.field6109.method185(53, 82) ? 1 : 0);
                class136.field1663.method2115(var7, arg3 ^ 0x6205);
                class546.method3204(0, true, 0, var14.method2694(28146), var14.field6483[0], var14.field6491[0], var14.method2694(arg3 ^ 0x30B), -2, true);
            }
        }
        if (var6 == 4) {
            class545 var15 = class459.field6329[var7];
            if (var15 != null) {
                class192.field2311++;
                class148.field1775 = arg2;
                class281.field3689 = 0;
                class128.field1583 = 2;
                class448.field6213 = arg0;
                class418.method2378(17984, class437.field5990);
                class136.field1663.method2126(arg3 - 28534, class443.field6109.method185(53, 82) ? 1 : 0);
                class136.field1663.method2115(var7, arg3 - 25085);
                class546.method3204(0, true, 0, var15.method2694(28146), var15.field6483[0], var15.field6491[0], var15.method2694(arg3 ^ 0x30B), -2, true);
            }
        }
        if (var6 == 1002) {
            class266.field3460++;
            class128.field1583 = 2;
            class281.field3689 = 0;
            class448.field6213 = arg0;
            class148.field1775 = arg2;
            class418.method2378(arg3 ^ 0x28B9, class564.field8290);
            class136.field1663.method2115((int) (var8 >>> 32) & Integer.MAX_VALUE, 3324);
            class136.field1663.method2088(class632.field9113 + var4, 106);
            class136.field1663.method2101(false, class119.field1504 + var5);
            class136.field1663.method2126(-124, class443.field6109.method185(53, 82) ? 1 : 0);
            class542.method3165(var5, var8, (byte) 37, var4);
        }
        if (arg3 != 28409) {
            method2778(false);
        }
        if (var6 == 23) {
            class415 var16 = (class415) class309.field3938.method2645((long) var7, (byte) -79);
            if (var16 != null) {
                class459 var17 = var16.field5390;
                class148.field1775 = arg2;
                class448.field6213 = arg0;
                class415.field5387++;
                class281.field3689 = 0;
                class128.field1583 = 2;
                class418.method2378(17984, class543.field7946);
                class136.field1663.method2115(var7, 3324);
                class136.field1663.method2126(-121, class443.field6109.method185(53, 82) ? 1 : 0);
                class546.method3204(0, true, 0, var17.method2694(28146), var17.field6483[0], var17.field6491[0], var17.method2694(arg3 ^ 0x30B), -2, true);
            }
        }
        if (var6 == 58) {
            class281.field3689 = 0;
            client.field3208++;
            class148.field1775 = arg2;
            class448.field6213 = arg0;
            class128.field1583 = 2;
            class418.method2378(17984, class516.field7278);
            class136.field1663.method2111((byte) -48, class588.field8538);
            class136.field1663.method2101(false, class103.field1265.field6399);
            class136.field1663.method2116(8, class443.field6109.method185(53, 82) ? 1 : 0);
            class136.field1663.method2101(false, class592.field8606);
            class136.field1663.method2148(class110.field1361, 29780);
        }
        if (var6 == 51) {
            if (class633.field9120 > 0 && class443.field6109.method185(53, 82) && class443.field6109.method185(arg3 ^ 0x6ECC, 81)) {
                class438.method2569(class632.field9113 + var4, true, class103.field1265.field8660, class119.field1504 + var5);
            } else {
                class644.field9385++;
                class148.field1775 = arg2;
                class448.field6213 = arg0;
                class128.field1583 = 1;
                class281.field3689 = 0;
                class418.method2378(17984, class422.field5450);
                class136.field1663.method2088(class119.field1504 + var5, 102);
                class136.field1663.method2148(class632.field9113 + var4, 29780);
            }
        }
        if (var6 == 1010) {
            class448.field6213 = arg0;
            class486.field6797++;
            class128.field1583 = 2;
            class148.field1775 = arg2;
            class281.field3689 = 0;
            class418.method2378(17984, class607.field8826);
            class136.field1663.method2115(var7, 3324);
        }
        if (var6 == 44) {
            class281.field3689 = 0;
            class148.field1775 = arg2;
            class448.field6213 = arg0;
            class128.field1583 = 2;
            class9.field69++;
            class418.method2378(arg3 - 10425, class521.field7313);
            class136.field1663.method2115(class632.field9113 + var4, 3324);
            class136.field1663.method2142(false, class443.field6109.method185(53, 82) ? 1 : 0);
            class136.field1663.method2148(class592.field8606, 29780);
            class136.field1663.method2148(Integer.MAX_VALUE & (int) (var8 >>> 32), 29780);
            class136.field1663.method2115(class119.field1504 + var5, arg3 + -25085);
            class136.field1663.method2108(class588.field8538, -72);
            class136.field1663.method2088(class110.field1361, arg3 - 28518);
            class542.method3165(var5, var8, (byte) 37, var4);
        }
        if (var6 == 10) {
            class545 var18 = class459.field6329[var7];
            if (var18 != null) {
                class148.field1775 = arg2;
                class128.field1583 = 2;
                class281.field3689 = 0;
                client.field3208++;
                class448.field6213 = arg0;
                class418.method2378(17984, class516.field7278);
                class136.field1663.method2111((byte) -58, class588.field8538);
                class136.field1663.method2101(false, var7);
                class136.field1663.method2116(arg3 ^ 0x6EF1, class443.field6109.method185(53, 82) ? 1 : 0);
                class136.field1663.method2101(false, class592.field8606);
                class136.field1663.method2148(class110.field1361, 29780);
                class546.method3204(0, true, 0, var18.method2694(28146), var18.field6483[0], var18.field6491[0], var18.method2694(28146), -2, true);
            }
        }
        if (var6 == 5) {
            class29.field199++;
            class128.field1583 = 2;
            class148.field1775 = arg2;
            class281.field3689 = 0;
            class448.field6213 = arg0;
            class418.method2378(arg3 ^ 0x28B9, class316.field4029);
            class136.field1663.method2088(var7, -88);
            class136.field1663.method2148(var4 + class632.field9113, arg3 + 1371);
            class136.field1663.method2101(false, class119.field1504 + var5);
            class136.field1663.method2126(-107, class443.field6109.method185(53, 82) ? 1 : 0);
            class584.method3395(var4, var5, 0);
        }
        if (var6 == 47) {
            class509 var19 = class369.method2071(var5, var4, -20190);
            if (var19 != null) {
                class281.method1595(25098);
                class268 var20 = client.method1412(var19);
                class406.method2314(var20.method1499(0), 55, var20.field3500, var19);
                class208.field2503 = class210.method1208(var19, (byte) 42);
                class472.field6608 = var19.field7184 + "<col=ffffff>";
                if (class208.field2503 == null) {
                    class208.field2503 = "Null";
                }
            }
            return;
        }
        if (var6 == 22) {
            class128.field1583 = 2;
            class529.field7401++;
            class281.field3689 = 0;
            class148.field1775 = arg2;
            class448.field6213 = arg0;
            class418.method2378(17984, class551.field8119);
            class136.field1663.method2126(-95, class443.field6109.method185(53, 82) ? 1 : 0);
            class136.field1663.method2148(class119.field1504 + var5, 29780);
            class136.field1663.method2148(var7, 29780);
            class136.field1663.method2101(false, var4 + class632.field9113);
            class584.method3395(var4, var5, 0);
        }
        if (var6 == 21) {
            class415 var21 = (class415) class309.field3938.method2645((long) var7, (byte) -107);
            if (var21 != null) {
                class459 var22 = var21.field5390;
                class148.field1775 = arg2;
                class257.field3299++;
                class128.field1583 = 2;
                class448.field6213 = arg0;
                class281.field3689 = 0;
                class418.method2378(17984, class588.field8532);
                class136.field1663.method2088(var7, arg3 - 28333);
                class136.field1663.method2126(-111, class443.field6109.method185(arg3 ^ 0x6ECC, 82) ? 1 : 0);
                class546.method3204(0, true, 0, var22.method2694(arg3 ^ 0x30B), var22.field6483[0], var22.field6491[0], var22.method2694(28146), -2, true);
            }
        }
        if (var6 == 2) {
            class281.field3689 = 0;
            class448.field6213 = arg0;
            class128.field1583 = 2;
            class148.field1775 = arg2;
            class549.field8064++;
            class418.method2378(arg3 - 10425, class356.field4661);
            class136.field1663.method2101(false, class632.field9113 + var4);
            class136.field1663.method2101(false, (int) (var8 >>> 32) & Integer.MAX_VALUE);
            class136.field1663.method2148(class119.field1504 + var5, 29780);
            class136.field1663.method2126(arg3 - 28526, class443.field6109.method185(53, 82) ? 1 : 0);
            class542.method3165(var5, var8, (byte) 37, var4);
        }
        if (var6 == 20 || var6 == 1009) {
            class543.method3180(var7, arg1.field1229, var5, var4, true);
        }
        if (var6 == 9) {
            class545 var23 = class459.field6329[var7];
            if (var23 != null) {
                class281.field3689 = 0;
                class448.field6213 = arg0;
                class128.field1583 = 2;
                class148.field1775 = arg2;
                class609.field8850++;
                class418.method2378(17984, class37.field288);
                class136.field1663.method2088(var7, 79);
                class136.field1663.method2126(-112, class443.field6109.method185(53, 82) ? 1 : 0);
                class546.method3204(0, true, 0, var23.method2694(28146), var23.field6483[0], var23.field6491[0], var23.method2694(arg3 ^ 0x30B), -2, true);
            }
        }
        if (var6 == 12) {
            class448.field6213 = arg0;
            class148.field1775 = arg2;
            class128.field1583 = 2;
            class281.field3689 = 0;
            class360.field4742++;
            class418.method2378(17984, class160.field1940);
            class136.field1663.method2142(false, class443.field6109.method185(arg3 ^ 0x6ECC, 82) ? 1 : 0);
            class136.field1663.method2101(false, var5 + class119.field1504);
            class136.field1663.method2088(var7, 79);
            class136.field1663.method2148(class632.field9113 + var4, 29780);
            class584.method3395(var4, var5, 0);
        }
        if (var6 == 60) {
            class545 var24 = class459.field6329[var7];
            if (var24 != null) {
                class148.field1775 = arg2;
                class480.field6740++;
                class128.field1583 = 2;
                class281.field3689 = 0;
                class448.field6213 = arg0;
                class418.method2378(17984, class62.field612);
                class136.field1663.method2115(var7, arg3 - 25085);
                class136.field1663.method2093(class443.field6109.method185(53, 82) ? 1 : 0, -112);
                class546.method3204(0, true, 0, var24.method2694(28146), var24.field6483[0], var24.field6491[0], var24.method2694(28146), -2, true);
            }
        }
        if (var6 == 8) {
            class281.field3689 = 0;
            class448.field6213 = arg0;
            class128.field1583 = 2;
            class314.field4003++;
            class148.field1775 = arg2;
            class418.method2378(17984, class55.field465);
            class136.field1663.method2093(class443.field6109.method185(53, 82) ? 1 : 0, arg3 - 28526);
            class136.field1663.method2101(false, Integer.MAX_VALUE & (int) (var8 >>> 32));
            class136.field1663.method2115(class119.field1504 + var5, 3324);
            class136.field1663.method2115(class632.field9113 + var4, 3324);
            class542.method3165(var5, var8, (byte) 37, var4);
        }
        if (var6 == 1011) {
            class148.field1775 = arg2;
            class448.field6213 = arg0;
            class281.field3689 = 0;
            class128.field1583 = 2;
            class532.field7481++;
            class418.method2378(17984, class75.field875);
            class136.field1663.method2115(var7, 3324);
        }
        if (var6 == 49) {
            class545 var25 = class459.field6329[var7];
            if (var25 != null) {
                class128.field1583 = 2;
                class148.field1775 = arg2;
                class281.field3689 = 0;
                class448.field6213 = arg0;
                class389.field5141++;
                class418.method2378(17984, class597.field8646);
                class136.field1663.method2088(var7, arg3 ^ 0xFFFF9173);
                class136.field1663.method2126(-97, class443.field6109.method185(arg3 ^ 0x6ECC, 82) ? 1 : 0);
                class546.method3204(0, true, 0, var25.method2694(28146), var25.field6483[0], var25.field6491[0], var25.method2694(28146), -2, true);
            }
        }
        if (var6 == 16) {
            class148.field1775 = arg2;
            class128.field1583 = 2;
            class569.field8365++;
            class448.field6213 = arg0;
            class281.field3689 = 0;
            class418.method2378(17984, class258.field3323);
            class136.field1663.method2088(class110.field1361, 54);
            class136.field1663.method2088(var7, 48);
            class136.field1663.method2088(class592.field8606, 92);
            class136.field1663.method2088(class119.field1504 + var5, arg3 ^ 0xFFFF9169);
            class136.field1663.method2101(false, class632.field9113 + var4);
            class136.field1663.method2131(class588.field8538, -1495157560);
            class136.field1663.method2093(class443.field6109.method185(53, 82) ? 1 : 0, -101);
            class584.method3395(var4, var5, 0);
        }
        if (var6 == 17) {
            class415 var26 = (class415) class309.field3938.method2645((long) var7, (byte) -79);
            if (var26 != null) {
                class609.field8849++;
                class128.field1583 = 2;
                class281.field3689 = 0;
                class448.field6213 = arg0;
                class459 var27 = var26.field5390;
                class148.field1775 = arg2;
                class418.method2378(17984, class428.field5563);
                class136.field1663.method2088(var7, 89);
                class136.field1663.method2116(8, class443.field6109.method185(53, 82) ? 1 : 0);
                class546.method3204(0, true, 0, var27.method2694(28146), var27.field6483[0], var27.field6491[0], var27.method2694(arg3 - 263), -2, true);
            }
        }
        if (var6 == 6) {
            class128.field1583 = 2;
            class594.field8625++;
            class281.field3689 = 0;
            class448.field6213 = arg0;
            class148.field1775 = arg2;
            class418.method2378(17984, class36.field281);
            class136.field1663.method2093(class443.field6109.method185(53, 82) ? 1 : 0, -101);
            class136.field1663.method2088(var7, 67);
            class136.field1663.method2148(var4 + class632.field9113, 29780);
            class136.field1663.method2101(false, class119.field1504 + var5);
            class584.method3395(var4, var5, 0);
        }
        if (var6 == 3) {
            class545 var28 = class459.field6329[var7];
            if (var28 != null) {
                class281.field3689 = 0;
                class148.field1775 = arg2;
                class128.field1583 = 2;
                class180.field2161++;
                class448.field6213 = arg0;
                class418.method2378(17984, class170.field2069);
                class136.field1663.method2093(class443.field6109.method185(53, 82) ? 1 : 0, -105);
                class136.field1663.method2101(false, var7);
                class546.method3204(0, true, 0, var28.method2694(28146), var28.field6483[0], var28.field6491[0], var28.method2694(28146), -2, true);
            }
        }
        if (var6 == 59) {
            class415 var29 = (class415) class309.field3938.method2645((long) var7, (byte) -110);
            if (var29 != null) {
                class281.field3689 = 0;
                class459 var30 = var29.field5390;
                class128.field1583 = 2;
                class389.field5140++;
                class448.field6213 = arg0;
                class148.field1775 = arg2;
                class418.method2378(arg3 - 10425, class493.field6873);
                class136.field1663.method2088(var7, 106);
                class136.field1663.method2142(false, class443.field6109.method185(53, 82) ? 1 : 0);
                class546.method3204(0, true, 0, var30.method2694(28146), var30.field6483[0], var30.field6491[0], var30.method2694(arg3 - 263), -2, true);
            }
        }
        if (var6 == 1012) {
            class448.field6213 = arg0;
            class128.field1583 = 2;
            class281.field3689 = 0;
            class148.field1775 = arg2;
            class415 var31 = (class415) class309.field3938.method2645((long) var7, (byte) -96);
            if (var31 != null) {
                class459 var32 = var31.field5390;
                class74 var33 = var32.field6334;
                if (var33.field800 != null) {
                    var33 = var33.method420(class281.field3700, 104);
                }
                if (var33 != null) {
                    class43.field343++;
                    class418.method2378(17984, class382.field5053);
                    class136.field1663.method2115(var33.field816, 3324);
                }
            }
        }
        if (var6 == 48) {
            class509 var34 = class369.method2071(var5, var4, -20190);
            if (var34 != null) {
                class354.method1990((byte) 4, var34);
            }
        }
        if (var6 == 13) {
            class545 var35 = class459.field6329[var7];
            if (var35 != null) {
                class75.field877++;
                class448.field6213 = arg0;
                class281.field3689 = 0;
                class128.field1583 = 2;
                class148.field1775 = arg2;
                class418.method2378(17984, class537.field7714);
                class136.field1663.method2101(false, var7);
                class136.field1663.method2116(8, class443.field6109.method185(53, 82) ? 1 : 0);
                class546.method3204(0, true, 0, var35.method2694(28146), var35.field6483[0], var35.field6491[0], var35.method2694(arg3 - 263), -2, true);
            }
        }
        if (var6 == 1003 || var6 == 1006 || var6 == 1004 || var6 == 1001 || var6 == 1007) {
            class272.method1524(var4, var7, var6, -1002);
        }
        if (var6 == 19) {
            class148.field1775 = arg2;
            class281.field3689 = 0;
            class448.field6213 = arg0;
            class128.field1583 = 2;
            class418.field5433++;
            class418.method2378(17984, class62.field621);
            class136.field1663.method2101(false, class119.field1504 + var5);
            class136.field1663.method2126(arg3 ^ 0xFFFF917F, class443.field6109.method185(arg3 - 28356, 82) ? 1 : 0);
            class136.field1663.method2115(class632.field9113 + var4, 3324);
            class136.field1663.method2101(false, (int) (var8 >>> 32) & Integer.MAX_VALUE);
            class542.method3165(var5, var8, (byte) 37, var4);
        }
        if (var6 == 57) {
            class394.field5198++;
            class128.field1583 = 2;
            class148.field1775 = arg2;
            class448.field6213 = arg0;
            class281.field3689 = 0;
            class418.method2378(17984, class427.field5502);
            class136.field1663.method2088((int) (var8 >>> 32) & Integer.MAX_VALUE, -87);
            class136.field1663.method2088(class632.field9113 + var4, -121);
            class136.field1663.method2093(class443.field6109.method185(53, 82) ? 1 : 0, -102);
            class136.field1663.method2148(class119.field1504 + var5, 29780);
            class542.method3165(var5, var8, (byte) 37, var4);
        }
        if (var6 == 18) {
            class545 var36 = class459.field6329[var7];
            if (var36 != null) {
                class448.field6213 = arg0;
                class148.field1775 = arg2;
                class281.field3689 = 0;
                class128.field1583 = 2;
                class15.field121++;
                class418.method2378(17984, class469.field6561);
                class136.field1663.method2142(false, class443.field6109.method185(arg3 ^ 0x6ECC, 82) ? 1 : 0);
                class136.field1663.method2088(var7, -104);
                class546.method3204(0, true, 0, var36.method2694(28146), var36.field6483[0], var36.field6491[0], var36.method2694(28146), -2, true);
            }
        }
        if (var6 == 11) {
            if (class633.field9120 > 0 && class443.field6109.method185(53, 82) && class443.field6109.method185(53, 81)) {
                class438.method2569(class632.field9113 + var4, true, class103.field1265.field8660, class119.field1504 + var5);
            } else {
                class646.method3728(arg3 - 28310, var4, var7, var5);
                if (var7 == 1) {
                    class136.field1663.method2093(-1, -125);
                    class136.field1663.method2093(-1, -124);
                    class136.field1663.method2115((int) class558.field8223, arg3 - 25085);
                    class136.field1663.method2093(57, -123);
                    class136.field1663.method2093(class335.field4369, -116);
                    class136.field1663.method2093(class194.field2354, -127);
                    class136.field1663.method2093(89, -101);
                    class136.field1663.method2115(class103.field1265.field8661, 3324);
                    class136.field1663.method2115(class103.field1265.field8652, 3324);
                    class136.field1663.method2093(63, -116);
                } else {
                    class281.field3689 = 0;
                    class128.field1583 = 1;
                    class148.field1775 = arg2;
                    class448.field6213 = arg0;
                }
                class546.method3204(0, true, 0, 1, var4, var5, 1, -4, true);
            }
        }
        if (class449.field6225) {
            class281.method1595(arg3 - 3311);
        }
        if (class106.field1292 != null && class33.field258 == 0) {
            class87.method508(124, class106.field1292);
        }
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(IIB[B)V", line = 735)
    public final void method2777(int arg0, int arg1, byte arg2, byte[] arg3) throws IOException {
        field6683++;
        if (arg1 < 0 || arg0 < 0 || arg3.length < (arg0 + arg1)) {
            throw new IndexOutOfBoundsException();
        }
        synchronized (this) {
            if (this.field6691 != null) {
                throw new IOException(this.field6691.toString());
            }
            int var6 = -109 / (arg2 / 62);
            int var7;
            if (this.field6685 > this.field6694) {
                var7 = this.field6685 - this.field6694 - 1;
            } else {
                var7 = this.field6685 + this.field6684 - this.field6694 - 1;
            }
            if (var7 < arg1) {
                throw new IOException("");
            }
            if ((this.field6694 + arg1) > this.field6684) {
                int var8 = this.field6684 - this.field6694;
                class345.method1932(arg3, arg0, this.field6688, this.field6694, var8);
                class345.method1932(arg3, arg0 + var8, this.field6688, 0, arg1 - var8);
            } else {
                class345.method1932(arg3, arg0, this.field6688, this.field6694, arg1);
            }
            this.field6694 = (this.field6694 + arg1) % this.field6684;
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(Z)Z", line = 780)
    public static final boolean method2778(boolean arg0) {
        for (int var1 = class76.field881; var1 < client.field3216; var1++) {
            class349[][] var2 = class383.field5070[var1];
            for (int var3 = -class244.field3140; var3 <= 0; var3++) {
                int var4 = class144.field1735 + var3;
                int var5 = class144.field1735 - var3;
                if (var4 >= class391.field5184 || var5 < class341.field4393) {
                    for (int var6 = -class244.field3140; var6 <= 0; var6++) {
                        int var7 = class222.field2728 + var6;
                        int var8 = class222.field2728 - var6;
                        if (var4 >= class391.field5184) {
                            if (var7 >= class325.field4157) {
                                class349 var9 = var2[var4][var7];
                                if (var9 != null && var9.field4505) {
                                    class425.field5480 = arg0;
                                    class367.field4820.method1327(var9, true);
                                    class367.field4820.method1323((byte) 109);
                                }
                            }
                            if (var8 < class163.field1995) {
                                class349 var10 = var2[var4][var8];
                                if (var10 != null && var10.field4505) {
                                    class425.field5480 = arg0;
                                    class367.field4820.method1327(var10, true);
                                    class367.field4820.method1323((byte) 112);
                                }
                            }
                        }
                        if (var5 < class341.field4393) {
                            if (var7 >= class325.field4157) {
                                class349 var11 = var2[var5][var7];
                                if (var11 != null && var11.field4505) {
                                    class425.field5480 = arg0;
                                    class367.field4820.method1327(var11, true);
                                    class367.field4820.method1323((byte) 107);
                                }
                            }
                            if (var8 < class163.field1995) {
                                class349 var12 = var2[var5][var8];
                                if (var12 != null && var12.field4505) {
                                    class425.field5480 = arg0;
                                    class367.field4820.method1327(var12, true);
                                    class367.field4820.method1323((byte) 111);
                                }
                            }
                        }
                        if (class595.field8631 == 0) {
                            if (class562.field8273) {
                                class367.field4820.method1333(18936, 24);
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(B)V", line = 888)
    public final void method2779(byte arg0) {
        int var2 = -19 % ((-arg0 - 29) / 42);
        this.field6687 = new class37();
        field6695++;
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(BIIII)V", line = 899)
    public static final void method2780(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var5 = 0; var5 < class315.field4023; var5++) {
            Rectangle var7 = class250.field3224[var5];
            if (arg3 < (var7.x + var7.width) && arg2 + arg3 > var7.x && arg4 < (var7.y + var7.height) && var7.y < (arg1 + arg4)) {
                class468.field6543[var5] = true;
            }
        }
        int var6 = 62 % ((arg0 - 44) / 63);
        field6690++;
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(I)V", line = 922)
    public final void method2781(int arg0) {
        synchronized (this) {
            if (this.field6691 == null) {
                this.field6691 = new IOException("");
            }
            this.notifyAll();
        }
        field6698++;
        try {
            int var3 = 122 / ((-arg0 - 69) / 57);
            this.field6692.join();
        } catch (InterruptedException var4) {
        }
    }

    @OriginalMember(owner = "client!nda", name = "run", descriptor = "()V", line = 943)
    public final void run() {
        field6696++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field6691 != null) {
                        return;
                    }
                    if (this.field6694 >= this.field6685) {
                        var2 = this.field6694 - this.field6685;
                    } else {
                        var2 = this.field6684 + this.field6694 - this.field6685;
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var12) {
                    }
                }
            }
            try {
                if (this.field6685 + var2 > this.field6684) {
                    int var3 = this.field6684 - this.field6685;
                    this.field6687.write(this.field6688, this.field6685, var3);
                    this.field6687.write(this.field6688, 0, var2 - var3);
                } else {
                    this.field6687.write(this.field6688, this.field6685, var2);
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field6691 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field6685 = (this.field6685 + var2) % this.field6684;
            }
        }
    }

    @OriginalMember(owner = "client!nda", name = "b", descriptor = "(B)V", line = 1004)
    public static void method2782(byte arg0) {
        if (arg0 == 80) {
            field6697 = null;
            field6693 = null;
            field6689 = null;
        }
    }

    @OriginalMember(owner = "client!nda", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V", line = 1036)
    public class476(OutputStream arg0, int arg1) {
        this.field6684 = arg1 + 1;
        this.field6687 = arg0;
        this.field6688 = new byte[this.field6684];
        this.field6692 = new Thread(this);
        this.field6692.setDaemon(true);
        this.field6692.start();
    }
}
