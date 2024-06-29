import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!JEPDVFCL")
public class class29 {

    @OriginalMember(owner = "client!JEPDVFCL", name = "g", descriptor = "I")
    public int field935 = -1;

    @OriginalMember(owner = "client!JEPDVFCL", name = "i", descriptor = "[I")
    public int[] field937 = new int[6];

    @OriginalMember(owner = "client!JEPDVFCL", name = "j", descriptor = "[I")
    public int[] field938 = new int[6];

    @OriginalMember(owner = "client!JEPDVFCL", name = "k", descriptor = "I")
    public int field939 = 128;

    @OriginalMember(owner = "client!JEPDVFCL", name = "l", descriptor = "I")
    public int field940 = 128;

    @OriginalMember(owner = "client!JEPDVFCL", name = "a", descriptor = "I")
    private static int field929 = 536;

    @OriginalMember(owner = "client!JEPDVFCL", name = "b", descriptor = "I")
    private static int field930 = 3;

    @OriginalMember(owner = "client!JEPDVFCL", name = "p", descriptor = "LHARAZQMH;")
    public static class22 field944 = new class22((byte) 5, 30);

    @OriginalMember(owner = "client!JEPDVFCL", name = "c", descriptor = "I")
    public static int field931;

    @OriginalMember(owner = "client!JEPDVFCL", name = "e", descriptor = "I")
    public int field933;

    @OriginalMember(owner = "client!JEPDVFCL", name = "f", descriptor = "I")
    public int field934;

    @OriginalMember(owner = "client!JEPDVFCL", name = "m", descriptor = "I")
    public int field941;

    @OriginalMember(owner = "client!JEPDVFCL", name = "n", descriptor = "I")
    public int field942;

    @OriginalMember(owner = "client!JEPDVFCL", name = "o", descriptor = "I")
    public int field943;

    @OriginalMember(owner = "client!JEPDVFCL", name = "h", descriptor = "LXRDQTWLL;")
    public class67 field936;

    @OriginalMember(owner = "client!JEPDVFCL", name = "d", descriptor = "[LJEPDVFCL;")
    public static class29[] field932;

    @OriginalMember(owner = "client!JEPDVFCL", name = "a", descriptor = "(ILUUIGNTAD;)V")
    public static void method330(int arg0, class59 arg1) {
        class10 var2 = new class10(arg1.method545("spotanim.dat", null), field929);
        field931 = var2.method196();
        if (field932 == null) {
            field932 = new class29[field931];
        }
        for (int var3 = 0; var3 < field931; var3++) {
            if (field932[var3] == null) {
                field932[var3] = new class29();
            }
            field932[var3].field933 = var3;
            field932[var3].method331(var2, -593);
        }
        if (arg0 < field930 || arg0 > field930) {
            ;
        }
    }

    @OriginalMember(owner = "client!JEPDVFCL", name = "a", descriptor = "(LCMGGUSPR;I)V")
    public void method331(class10 arg0, int arg1) {
        label66: while (true) {
            if (arg1 >= 0) {
                int var4 = 1;
                while (true) {
                    if (var4 <= 0) {
                        continue label66;
                    }
                    var4++;
                }
            }
            while (true) {
                while (true) {
                    int var3 = arg0.method194();
                    if (var3 == 0) {
                        return;
                    }
                    if (var3 == 1) {
                        this.field934 = arg0.method196();
                    } else if (var3 == 2) {
                        this.field935 = arg0.method196();
                        if (class67.field1666 != null) {
                            this.field936 = class67.field1666[this.field935];
                        }
                    } else if (var3 == 4) {
                        this.field939 = arg0.method196();
                    } else if (var3 == 5) {
                        this.field940 = arg0.method196();
                    } else if (var3 == 6) {
                        this.field941 = arg0.method196();
                    } else if (var3 == 7) {
                        this.field942 = arg0.method194();
                    } else if (var3 == 8) {
                        this.field943 = arg0.method194();
                    } else if (var3 >= 40 && var3 < 50) {
                        this.field937[var3 - 40] = arg0.method196();
                    } else if (var3 >= 50 && var3 < 60) {
                        this.field938[var3 - 50] = arg0.method196();
                    } else {
                        System.out.println("Error unrecognised spotanim config code: " + var3);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!JEPDVFCL", name = "a", descriptor = "()LGCSAWSJV;")
    public class16 method332() {
        class16 var1 = (class16) field944.method299((long) this.field933);
        if (var1 != null) {
            return var1;
        }
        class16 var2 = class16.method260(this.field934);
        if (var2 == null) {
            return null;
        }
        for (int var3 = 0; var3 < 6; var3++) {
            if (this.field937[0] != 0) {
                var2.method274(this.field937[var3], this.field938[var3]);
            }
        }
        field944.method300((byte) 24, (long) this.field933, var2);
        return var2;
    }
}
