import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class334 {

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "I")
    private int field5032 = 0;

    @OriginalMember(owner = "client!ug", name = "m", descriptor = "I")
    private int field5037 = -1;

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "Lnv;")
    private class44 field5033 = new class44();

    @OriginalMember(owner = "client!ug", name = "p", descriptor = "Z")
    public boolean field5040 = false;

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "I")
    private int field5031;

    @OriginalMember(owner = "client!ug", name = "n", descriptor = "I")
    private int field5038;

    @OriginalMember(owner = "client!ug", name = "o", descriptor = "[[I")
    private int[][] field5039;

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "[Lvl;")
    private class241[] field5027;

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "I")
    public static int field5026 = 0;

    @OriginalMember(owner = "client!ug", name = "l", descriptor = "I")
    public static int field5036 = 0;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "I")
    public static int field5025;

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "I")
    public static int field5028;

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "I")
    public static int field5029;

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "I")
    public static int field5030;

    @OriginalMember(owner = "client!ug", name = "j", descriptor = "I")
    public static int field5034;

    @OriginalMember(owner = "client!ug", name = "k", descriptor = "I")
    public static int field5035;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(BLfi;)V", line = 3)
    public static final void method2172(byte arg0, class38 arg1) {
        field5034++;
        if (!class2.field17) {
            return;
        }
        class539.field7889++;
        if (arg1.field490 != null) {
            class38 var2 = class327.method2148(class442.field6585, -7153, class291.field4510);
            if (var2 != null) {
                class510 var3 = new class510();
                var3.field7417 = var2;
                var3.field7423 = arg1;
                var3.field7413 = arg1.field490;
                class152.method1090(var3);
            }
        }
        class110.method857(4095, class267.field4244);
        class312.field4752.method1348((byte) -65, arg1.field580);
        class312.field4752.method1386(true, class511.field7481);
        if (arg0 >= -47) {
            method2176(97, null);
        }
        class312.field4752.method1364(arg1.field499, true);
        class312.field4752.method1362(class291.field4510, -66);
        class312.field4752.method1395(-3, class442.field6585);
        class312.field4752.method1386(true, arg1.field607);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lfh;I)Lub;", line = 47)
    public static final class305 method2173(class194 arg0, int arg1) {
        arg0.method1337((byte) -122);
        field5025++;
        int var2 = arg0.method1337((byte) -107);
        class305 var3 = class19.method120(10, var2);
        var3.field4667 = arg0.method1337((byte) 58);
        int var4 = arg0.method1337((byte) -108);
        for (int var5 = arg1; var5 < var4; var5++) {
            int var6 = arg0.method1337((byte) 20);
            var3.method14(var6, arg0, (byte) 118);
        }
        var3.method17((byte) -62);
        return var3;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(II)[I", line = 84)
    public final int[] method2174(int arg0, int arg1) {
        field5029++;
        int var3 = -6 % ((arg1 + 21) / 45);
        if (this.field5038 == this.field5031) {
            this.field5040 = this.field5027[arg0] == null;
            this.field5027[arg0] = class456.field6780;
            return this.field5039[arg0];
        } else if (this.field5038 == 1) {
            this.field5040 = this.field5037 != arg0;
            this.field5037 = arg0;
            return this.field5039[0];
        } else {
            class241 var4 = this.field5027[arg0];
            if (var4 == null) {
                this.field5040 = true;
                if (this.field5038 > this.field5032) {
                    var4 = new class241(arg0, this.field5032);
                    this.field5032++;
                } else {
                    class241 var5 = (class241) this.field5033.method294(0);
                    var4 = new class241(arg0, var5.field3614);
                    this.field5027[var5.field3617] = null;
                    var5.method947((byte) 123);
                }
                this.field5027[arg0] = var4;
            } else {
                this.field5040 = false;
            }
            this.field5033.method288(var4, 28);
            return this.field5039[var4.field3614];
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)V", line = 155)
    public final void method2175(int arg0) {
        for (int var2 = arg0; var2 < this.field5038; var2++) {
            this.field5039[var2] = null;
        }
        field5030++;
        this.field5039 = null;
        this.field5027 = null;
        this.field5033.method291(false);
        this.field5033 = null;
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(III)V", line = 227)
    public class334(int arg0, int arg1, int arg2) {
        this.field5031 = arg1;
        this.field5038 = arg0;
        this.field5039 = new int[this.field5038][arg2];
        this.field5027 = new class241[this.field5031];
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILfh;)Lqb;", line = 176)
    public static final class524 method2176(int arg0, class194 arg1) {
        if (arg0 != 705) {
            method2173(null, -45);
        }
        field5028++;
        return new class524(arg1.method1384(true), arg1.method1384(true), arg1.method1384(true), arg1.method1384(true), arg1.method1384(true), arg1.method1384(true), arg1.method1384(true), arg1.method1384(true), arg1.method1339(arg0 ^ 0xFFFF82C1), arg1.method1337((byte) -122));
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)[[I", line = 192)
    public final int[][] method2177(byte arg0) {
        field5035++;
        if (this.field5038 != this.field5031) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field5038; var2++) {
            this.field5027[var2] = class456.field6780;
        }
        if (arg0 >= -1) {
            method2172((byte) 56, null);
        }
        return this.field5039;
    }
}
