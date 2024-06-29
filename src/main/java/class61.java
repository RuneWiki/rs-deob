import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class61 {

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "I")
    public static int field887 = -1;

    @OriginalMember(owner = "client!hl", name = "f", descriptor = "Ljava/lang/String;")
    public static String field889 = "Attack";

    @OriginalMember(owner = "client!hl", name = "i", descriptor = "I")
    public static int field892 = 0;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "I")
    public static int field884;

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "I")
    public static int field885;

    @OriginalMember(owner = "client!hl", name = "g", descriptor = "I")
    public static int field890;

    @OriginalMember(owner = "client!hl", name = "h", descriptor = "I")
    public static int field891;

    @OriginalMember(owner = "client!hl", name = "j", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field893;

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "[Lrb;")
    public static class210[] field888;

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "[Lnj;")
    public static class215[] field886;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "([BILim;)V")
    public final void method388(byte[] arg0, int arg1, class170 arg2) {
        field890++;
        if (arg2.field2650[arg2.field2676] != 31 || arg2.field2650[arg2.field2676 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field893 == null) {
            this.field893 = new Inflater(true);
        }
        try {
            this.field893.setInput(arg2.field2650, arg2.field2676 + 10, -arg2.field2676 + -10 + arg2.field2650.length + -8);
            this.field893.inflate(arg0);
        } catch (Exception var4) {
            this.field893.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        if (arg1 != 10087) {
            method390(87);
        }
        this.field893.reset();
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)V")
    public static void method389(int arg0) {
        field889 = null;
        field888 = null;
        field886 = null;
        if (arg0 != 15) {
            method391(111, 88);
        }
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(I)V")
    public static final void method390(int arg0) {
        int var1 = class206.field3229;
        field891++;
        int var2 = class89.field1332;
        int var3 = class249.field4040;
        int var4 = class45.field548;
        int var5 = 6116423;
        class151.method1026(var4, var1, var2, var3, var5);
        class151.method1026(var4 + 1, arg0 + var1, var2 - 2, 16, 0);
        class151.method1040(var4 + 1, var1 + 18, var2 - 2, var3 + -19, 0);
        class306.field4885.method1486(class177.field2783, var4 + 3, var1 + 14, var5, -1);
        int var6 = class71.field1042;
        int var7 = class50.field633;
        for (int var8 = 0; var8 < class173.field2721; var8++) {
            int var9 = (class173.field2721 - var8 - 1) * 15 + var1 + 31;
            int var10 = 16777215;
            if (var7 > var4 && var7 < var4 + var2 && var6 > (var9 - 13) && var6 < (var9 + 3)) {
                var10 = 16776960;
            }
            class306.field4885.method1486(class211.method1463(-126, var8), var4 + 3, var9, var10, 0);
        }
        class287.method1961(class45.field548, arg0 - 91, class249.field4040, class206.field3229, class89.field1332);
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "()V")
    public class61() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(II)V")
    public static final void method391(int arg0, int arg1) {
        class45.method253(arg0 + 18415);
        field885++;
        class234.method1646(arg0 ^ 0xA759C4D5);
        int var2 = class118.method775(29142, arg1).field2185;
        if (var2 == 0) {
            return;
        }
        int var3 = class299.field4770[arg1];
        if (~var2 == arg0) {
            class270.field4402 = var3;
        }
        if (var2 == 5) {
            class10.field153 = var3;
        }
        if (var2 == 9) {
            class191.field2979 = var3;
        }
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(III)V")
    private class61(int arg0, int arg1, int arg2) {
    }
}
