import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public class class682 {
   @OriginalMember(
      owner = "client!rs",
      name = "f",
      descriptor = "I"
   )
   public int field10005 = 0;
   @OriginalMember(
      owner = "client!rs",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10011 = new String[]{method4989(method4988("\u0006O,v\u0014")), method4989(method4988("\u0006O,u\u0014")), method4989(method4988("\u001aIn[")), method4989(method4988("\u000f\u0012,\u0019A")), method4989(method4988("\u0006O,t\u0014"))};
   @OriginalMember(
      owner = "client!rs",
      name = "c",
      descriptor = "I"
   )
   public static int field10009 = 0;
   @OriginalMember(
      owner = "client!rs",
      name = "b",
      descriptor = "Lbga;"
   )
   public static class378 field10010 = new class378(16, 10);
   @OriginalMember(
      owner = "client!rs",
      name = "h",
      descriptor = "F"
   )
   public static float field10007;
   @OriginalMember(
      owner = "client!rs",
      name = "g",
      descriptor = "I"
   )
   public static int field10003;
   @OriginalMember(
      owner = "client!rs",
      name = "d",
      descriptor = "I"
   )
   public static int field10004;
   @OriginalMember(
      owner = "client!rs",
      name = "e",
      descriptor = "I"
   )
   public static int field10006;
   @OriginalMember(
      owner = "client!rs",
      name = "a",
      descriptor = "I"
   )
   public static int field10008;

   @OriginalMember(
      owner = "client!rs",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4985(int arg0) {
      try {
         field10010 = null;
         if (arg0 != 0) {
            method4985(109);
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field10011[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rs",
      name = "a",
      descriptor = "(Lwm;II)V"
   )
   private final void method4986(class594 arg0, int arg1, int arg2) {
      try {
         if (arg2 == 5) {
            this.field10005 = arg0.method4280(-19104);
         }

         ++field10006;
         if (arg1 <= 124) {
            this.method4986((class594)null, -51, 70);
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field10011[4] + (arg0 != null ? field10011[3] : field10011[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rs",
      name = "a",
      descriptor = "(Lwm;Z)V"
   )
   public final void method4987(class594 arg0, boolean arg1) {
      boolean var3 = client.field4273;

      try {
         ++field10008;
         if (arg1) {
            do {
               int var4 = arg0.method4288((byte)121);
               if (var4 == 0) {
                  break;
               }

               this.method4986(arg0, 127, var4);
            } while(!var3);

         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field10011[1] + (arg0 != null ? field10011[3] : field10011[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rs",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4988(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 60);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rs",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4989(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 116;
            break;
         case 1:
            var10005 = 60;
            break;
         case 2:
            var10005 = 2;
            break;
         case 3:
            var10005 = 55;
            break;
         default:
            var10005 = 60;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
