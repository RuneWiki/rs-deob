import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class159 {

    @OriginalMember(owner = "client!rh", name = "l", descriptor = "Z")
    public boolean field2191 = false;

    @OriginalMember(owner = "client!rh", name = "h", descriptor = "Lhu;")
    private class76 field2187 = new class76(64);

    @OriginalMember(owner = "client!rh", name = "q", descriptor = "Lhu;")
    public class76 field2196 = new class76(500);

    @OriginalMember(owner = "client!rh", name = "t", descriptor = "Lhu;")
    public class76 field2199 = new class76(30);

    @OriginalMember(owner = "client!rh", name = "u", descriptor = "Lhu;")
    public class76 field2200 = new class76(50);

    @OriginalMember(owner = "client!rh", name = "n", descriptor = "Lr;")
    private class110 field2193;

    @OriginalMember(owner = "client!rh", name = "o", descriptor = "Z")
    public boolean field2194;

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "Lr;")
    public class110 field2183;

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "Lgd;")
    public static class206 field2181 = new class206("Loaded world map", "Weltkarte geladen", "Mappemonde chargée", "Mapa-múndi carregado");

    @OriginalMember(owner = "client!rh", name = "p", descriptor = "[Lac;")
    public static class348[] field2195;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "I")
    public static int field2180;

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "I")
    public static int field2182;

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "I")
    public static int field2184;

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "I")
    public static int field2185;

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "I")
    public static int field2186;

    @OriginalMember(owner = "client!rh", name = "i", descriptor = "I")
    public static int field2188;

    @OriginalMember(owner = "client!rh", name = "j", descriptor = "I")
    public static int field2189;

    @OriginalMember(owner = "client!rh", name = "k", descriptor = "I")
    public static int field2190;

    @OriginalMember(owner = "client!rh", name = "m", descriptor = "I")
    public static int field2192;

    @OriginalMember(owner = "client!rh", name = "s", descriptor = "I")
    public static int field2198;

    @OriginalMember(owner = "client!rh", name = "v", descriptor = "I")
    public int field2201;

    @OriginalMember(owner = "client!rh", name = "r", descriptor = "Lwp;")
    public static class109 field2197;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)V")
    public final void method927(int arg0, int arg1) {
        field2182++;
        this.field2201 = arg0;
        class76 var3 = this.field2196;
        synchronized (this.field2196) {
            this.field2196.method495(-120);
        }
        if (arg1 != -31264) {
            this.method930((byte) -43);
        }
        class76 var4 = this.field2199;
        synchronized (this.field2199) {
            this.field2199.method495(-128);
        }
        class76 var5 = this.field2200;
        synchronized (this.field2200) {
            this.field2200.method495(-84);
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Z)V")
    public static void method928(boolean arg0) {
        if (!arg0) {
            method928(true);
        }
        field2197 = null;
        field2181 = null;
        field2195 = null;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(BZ)V")
    public final void method929(byte arg0, boolean arg1) {
        field2198++;
        int var3 = 89 % ((arg0 - 55) / 40);
        if (arg1 != this.field2194) {
            this.field2194 = arg1;
            this.method931(18133);
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(B)V")
    public final void method930(byte arg0) {
        class76 var2 = this.field2187;
        synchronized (this.field2187) {
            this.field2187.method502(0);
        }
        field2189++;
        class76 var3 = this.field2196;
        synchronized (this.field2196) {
            this.field2196.method502(0);
        }
        class76 var4 = this.field2199;
        synchronized (this.field2199) {
            this.field2199.method502(arg0 ^ 0x4E);
        }
        class76 var5 = this.field2200;
        synchronized (this.field2200) {
            this.field2200.method502(0);
        }
        if (arg0 != 78) {
            this.field2183 = null;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V")
    public final void method931(int arg0) {
        class76 var2 = this.field2187;
        synchronized (this.field2187) {
            this.field2187.method495(-73);
        }
        field2186++;
        class76 var3 = this.field2196;
        synchronized (this.field2196) {
            this.field2196.method495(-97);
            if (arg0 != 18133) {
                field2181 = null;
            }
        }
        class76 var4 = this.field2199;
        synchronized (this.field2199) {
            this.field2199.method495(-111);
        }
        class76 var5 = this.field2200;
        synchronized (this.field2200) {
            this.field2200.method495(-86);
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IZ)V")
    public final void method932(int arg0, boolean arg1) {
        field2190++;
        if (arg0 != 0) {
            this.method930((byte) 123);
        }
        if (this.field2191 != arg1) {
            this.field2191 = arg1;
            this.method931(18133);
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IB)V")
    public final void method933(int arg0, byte arg1) {
        field2192++;
        if (arg1 <= 61) {
            this.method927(-10, -63);
        }
        this.field2187 = new class76(arg0);
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(II)V")
    public final void method934(int arg0, int arg1) {
        field2184++;
        class76 var3 = this.field2187;
        synchronized (this.field2187) {
            this.field2187.method496(arg1, -114);
        }
        class76 var4 = this.field2196;
        synchronized (this.field2196) {
            this.field2196.method496(arg1, -81);
        }
        class76 var5 = this.field2199;
        synchronized (this.field2199) {
            int var6 = 55 % ((-arg0 - 22) / 52);
            this.field2199.method496(arg1, -91);
        }
        class76 var7 = this.field2200;
        synchronized (this.field2200) {
            this.field2200.method496(arg1, -26);
        }
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(IB)Lct;")
    public final class88 method935(int arg0, byte arg1) {
        field2188++;
        class76 var3 = this.field2187;
        class88 var4;
        synchronized (this.field2187) {
            var4 = (class88) this.field2187.method493((byte) 19, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field2193.method702((byte) 43, class164.method959(arg0, 255), class108.method672(-127, arg0));
        class88 var6 = new class88();
        var6.field1298 = arg0;
        var6.field1293 = this;
        if (var5 != null) {
            var6.method567(new class32(var5), 3);
        }
        int var7 = -19 / ((-arg1 - 1) / 42);
        var6.method557((byte) 113);
        if (var6.field1227) {
            var6.field1245 = 0;
            var6.field1280 = false;
        }
        if (!this.field2194 && var6.field1268) {
            var6.field1275 = null;
            var6.field1304 = null;
        }
        class76 var8 = this.field2187;
        synchronized (this.field2187) {
            this.field2187.method505((long) arg0, var6, 83);
            return var6;
        }
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(Ldn;IZLr;Lr;)V")
    public class159(class329 arg0, int arg1, boolean arg2, class110 arg3, class110 arg4) {
        this.field2193 = arg3;
        this.field2194 = arg2;
        this.field2183 = arg4;
        if (this.field2193 != null) {
            int var6 = this.field2193.method705((byte) -89) - 1;
            this.field2193.method694(var6, (byte) 119);
        }
    }

    static {
        new class206("Unable to send message - system busy.", "Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.", "Impossible d'envoyer un message - système occupé.", "Não foi possível enviar a mensagem. O sistema está ocupado.");
        field2195 = new class348[0];
    }
}
