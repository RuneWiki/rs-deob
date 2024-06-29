import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kia")
public abstract class class93 {
   @OriginalMember(
      owner = "client!kia",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1263 = new String[]{method876(method875("Y\u000eW\u000f_sO")), method876(method875("Y\u000eW\u000fSsO")), method876(method875("\\\u0012ZM")), method876(method875("II\u0018\u000fe")), method876(method875("Y\u000eW\u000fQsO")), method876(method875("Y\u000eW\u000fRsO"))};
   @OriginalMember(
      owner = "client!kia",
      name = "e",
      descriptor = "Llia;"
   )
   public static class633 field1259 = new class633(method876(method875("{)bc]f&")), method876(method875("]\u0001PH{W")), method876(method875("m\u000eXUzW\u0013W")), 6);
   @OriginalMember(
      owner = "client!kia",
      name = "a",
      descriptor = "D"
   )
   public static double field1262;
   @OriginalMember(
      owner = "client!kia",
      name = "g",
      descriptor = "I"
   )
   public static int field1256;
   @OriginalMember(
      owner = "client!kia",
      name = "b",
      descriptor = "I"
   )
   public static int field1257;
   @OriginalMember(
      owner = "client!kia",
      name = "d",
      descriptor = "I"
   )
   public static int field1258;
   @OriginalMember(
      owner = "client!kia",
      name = "f",
      descriptor = "I"
   )
   public static int field1260;
   @OriginalMember(
      owner = "client!kia",
      name = "c",
      descriptor = "I"
   )
   public static int field1261;

   @OriginalMember(
      owner = "client!kia",
      name = "b",
      descriptor = "()Lkia;"
   )
   public abstract class93 method854();

   @OriginalMember(
      owner = "client!kia",
      name = "f",
      descriptor = "(I)V"
   )
   public abstract void method855(int arg0);

   @OriginalMember(
      owner = "client!kia",
      name = "a",
      descriptor = "()V"
   )
   public abstract void method856();

   @OriginalMember(
      owner = "client!kia",
      name = "a",
      descriptor = "(Ljb;I)V"
   )
   public static final void method857(class754 arg0, int arg1) {
      try {
         class532.field7798 = arg0;
         if (arg1 != -7043) {
            field1259 = null;
         }

         ++field1256;
      } catch (RuntimeException var3) {
         throw method866(var3, field1263[4] + (arg0 != null ? field1263[3] : field1263[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kia",
      name = "h",
      descriptor = "(I)V"
   )
   public static final void method858(int arg0) {
      try {
         class407 var1 = class563.field8278;
         synchronized(class563.field8278) {
            class563.field8278.method3201((byte)-47);
         }

         ++field1258;
         class407 var2 = class88.field1196;
         synchronized(class88.field1196) {
            class88.field1196.method3201((byte)94);
         }

         if (arg0 != 32) {
            method862(13);
         }
      } catch (RuntimeException var6) {
         throw method866(var6, field1263[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kia",
      name = "e",
      descriptor = "(I)V"
   )
   public abstract void method859(int arg0);

   @OriginalMember(
      owner = "client!kia",
      name = "a",
      descriptor = "(III)V"
   )
   public abstract void method860(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!kia",
      name = "d",
      descriptor = "(I)V"
   )
   public abstract void method861(int arg0);

   @OriginalMember(
      owner = "client!kia",
      name = "g",
      descriptor = "(I)V"
   )
   public static void method862(int arg0) {
      try {
         if (arg0 == 19802) {
            field1259 = null;
         }
      } catch (RuntimeException var2) {
         throw method866(var2, field1263[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kia",
      name = "b",
      descriptor = "(III[I)V"
   )
   public abstract void method863(int arg0, int arg1, int arg2, int[] arg3);

   @OriginalMember(
      owner = "client!kia",
      name = "a",
      descriptor = "(IBI)V"
   )
   public static final void method864(int arg0, byte arg1, int arg2) {
      try {
         ++field1257;
         class487 var3 = class2.method12((long)arg0, 7, (byte)43);
         var3.method3694(arg1 ^ 21855);
         if (arg1 != -65) {
            method866((Throwable)null, (String)null);
         }

         var3.field6794 = arg2;
      } catch (RuntimeException var5) {
         throw method866(var5, field1263[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kia",
      name = "a",
      descriptor = "(III[I)V"
   )
   public abstract void method865(int arg0, int arg1, int arg2, int[] arg3);

   @OriginalMember(
      owner = "client!kia",
      name = "a",
      descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lmc;"
   )
   public static final class355 method866(Throwable arg0, String arg1) {
      ++field1261;
      class355 var2;
      if (arg0 instanceof class355) {
         var2 = (class355)arg0;
         var2.field4958 = var2.field4958 + ' ' + arg1;
      } else {
         var2 = new class355(arg0, arg1);
      }

      return var2;
   }

   @OriginalMember(
      owner = "client!kia",
      name = "c",
      descriptor = "(I)V"
   )
   public abstract void method867(int arg0);

   @OriginalMember(
      owner = "client!kia",
      name = "b",
      descriptor = "(III)V"
   )
   public abstract void method868(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!kia",
      name = "a",
      descriptor = "(IIIIII)V"
   )
   public abstract void method869(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

   @OriginalMember(
      owner = "client!kia",
      name = "a",
      descriptor = "([I)V"
   )
   public abstract void method870(int[] arg0);

   @OriginalMember(
      owner = "client!kia",
      name = "a",
      descriptor = "(I)V"
   )
   public abstract void method871(int arg0);

   @OriginalMember(
      owner = "client!kia",
      name = "c",
      descriptor = "(III[I)V"
   )
   public abstract void method872(int arg0, int arg1, int arg2, int[] arg3);

   @OriginalMember(
      owner = "client!kia",
      name = "b",
      descriptor = "(I)V"
   )
   public abstract void method873(int arg0);

   @OriginalMember(
      owner = "client!kia",
      name = "a",
      descriptor = "(Lkia;)V"
   )
   public abstract void method874(class93 arg0);

   @OriginalMember(
      owner = "client!kia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method875(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 24);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method876(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 50;
            break;
         case 1:
            var10005 = 103;
            break;
         case 2:
            var10005 = 54;
            break;
         case 3:
            var10005 = 33;
            break;
         default:
            var10005 = 24;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
