import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class116 {
   @OriginalMember(
      owner = "client!kn",
      name = "a",
      descriptor = "I"
   )
   public int field1563 = 0;
   @OriginalMember(
      owner = "client!kn",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1567 = new String[]{method1076(method1075("ne?kt")), method1076(method1075("k~}F")), method1076(method1075("~%?\u0004!")), method1076(method1075("ne?ht"))};
   @OriginalMember(
      owner = "client!kn",
      name = "d",
      descriptor = "Z"
   )
   public static boolean field1566 = false;
   @OriginalMember(
      owner = "client!kn",
      name = "b",
      descriptor = "I"
   )
   public static int field1564;
   @OriginalMember(
      owner = "client!kn",
      name = "c",
      descriptor = "I"
   )
   public static int field1565;

   @OriginalMember(
      owner = "client!kn",
      name = "a",
      descriptor = "(Lica;II)V",
      line = 4
   )
   private final void method1073(class354 arg0, int arg1, int arg2) {
      try {
         if (arg2 <= 43) {
            this.field1563 = 27;
         }

         if (~arg1 == -6) {
            this.field1563 = arg0.method2848(-101);
         }

         ++field1564;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field1567[3] + (arg0 != null ? field1567[2] : field1567[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kn",
      name = "a",
      descriptor = "(Lica;I)V",
      line = 20
   )
   public final void method1074(class354 arg0, int arg1) {
      boolean var3 = client.field1786;

      try {
         while(true) {
            int var4 = arg0.method2855(arg1 + -31007);
            if (~var4 != -1) {
               this.method1073(arg0, var4, 80);
               if (var3) {
                  break;
               }

               if (!var3) {
                  continue;
               }
            }

            if (arg1 != 0) {
               this.method1074((class354)null, -94);
            }

            ++field1565;
            break;
         }

      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field1567[0] + (arg0 != null ? field1567[2] : field1567[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kn",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1075(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 92);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kn",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1076(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 5;
            break;
         case 1:
            var10005 = 11;
            break;
         case 2:
            var10005 = 17;
            break;
         case 3:
            var10005 = 42;
            break;
         default:
            var10005 = 92;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
