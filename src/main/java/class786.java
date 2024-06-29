import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fja")
public class class786 {
   @OriginalMember(
      owner = "client!fja",
      name = "d",
      descriptor = "Z"
   )
   public boolean field11480 = true;
   @OriginalMember(
      owner = "client!fja",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11482 = new String[]{method5665(method5664("7\f-p")), method5665(method5664("\"Wo2\u0005")), method5665(method5664("?\u0013 2<q")), method5665(method5664("?\u0013 2:q")), method5665(method5664("?\u0013 2=q")), method5665(method5664("?\u0013 29q")), method5665(method5664("?\u0013 2;q"))};
   @OriginalMember(
      owner = "client!fja",
      name = "g",
      descriptor = "[Z"
   )
   public static boolean[] field11476 = new boolean[100];
   @OriginalMember(
      owner = "client!fja",
      name = "b",
      descriptor = "C"
   )
   private char field11478;
   @OriginalMember(
      owner = "client!fja",
      name = "a",
      descriptor = "I"
   )
   public static int field11473;
   @OriginalMember(
      owner = "client!fja",
      name = "e",
      descriptor = "I"
   )
   public static int field11474;
   @OriginalMember(
      owner = "client!fja",
      name = "i",
      descriptor = "I"
   )
   public static int field11475;
   @OriginalMember(
      owner = "client!fja",
      name = "f",
      descriptor = "I"
   )
   public static int field11477;
   @OriginalMember(
      owner = "client!fja",
      name = "h",
      descriptor = "I"
   )
   public int field11479;
   @OriginalMember(
      owner = "client!fja",
      name = "c",
      descriptor = "Ljava/lang/String;"
   )
   public String field11481;

   @OriginalMember(
      owner = "client!fja",
      name = "a",
      descriptor = "(B)Z"
   )
   public final boolean method5659(byte arg0) {
      try {
         if (arg0 > -11) {
            this.method5660((class594)null, 108);
         }

         ++field11473;
         return ~this.field11478 == -116;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field11482[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fja",
      name = "a",
      descriptor = "(Lwm;I)V"
   )
   public final void method5660(class594 arg0, int arg1) {
      boolean var3 = client.field4273;

      try {
         ++field11477;
         int var4 = -35 / ((33 - arg1) / 52);

         do {
            int var5 = arg0.method4288((byte)127);
            if (~var5 == -1) {
               break;
            }

            this.method5662(var5, arg0, 82);
         } while(!var3);

      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field11482[6] + (arg0 != null ? field11482[1] : field11482[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fja",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method5661(boolean arg0) {
      try {
         if (!arg0) {
            method5661(false);
         }

         field11476 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field11482[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fja",
      name = "a",
      descriptor = "(ILwm;I)V"
   )
   private final void method5662(int arg0, class594 arg1, int arg2) {
      boolean var4 = client.field4273;

      try {
         label52: {
            if (~arg0 == -2) {
               this.field11478 = class90.method855(arg1.method4340(409855200), (byte)104);
               if (!var4) {
                  break label52;
               }
            }

            if (arg0 != 2) {
               if (~arg0 != -5) {
                  if (~arg0 != -6) {
                     break label52;
                  }

                  this.field11481 = arg1.method4291(-38);
                  if (!var4) {
                     break label52;
                  }
               }

               this.field11480 = false;
               if (!var4) {
                  break label52;
               }
            }

            this.field11479 = arg1.method4302(true);
         }

         if (arg2 <= 75) {
            this.field11481 = null;
         }

         ++field11474;
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field11482[2] + arg0 + ',' + (arg1 != null ? field11482[1] : field11482[0]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fja",
      name = "a",
      descriptor = "(ILjava/lang/String;Ljava/io/File;)V"
   )
   public static final void method5663(int arg0, String arg1, File arg2) {
      try {
         ++field11475;
         class307.field4083.put(arg1, arg2);
         if (arg0 < 0) {
            field11476 = null;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field11482[3] + arg0 + ',' + (arg1 != null ? field11482[1] : field11482[0]) + ',' + (arg2 != null ? field11482[1] : field11482[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5664(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 120);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5665(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 89;
            break;
         case 1:
            var10005 = 121;
            break;
         case 2:
            var10005 = 65;
            break;
         case 3:
            var10005 = 28;
            break;
         default:
            var10005 = 120;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
