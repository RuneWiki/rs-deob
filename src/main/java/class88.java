import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class88 {

    @OriginalMember(owner = "client!od", name = "i", descriptor = "Lg;")
    public class37 field1984 = new class37();

    @OriginalMember(owner = "client!od", name = "p", descriptor = "Lo;")
    public static class84 field1991 = class15.method124("Login server offline)3", 255);

    @OriginalMember(owner = "client!od", name = "l", descriptor = "Lo;")
    public static class84 field1987 = class15.method124("@or2@", 255);

    @OriginalMember(owner = "client!od", name = "s", descriptor = "[Loc;")
    public static class87[] field1994 = new class87[50];

    @OriginalMember(owner = "client!od", name = "u", descriptor = "Lo;")
    public static class84 field1996 = class15.method124("Trade)4compete", 255);

    @OriginalMember(owner = "client!od", name = "r", descriptor = "Z")
    public static boolean field1993 = true;

    @OriginalMember(owner = "client!od", name = "g", descriptor = "Lo;")
    public static class84 field1982 = class15.method124("Loading textures )2 ", 255);

    @OriginalMember(owner = "client!od", name = "o", descriptor = "I")
    public static int field1990 = -1;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "I")
    public static int field1976;

    @OriginalMember(owner = "client!od", name = "b", descriptor = "I")
    public static int field1977;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "I")
    public static int field1979;

    @OriginalMember(owner = "client!od", name = "e", descriptor = "I")
    public static int field1980;

    @OriginalMember(owner = "client!od", name = "f", descriptor = "I")
    public static int field1981;

    @OriginalMember(owner = "client!od", name = "h", descriptor = "I")
    public static int field1983;

    @OriginalMember(owner = "client!od", name = "j", descriptor = "I")
    public static int field1985;

    @OriginalMember(owner = "client!od", name = "k", descriptor = "I")
    public static int field1986;

    @OriginalMember(owner = "client!od", name = "m", descriptor = "I")
    public static int field1988;

    @OriginalMember(owner = "client!od", name = "n", descriptor = "I")
    public static int field1989;

    @OriginalMember(owner = "client!od", name = "q", descriptor = "I")
    public static int field1992;

    @OriginalMember(owner = "client!od", name = "t", descriptor = "I")
    public static int field1995;

    @OriginalMember(owner = "client!od", name = "v", descriptor = "I")
    public static int field1997;

    @OriginalMember(owner = "client!od", name = "x", descriptor = "I")
    public static int field1999;

    @OriginalMember(owner = "client!od", name = "y", descriptor = "I")
    public static int field2000;

    @OriginalMember(owner = "client!od", name = "z", descriptor = "I")
    public static int field2001;

    @OriginalMember(owner = "client!od", name = "A", descriptor = "I")
    public static int field2002;

    @OriginalMember(owner = "client!od", name = "B", descriptor = "I")
    public static int field2003;

    @OriginalMember(owner = "client!od", name = "w", descriptor = "Lg;")
    private class37 field1998;

    @OriginalMember(owner = "client!od", name = "c", descriptor = "[[[B")
    public static byte[][][] field1978;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Z)Lg;", line = 6)
    public final class37 method689(boolean arg0) {
        field2003++;
        if (arg0) {
            this.method694(64, null, null);
        }
        class37 var2 = this.field1984.field726;
        if (this.field1984 == var2) {
            return null;
        } else {
            var2.method333(0);
            return var2;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V", line = 25)
    public static void method690(int arg0) {
        if (arg0 != -19737) {
            return;
        }
        field1982 = null;
        field1987 = null;
        field1991 = null;
        field1978 = null;
        field1994 = null;
        field1996 = null;
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(I)Lg;", line = 45)
    public final class37 method691(int arg0) {
        class37 var2 = this.field1984.field733;
        field1997++;
        if (this.field1984 == var2) {
            return null;
        }
        var2.method333(0);
        if (arg0 != -20575) {
            this.method697((byte) -2);
        }
        return var2;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(BLg;)V", line = 72)
    public final void method692(byte arg0, class37 arg1) {
        field1980++;
        if (arg1.field726 != null) {
            arg1.method333(arg0 + 98);
        }
        arg1.field733 = this.field1984;
        if (arg0 != -98) {
            this.method691(1);
        }
        arg1.field726 = this.field1984.field726;
        arg1.field726.field733 = arg1;
        arg1.field733.field726 = arg1;
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "()V", line = 289)
    public class88() {
        this.field1984.field726 = this.field1984;
        this.field1984.field733 = this.field1984;
    }

    @OriginalMember(owner = "client!od", name = "c", descriptor = "(I)V", line = 95)
    public final void method693(int arg0) {
        field1983++;
        if (arg0 != -9707) {
            this.method697((byte) 90);
        }
        while (true) {
            class37 var2 = this.field1984.field733;
            if (this.field1984 == var2) {
                return;
            }
            var2.method333(0);
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ILg;Lg;)V", line = 122)
    public final void method694(int arg0, class37 arg1, class37 arg2) {
        field1981++;
        if (arg2.field726 != null) {
            arg2.method333(0);
        }
        arg2.field733 = arg1;
        arg2.field726 = arg1.field726;
        arg2.field726.field733 = arg2;
        arg2.field733.field726 = arg2;
        if (arg0 >= -21) {
            method690(-110);
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(B)Lg;", line = 140)
    public final class37 method695(byte arg0) {
        field1977++;
        class37 var2 = this.field1984.field733;
        if (arg0 > -110) {
            return null;
        } else if (this.field1984 == var2) {
            this.field1998 = null;
            return null;
        } else {
            this.field1998 = var2.field733;
            return var2;
        }
    }

    @OriginalMember(owner = "client!od", name = "d", descriptor = "(I)Lg;", line = 163)
    public final class37 method696(int arg0) {
        field1985++;
        if (arg0 >= -85) {
            this.method700((byte) 37, null);
        }
        class37 var2 = this.field1998;
        if (this.field1984 == var2) {
            this.field1998 = null;
            return null;
        } else {
            this.field1998 = var2.field726;
            return var2;
        }
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(B)Lg;", line = 188)
    public final class37 method697(byte arg0) {
        field1976++;
        class37 var2 = this.field1984.field726;
        if (this.field1984 == var2) {
            this.field1998 = null;
            return null;
        } else if (arg0 == -68) {
            this.field1998 = var2.field726;
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!od", name = "e", descriptor = "(I)V", line = 217)
    public static final void method698(int arg0) {
        for (int var1 = arg0; var1 < class85.field1933; var1++) {
            int var2 = class75.field1571[var1];
            class115 var3 = class3.field30[var2];
            if (var3 != null) {
                class110.method854(var3, var3.field2501.field754, 64);
            }
        }
        field2002++;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(II)Z", line = 270)
    public static final boolean method699(int arg0, int arg1) {
        field2000++;
        if (arg0 < 32) {
            return false;
        } else if (arg0 == arg1) {
            return false;
        } else {
            return arg0 < 129 || arg0 > 159;
        }
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(BLg;)V", line = 311)
    public final void method700(byte arg0, class37 arg1) {
        field1992++;
        if (arg1.field726 != null) {
            arg1.method333(0);
        }
        arg1.field726 = this.field1984;
        if (arg0 > -102) {
            method701(93);
        }
        arg1.field733 = this.field1984.field733;
        arg1.field726.field733 = arg1;
        arg1.field733.field726 = arg1;
    }

    @OriginalMember(owner = "client!od", name = "f", descriptor = "(I)V", line = 330)
    public static final void method701(int arg0) {
        class3.field38.method707(-90);
        class125.field2766 = class7.method51(class125.field2766);
        if (arg0 == 25085) {
            field1988++;
        }
    }

    @OriginalMember(owner = "client!od", name = "g", descriptor = "(I)Lg;", line = 342)
    public final class37 method702(int arg0) {
        field1999++;
        class37 var2 = this.field1998;
        if (this.field1984 == var2) {
            this.field1998 = null;
            return null;
        }
        if (arg0 != 0) {
            this.method694(13, null, null);
        }
        this.field1998 = var2.field733;
        return var2;
    }
}
