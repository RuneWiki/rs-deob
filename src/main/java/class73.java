import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public class class73 {

    @OriginalMember(owner = "client!ds", name = "c", descriptor = "I")
    public int field987;

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "Lds;")
    public static class73 field985 = new class73(1);

    @OriginalMember(owner = "client!ds", name = "d", descriptor = "Lds;")
    public static class73 field988 = new class73(2);

    @OriginalMember(owner = "client!ds", name = "e", descriptor = "Lds;")
    public static class73 field989 = new class73(4);

    @OriginalMember(owner = "client!ds", name = "f", descriptor = "Lds;")
    public static class73 field990 = new class73(1);

    @OriginalMember(owner = "client!ds", name = "g", descriptor = "Lds;")
    public static class73 field991 = new class73(2);

    @OriginalMember(owner = "client!ds", name = "h", descriptor = "Lds;")
    public static class73 field992 = new class73(4);

    @OriginalMember(owner = "client!ds", name = "i", descriptor = "Lds;")
    public static class73 field993 = new class73(2);

    @OriginalMember(owner = "client!ds", name = "j", descriptor = "Lds;")
    public static class73 field994 = new class73(4);

    @OriginalMember(owner = "client!ds", name = "l", descriptor = "Ljava/lang/Object;")
    public static volatile Object field996 = null;

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "I")
    public static int field986;

    @OriginalMember(owner = "client!ds", name = "k", descriptor = "Ltba;")
    public static class339 field995;

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(I)V", line = 9)
    public static void method433(int arg0) {
        field993 = null;
        field991 = null;
        field992 = null;
        field995 = null;
        field985 = null;
        field990 = null;
        field994 = null;
        if (arg0 != 2) {
            method433(-58);
        }
        field988 = null;
        field989 = null;
        field996 = null;
    }

    @OriginalMember(owner = "client!ds", name = "toString", descriptor = "()Ljava/lang/String;", line = 29)
    public final String toString() {
        field986++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(I)V", line = 36)
    private class73(int arg0) {
        this.field987 = arg0;
    }
}
