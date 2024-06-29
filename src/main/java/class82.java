import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class82 {

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "Ldp;")
    private class342 field1208;

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "Lun;")
    private class204 field1211;

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "Ljn;")
    private class87 field1209;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "I")
    public static int field1203;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "I")
    public static int field1204;

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "I")
    public static int field1206;

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "I")
    public static int field1207;

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "I")
    public static int field1210;

    @OriginalMember(owner = "client!ld", name = "k", descriptor = "I")
    public static int field1212;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "Lhw;")
    private class208 field1202;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ld", name = "l", descriptor = "Ljava/lang/Class;")
    public static Class field1213;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "[Lrt;")
    private class322[] field1205;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILbh;Lbh;I)Lrt;")
    public final class322 method579(int arg0, class307 arg1, class307 arg2, int arg3) {
        if (arg3 != -20485) {
            this.field1202 = null;
        }
        field1210++;
        return this.method582(arg3 + 44411, true, arg2, arg1, arg0);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)Z")
    public final boolean method580(byte arg0) {
        if (arg0 != -53) {
            this.method580((byte) -54);
        }
        field1203++;
        if (this.field1202 != null) {
            return true;
        }
        if (this.field1209 == null) {
            if (this.field1211.method1397(27573)) {
                return false;
            }
            this.field1209 = this.field1211.method1398(true, arg0 - 56, 255, 255, (byte) 0);
        }
        if (this.field1209.field4368) {
            return false;
        } else {
            this.field1202 = new class208(this.field1209.method539(23));
            this.field1205 = new class322[(this.field1202.field3193.length - 5) / 8];
            return true;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
    public final void method581(int arg0) {
        field1204++;
        if (this.field1205 == null) {
            return;
        }
        for (int var2 = arg0; var2 < this.field1205.length; var2++) {
            if (this.field1205[var2] != null) {
                this.field1205[var2].method2159((byte) -111);
            }
        }
        for (int var3 = 0; var3 < this.field1205.length; var3++) {
            if (this.field1205[var3] != null) {
                this.field1205[var3].method2154((byte) 76);
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IZLbh;Lbh;I)Lrt;")
    private final class322 method582(int arg0, boolean arg1, class307 arg2, class307 arg3, int arg4) {
        field1212++;
        if (this.field1202 == null) {
            throw new RuntimeException();
        }
        this.field1202.field3162 = arg4 * 8 + 5;
        if (this.field1202.field3193.length <= this.field1202.field3162) {
            throw new RuntimeException();
        } else if (this.field1205[arg4] == null) {
            int var6 = this.field1202.method1436((byte) 117);
            int var7 = this.field1202.method1436((byte) 86);
            if (arg0 != 23926) {
                method583((byte) -42);
            }
            class322 var8 = new class322(arg4, arg2, arg3, this.field1211, this.field1208, var6, var7, arg1);
            this.field1205[arg4] = var8;
            return var8;
        } else {
            return this.field1205[arg4];
        }
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(B)V")
    public static final void method583(byte arg0) {
        field1206++;
        try {
            if (arg0 > -36) {
                method583((byte) 21);
            }
            Method var1 = (field1213 == null ? (field1213 = method584("java.lang.Runtime")) : field1213).getMethod("availableProcessors");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Integer var3 = (Integer) var1.invoke(var2, (Object[]) null);
                    class236.field3878 = var3;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Lun;Ldp;)V")
    public class82(class204 arg0, class342 arg1) {
        this.field1208 = arg1;
        this.field1211 = arg0;
        if (!this.field1211.method1397(27573)) {
            this.field1209 = this.field1211.method1398(true, -43, 255, 255, (byte) 0);
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method584(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
