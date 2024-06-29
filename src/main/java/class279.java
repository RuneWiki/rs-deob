import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class279 extends class209 {

    @OriginalMember(owner = "client!gl", name = "D", descriptor = "Luf;")
    public static class168 field4680 = class148.method1019(-1720, "(U0a )2 non)2existant gosub script)2num: ");

    @OriginalMember(owner = "client!gl", name = "M", descriptor = "I")
    public static int field4688 = 0;

    @OriginalMember(owner = "client!gl", name = "K", descriptor = "I")
    public static int field4687 = 0;

    @OriginalMember(owner = "client!gl", name = "N", descriptor = "Luf;")
    public static class168 field4689 = class148.method1019(-1720, "Suche nach Updates )2 ");

    @OriginalMember(owner = "client!gl", name = "x", descriptor = "I")
    public static int field4674;

    @OriginalMember(owner = "client!gl", name = "z", descriptor = "I")
    public static int field4676;

    @OriginalMember(owner = "client!gl", name = "A", descriptor = "I")
    public static int field4677;

    @OriginalMember(owner = "client!gl", name = "B", descriptor = "I")
    public static int field4678;

    @OriginalMember(owner = "client!gl", name = "C", descriptor = "I")
    public static int field4679;

    @OriginalMember(owner = "client!gl", name = "F", descriptor = "I")
    public static int field4682;

    @OriginalMember(owner = "client!gl", name = "H", descriptor = "I")
    public static int field4684;

    @OriginalMember(owner = "client!gl", name = "I", descriptor = "I")
    public static int field4685;

    @OriginalMember(owner = "client!gl", name = "J", descriptor = "I")
    public static int field4686;

    @OriginalMember(owner = "client!gl", name = "O", descriptor = "I")
    public static int field4690;

    @OriginalMember(owner = "client!gl", name = "P", descriptor = "I")
    public static int field4691;

    @OriginalMember(owner = "client!gl", name = "E", descriptor = "[I")
    public int[] field4681;

    @OriginalMember(owner = "client!gl", name = "G", descriptor = "[I")
    private int[] field4683;

    @OriginalMember(owner = "client!gl", name = "w", descriptor = "[Luf;")
    private class168[] field4673;

    @OriginalMember(owner = "client!gl", name = "y", descriptor = "[[I")
    private int[][] field4675;

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "(I)I", line = 8)
    public final int method1924(int arg0) {
        field4685++;
        if (this.field4683 == null) {
            return 0;
        } else if (arg0 == 1) {
            return this.field4683.length;
        } else {
            return 117;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ILj;)Luf;", line = 33)
    public final class168 method1925(int arg0, class153 arg1) {
        field4682++;
        if (arg0 != 0) {
            return (class168) null;
        }
        class168 var3 = class126.method891(true, 80);
        if (this.field4683 != null) {
            for (int var4 = 0; var4 < this.field4683.length; var4++) {
                var3.method1207(arg0 ^ 0x5DD1, this.field4673[var4]);
                var3.method1207(24017, class65.method372(this.field4675[var4], this.field4683[var4], -118, arg1.method1048(false, class126.field1940[this.field4683[var4]])));
            }
        }
        var3.method1207(arg0 + 24017, this.field4673[this.field4673.length - 1]);
        return var3.method1201((byte) -98);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ILj;[I)V", line = 69)
    public final void method1926(int arg0, class153 arg1, int[] arg2) {
        field4679++;
        if (this.field4683 == null) {
            return;
        }
        for (int var4 = 0; this.field4683.length > var4 && var4 < arg2.length; var4++) {
            int var5 = class276.field4643[this.method1927(var4, -1)];
            if (var5 > 0) {
                arg1.method1077(var5, (byte) -29, (long) arg2[var4]);
            }
        }
        if (arg0 != -23522) {
            this.field4673 = (class168[]) null;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(II)I", line = 104)
    public final int method1927(int arg0, int arg1) {
        field4686++;
        if (this.field4683 == null || arg0 < 0 || this.field4683.length < arg0) {
            return -1;
        } else {
            if (arg1 != -1) {
                this.method1933(66);
            }
            return this.field4683[arg0];
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(BLcj;Ljava/lang/Object;)V", line = 134)
    public static final void method1928(byte arg0, class75 arg1, Object arg2) {
        field4684++;
        if (arg0 <= 90) {
            method1931(true);
        }
        if (arg1.field988 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg1.field988.peekEvent() != null; var3++) {
            class300.method2054(10, 1L);
        }
        if (arg2 != null) {
            arg1.field988.postEvent(new ActionEvent(arg2, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "(I)V", line = 160)
    public static final void method1929(int arg0) {
        field4676++;
        if (class48.field596 <= 0) {
            class242.field4018 = class157.field2493;
            class157.field2493 = null;
            int var1 = 67 / ((-arg0 - 9) / 40);
            class109.method810(40, 8858);
        } else {
            class144.method985(0);
        }
    }

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "(I)V", line = 183)
    public final void method1930(int arg0) {
        if (this.field4681 != null) {
            for (int var2 = 0; var2 < this.field4681.length; var2++) {
                this.field4681[var2] = class80.method492(this.field4681[var2], 32768);
            }
        }
        field4677++;
        if (arg0 != 0) {
            field4687 = -68;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Z)V", line = 202)
    public static void method1931(boolean arg0) {
        field4689 = null;
        if (arg0) {
            field4687 = -22;
        }
        field4680 = null;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ILj;B)V", line = 213)
    private final void method1932(int arg0, class153 arg1, byte arg2) {
        field4691++;
        if (arg2 != 77) {
            return;
        }
        if (arg0 == 1) {
            this.field4673 = arg1.method1075(81).method1191(-59, 60);
        } else if (arg0 == 2) {
            int var4 = arg1.method1042((byte) -110);
            this.field4681 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4681[var5] = arg1.method1069(41);
            }
        } else if (arg0 == 3) {
            int var6 = arg1.method1042((byte) -78);
            this.field4683 = new int[var6];
            this.field4675 = new int[var6][];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg1.method1069(87);
                this.field4683[var7] = var8;
                this.field4675[var7] = new int[class140.field2171[var8]];
                for (int var9 = 0; var9 < class140.field2171[var8]; var9++) {
                    this.field4675[var7][var9] = arg1.method1069(99);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gl", name = "f", descriptor = "(I)Luf;", line = 278)
    public final class168 method1933(int arg0) {
        field4690++;
        if (arg0 != 80) {
            field4680 = (class168) null;
        }
        class168 var2 = class126.method891(true, 80);
        if (this.field4673 == null) {
            return class238.field3874;
        }
        var2.method1207(arg0 ^ 0x5D81, this.field4673[0]);
        for (int var3 = 1; var3 < this.field4673.length; var3++) {
            var2.method1207(24017, class52.field634);
            var2.method1207(24017, this.field4673[var3]);
        }
        return var2.method1201((byte) -98);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(III)I", line = 309)
    public final int method1934(int arg0, int arg1, int arg2) {
        field4678++;
        if (this.field4683 == null || arg2 < 0 || arg2 > this.field4683.length) {
            return -1;
        } else if (this.field4675[arg2] == null || arg0 < 0 || this.field4675[arg2].length < arg0) {
            return -1;
        } else {
            if (arg1 != -1) {
                this.field4681 = (int[]) null;
            }
            return this.field4675[arg2][arg0];
        }
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(ILj;)V", line = 339)
    public final void method1935(int arg0, class153 arg1) {
        while (true) {
            int var3 = arg1.method1042((byte) 96);
            if (var3 == 0) {
                if (arg0 < 64) {
                    method1928((byte) -4, (class75) null, (Object) null);
                }
                field4674++;
                return;
            }
            this.method1932(var3, arg1, (byte) 77);
        }
    }
}
