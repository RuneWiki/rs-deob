import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class435 extends RuntimeException {

    @OriginalMember(owner = "client!n", name = "a", descriptor = "Ljava/lang/Throwable;")
    public Throwable field5971;

    @OriginalMember(owner = "client!n", name = "e", descriptor = "Ljava/lang/String;")
    public String field5975;

    @OriginalMember(owner = "client!n", name = "f", descriptor = "[I")
    public static int[] field5976 = new int[2];

    @OriginalMember(owner = "client!n", name = "d", descriptor = "I")
    public static int field5974;

    @OriginalMember(owner = "client!n", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field5972;

    @OriginalMember(owner = "client!n", name = "c", descriptor = "[[Z")
    public static boolean[][] field5973;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(BI)Lcl;", line = 4)
    public static final class214 method2530(byte arg0, int arg1) {
        field5974++;
        if (arg0 != 125) {
            method2531((byte) 94);
        }
        if (arg1 == 0) {
            return new class341();
        } else if (arg1 == 1) {
            return new class243();
        } else if (arg1 == 2) {
            return new class191();
        } else if (arg1 == 3) {
            return new class396();
        } else if (arg1 == 4) {
            return new class327();
        } else if (arg1 == 5) {
            return new class199();
        } else if (arg1 == 6) {
            return new class431();
        } else if (arg1 == 7) {
            return new class105();
        } else if (arg1 == 8) {
            return new class262();
        } else if (arg1 == 9) {
            return new class266();
        } else if (arg1 == 10) {
            return new class181();
        } else if (arg1 == 11) {
            return new class231();
        } else if (arg1 == 12) {
            return new class39();
        } else if (arg1 == 13) {
            return new class61();
        } else if (arg1 == 14) {
            return new class194();
        } else if (arg1 == 15) {
            return new class438();
        } else if (arg1 == 16) {
            return new class320();
        } else if (arg1 == 17) {
            return new class355();
        } else if (arg1 == 18) {
            return new class227();
        } else if (arg1 == 19) {
            return new class2();
        } else if (arg1 == 20) {
            return new class357();
        } else if (arg1 == 21) {
            return new class376();
        } else if (arg1 == 22) {
            return new class448();
        } else if (arg1 == 23) {
            return new class3();
        } else if (arg1 == 24) {
            return new class286();
        } else if (arg1 == 25) {
            return new class422();
        } else if (arg1 == 26) {
            return new class375();
        } else if (arg1 == 27) {
            return new class274();
        } else if (arg1 == 28) {
            return new class326();
        } else if (arg1 == 29) {
            return new class120();
        } else if (arg1 == 30) {
            return new class42();
        } else if (arg1 == 31) {
            return new class245();
        } else if (arg1 == 32) {
            return new class468();
        } else if (arg1 == 33) {
            return new class211();
        } else if (arg1 == 34) {
            return new class153();
        } else if (arg1 == 35) {
            return new class434();
        } else if (arg1 == 36) {
            return new class337();
        } else if (arg1 == 37) {
            return new class19();
        } else if (arg1 == 38) {
            return new class138();
        } else if (arg1 == 39) {
            return new class205();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(B)V", line = 328)
    public static void method2531(byte arg0) {
        field5976 = null;
        field5972 = null;
        if (arg0 != 53) {
            method2531((byte) -115);
        }
        field5973 = null;
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 340)
    public class435(Throwable arg0, String arg1) {
        this.field5971 = arg0;
        this.field5975 = arg1;
    }
}
