import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class12 {

    @OriginalMember(owner = "client!em", name = "c", descriptor = "Ljava/lang/String;")
    public static String field169 = "wave:";

    @OriginalMember(owner = "client!em", name = "b", descriptor = "S")
    public static short field168 = 32767;

    @OriginalMember(owner = "client!em", name = "f", descriptor = "I")
    public static int field172 = 1;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "C")
    public static char field167;

    @OriginalMember(owner = "client!em", name = "d", descriptor = "I")
    public static int field170;

    @OriginalMember(owner = "client!em", name = "e", descriptor = "I")
    public static int field171;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(II)V", line = 7)
    public static final void method85(int arg0, int arg1) {
        class276.field4301 = arg1;
        class313.field4842 = 3;
        field171++;
        int var2 = 54 / ((64 - arg0) / 55);
        class312.field4830 = 20;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IIIIBI)V", line = 23)
    public static final void method86(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        int var6 = -88 % ((arg4 - 48) / 50);
        field170++;
        class269.field4245[0].method1657(arg0, arg1);
        class269.field4245[1].method1657(arg0, arg1 + arg2 - 16);
        int var7 = (arg2 - 32) * arg2 / arg3;
        if (var7 < 8) {
            var7 = 8;
        }
        int var8 = (arg2 - var7 - 32) * arg5 / (arg3 - arg2);
        if (!class250.field3787) {
            class144.method977(arg0, arg1 + 16, 16, arg2 - 32, class44.field513);
            class144.method977(arg0, var8 + arg1 + 16, 16, var7, class98.field1277);
            class144.method958(arg0, arg1 - (-var8 - 16), var7, class195.field2801);
            class144.method958(arg0 + 1, var8 + 16 + arg1, var7, class195.field2801);
            class144.method965(arg0, var8 + arg1 + 16, 16, class195.field2801);
            class144.method965(arg0, arg1 + var8 + 17, 16, class195.field2801);
            class144.method958(arg0 + 15, arg1 - -var8 + 16, var7, class7.field93);
            class144.method958(arg0 + 14, arg1 + 17 + var8, var7 - 1, class7.field93);
            class144.method965(arg0, arg1 + var7 + var8 + 15, 16, class7.field93);
            class144.method965(arg0 + 1, arg1 + 14 - -var7 + var8, 15, class7.field93);
            return;
        }
        class306.method2154(arg0, arg1 + 16, 16, arg2 - 32, class44.field513);
        class306.method2154(arg0, arg1 + var8 + 16, 16, var7, class98.field1277);
        class306.method2148(arg0, arg1 - (-var8 - 16), var7, class195.field2801);
        class306.method2148(arg0 + 1, arg1 + 16 + var8, var7, class195.field2801);
        class306.method2146(arg0, arg1 + var8 + 16, 16, class195.field2801);
        class306.method2146(arg0, arg1 + var8 + 17, 16, class195.field2801);
        class306.method2148(arg0 + 15, arg1 + 16 + var8, var7, class7.field93);
        class306.method2148(arg0 + 14, var8 + 17 + arg1, var7 - 1, class7.field93);
        class306.method2146(arg0, arg1 + var8 + var7 + 15, 16, class7.field93);
        class306.method2146(arg0 + 1, arg1 + var7 - -14 - -var8, 15, class7.field93);
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Z)V", line = 78)
    public static void method87(boolean arg0) {
        if (!arg0) {
            field172 = -4;
        }
        field169 = null;
    }
}
