import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class146 {

    @OriginalMember(owner = "client!bm", name = "j", descriptor = "I")
    public static int field2031 = -1;

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "Ljava/lang/String;")
    public static String field2025 = "Loading wordpack - ";

    @OriginalMember(owner = "client!bm", name = "n", descriptor = "Ljava/lang/String;")
    public static String field2035 = "Loaded wordpack";

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "I")
    public static int field2022;

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "I")
    public static int field2023;

    @OriginalMember(owner = "client!bm", name = "e", descriptor = "I")
    public int field2026;

    @OriginalMember(owner = "client!bm", name = "f", descriptor = "I")
    public int field2027;

    @OriginalMember(owner = "client!bm", name = "i", descriptor = "I")
    public static int field2030;

    @OriginalMember(owner = "client!bm", name = "k", descriptor = "I")
    public int field2032;

    @OriginalMember(owner = "client!bm", name = "l", descriptor = "I")
    public static int field2033;

    @OriginalMember(owner = "client!bm", name = "m", descriptor = "I")
    public int field2034;

    @OriginalMember(owner = "client!bm", name = "h", descriptor = "J")
    public long field2029;

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "Len;")
    public class47 field2024;

    @OriginalMember(owner = "client!bm", name = "g", descriptor = "Len;")
    public class47 field2028;

    @OriginalMember(owner = "client!bm", name = "o", descriptor = "Len;")
    public class47 field2036;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(ILjava/lang/String;BILjava/lang/String;Ljava/lang/String;)V", line = 8)
    public static final void method985(int arg0, String arg1, byte arg2, int arg3, String arg4, String arg5) {
        field2023++;
        for (int var6 = 99; var6 > 0; var6--) {
            class80.field1019[var6] = class80.field1019[var6 - 1];
            class161.field2217[var6] = class161.field2217[var6 - 1];
            class217.field3041[var6] = class217.field3041[var6 - 1];
            class179.field2604[var6] = class179.field2604[var6 - 1];
            class301.field4703[var6] = class301.field4703[var6 - 1];
        }
        class136.field1890++;
        class61.field751 = class331.field5060;
        class161.field2217[0] = arg4;
        if (arg2 != -125) {
            field2035 = (String) null;
        }
        class217.field3041[0] = arg1;
        class179.field2604[0] = arg5;
        class80.field1019[0] = arg3;
        class301.field4703[0] = arg0;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(I)V", line = 45)
    public static void method986(int arg0) {
        field2035 = null;
        field2025 = null;
        if (arg0 != -1) {
            field2031 = 54;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Len;III)V", line = 64)
    public static final void method987(class47 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class62.field788) {
            class225 var4 = class158.field2184[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field3209 != null && var4.field3209.field1935.method274()) {
                arg0.method277(var4.field3209.field1935, 128, 0, 0, true);
            }
        }
        if (arg3 < class62.field788) {
            class225 var5 = class158.field2184[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field3209 != null && var5.field3209.field1935.method274()) {
                arg0.method277(var5.field3209.field1935, 0, 0, 128, true);
            }
        }
        if (arg2 < class62.field788 && arg3 < class326.field4993) {
            class225 var6 = class158.field2184[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field3209 != null && var6.field3209.field1935.method274()) {
                arg0.method277(var6.field3209.field1935, 128, 0, 128, true);
            }
        }
        if (arg2 < class62.field788 && arg3 > 0) {
            class225 var7 = class158.field2184[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field3209 != null && var7.field3209.field1935.method274()) {
                arg0.method277(var7.field3209.field1935, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(ILlc;)V", line = 114)
    public static final void method988(int arg0, class175 arg1) {
        field2022++;
        class14.field179 = arg1.method1179((byte) -104, "runes");
        if (arg0 != 0) {
            field2035 = (String) null;
        }
    }
}
