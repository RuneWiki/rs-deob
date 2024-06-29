import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!PHXJLMVH")
public class class41 {

    @OriginalMember(owner = "client!PHXJLMVH", name = "a", descriptor = "Z")
    private boolean field1129 = true;

    @OriginalMember(owner = "client!PHXJLMVH", name = "f", descriptor = "I")
    public int field1134 = -1;

    @OriginalMember(owner = "client!PHXJLMVH", name = "h", descriptor = "[I")
    public int[] field1136 = new int[6];

    @OriginalMember(owner = "client!PHXJLMVH", name = "i", descriptor = "[I")
    public int[] field1137 = new int[6];

    @OriginalMember(owner = "client!PHXJLMVH", name = "j", descriptor = "I")
    public int field1138 = 128;

    @OriginalMember(owner = "client!PHXJLMVH", name = "k", descriptor = "I")
    public int field1139 = 128;

    @OriginalMember(owner = "client!PHXJLMVH", name = "o", descriptor = "LULDYKUPK;")
    public static class57 field1143 = new class57(30, 0);

    @OriginalMember(owner = "client!PHXJLMVH", name = "b", descriptor = "I")
    public static int field1130;

    @OriginalMember(owner = "client!PHXJLMVH", name = "d", descriptor = "I")
    public int field1132;

    @OriginalMember(owner = "client!PHXJLMVH", name = "e", descriptor = "I")
    public int field1133;

    @OriginalMember(owner = "client!PHXJLMVH", name = "l", descriptor = "I")
    public int field1140;

    @OriginalMember(owner = "client!PHXJLMVH", name = "m", descriptor = "I")
    public int field1141;

    @OriginalMember(owner = "client!PHXJLMVH", name = "n", descriptor = "I")
    public int field1142;

    @OriginalMember(owner = "client!PHXJLMVH", name = "g", descriptor = "LKYGPROVJ;")
    public class27 field1135;

    @OriginalMember(owner = "client!PHXJLMVH", name = "c", descriptor = "[LPHXJLMVH;")
    public static class41[] field1131;

    @OriginalMember(owner = "client!PHXJLMVH", name = "a", descriptor = "(LRSPRYUFS;I)V")
    public static void method412(class49 arg0, int arg1) {
        class36 var2 = new class36(-587, arg0.method427("spotanim.dat", null));
        field1130 = var2.method341();
        if (field1131 == null) {
            field1131 = new class41[field1130];
        }
        for (int var3 = 0; var3 < field1130; var3++) {
            if (field1131[var3] == null) {
                field1131[var3] = new class41();
            }
            field1131[var3].field1132 = var3;
            field1131[var3].method413((byte) 6, var2);
        }
        if (arg1 >= 0) {
            ;
        }
    }

    @OriginalMember(owner = "client!PHXJLMVH", name = "a", descriptor = "(BLNQUAUMDT;)V")
    public void method413(byte arg0, class36 arg1) {
        if (arg0 == 6) {
            boolean var3 = false;
        } else {
            this.field1129 = !this.field1129;
        }
        while (true) {
            while (true) {
                int var4 = arg1.method339();
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    this.field1133 = arg1.method341();
                } else if (var4 == 2) {
                    this.field1134 = arg1.method341();
                    if (class27.field923 != null) {
                        this.field1135 = class27.field923[this.field1134];
                    }
                } else if (var4 == 4) {
                    this.field1138 = arg1.method341();
                } else if (var4 == 5) {
                    this.field1139 = arg1.method341();
                } else if (var4 == 6) {
                    this.field1140 = arg1.method341();
                } else if (var4 == 7) {
                    this.field1141 = arg1.method339();
                } else if (var4 == 8) {
                    this.field1142 = arg1.method339();
                } else if (var4 >= 40 && var4 < 50) {
                    this.field1136[var4 - 40] = arg1.method341();
                } else if (var4 >= 50 && var4 < 60) {
                    this.field1137[var4 - 50] = arg1.method341();
                } else {
                    System.out.println("Error unrecognised spotanim config code: " + var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!PHXJLMVH", name = "a", descriptor = "()LJUQSYEMB;")
    public class22 method414() {
        class22 var1 = (class22) field1143.method509((long) this.field1132);
        if (var1 != null) {
            return var1;
        }
        class22 var2 = class22.method212(this.field1133);
        if (var2 == null) {
            return null;
        }
        for (int var3 = 0; var3 < 6; var3++) {
            if (this.field1136[0] != 0) {
                var2.method226(this.field1136[var3], this.field1137[var3]);
            }
        }
        field1143.method510((long) this.field1132, 0, var2);
        return var2;
    }
}
