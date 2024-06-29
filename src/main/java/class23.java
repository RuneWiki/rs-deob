import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class23 {

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "I")
    public static int field361;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "I")
    public static int field363;

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "Ljava/awt/Image;")
    public static Image field362;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Z)V")
    public static void method168(boolean arg0) {
        field362 = null;
        if (arg0) {
            field362 = null;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)V")
    public static final void method169(byte arg0) {
        int var1 = 126 % ((-arg0 - 7) / 55);
        field363++;
        if (class316.field4063 == -1) {
            return;
        }
        int var2 = class289.field3592.method944(2000);
        int var3 = class289.field3592.method941(99);
        class368 var4 = (class368) class403.field5058.method237(115);
        if (var4 != null) {
            var2 = var4.method437(9);
            var3 = var4.method439(true);
        }
        class514.method2779((byte) -99, 0, var2, 0, class523.field7111, 0, class316.field4063, 0, var3, class244.field3022);
        if (class147.field1887 != null) {
            class502.method2701(false, var3, var2);
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILks;)V")
    public static final void method170(int arg0, class30 arg1) {
        arg1.method3464(class280.field3511.method3340(6), arg0 ^ 0xFFFFF57D);
        field361++;
        arg1.method3464(class276.field3463.method3340(6), -127);
        arg1.method3464(class493.field6500.method3340(6), -96);
        arg1.method3464(class642.field9038.method3340(arg0 ^ 0xAEB), arg0 ^ 0xFFFFF56D);
        arg1.method3464(class533.field7189.method3340(arg0 - 2791), arg0 - 2903);
        arg1.method3464(class600.field8416.method3340(6), -115);
        arg1.method3464(class81.field1086.method3340(6), -124);
        arg1.method3464(class324.field4170.method3340(6), arg0 ^ 0xFFFFF572);
        arg1.method3464(class631.field8846.method3340(6), -110);
        arg1.method3464(class85.field1197.method3340(arg0 ^ 0xAEB), -113);
        arg1.method3464(class590.field8283.method3340(6), -99);
        arg1.method3464(class36.field496.method3340(6), arg0 - 2899);
        arg1.method3464(class689.field9770.method3340(6), -115);
        arg1.method3464(class301.field3700.method3340(6), -113);
        arg1.method3464(class472.field5993.method3340(6), -109);
        arg1.method3464(class518.field7073.method3340(6), arg0 - 2910);
        arg1.method3464(class242.field3020.method3340(6), -102);
        arg1.method3464(class622.field8709.method3340(arg0 ^ 0xAEB), arg0 ^ 0xFFFFF57A);
        if (arg0 != 2797) {
            method169((byte) 79);
        }
        arg1.method3464(class415.field5188.method3340(6), arg0 - 2908);
        arg1.method3464(class673.field9472.method3340(6), -118);
        arg1.method3464(class105.field1411.method3340(6), -118);
        arg1.method3464(class475.field6030.method3340(arg0 - 2791), arg0 - 2918);
        arg1.method3464(class581.field8130.method3340(arg0 ^ 0xAEB), arg0 - 2903);
        arg1.method3464(class381.field4806.method3340(6), arg0 - 2897);
        arg1.method3464(class572.field7994.method3340(6), -109);
        arg1.method3464(class374.field4711.method3340(arg0 ^ 0xAEB), -98);
        arg1.method3464(class193.field2408.method3340(6), -121);
        arg1.method3464(class224.field2809.method3340(arg0 - 2791), -124);
        arg1.method3464(class398.field5007.method3340(6), arg0 ^ 0xFFFFF579);
        arg1.method3464(class488.field6460.method3340(6), arg0 ^ 0xFFFFF575);
        arg1.method3464(class382.field4821.method3340(6), arg0 - 2907);
        arg1.method3464(class689.field9772.method3340(6), -121);
        arg1.method3464(class309.method1788(arg0 - 2797), arg0 ^ 0xFFFFF563);
        arg1.method3464(class525.method2859(0), arg0 - 2898);
    }
}
