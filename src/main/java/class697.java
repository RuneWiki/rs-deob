import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class697 extends class22 {
   @OriginalMember(
      owner = "client!pc",
      name = "p",
      descriptor = "[B"
   )
   public byte[] field10213;
   @OriginalMember(
      owner = "client!pc",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10218 = new String[]{method5071(method5070("\u0006dt9I")), method5071(method5070("\u0013?6{")), method5071(method5070("\r)t+]\u0013#.)\u001c")), method5071(method5070("\r)tU\u001c")), method5071(method5070("\r)tV\u001c"))};
   @OriginalMember(
      owner = "client!pc",
      name = "m",
      descriptor = "Z"
   )
   public static boolean field10214 = false;
   @OriginalMember(
      owner = "client!pc",
      name = "l",
      descriptor = "I"
   )
   public static int field10217 = 0;
   @OriginalMember(
      owner = "client!pc",
      name = "k",
      descriptor = "I"
   )
   public static int field10211;
   @OriginalMember(
      owner = "client!pc",
      name = "j",
      descriptor = "I"
   )
   public static int field10212;
   @OriginalMember(
      owner = "client!pc",
      name = "n",
      descriptor = "I"
   )
   public static int field10215;
   @OriginalMember(
      owner = "client!pc",
      name = "o",
      descriptor = "I"
   )
   public static int field10216;

   @OriginalMember(
      owner = "client!pc",
      name = "<init>",
      descriptor = "([B)V",
      line = 6
   )
   public class697(byte[] arg0) {
      try {
         this.field10213 = arg0;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field10218[2] + (arg0 != null ? field10218[0] : field10218[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pc",
      name = "a",
      descriptor = "(IZZI)V",
      line = 16
   )
   public static final void method5068(int arg0, boolean arg1, boolean arg2, int arg3) {
      try {
         ++field10212;
         if (!arg2) {
            if (class64.field1178.method1572((long)arg3, -16289) == null) {
               if (!class51.field1064) {
                  class645.method4738(116, arg1, arg3);
               } else {
                  class196 var4 = new class196(arg3, new class159(4096, class347.field4944, arg3), arg0, arg1);
                  var4.field2966.method5210(class527.field7687[class385.field5684], 6934);
                  class64.field1178.method1566(var4, 24742, (long)arg3);
               }
            }
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field10218[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pc",
      name = "a",
      descriptor = "(CI)Z",
      line = 44
   )
   public static final boolean method5069(char arg0, int arg1) {
      boolean var2 = client.field4564;

      try {
         ++field10215;
         if (Character.isISOControl(arg0)) {
            return false;
         } else if (class243.method1979(arg0, 122)) {
            return true;
         } else {
            int var3 = -126 / ((14 - arg1) / 45);
            char[] var4 = class32.field479;
            int var5 = 0;
            char var6;
            if (var2) {
               var6 = var4[var5];
               if (~arg0 == ~var6) {
                  return true;
               }

               ++var5;
            }

            while(true) {
               char var10000;
               if (var4.length <= var5) {
                  char[] var7 = class626.field9107;
                  var10000 = 0;
                  if (!var2) {
                     int var8 = 0;
                     char var9;
                     if (var2) {
                        var9 = var7[var8];
                        if (~arg0 == ~var9) {
                           return true;
                        }

                        ++var8;
                     }

                     while(true) {
                        if (var7.length <= var8) {
                           var10000 = 0;
                           if (!var2) {
                              return false;
                           }
                        } else {
                           var10000 = var7[var8];
                        }

                        var9 = var10000;
                        if (~arg0 == ~var9) {
                           return true;
                        }

                        ++var8;
                     }
                  }
               } else {
                  var10000 = var4[var5];
               }

               var6 = var10000;
               if (~arg0 == ~var6) {
                  return true;
               }

               ++var5;
            }
         }
      } catch (RuntimeException var11) {
         throw class608.method4462(var11, field10218[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5070(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 52);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5071(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 125;
            break;
         case 1:
            var10005 = 74;
            break;
         case 2:
            var10005 = 90;
            break;
         case 3:
            var10005 = 23;
            break;
         default:
            var10005 = 52;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
