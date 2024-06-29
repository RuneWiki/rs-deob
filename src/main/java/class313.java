import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pfa")
public class class313 {
   @OriginalMember(
      owner = "client!pfa",
      name = "e",
      descriptor = "I"
   )
   public int field4174 = 1;
   @OriginalMember(
      owner = "client!pfa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4176 = new String[]{method2359(method2358("\u0015\u000f\u0002*")), method2359(method2358("\u0000T@h%")), method2359(method2358("\u000b\u001c\u000fh\u0019S")), method2359(method2358("\u000b\u001c\u000fh\u001bS")), method2359(method2358("\u000b\u001c\u000fh\u001aS"))};
   @OriginalMember(
      owner = "client!pfa",
      name = "b",
      descriptor = "I"
   )
   public static int field4171 = 100;
   @OriginalMember(
      owner = "client!pfa",
      name = "f",
      descriptor = "C"
   )
   public char field4175;
   @OriginalMember(
      owner = "client!pfa",
      name = "h",
      descriptor = "I"
   )
   public static int field4168;
   @OriginalMember(
      owner = "client!pfa",
      name = "g",
      descriptor = "I"
   )
   public static int field4169;
   @OriginalMember(
      owner = "client!pfa",
      name = "c",
      descriptor = "I"
   )
   public static int field4170;
   @OriginalMember(
      owner = "client!pfa",
      name = "d",
      descriptor = "I"
   )
   public static int field4172;
   @OriginalMember(
      owner = "client!pfa",
      name = "a",
      descriptor = "I"
   )
   public static int field4173;

   @OriginalMember(
      owner = "client!pfa",
      name = "a",
      descriptor = "(Lwm;II)V"
   )
   private final void method2355(class594 arg0, int arg1, int arg2) {
      try {
         if (arg2 == -17873) {
            label29: {
               if (~arg1 == -2) {
                  this.field4175 = class90.method855(arg0.method4340(arg2 + 409873073), (byte)-98);
                  if (!client.field4273) {
                     break label29;
                  }
               }

               if (~arg1 == -3) {
                  this.field4174 = 0;
               }
            }

            ++field4169;
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field4176[2] + (arg0 != null ? field4176[1] : field4176[0]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pfa",
      name = "a",
      descriptor = "(Lwm;B)V"
   )
   public final void method2356(class594 arg0, byte arg1) {
      boolean var3 = client.field4273;

      try {
         while(true) {
            int var4 = arg0.method4288((byte)89);
            if (var4 != 0) {
               this.method2355(arg0, var4, -17873);
               if (var3) {
                  break;
               }

               if (!var3) {
                  continue;
               }
            }

            ++field4168;
            int var5 = -35 / ((arg1 - -65) / 40);
            break;
         }

      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field4176[3] + (arg0 != null ? field4176[1] : field4176[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pfa",
      name = "a",
      descriptor = "(IZIIIIII)V"
   )
   public static final void method2357(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      try {
         if (arg3 != 100) {
            field4171 = 27;
         }

         ++field4172;
         if ((arg1 ? class674.field9907.field8439.method5190((byte)-83) : class674.field9907.field8453.method5190((byte)-102)) != 0 && ~arg5 != -1 && class56.field610 < 50 && ~arg6 != 0) {
            class701.field10206[class56.field610++] = new class693((byte)(!arg1 ? 2 : 3), arg6, arg5, arg7, arg4, arg0, arg2, (class80)null);
         }
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field4176[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2358(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 88);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2359(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 123;
            break;
         case 1:
            var10005 = 122;
            break;
         case 2:
            var10005 = 110;
            break;
         case 3:
            var10005 = 70;
            break;
         default:
            var10005 = 88;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
