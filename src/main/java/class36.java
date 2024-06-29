import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class36 {

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "I")
    public int field490;

    @OriginalMember(owner = "client!ml", name = "h", descriptor = "[Lmb;")
    public static class285[] field496 = new class285[14];

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "I")
    public static int field489;

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "I")
    public static int field491;

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "I")
    public static int field492;

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "I")
    public static int field493;

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!ml", name = "g", descriptor = "I")
    public static int field495;

    @OriginalMember(owner = "client!ml", name = "i", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!ml", name = "toString", descriptor = "()Ljava/lang/String;", line = 3)
    public final String toString() {
        field495++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(II)Z", line = 16)
    public static final boolean method315(int arg0, int arg1) {
        field492++;
        if ((short) arg0 == arg1 || arg1 == 19 || arg1 == 15 || arg1 == 21 || arg1 == 1010) {
            return true;
        } else {
            return arg1 == 44 || arg1 == 1004;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ZLbda;)V", line = 39)
    public static final void method316(boolean arg0, class400 arg1) {
        if (!arg0) {
            return;
        }
        field489++;
        class154 var2 = (class154) class424.field6207.method740(0, (long) arg1.field1555);
        if (var2 == null) {
            class589.method3371(arg1.field1571[0], 0, null, arg1.field1572[0], arg1.field5116, arg1, (byte) -55, null);
        } else {
            var2.method1094(95);
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IB)Lhf;", line = 59)
    public static final class573 method317(int arg0, byte arg1) {
        int var2 = 33 / ((arg1 - 29) / 40);
        field494++;
        class573[] var3 = class367.method2216(false);
        for (int var4 = 0; var4 < var3.length; var4++) {
            class573 var5 = var3[var4];
            if (var5.field8162 == arg0) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Z)V", line = 89)
    public static void method318(boolean arg0) {
        field496 = null;
        if (!arg0) {
            method317(121, (byte) -1);
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V", line = 99)
    public static final void method319(int arg0) {
        class439.field6391 = -1;
        class473.field6783 = 0;
        class476.field6810 = -1;
        if (arg0 != 19) {
            field496 = null;
        }
        field497++;
        class555.field7857 = -1;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(III)I", line = 117)
    public static final int method320(int arg0, int arg1, int arg2) {
        field491++;
        int var3 = arg2 >>> 31;
        if (arg0 != 386342943) {
            method315(19, -40);
        }
        return (arg2 + var3) / arg1 - var3;
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(III)Z", line = 134)
    public static final boolean method321(int arg0, int arg1, int arg2) {
        field493++;
        if (arg0 != 386342943) {
            field496 = null;
        }
        return class161.method1132((byte) -22, arg1, arg2) & class210.method1348(103, arg1, arg2);
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 144)
    public class36(String arg0, int arg1) {
        this.field490 = arg1;
    }
}
