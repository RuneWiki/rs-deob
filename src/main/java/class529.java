import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public abstract class class529 {
   @OriginalMember(
      owner = "client!ve",
      name = "c",
      descriptor = "Lck;"
   )
   public class667 field7700;
   @OriginalMember(
      owner = "client!ve",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7702 = new String[]{method3918(method3917("W\\O=Z")), method3918(method3917("Z\u0017O_\u000f")), method3918(method3917("B\u0007\r\u007f")), method3918(method3917("Z\u0017OX\u000f")), method3918(method3917("Z\u0017O/NB\u001b\u0015-\u000f"))};
   @OriginalMember(
      owner = "client!ve",
      name = "a",
      descriptor = "I"
   )
   public static int field7699;
   @OriginalMember(
      owner = "client!ve",
      name = "b",
      descriptor = "[S"
   )
   public static short[] field7701;

   @OriginalMember(
      owner = "client!ve",
      name = "b",
      descriptor = "(IZ)V"
   )
   public abstract void method872(int arg0, boolean arg1);

   @OriginalMember(
      owner = "client!ve",
      name = "a",
      descriptor = "(ILbca;I)V"
   )
   public abstract void method870(int arg0, class689 arg1, int arg2);

   @OriginalMember(
      owner = "client!ve",
      name = "c",
      descriptor = "(I)Z"
   )
   public abstract boolean method873(int arg0);

   @OriginalMember(
      owner = "client!ve",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3915(int arg0) {
      try {
         field7701 = null;
         if (arg0 != 1) {
            method3916((String)null, (byte)17);
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field7702[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ve",
      name = "b",
      descriptor = "(I)V"
   )
   public abstract void method874(int arg0);

   @OriginalMember(
      owner = "client!ve",
      name = "a",
      descriptor = "(IZ)V"
   )
   public abstract void method878(int arg0, boolean arg1);

   @OriginalMember(
      owner = "client!ve",
      name = "a",
      descriptor = "(III)V"
   )
   public abstract void method871(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!ve",
      name = "a",
      descriptor = "(Ljava/lang/String;B)V"
   )
   public static final void method3916(String arg0, byte arg1) {
      int var2 = client.field4530;

      try {
         if (arg1 > 30) {
            ++field7699;
            if (arg0 != null) {
               if (arg0.startsWith("*")) {
                  arg0 = arg0.substring(1);
               }

               String var3 = class70.method696((byte)-97, arg0);
               if (var3 != null) {
                  int var4 = 0;
                  if (var2 != 0 || var4 < class67.field821) {
                     do {
                        String var5 = class590.field8725[var4];
                        if (var5.startsWith("*")) {
                           var5 = var5.substring(1);
                        }

                        String var6 = class70.method696((byte)-109, var5);
                        if (var6 != null && var6.equals(var3)) {
                           --class67.field821;
                           int var7 = var4;
                           if (var2 != 0) {
                              class590.field8725[var4] = class590.field8725[var4 + 1];
                              class185.field2294[var4] = class185.field2294[var4 + 1];
                              class289.field4050[var4] = class289.field4050[var4 - -1];
                              class163.field2049[var4] = class163.field2049[var4 - -1];
                              class409.field6239[var4] = class409.field6239[var4 - -1];
                              var7 = var4 + 1;
                           }

                           while(true) {
                              while(var7 < class67.field821) {
                                 class590.field8725[var7] = class590.field8725[var7 + 1];
                                 class185.field2294[var7] = class185.field2294[var7 + 1];
                                 class289.field4050[var7] = class289.field4050[var7 - -1];
                                 class163.field2049[var7] = class163.field2049[var7 - -1];
                                 class409.field6239[var7] = class409.field6239[var7 - -1];
                                 ++var7;
                              }

                              class310.field4417 = class456.field6922;
                              ++class680.field10223;
                              class180 var8 = class486.method3603(class31.field346, (byte)-87, class48.field583);
                              var8.field2211.method1085(class543.method4009(true, arg0), (byte)-11);
                              var8.field2211.method1101(arg0, -119);
                              class763.method5527(false, var8);
                              if (var2 == 0) {
                                 return;
                              }

                              ++var7;
                           }
                        }

                        ++var4;
                     } while(var4 < class67.field821);

                  }
               }
            }
         }
      } catch (RuntimeException var10) {
         throw class670.method4877(var10, field7702[1] + (arg0 != null ? field7702[0] : field7702[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ve",
      name = "<init>",
      descriptor = "(Lck;)V"
   )
   public class529(class667 arg0) {
      try {
         this.field7700 = arg0;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field7702[4] + (arg0 != null ? field7702[0] : field7702[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ve",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3917(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 39);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ve",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3918(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 44;
            break;
         case 1:
            var10005 = 114;
            break;
         case 2:
            var10005 = 97;
            break;
         case 3:
            var10005 = 19;
            break;
         default:
            var10005 = 39;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
