import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class308 {

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "I")
    private int field4163 = 0;

    @OriginalMember(owner = "client!vc", name = "m", descriptor = "I")
    private int field4170 = -1;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "Lmk;")
    private class154 field4158 = new class154();

    @OriginalMember(owner = "client!vc", name = "q", descriptor = "Z")
    public boolean field4174 = false;

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "I")
    private int field4159;

    @OriginalMember(owner = "client!vc", name = "l", descriptor = "I")
    private int field4169;

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "[Lwf;")
    private class1[] field4161;

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "[[I")
    private int[][] field4166;

    @OriginalMember(owner = "client!vc", name = "j", descriptor = "Lmk;")
    public static class154 field4167 = new class154();

    @OriginalMember(owner = "client!vc", name = "p", descriptor = "Z")
    public static boolean field4173 = false;

    @OriginalMember(owner = "client!vc", name = "r", descriptor = "[I")
    public static int[] field4175 = new int[1024];

    @OriginalMember(owner = "client!vc", name = "o", descriptor = "[I")
    public static int[] field4172 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "I")
    public static int field4160;

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "I")
    public static int field4162;

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "I")
    public static int field4164;

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "I")
    public static int field4165;

    @OriginalMember(owner = "client!vc", name = "k", descriptor = "I")
    public static int field4168;

    @OriginalMember(owner = "client!vc", name = "n", descriptor = "I")
    public static int field4171;

    @OriginalMember(owner = "client!vc", name = "s", descriptor = "I")
    public static int field4176;

    @OriginalMember(owner = "client!vc", name = "t", descriptor = "I")
    public static int field4177;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)Z")
    public static final boolean method1808(byte arg0) {
        int var1 = -17 % ((arg0 + 40) / 33);
        field4164++;
        try {
            return class75.method421(-163);
        } catch (IOException var5) {
            class104.method557(-36);
            return true;
        } catch (Exception var6) {
            String var3 = "T2 - " + class7.field68 + "," + class85.field952 + "," + class184.field2345 + " - " + class161.field2065 + "," + (class70.field767 + class427.field6264.field6119[0]) + "," + (class427.field6264.field6109[0] + class291.field3961) + " - ";
            for (int var4 = 0; var4 < class161.field2065 && var4 < 50; var4++) {
                var3 = var3 + class448.field6514.field3406[var4] + ",";
            }
            class254.method1439(22292, var6, var3);
            class268.method1493(54);
            return true;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(CI)Z")
    public static final boolean method1809(char arg0, int arg1) {
        field4165++;
        if (arg1 != -24754) {
            field4175 = null;
        }
        if (arg0 >= ' ' && arg0 <= '~') {
            return true;
        } else if (arg0 >= ' ' && arg0 <= 'ÿ') {
            return true;
        } else {
            return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
        }
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(B)V")
    public static void method1810(byte arg0) {
        if (arg0 <= 45) {
            method1810((byte) 13);
        }
        field4172 = null;
        field4167 = null;
        field4175 = null;
    }

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "(B)[[I")
    public final int[][] method1811(byte arg0) {
        field4168++;
        if (this.field4169 != this.field4159) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field4169; var2++) {
            this.field4161[var2] = class130.field1674;
        }
        if (arg0 >= -116) {
            this.method1811((byte) -4);
        }
        return this.field4166;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V")
    public final void method1812(int arg0) {
        field4162++;
        for (int var2 = arg0; var2 < this.field4169; var2++) {
            this.field4166[var2] = null;
        }
        this.field4166 = null;
        this.field4161 = null;
        this.field4158.method829(false);
        this.field4158 = null;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IB)[I")
    public final int[] method1813(int arg0, byte arg1) {
        int var3 = -103 % ((arg1 - 80) / 35);
        field4176++;
        if (this.field4169 == this.field4159) {
            this.field4174 = this.field4161[arg0] == null;
            this.field4161[arg0] = class130.field1674;
            return this.field4166[arg0];
        } else if (this.field4169 == 1) {
            this.field4174 = this.field4170 != arg0;
            this.field4170 = arg0;
            return this.field4166[0];
        } else {
            class1 var4 = this.field4161[arg0];
            if (var4 == null) {
                this.field4174 = true;
                if (this.field4163 < this.field4169) {
                    var4 = new class1(arg0, this.field4163);
                    this.field4163++;
                } else {
                    class1 var5 = (class1) this.field4158.method821((byte) 123);
                    var4 = new class1(arg0, var5.field1);
                    this.field4161[var5.field5] = null;
                    var5.method1967(-1);
                }
                this.field4161[arg0] = var4;
            } else {
                this.field4174 = false;
            }
            this.field4158.method820(var4, (byte) 73);
            return this.field4166[var4.field1];
        }
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(III)V")
    public class308(int arg0, int arg1, int arg2) {
        this.field4159 = arg1;
        this.field4169 = arg0;
        this.field4161 = new class1[this.field4159];
        this.field4166 = new int[this.field4169][arg2];
    }
}
