import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class176 {

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "I")
    public int field3089 = 0;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "Lpj;")
    private static class237 field3080 = class33.method353("Please remove ", 118);

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "I")
    public static int field3083 = 0;

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "Lpj;")
    public static class237 field3082 = class33.method353("Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100", 126);

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "Lpj;")
    public static class237 field3085 = field3080;

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "Lpj;")
    public static class237 field3081 = field3080;

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "I")
    public static int field3084;

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "I")
    public static int field3086;

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "I")
    public static int field3087;

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "I")
    public static int field3088;

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "I")
    public static int field3090;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(II)I")
    public static final int method1214(int arg0, int arg1) {
        if (arg1 != 27112) {
            method1217(false);
        }
        field3086++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILie;)V")
    public final void method1215(int arg0, class32 arg1) {
        field3090++;
        if (arg0 < 69) {
            method1217(true);
        }
        while (true) {
            int var3 = arg1.method316((byte) 116);
            if (var3 == 0) {
                return;
            }
            this.method1218(var3, 0, arg1);
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IBIII)V")
    public static final void method1216(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        int var5 = 0;
        field3087++;
        if (arg1 > -120) {
            field3081 = null;
        }
        int var6 = arg4;
        int var7 = -arg4;
        int var8 = -1;
        int var9 = class91.method689(arg3 + arg4, class89.field1637, class94.field1676, (byte) 45);
        int var10 = class91.method689(arg3 - arg4, class89.field1637, class94.field1676, (byte) 59);
        class199.method1361(arg2, var9, class62.field1241[arg0], var10, 108);
        while (var5 < var6) {
            var8 += 2;
            var7 += var8;
            if (var7 > 0) {
                var6--;
                int var11 = arg0 - var6;
                var7 -= var6 << 1;
                int var12 = arg0 + var6;
                if (class13.field215 <= var12 && class34.field727 >= var11) {
                    int var13 = class91.method689(arg3 + var5, class89.field1637, class94.field1676, (byte) -112);
                    int var14 = class91.method689(arg3 - var5, class89.field1637, class94.field1676, (byte) 39);
                    if (class34.field727 >= var12) {
                        class199.method1361(arg2, var13, class62.field1241[var12], var14, 56);
                    }
                    if (var11 >= class13.field215) {
                        class199.method1361(arg2, var13, class62.field1241[var11], var14, 98);
                    }
                }
            }
            var5++;
            int var15 = arg0 - var5;
            int var16 = arg0 + var5;
            if (var16 >= class13.field215 && class34.field727 >= var15) {
                int var17 = class91.method689(arg3 + var6, class89.field1637, class94.field1676, (byte) -123);
                int var18 = class91.method689(arg3 - var6, class89.field1637, class94.field1676, (byte) -125);
                if (class34.field727 >= var16) {
                    class199.method1361(arg2, var17, class62.field1241[var16], var18, 98);
                }
                if (var15 >= class13.field215) {
                    class199.method1361(arg2, var17, class62.field1241[var15], var18, 113);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Z)V")
    public static void method1217(boolean arg0) {
        field3085 = null;
        if (arg0) {
            field3085 = null;
        }
        field3082 = null;
        field3080 = null;
        field3081 = null;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IILie;)V")
    private final void method1218(int arg0, int arg1, class32 arg2) {
        if (arg1 != 0) {
            method1216(-50, (byte) -29, -9, 87, 41);
        }
        if (arg0 == 5) {
            this.field3089 = arg2.method339(-16777216);
        }
        field3084++;
    }
}
