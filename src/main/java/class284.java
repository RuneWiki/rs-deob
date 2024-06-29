import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gia")
public class class284 extends class743 {
   @OriginalMember(
      owner = "client!gia",
      name = "E",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3784 = new String[]{method2163(method2162("\u000ex\u001dkhA")), method2163(method2162("\u000ex\u001dkmA")), method2163(method2162("\u000ex\u001dknA")), method2163(method2162("\u000ex\u001dkoA"))};
   @OriginalMember(
      owner = "client!gia",
      name = "A",
      descriptor = "I"
   )
   public static int field3777;
   @OriginalMember(
      owner = "client!gia",
      name = "z",
      descriptor = "I"
   )
   public int field3778;
   @OriginalMember(
      owner = "client!gia",
      name = "D",
      descriptor = "I"
   )
   public static int field3779;
   @OriginalMember(
      owner = "client!gia",
      name = "B",
      descriptor = "I"
   )
   public static int field3780;
   @OriginalMember(
      owner = "client!gia",
      name = "y",
      descriptor = "I"
   )
   public static int field3783;
   @OriginalMember(
      owner = "client!gia",
      name = "x",
      descriptor = "Ltt;"
   )
   public class100 field3781;
   @OriginalMember(
      owner = "client!gia",
      name = "C",
      descriptor = "[B"
   )
   public byte[] field3782;

   @OriginalMember(
      owner = "client!gia",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method971(int arg0) {
      try {
         ++field3777;
         int var2 = 28 / ((arg0 - 37) / 49);
         return super.field10819 ? 0 : 100;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field3784[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gia",
      name = "a",
      descriptor = "(IZ)V"
   )
   public static final void method2160(int arg0, boolean arg1) {
      boolean var2 = client.field4273;

      try {
         if (arg0 != 0) {
            method2161(74, 57);
         }

         ++field3783;
         if (arg1) {
            if (~class366.field5168 != 0) {
               class415.method3142(arg0 ^ -124, class366.field5168);
            }

            int var10000;
            label59: {
               class588 var3 = (class588)class202.field2476.method1850(arg0);
               if (var2) {
                  var10000 = var3.method3610(536870911);
               } else if (var3 == null) {
                  class366.field5168 = -1;
                  class202.field2476 = new class245(8);
                  class369.method2850(arg0 + 6015);
                  class366.field5168 = class149.field1945;
                  class698.method5074(arg0 + 7878, false);
                  class570.method4093(-30624);
                  var10000 = class366.field5168;
                  if (!var2) {
                     break label59;
                  }
               } else {
                  var10000 = var3.method3610(536870911);
               }

               label58:
               do {
                  while(true) {
                     if (var10000 == 0) {
                        var3 = (class588)class202.field2476.method1850(0);
                        if (var3 == null) {
                           if (!var2) {
                              class366.field5168 = -1;
                              class202.field2476 = new class245(8);
                              class369.method2850(arg0 + 6015);
                              class366.field5168 = class149.field1945;
                              class698.method5074(arg0 + 7878, false);
                              class570.method4093(-30624);
                              var10000 = class366.field5168;
                              break;
                           }

                           class181.method1386(false, true, true, var3);
                           var3 = (class588)class202.field2476.method1847(127);
                        } else {
                           class181.method1386(false, true, true, var3);
                           var3 = (class588)class202.field2476.method1847(127);
                        }
                     } else {
                        class181.method1386(false, true, true, var3);
                        var3 = (class588)class202.field2476.method1847(127);
                     }

                     if (var3 == null) {
                        class366.field5168 = -1;
                        class202.field2476 = new class245(8);
                        class369.method2850(arg0 + 6015);
                        class366.field5168 = class149.field1945;
                        class698.method5074(arg0 + 7878, false);
                        class570.method4093(-30624);
                        var10000 = class366.field5168;
                        if (!var2) {
                           break label58;
                        }
                     } else {
                        var10000 = var3.method3610(536870911);
                     }
                  }
               } while(var2);
            }

            class16.method134(var10000);
         }

         class552.field7593 = true;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field3784[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gia",
      name = "e",
      descriptor = "(I)[B"
   )
   public final byte[] method969(int arg0) {
      try {
         ++field3780;
         int var2 = -75 / ((arg0 - 25) / 57);
         if (super.field10819) {
            throw new RuntimeException();
         } else {
            return this.field3782;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field3784[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gia",
      name = "c",
      descriptor = "(II)Lrf;"
   )
   public static final class91 method2161(int arg0, int arg1) {
      try {
         ++field3779;
         class91 var2 = (class91)class104.field1322.method4239((long)arg1, 0);
         if (var2 != null) {
            return var2;
         } else {
            byte[] var3 = class412.field5796.method732(arg1, arg0, (byte)68);
            class91 var4 = new class91();
            if (var3 != null) {
               var4.method865(new class594(var3), -2);
            }

            var4.method863((byte)6);
            class104.field1322.method4238(arg0 + 70, var4, (long)arg1);
            return var4;
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field3784[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2162(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 44);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2163(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 105;
            break;
         case 1:
            var10005 = 17;
            break;
         case 2:
            var10005 = 124;
            break;
         case 3:
            var10005 = 69;
            break;
         default:
            var10005 = 44;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
