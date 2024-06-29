import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!saa")
public class class300 extends class425 {

    @OriginalMember(owner = "client!saa", name = "r", descriptor = "Ljava/lang/String;")
    public String field4468;

    @OriginalMember(owner = "client!saa", name = "t", descriptor = "I")
    public int field4470;

    @OriginalMember(owner = "client!saa", name = "m", descriptor = "Z")
    public boolean field4463;

    @OriginalMember(owner = "client!saa", name = "v", descriptor = "J")
    public long field4472;

    @OriginalMember(owner = "client!saa", name = "s", descriptor = "Ljava/lang/String;")
    public String field4469;

    @OriginalMember(owner = "client!saa", name = "j", descriptor = "Z")
    public boolean field4460;

    @OriginalMember(owner = "client!saa", name = "o", descriptor = "I")
    public int field4465;

    @OriginalMember(owner = "client!saa", name = "n", descriptor = "I")
    public int field4464;

    @OriginalMember(owner = "client!saa", name = "u", descriptor = "I")
    public int field4471;

    @OriginalMember(owner = "client!saa", name = "k", descriptor = "I")
    public int field4461;

    @OriginalMember(owner = "client!saa", name = "p", descriptor = "I")
    public static int field4466 = 0;

    @OriginalMember(owner = "client!saa", name = "q", descriptor = "[I")
    public static int[] field4467 = new int[13];

    @OriginalMember(owner = "client!saa", name = "l", descriptor = "I")
    public static int field4462;

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(ZII)I")
    public static final int method1978(boolean arg0, int arg1, int arg2) {
        field4462++;
        if (arg0) {
            return 0;
        }
        class430 var3 = class605.method3470((byte) -114, arg0, arg1);
        if (var3 == null) {
            return class96.field1715.method833(arg1, (byte) -107).field3147;
        }
        int var4 = arg2;
        for (int var5 = 0; var5 < var3.field6215.length; var5++) {
            if (var3.field6215[var5] == -1) {
                var4++;
            }
        }
        return var4 + class96.field1715.method833(arg1, (byte) -107).field3147 - var3.field6215.length;
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(Z)V")
    public static void method1979(boolean arg0) {
        if (arg0) {
            method1979(false);
        }
        field4467 = null;
    }

    @OriginalMember(owner = "client!saa", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V")
    public class300(String arg0, String arg1, int arg2, int arg3, int arg4, long arg5, int arg6, int arg7, boolean arg8, boolean arg9) {
        this.field4468 = arg0;
        this.field4470 = arg7;
        this.field4463 = arg8;
        this.field4472 = arg5;
        this.field4469 = arg1;
        this.field4460 = arg9;
        this.field4465 = arg3;
        this.field4464 = arg6;
        this.field4471 = arg4;
        this.field4461 = arg2;
    }
}
