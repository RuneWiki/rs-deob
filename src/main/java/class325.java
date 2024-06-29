import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public class class325 {

    @OriginalMember(owner = "client!ss", name = "i", descriptor = "Ljo;")
    private class382 field5072 = new class382(64);

    @OriginalMember(owner = "client!ss", name = "j", descriptor = "Ljo;")
    public class382 field5073 = new class382(30);

    @OriginalMember(owner = "client!ss", name = "f", descriptor = "Lok;")
    private class74 field5069;

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "Lok;")
    public class74 field5065;

    @OriginalMember(owner = "client!ss", name = "h", descriptor = "I")
    public static int field5071 = 0;

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "I")
    public static int field5064;

    @OriginalMember(owner = "client!ss", name = "c", descriptor = "I")
    public static int field5066;

    @OriginalMember(owner = "client!ss", name = "d", descriptor = "I")
    public static int field5067;

    @OriginalMember(owner = "client!ss", name = "e", descriptor = "I")
    public static int field5068;

    @OriginalMember(owner = "client!ss", name = "g", descriptor = "I")
    public static int field5070;

    @OriginalMember(owner = "client!ss", name = "k", descriptor = "I")
    public int field5074;

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(I)V", line = 6)
    public final void method2021(int arg0) {
        field5070++;
        class382 var2 = this.field5072;
        synchronized (this.field5072) {
            if (arg0 != -1) {
                this.field5072 = null;
            }
            this.field5072.method2293(false);
        }
        class382 var3 = this.field5073;
        synchronized (this.field5073) {
            this.field5073.method2293(false);
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(II)Lhk;", line = 24)
    public final class270 method2022(int arg0, int arg1) {
        field5067++;
        if (arg0 != 30) {
            this.method2021(36);
        }
        class382 var3 = this.field5072;
        class270 var4;
        synchronized (this.field5072) {
            var4 = (class270) this.field5072.method2288((long) arg1, 0);
        }
        if (var4 != null) {
            return var4;
        }
        class74 var5 = this.field5069;
        byte[] var6;
        synchronized (this.field5069) {
            var6 = this.field5069.method541(class419.method2498(-57, arg1), class76.method561(arg1, 21012), (byte) -122);
        }
        class270 var7 = new class270();
        var7.field4008 = arg1;
        var7.field4010 = this;
        if (var6 != null) {
            var7.method1688((byte) -101, new class468(var6));
        }
        class382 var8 = this.field5072;
        synchronized (this.field5072) {
            this.field5072.method2290((long) arg1, var7, 99);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "(II)V", line = 64)
    public final void method2023(int arg0, int arg1) {
        this.field5074 = arg1;
        if (arg0 >= -111) {
            return;
        }
        field5064++;
        class382 var3 = this.field5073;
        synchronized (this.field5073) {
            this.field5073.method2293(false);
        }
    }

    @OriginalMember(owner = "client!ss", name = "<init>", descriptor = "(Lkr;ILok;Lok;)V", line = 108)
    public class325(class262 arg0, int arg1, class74 arg2, class74 arg3) {
        this.field5069 = arg2;
        this.field5065 = arg3;
        int var5 = this.field5069.method535((byte) 117) - 1;
        this.field5069.method536(false, var5);
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(ZI)V", line = 88)
    public final void method2024(boolean arg0, int arg1) {
        field5066++;
        if (arg0) {
            this.method2023(-48, -111);
        }
        class382 var3 = this.field5072;
        synchronized (this.field5072) {
            this.field5072.method2294(arg1, true);
        }
        class382 var4 = this.field5073;
        synchronized (this.field5073) {
            this.field5073.method2294(arg1, true);
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(Z)V", line = 126)
    public final void method2025(boolean arg0) {
        field5068++;
        class382 var2 = this.field5072;
        synchronized (this.field5072) {
            this.field5072.method2287(118);
        }
        if (arg0) {
            class382 var3 = this.field5073;
            synchronized (this.field5073) {
                this.field5073.method2287(84);
            }
        }
    }
}
