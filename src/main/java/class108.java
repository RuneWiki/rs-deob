import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eda")
public class class108 extends Canvas {
   @OriginalMember(
      owner = "client!eda",
      name = "e",
      descriptor = "Ljava/awt/Component;"
   )
   private Component field1316;
   @OriginalMember(
      owner = "client!eda",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1318 = new String[]{method933(method932("\u0010YO2,]")), method933(method932("\u000e\u0013\u00002\u0010")), method933(method932("\u001bHBp")), method933(method932("\u0010YO2Q\u001cSGhS]")), method933(method932("\u0010YO2\u0018\u0005YOh\b]")), method933(method932("\u0010YO2\u001d\u0014T@hE"))};
   @OriginalMember(
      owner = "client!eda",
      name = "d",
      descriptor = "I"
   )
   public static int field1315 = -1;
   @OriginalMember(
      owner = "client!eda",
      name = "b",
      descriptor = "I"
   )
   public static int field1313;
   @OriginalMember(
      owner = "client!eda",
      name = "c",
      descriptor = "I"
   )
   public static int field1314;
   @OriginalMember(
      owner = "client!eda",
      name = "a",
      descriptor = "I"
   )
   public static int field1317;

   @OriginalMember(
      owner = "client!eda",
      name = "paint",
      descriptor = "(Ljava/awt/Graphics;)V",
      line = 10
   )
   public final void paint(Graphics arg0) {
      try {
         ++field1314;
         this.field1316.paint(arg0);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field1318[5] + (arg0 != null ? field1318[1] : field1318[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!eda",
      name = "update",
      descriptor = "(Ljava/awt/Graphics;)V",
      line = 18
   )
   public final void update(Graphics arg0) {
      try {
         ++field1313;
         this.field1316.update(arg0);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field1318[4] + (arg0 != null ? field1318[1] : field1318[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!eda",
      name = "<init>",
      descriptor = "(Ljava/awt/Component;)V",
      line = 31
   )
   public class108(Component arg0) {
      try {
         this.field1316 = arg0;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field1318[3] + (arg0 != null ? field1318[1] : field1318[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!eda",
      name = "a",
      descriptor = "(IZ)I",
      line = 39
   )
   public static final int method931(int arg0, boolean arg1) {
      try {
         int var4 = (1431655765 & arg0) - -(arg0 >>> 1 & 1431655765);
         ++field1317;
         if (arg1) {
            method931(-60, true);
         }

         var4 = (858993459 & var4) - -((var4 & -858993460) >>> 2);
         var4 = (var4 >>> 4) + var4 & 252645135;
         var4 += var4 >>> 8;
         var4 += var4 >>> 16;
         return var4 & 255;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field1318[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method932(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 109);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!eda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method933(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 117;
            break;
         case 1:
            var10005 = 61;
            break;
         case 2:
            var10005 = 46;
            break;
         case 3:
            var10005 = 28;
            break;
         default:
            var10005 = 109;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
