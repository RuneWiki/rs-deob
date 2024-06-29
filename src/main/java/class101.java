import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dba")
public class class101 extends class345 {
   @OriginalMember(
      owner = "client!dba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1676 = new String[]{method968(method967("8H\u001f\u0007Tt")), method968(method967("8H\u001f\u0007St")), method968(method967("8H\u001f\u0007Wt")), method968(method967("8H\u001f\u0007Vt")), method968(method967("8H\u001f\u0007Ut")), method968(method967(">N")), method968(method967("'\u0004P\u0007m")), method968(method967("2_\u0012E")), method968(method967("8H\u001f\u0007Qt")), method968(method967("8H\u001f\u0007Rt"))};
   @OriginalMember(
      owner = "client!dba",
      name = "l",
      descriptor = "I"
   )
   public static int field1672 = 0;
   @OriginalMember(
      owner = "client!dba",
      name = "o",
      descriptor = "Z"
   )
   public static boolean field1675 = false;
   @OriginalMember(
      owner = "client!dba",
      name = "p",
      descriptor = "I"
   )
   public static int field1667;
   @OriginalMember(
      owner = "client!dba",
      name = "q",
      descriptor = "I"
   )
   public static int field1668;
   @OriginalMember(
      owner = "client!dba",
      name = "j",
      descriptor = "I"
   )
   public static int field1669;
   @OriginalMember(
      owner = "client!dba",
      name = "n",
      descriptor = "I"
   )
   public static int field1670;
   @OriginalMember(
      owner = "client!dba",
      name = "m",
      descriptor = "I"
   )
   public static int field1671;
   @OriginalMember(
      owner = "client!dba",
      name = "i",
      descriptor = "I"
   )
   public static int field1673;
   @OriginalMember(
      owner = "client!dba",
      name = "k",
      descriptor = "Lmh;"
   )
   public static class656 field1674;

   @OriginalMember(
      owner = "client!dba",
      name = "a",
      descriptor = "(Z)I",
      line = 7
   )
   public final int method53(boolean arg0) {
      try {
         if (arg0) {
            field1672 = 47;
         }

         ++field1669;
         return 1;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field1676[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dba",
      name = "<init>",
      descriptor = "(ILob;)V",
      line = 19
   )
   public class101(int arg0, class768 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!dba",
      name = "b",
      descriptor = "(I)V",
      line = 22
   )
   public final void method51(int arg0) {
      try {
         if (super.field4913 != 1 && super.field4913 != 0) {
            super.field4913 = this.method53(false);
         }

         ++field1671;
         if (arg0 != 0) {
            field1672 = 73;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field1676[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dba",
      name = "c",
      descriptor = "(I)V",
      line = 35
   )
   public static void method964(int arg0) {
      try {
         if (arg0 == 1) {
            field1674 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field1676[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dba",
      name = "a",
      descriptor = "(IB)V",
      line = 45
   )
   public final void method54(int arg0, byte arg1) {
      try {
         if (arg1 < 99) {
            method964(-80);
         }

         ++field1667;
         super.field4913 = arg0;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field1676[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dba",
      name = "b",
      descriptor = "(Z)I",
      line = 56
   )
   public final int method965(boolean arg0) {
      try {
         ++field1668;
         if (arg0) {
            field1672 = 54;
         }

         return super.field4913;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field1676[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dba",
      name = "a",
      descriptor = "(Loo;IILjava/awt/Component;I)Lwq;",
      line = 72
   )
   public static final class176 method966(class651 arg0, int arg1, int arg2, Component arg3, int arg4) {
      try {
         ++field1673;
         if (~class755.field10967 == -1) {
            throw new IllegalStateException();
         } else if (arg2 >= 0 && arg2 < 2) {
            if (~arg4 > -257) {
               arg4 = 256;
            }

            try {
               class176 var5 = (class176)Class.forName(field1676[5]).newInstance();
               var5.field2709 = arg4;
               var5.field2702 = new int[256 * (class483.field7024 ? 2 : 1)];
               var5.method731(arg3);
               var5.field2708 = (-1024 & arg4) + 1024;
               if (~var5.field2708 < -16385) {
                  var5.field2708 = 16384;
               }

               var5.method729(var5.field2708);
               if (~class397.field5840 < -1 && class46.field1007 == null) {
                  class46.field1007 = new class311();
                  class46.field1007.field4483 = arg0;
                  arg0.method4792((byte)-97, class397.field5840, class46.field1007);
               }

               if (class46.field1007 != null) {
                  if (class46.field1007.field4484[arg2] != null) {
                     throw new IllegalArgumentException();
                  }

                  class46.field1007.field4484[arg2] = var5;
               }

               return var5;
            } catch (Throwable var9) {
               try {
                  class666 var6 = new class666(arg0, arg2);
                  var6.field2709 = arg4;
                  var6.field2702 = new int[256 * (class483.field7024 ? 2 : 1)];
                  if (arg1 >= -99) {
                     return null;
                  } else {
                     var6.method731(arg3);
                     var6.field2708 = 16384;
                     var6.method729(var6.field2708);
                     if (~class397.field5840 < -1 && class46.field1007 == null) {
                        class46.field1007 = new class311();
                        class46.field1007.field4483 = arg0;
                        arg0.method4792((byte)-97, class397.field5840, class46.field1007);
                     }

                     if (class46.field1007 != null) {
                        if (class46.field1007.field4484[arg2] != null) {
                           throw new IllegalArgumentException();
                        }

                        class46.field1007.field4484[arg2] = var6;
                     }

                     return var6;
                  }
               } catch (Throwable var8) {
                  return new class176();
               }
            }
         } else {
            throw new IllegalArgumentException();
         }
      } catch (RuntimeException var10) {
         throw class608.method4462(var10, field1676[8] + (arg0 != null ? field1676[6] : field1676[7]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field1676[6] : field1676[7]) + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dba",
      name = "a",
      descriptor = "(BI)I",
      line = 163
   )
   public final int method52(byte arg0, int arg1) {
      try {
         if (arg0 >= -45) {
            method964(15);
         }

         ++field1670;
         return 1;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field1676[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dba",
      name = "<init>",
      descriptor = "(Lob;)V",
      line = 178
   )
   public class101(class768 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!dba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method967(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 16);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method968(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 92;
            break;
         case 1:
            var10005 = 42;
            break;
         case 2:
            var10005 = 126;
            break;
         case 3:
            var10005 = 41;
            break;
         default:
            var10005 = 16;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
