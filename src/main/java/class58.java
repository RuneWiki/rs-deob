import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public class class58 {

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "Lwm;")
    private class399 field1220 = new class399(64);

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "Lph;")
    public class459 field1219;

    @OriginalMember(owner = "client!gv", name = "e", descriptor = "Lph;")
    private class459 field1223;

    @OriginalMember(owner = "client!gv", name = "f", descriptor = "I")
    public static int field1224;

    @OriginalMember(owner = "client!gv", name = "g", descriptor = "I")
    public static int field1225;

    @OriginalMember(owner = "client!gv", name = "h", descriptor = "I")
    public static int field1226;

    @OriginalMember(owner = "client!gv", name = "j", descriptor = "I")
    public static int field1228;

    @OriginalMember(owner = "client!gv", name = "d", descriptor = "Lph;")
    public static class459 field1222;

    @OriginalMember(owner = "client!gv", name = "c", descriptor = "[I")
    public static int[] field1221;

    @OriginalMember(owner = "client!gv", name = "i", descriptor = "[I")
    public static int[] field1227;

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(Z)V", line = 3)
    public static void method522(boolean arg0) {
        field1221 = null;
        field1227 = null;
        if (arg0) {
            field1221 = null;
        }
        field1222 = null;
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(ZI)Lmm;", line = 16)
    public final class185 method523(boolean arg0, int arg1) {
        field1226++;
        class399 var3 = this.field1220;
        class185 var4;
        synchronized (this.field1220) {
            var4 = (class185) this.field1220.method2478(1, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg0) {
            this.method525(-120);
        }
        class459 var5 = this.field1223;
        byte[] var6;
        synchronized (this.field1223) {
            var6 = this.field1223.method2757(3, arg1, (byte) -122);
        }
        class185 var7 = new class185();
        var7.field2964 = this;
        if (var6 != null) {
            var7.method1267(new class289(var6), -128);
        }
        class399 var8 = this.field1220;
        synchronized (this.field1220) {
            this.field1220.method2472(101, var7, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(I)V", line = 47)
    public final void method524(int arg0) {
        class399 var2 = this.field1220;
        synchronized (this.field1220) {
            this.field1220.method2477(-111);
        }
        if (arg0 == 3) {
            field1228++;
        }
    }

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "(I)V", line = 65)
    public final void method525(int arg0) {
        class399 var2 = this.field1220;
        synchronized (this.field1220) {
            this.field1220.method2475((byte) 67);
        }
        if (arg0 > 91) {
            field1225++;
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(II)V", line = 81)
    public final void method526(int arg0, int arg1) {
        field1224++;
        class399 var3 = this.field1220;
        synchronized (this.field1220) {
            if (arg0 == 3) {
                this.field1220.method2471((byte) 98, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(Lkp;ILph;Lph;)V", line = 103)
    public class58(class341 arg0, int arg1, class459 arg2, class459 arg3) {
        this.field1219 = arg3;
        this.field1223 = arg2;
        this.field1223.method2763(3, -3);
    }
}
