import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class194 {

    @OriginalMember(owner = "client!de", name = "h", descriptor = "[I")
    public static int[] field3094 = new int[5];

    @OriginalMember(owner = "client!de", name = "k", descriptor = "I")
    public static int field3097 = 0;

    @OriginalMember(owner = "client!de", name = "l", descriptor = "[J")
    public static long[] field3098 = new long[32];

    @OriginalMember(owner = "client!de", name = "a", descriptor = "I")
    public int field3087;

    @OriginalMember(owner = "client!de", name = "b", descriptor = "I")
    public int field3088;

    @OriginalMember(owner = "client!de", name = "c", descriptor = "I")
    public int field3089;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "I")
    public int field3090;

    @OriginalMember(owner = "client!de", name = "e", descriptor = "I")
    public int field3091;

    @OriginalMember(owner = "client!de", name = "f", descriptor = "I")
    public int field3092;

    @OriginalMember(owner = "client!de", name = "g", descriptor = "I")
    public static int field3093;

    @OriginalMember(owner = "client!de", name = "i", descriptor = "I")
    public static int field3095;

    @OriginalMember(owner = "client!de", name = "m", descriptor = "I")
    public static int field3099;

    @OriginalMember(owner = "client!de", name = "j", descriptor = "Ljava/lang/String;")
    public static String field3096;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(B)V", line = 7)
    public static final void method1503(byte arg0) {
        for (int var1 = 0; var1 < 5; var1++) {
            class78.field1353[var1] = false;
        }
        class195.field3106 = -1;
        class255.field4299 = 0;
        field3093++;
        class112.field1827 = 5;
        if (arg0 != -49) {
            method1503((byte) 0);
        }
        class353.field5590 = 0;
        class317.field5053 = -1;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(II)Leb;", line = 32)
    public static final class6 method1504(int arg0, int arg1) {
        field3099++;
        class6 var2 = (class6) class260.field4363.method2147((byte) 43, (long) arg0);
        int var3 = 99 / ((arg1 - 46) / 37);
        if (var2 != null) {
            return var2;
        }
        byte[] var4 = class131.field2224.method472(0, 43, arg0);
        if (var4 == null || var4.length <= 1) {
            return null;
        } else {
            class6 var5 = class125.method980(2, var4);
            class260.field4363.method2149(var5, -32563, (long) arg0);
            return var5;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V", line = 61)
    public static void method1505(int arg0) {
        field3094 = null;
        if (arg0 == 0) {
            field3096 = null;
            field3098 = null;
        }
    }
}
