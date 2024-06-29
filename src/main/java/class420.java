import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class420 {

    @OriginalMember(owner = "client!ga", name = "j", descriptor = "Ldn;")
    public class540 field5911 = new class540();

    @OriginalMember(owner = "client!ga", name = "h", descriptor = "I")
    public static int field5909 = 0;

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "Ljo;")
    public static class351 field5906 = new class351(82, 5);

    @OriginalMember(owner = "client!ga", name = "r", descriptor = "Lke;")
    public static class622 field5919 = new class622(132, 10);

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "I")
    public static int field5902;

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "I")
    public static int field5903;

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "I")
    public static int field5904;

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "I")
    public static int field5905;

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "I")
    public static int field5907;

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "I")
    public static int field5908;

    @OriginalMember(owner = "client!ga", name = "i", descriptor = "I")
    public static int field5910;

    @OriginalMember(owner = "client!ga", name = "k", descriptor = "I")
    public static int field5912;

    @OriginalMember(owner = "client!ga", name = "l", descriptor = "I")
    public static int field5913;

    @OriginalMember(owner = "client!ga", name = "m", descriptor = "I")
    public static int field5914;

    @OriginalMember(owner = "client!ga", name = "n", descriptor = "I")
    public static int field5915;

    @OriginalMember(owner = "client!ga", name = "o", descriptor = "I")
    public static int field5916;

    @OriginalMember(owner = "client!ga", name = "q", descriptor = "I")
    public static int field5918;

    @OriginalMember(owner = "client!ga", name = "p", descriptor = "Ldn;")
    private class540 field5917;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V")
    public static void method2502(int arg0) {
        field5906 = null;
        if (arg0 >= -118) {
            field5909 = 22;
        }
        field5919 = null;
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(I)V")
    public final void method2503(int arg0) {
        while (true) {
            class540 var2 = this.field5911.field7578;
            if (this.field5911 == var2) {
                field5912++;
                this.field5917 = null;
                if (arg0 != 10) {
                    this.method2507(-67);
                    return;
                }
                return;
            }
            var2.method3117((byte) 41);
        }
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(I)I")
    public final int method2504(int arg0) {
        field5903++;
        int var2 = arg0;
        class540 var3 = this.field5911.field7578;
        while (this.field5911 != var3) {
            var3 = var3.field7578;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(B)Ldn;")
    public final class540 method2505(byte arg0) {
        field5905++;
        class540 var2 = this.field5917;
        if (this.field5911 == var2) {
            this.field5917 = null;
            return null;
        }
        if (arg0 != -55) {
            this.field5917 = null;
        }
        this.field5917 = var2.field7578;
        return var2;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Ldn;B)V")
    public final void method2506(class540 arg0, byte arg1) {
        if (arg0.field7583 != null) {
            arg0.method3117((byte) 41);
        }
        if (arg1 >= -92) {
            this.method2507(13);
        }
        field5904++;
        arg0.field7583 = this.field5911;
        arg0.field7578 = this.field5911.field7578;
        arg0.field7583.field7578 = arg0;
        arg0.field7578.field7583 = arg0;
    }

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "(I)Ldn;")
    public final class540 method2507(int arg0) {
        if (arg0 > -84) {
            this.field5911 = null;
        }
        field5908++;
        class540 var2 = this.field5911.field7578;
        if (this.field5911 == var2) {
            return null;
        } else {
            var2.method3117((byte) -95);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(B)Ldn;")
    public final class540 method2508(byte arg0) {
        int var2 = 100 / ((arg0 - 44) / 63);
        field5916++;
        class540 var3 = this.field5911.field7578;
        if (this.field5911 == var3) {
            this.field5917 = null;
            return null;
        } else {
            this.field5917 = var3.field7578;
            return var3;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Z)Ldn;")
    public final class540 method2509(boolean arg0) {
        field5913++;
        class540 var2 = this.field5911.field7583;
        if (arg0) {
            this.field5911 = null;
        }
        if (this.field5911 == var2) {
            this.field5917 = null;
            return null;
        } else {
            this.field5917 = var2.field7583;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Ldn;Z)V")
    public final void method2510(class540 arg0, boolean arg1) {
        if (arg1) {
            field5919 = null;
        }
        field5915++;
        if (arg0.field7583 != null) {
            arg0.method3117((byte) 8);
        }
        arg0.field7583 = this.field5911.field7583;
        arg0.field7578 = this.field5911;
        arg0.field7583.field7578 = arg0;
        arg0.field7578.field7583 = arg0;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lga;Z)V")
    public final void method2511(class420 arg0, boolean arg1) {
        this.method2514(-24460, arg0, this.field5911.field7578);
        field5918++;
        if (!arg1) {
            this.field5911 = null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(BI)Z")
    public static final boolean method2512(byte arg0, int arg1) {
        field5907++;
        if (class323.field4845[arg1]) {
            return true;
        } else if (!class611.field8623.method3140(arg1, (byte) -88)) {
            return false;
        } else if (arg0 == 43) {
            int var2 = class611.field8623.method3147(arg1, arg0 + 7);
            if (var2 == 0) {
                class323.field4845[arg1] = true;
                return true;
            }
            if (class110.field1382[arg1] == null) {
                class110.field1382[arg1] = new class176[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class110.field1382[arg1][var3] == null) {
                    byte[] var4 = class611.field8623.method3150(var3, -70, arg1);
                    if (var4 != null) {
                        class176 var5 = class110.field1382[arg1][var3] = new class176();
                        var5.field2588 = (arg1 << 16) + var3;
                        if (var4[0] != -1) {
                            throw new IllegalStateException("if1");
                        }
                        var5.method1331((byte) -62, new class120(var4));
                    }
                }
            }
            class323.field4845[arg1] = true;
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(B)Z")
    public final boolean method2513(byte arg0) {
        field5902++;
        if (arg0 == 88) {
            return this.field5911.field7578 == this.field5911;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "()V")
    public class420() {
        this.field5911.field7583 = this.field5911;
        this.field5911.field7578 = this.field5911;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(ILga;Ldn;)V")
    private final void method2514(int arg0, class420 arg1, class540 arg2) {
        field5914++;
        class540 var4 = this.field5911.field7583;
        if (arg0 != -24460) {
            this.method2511(null, false);
        }
        this.field5911.field7583 = arg2.field7583;
        arg2.field7583.field7578 = this.field5911;
        if (this.field5911 != arg2) {
            arg2.field7583 = arg1.field5911.field7583;
            arg2.field7583.field7578 = arg2;
            arg1.field5911.field7583 = var4;
            var4.field7578 = arg1.field5911;
        }
    }

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "(I)Ldn;")
    public final class540 method2515(int arg0) {
        field5910++;
        class540 var2 = this.field5917;
        if (arg0 < 50) {
            field5909 = -23;
        }
        if (this.field5911 == var2) {
            this.field5917 = null;
            return null;
        } else {
            this.field5917 = var2.field7583;
            return var2;
        }
    }
}
