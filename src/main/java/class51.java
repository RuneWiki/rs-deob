import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public abstract class class51 {

    @OriginalMember(owner = "client!di", name = "b", descriptor = "I")
    public int field647;

    @OriginalMember(owner = "client!di", name = "f", descriptor = "I")
    public int field651;

    @OriginalMember(owner = "client!di", name = "g", descriptor = "I")
    public int field652;

    @OriginalMember(owner = "client!di", name = "e", descriptor = "S")
    public static short field650 = 32767;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "I")
    public static int field646;

    @OriginalMember(owner = "client!di", name = "c", descriptor = "I")
    public static int field648;

    @OriginalMember(owner = "client!di", name = "d", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!di", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field653;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "([Lcd;IIIZI)V", line = 6)
    public static final void method375(class136[] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (arg2 != -1) {
            return;
        }
        for (int var6 = 0; var6 < arg0.length; var6++) {
            class136 var7 = arg0[var6];
            if (var7 != null && var7.field2090 == arg5) {
                class286.method2024(arg3, arg4, var7, true, arg1);
                class25.method239(arg3, var7, (byte) 41, arg1);
                if ((var7.field2007 - var7.field2078) < var7.field2018) {
                    var7.field2018 = var7.field2007 - var7.field2078;
                }
                if (var7.field2018 < 0) {
                    var7.field2018 = 0;
                }
                if ((var7.field1991 - var7.field2137) < var7.field2129) {
                    var7.field2129 = var7.field1991 - var7.field2137;
                }
                if (var7.field2129 < 0) {
                    var7.field2129 = 0;
                }
                if (var7.field2063 == 0) {
                    class82.method602((byte) 65, var7, arg4);
                }
            }
        }
        field649++;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(B)V", line = 53)
    public static void method376(byte arg0) {
        if (arg0 != -99) {
            field646 = 42;
        }
        field653 = null;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I[B)[B", line = 68)
    public static final byte[] method377(int arg0, byte[] arg1) {
        field648++;
        if (arg1 == null) {
            return null;
        } else {
            byte[] var2 = new byte[arg1.length];
            int var3 = 51 % ((arg0 + 39) / 57);
            class54.method422(arg1, 0, var2, 0, arg1.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "(III)V", line = 92)
    public class51(int arg0, int arg1, int arg2) {
        this.field647 = arg0;
        this.field651 = arg2;
        this.field652 = arg1;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(III)V")
    public abstract void method230(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(III)V")
    public abstract void method229(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(BII)V")
    public abstract void method234(byte arg0, int arg1, int arg2);
}
