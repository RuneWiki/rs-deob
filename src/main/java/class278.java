import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class278 {

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "I")
    private int field4075 = 0;

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "I")
    private int field4073 = -1;

    @OriginalMember(owner = "client!ga", name = "i", descriptor = "Lmi;")
    private class408 field4080 = new class408();

    @OriginalMember(owner = "client!ga", name = "p", descriptor = "Z")
    public boolean field4087 = false;

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "I")
    private int field4078;

    @OriginalMember(owner = "client!ga", name = "h", descriptor = "I")
    private int field4079;

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "[[[I")
    private int[][][] field4074;

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "[Lsk;")
    private class169[] field4077;

    @OriginalMember(owner = "client!ga", name = "o", descriptor = "Ljava/lang/String;")
    public static String field4086 = "Loaded defaults";

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "Lmi;")
    public static class408 field4076 = new class408();

    @OriginalMember(owner = "client!ga", name = "q", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field4088 = new Rectangle[100];

    @OriginalMember(owner = "client!ga", name = "r", descriptor = "I")
    public static int field4089 = 0;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "I")
    public static int field4072;

    @OriginalMember(owner = "client!ga", name = "j", descriptor = "I")
    public static int field4081;

    @OriginalMember(owner = "client!ga", name = "k", descriptor = "I")
    public static int field4082;

    @OriginalMember(owner = "client!ga", name = "l", descriptor = "I")
    public static int field4083;

    @OriginalMember(owner = "client!ga", name = "m", descriptor = "I")
    public static int field4084;

    @OriginalMember(owner = "client!ga", name = "n", descriptor = "I")
    public static int field4085;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)[[I", line = 3)
    public final int[][] method1774(int arg0, int arg1) {
        if (arg1 != -2) {
            field4086 = null;
        }
        field4072++;
        if (this.field4079 == this.field4078) {
            this.field4087 = this.field4077[arg0] == null;
            this.field4077[arg0] = class263.field3830;
            return this.field4074[arg0];
        } else if (this.field4078 == 1) {
            this.field4087 = this.field4073 != arg0;
            this.field4073 = arg0;
            return this.field4074[0];
        } else {
            class169 var3 = this.field4077[arg0];
            if (var3 == null) {
                this.field4087 = true;
                if (this.field4078 <= this.field4075) {
                    class169 var4 = (class169) this.field4080.method2659(0);
                    var3 = new class169(arg0, var4.field2224);
                    this.field4077[var4.field2219] = null;
                    var4.method2574((byte) 122);
                } else {
                    var3 = new class169(arg0, this.field4075);
                    this.field4075++;
                }
                this.field4077[arg0] = var3;
            } else {
                this.field4087 = false;
            }
            this.field4080.method2658(var3, 0);
            return this.field4074[var3.field2224];
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIII)V", line = 75)
    public static final void method1775(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4082++;
        if (class161.field2104 == 1) {
            class193.field2718[class392.field5883 / 100].method1499(class110.field1509 - 8, class263.field3827 + -8);
        }
        if (class161.field2104 == 2) {
            class193.field2718[class392.field5883 / 100 + 4].method1499(class110.field1509 - 8, class263.field3827 + -8);
        }
        if (arg4 == 87) {
            class439.method2775((byte) 114);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(ZILjava/lang/String;I)Z", line = 103)
    public static final boolean method1776(boolean arg0, int arg1, String arg2, int arg3) {
        field4081++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = arg3;
        int var7 = arg2.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg2.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg0) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                return false;
            }
            if (var11 >= arg1) {
                return false;
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg1 * var6 + var11;
            if (var10 / arg1 != var6) {
                return false;
            }
            var5 = true;
            var6 = var10;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(III)V", line = 273)
    public class278(int arg0, int arg1, int arg2) {
        this.field4078 = arg0;
        this.field4079 = arg1;
        this.field4074 = new int[this.field4078][3][arg2];
        this.field4077 = new class169[this.field4079];
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(II)V", line = 179)
    public static final void method1777(int arg0, int arg1) {
        class129.field1717.method215(0, arg0);
        field4083++;
        class237.field3325.method215(0, arg0);
        class292.field4237.method215(arg1 ^ arg1, arg0);
        class39.field628.method215(0, arg0);
        class91.field1252.method215(arg1 ^ 0xFFFFFFF8, arg0);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(B)V", line = 192)
    public static void method1778(byte arg0) {
        field4088 = null;
        if (arg0 != -40) {
            method1776(true, 105, (String) null, -115);
        }
        field4076 = null;
        field4086 = null;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V", line = 204)
    public final void method1779(int arg0) {
        for (int var2 = 0; var2 < this.field4078; var2++) {
            this.field4074[var2][0] = null;
            this.field4074[var2][1] = null;
            this.field4074[var2][2] = null;
            this.field4074[var2] = null;
        }
        field4084++;
        this.field4077 = null;
        this.field4074 = null;
        this.field4080.method2654(arg0 ^ arg0);
        this.field4080 = null;
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(B)[[[I", line = 230)
    public final int[][][] method1780(byte arg0) {
        field4085++;
        if (arg0 != 53) {
            return null;
        } else if (this.field4079 == this.field4078) {
            for (int var2 = 0; var2 < this.field4078; var2++) {
                this.field4077[var2] = class263.field3830;
            }
            return this.field4074;
        } else {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
    }
}
