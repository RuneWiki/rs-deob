import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public abstract class class67 {
   @OriginalMember(
      owner = "client!jb",
      name = "g",
      descriptor = "Lmp;"
   )
   public class41 field881;
   @OriginalMember(
      owner = "client!jb",
      name = "j",
      descriptor = "I"
   )
   public int field877;
   @OriginalMember(
      owner = "client!jb",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field886 = new String[]{method519(method518("\u00176\r@")), method519(method518("\u0002mO\u00029")), method519(method518("\u0013!Oal")), method519(method518("\u0013!O\u0010-\u0017*\u0015\u0012l")), method519(method518("\u0013!O}l")), method519(method518("\u0013!O|l")), method519(method518("\u0013!Ocl"))};
   @OriginalMember(
      owner = "client!jb",
      name = "e",
      descriptor = "Luk;"
   )
   public static class498 field878 = new class498(135, -1);
   @OriginalMember(
      owner = "client!jb",
      name = "f",
      descriptor = "Z"
   )
   public static boolean field884 = true;
   @OriginalMember(
      owner = "client!jb",
      name = "a",
      descriptor = "I"
   )
   public static int field876;
   @OriginalMember(
      owner = "client!jb",
      name = "d",
      descriptor = "I"
   )
   public static int field879;
   @OriginalMember(
      owner = "client!jb",
      name = "h",
      descriptor = "I"
   )
   public static int field880;
   @OriginalMember(
      owner = "client!jb",
      name = "c",
      descriptor = "I"
   )
   public static int field882;
   @OriginalMember(
      owner = "client!jb",
      name = "b",
      descriptor = "I"
   )
   public static int field883;
   @OriginalMember(
      owner = "client!jb",
      name = "i",
      descriptor = "I"
   )
   public static int field885;

   @OriginalMember(
      owner = "client!jb",
      name = "a",
      descriptor = "(IZ)V"
   )
   public abstract void method165(int arg0, boolean arg1);

   @OriginalMember(
      owner = "client!jb",
      name = "a",
      descriptor = "(II)I"
   )
   public abstract int method161(int arg0, int arg1);

   @OriginalMember(
      owner = "client!jb",
      name = "a",
      descriptor = "(Luaa;I)V"
   )
   public static final void method513(class119 arg0, int arg1) {
      try {
         ++field879;
         int var2 = -class308.field4801 + arg0.field1659;
         int var3 = arg0.field1664 * 512 + arg0.method61((byte)70) * 256;
         int var4 = arg0.field1673 * 512 - -(arg0.method61((byte)70) * 256);
         if (arg1 != 12288) {
            method513((class119)null, -18);
         }

         arg0.field1505 += (-arg0.field1505 + var3) / var2;
         arg0.field1682 = 0;
         arg0.field1494 += (-arg0.field1494 + var4) / var2;
         if (~arg0.field1671 == -1) {
            arg0.method1106(8192, (byte)21);
         }

         if (arg0.field1671 == 1) {
            arg0.method1106(12288, (byte)116);
         }

         if (arg0.field1671 == 2) {
            arg0.method1106(0, (byte)14);
         }

         if (arg0.field1671 == 3) {
            arg0.method1106(4096, (byte)31);
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field886[5] + (arg0 != null ? field886[1] : field886[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jb",
      name = "a",
      descriptor = "(ILjava/lang/String;)V"
   )
   public static final void method514(int arg0, String arg1) {
      boolean var2 = client.field1786;

      try {
         ++field882;
         if (arg1 != null) {
            if (arg0 != 1) {
               field883 = -47;
            }

            String var3 = class427.method3381(arg1, 0);
            if (var3 != null) {
               int var4 = 0;
               if (var2 || var4 < class377.field5987) {
                  do {
                     String var5 = class698.field10370[var4];
                     String var6 = class427.method3381(var5, arg0 ^ 1);
                     if (class499.method3874(arg1, var6, var5, 0, var3)) {
                        --class377.field5987;
                        int var7 = var4;
                        if (var2) {
                           class698.field10370[var4] = class698.field10370[var4 + 1];
                           class121.field1731[var4] = class121.field1731[var4 + 1];
                           class459.field7008[var4] = class459.field7008[var4 - -1];
                           class115.field1559[var4] = class115.field1559[var4 - -1];
                           class316.field4888[var4] = class316.field4888[var4 + 1];
                           var7 = var4 + 1;
                        }

                        while(true) {
                           while(~class377.field5987 < ~var7) {
                              class698.field10370[var7] = class698.field10370[var7 + 1];
                              class121.field1731[var7] = class121.field1731[var7 + 1];
                              class459.field7008[var7] = class459.field7008[var7 - -1];
                              class115.field1559[var7] = class115.field1559[var7 - -1];
                              class316.field4888[var7] = class316.field4888[var7 + 1];
                              ++var7;
                           }

                           class746.field11069 = class1.field6;
                           ++class599.field8781;
                           class29 var8 = class578.method4332((byte)-32);
                           class577 var9 = class218.method1888(class126.field1803, 103, var8.field361);
                           var9.field8531.method2864(arg0 ^ -26109, class714.method5292((byte)-107, arg1));
                           var9.field8531.method2862(arg1, true);
                           var8.method211(var9, 124);
                           if (!var2) {
                              return;
                           }

                           ++var7;
                        }
                     }

                     ++var4;
                  } while(var4 < class377.field5987);

               }
            }
         }
      } catch (RuntimeException var11) {
         throw class482.method3757(var11, field886[2] + arg0 + ',' + (arg1 != null ? field886[1] : field886[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jb",
      name = "a",
      descriptor = "(IB)V"
   )
   public final void method515(int arg0, byte arg1) {
      try {
         if (arg1 <= 125) {
            method517(-109);
         }

         if (this.method161(arg0, -92) != 3) {
            this.method165(arg0, true);
         }

         ++field880;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field886[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jb",
      name = "a",
      descriptor = "(B)V"
   )
   public abstract void method158(byte arg0);

   @OriginalMember(
      owner = "client!jb",
      name = "a",
      descriptor = "()V"
   )
   public static final void method516() {
      class348.method2809(1, class461.field7016);
   }

   @OriginalMember(
      owner = "client!jb",
      name = "b",
      descriptor = "(I)I"
   )
   public abstract int method162(int arg0);

   @OriginalMember(
      owner = "client!jb",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method517(int arg0) {
      try {
         field878 = null;
         if (arg0 >= -67) {
            field878 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field886[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jb",
      name = "<init>",
      descriptor = "(Lmp;)V"
   )
   public class67(class41 arg0) {
      try {
         this.field881 = arg0;
         this.field877 = this.method162(0);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field886[3] + (arg0 != null ? field886[1] : field886[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jb",
      name = "<init>",
      descriptor = "(ILmp;)V"
   )
   public class67(int arg0, class41 arg1) {
      try {
         this.field881 = arg1;
         this.field877 = arg0;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field886[3] + arg0 + ',' + (arg1 != null ? field886[1] : field886[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method518(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 68);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method519(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 121;
            break;
         case 1:
            var10005 = 67;
            break;
         case 2:
            var10005 = 97;
            break;
         case 3:
            var10005 = 44;
            break;
         default:
            var10005 = 68;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
