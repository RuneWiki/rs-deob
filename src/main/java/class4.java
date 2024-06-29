import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!BZLQCUPI")
public class class4 {

    @OriginalMember(owner = "client!BZLQCUPI", name = "e", descriptor = "I")
    public int field46 = -1;

    @OriginalMember(owner = "client!BZLQCUPI", name = "g", descriptor = "[I")
    public int[] field48 = new int[6];

    @OriginalMember(owner = "client!BZLQCUPI", name = "h", descriptor = "[I")
    public int[] field49 = new int[6];

    @OriginalMember(owner = "client!BZLQCUPI", name = "i", descriptor = "I")
    public int field50 = 128;

    @OriginalMember(owner = "client!BZLQCUPI", name = "j", descriptor = "I")
    public int field51 = 128;

    @OriginalMember(owner = "client!BZLQCUPI", name = "n", descriptor = "LTHJKANXW;")
    public static class54 field55 = new class54(30, false);

    @OriginalMember(owner = "client!BZLQCUPI", name = "a", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "client!BZLQCUPI", name = "c", descriptor = "I")
    public int field44;

    @OriginalMember(owner = "client!BZLQCUPI", name = "d", descriptor = "I")
    public int field45;

    @OriginalMember(owner = "client!BZLQCUPI", name = "k", descriptor = "I")
    public int field52;

    @OriginalMember(owner = "client!BZLQCUPI", name = "l", descriptor = "I")
    public int field53;

    @OriginalMember(owner = "client!BZLQCUPI", name = "m", descriptor = "I")
    public int field54;

    @OriginalMember(owner = "client!BZLQCUPI", name = "f", descriptor = "LEHYLCNJX;")
    public class15 field47;

    @OriginalMember(owner = "client!BZLQCUPI", name = "b", descriptor = "[LBZLQCUPI;")
    public static class4[] field43;

    @OriginalMember(owner = "client!BZLQCUPI", name = "a", descriptor = "(LFUZJMGZB;I)V")
    public static void method7(class19 arg0, int arg1) {
        class32 var2 = new class32((byte) 114, arg0.method277("spotanim.dat", null));
        field42 = var2.method371();
        if (arg1 < 5 || arg1 > 5) {
            return;
        }
        if (field43 == null) {
            field43 = new class4[field42];
        }
        for (int var3 = 0; var3 < field42; var3++) {
            if (field43[var3] == null) {
                field43[var3] = new class4();
            }
            field43[var3].field44 = var3;
            field43[var3].method8(var2, (byte) 59);
        }
    }

    @OriginalMember(owner = "client!BZLQCUPI", name = "a", descriptor = "(LLBBVYYXO;B)V")
    public void method8(class32 arg0, byte arg1) {
        if (arg1 != 59) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg0.method369();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field45 = arg0.method371();
                } else if (var3 == 2) {
                    this.field46 = arg0.method371();
                    if (class15.field837 != null) {
                        this.field47 = class15.field837[this.field46];
                    }
                } else if (var3 == 4) {
                    this.field50 = arg0.method371();
                } else if (var3 == 5) {
                    this.field51 = arg0.method371();
                } else if (var3 == 6) {
                    this.field52 = arg0.method371();
                } else if (var3 == 7) {
                    this.field53 = arg0.method369();
                } else if (var3 == 8) {
                    this.field54 = arg0.method369();
                } else if (var3 >= 40 && var3 < 50) {
                    this.field48[var3 - 40] = arg0.method371();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field49[var3 - 50] = arg0.method371();
                } else {
                    System.out.println("Error unrecognised spotanim config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!BZLQCUPI", name = "a", descriptor = "()LCYPZUKMB;")
    public class8 method9() {
        class8 var1 = (class8) field55.method529((long) this.field44);
        if (var1 != null) {
            return var1;
        }
        class8 var2 = class8.method196(this.field45);
        if (var2 == null) {
            return null;
        }
        for (int var3 = 0; var3 < 6; var3++) {
            if (this.field48[0] != 0) {
                var2.method210(this.field48[var3], this.field49[var3]);
            }
        }
        field55.method530((long) this.field44, true, var2);
        return var2;
    }
}
