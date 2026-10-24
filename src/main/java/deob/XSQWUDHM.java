package deob;

@ObfuscatedName("XSQWUDHM")
public class XSQWUDHM {

	@ObfuscatedName("XSQWUDHM.i")
	public int field1347 = 0;

	@ObfuscatedName("XSQWUDHM.j")
	public int field1348 = 0;

	@ObfuscatedName("XSQWUDHM.k")
	public int field1349;

	@ObfuscatedName("XSQWUDHM.l")
	public int field1350;

	@ObfuscatedName("XSQWUDHM.m")
	public int[][] field1351;

	public XSQWUDHM(int arg0, int arg1) {
		field1349 = arg1;
		field1350 = arg0;
		field1351 = new int[field1349][field1350];
		method514();
	}

	@ObfuscatedName("XSQWUDHM.a()V")
	public void method514() {
		for (int var1 = 0; var1 < field1349; var1++) {
			for (int var2 = 0; var2 < field1350; var2++) {
				if (var1 == 0 || var2 == 0 || field1349 - 1 == var1 || field1350 - 1 == var2) {
					field1351[var1][var2] = 0xFFFFFF;
				} else {
					field1351[var1][var2] = 0x1000000;
				}
			}
		}
	}

	@ObfuscatedName("XSQWUDHM.a(IIZIII)V")
	public void method515(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
		arg3 -= field1347;
		arg4 -= field1348;
		if (arg0 == 0) {
			if (arg1 == 0) {
				method518(arg3, arg4, 128);
				method518(arg3 - 1, arg4, 8);
			}

			if (arg1 == 1) {
				method518(arg3, arg4, 2);
				method518(arg3, arg4 + 1, 32);
			}

			if (arg1 == 2) {
				method518(arg3, arg4, 8);
				method518(arg3 + 1, arg4, 128);
			}

			if (arg1 == 3) {
				method518(arg3, arg4, 32);
				method518(arg3, arg4 - 1, 2);
			}
		}

		if (arg0 == 1 || arg0 == 3) {
			if (arg1 == 0) {
				method518(arg3, arg4, 1);
				method518(arg3 - 1, arg4 + 1, 16);
			}

			if (arg1 == 1) {
				method518(arg3, arg4, 4);
				method518(arg3 + 1, arg4 + 1, 64);
			}

			if (arg1 == 2) {
				method518(arg3, arg4, 16);
				method518(arg3 + 1, arg4 - 1, 1);
			}

			if (arg1 == 3) {
				method518(arg3, arg4, 64);
				method518(arg3 - 1, arg4 - 1, 4);
			}
		}

		if (arg0 == 2) {
			if (arg1 == 0) {
				method518(arg3, arg4, 130);
				method518(arg3 - 1, arg4, 8);
				method518(arg3, arg4 + 1, 32);
			}

			if (arg1 == 1) {
				method518(arg3, arg4, 10);
				method518(arg3, arg4 + 1, 32);
				method518(arg3 + 1, arg4, 128);
			}

			if (arg1 == 2) {
				method518(arg3, arg4, 40);
				method518(arg3 + 1, arg4, 128);
				method518(arg3, arg4 - 1, 2);
			}

			if (arg1 == 3) {
				method518(arg3, arg4, 160);
				method518(arg3, arg4 - 1, 2);
				method518(arg3 - 1, arg4, 8);
			}
		}

		if (arg2) {
			if (arg0 == 0) {
				if (arg1 == 0) {
					method518(arg3, arg4, 0x10000);
					method518(arg3 - 1, arg4, 4096);
				}

				if (arg1 == 1) {
					method518(arg3, arg4, 1024);
					method518(arg3, arg4 + 1, 16384);
				}

				if (arg1 == 2) {
					method518(arg3, arg4, 4096);
					method518(arg3 + 1, arg4, 0x10000);
				}

				if (arg1 == 3) {
					method518(arg3, arg4, 16384);
					method518(arg3, arg4 - 1, 1024);
				}
			}

			if (arg0 == 1 || arg0 == 3) {
				if (arg1 == 0) {
					method518(arg3, arg4, 512);
					method518(arg3 - 1, arg4 + 1, 8192);
				}

				if (arg1 == 1) {
					method518(arg3, arg4, 2048);
					method518(arg3 + 1, arg4 + 1, 32768);
				}

				if (arg1 == 2) {
					method518(arg3, arg4, 8192);
					method518(arg3 + 1, arg4 - 1, 512);
				}

				if (arg1 == 3) {
					method518(arg3, arg4, 32768);
					method518(arg3 - 1, arg4 - 1, 2048);
				}
			}

			if (arg0 == 2) {
				if (arg1 == 0) {
					method518(arg3, arg4, 66560);
					method518(arg3 - 1, arg4, 4096);
					method518(arg3, arg4 + 1, 16384);
				}

				if (arg1 == 1) {
					method518(arg3, arg4, 5120);
					method518(arg3, arg4 + 1, 16384);
					method518(arg3 + 1, arg4, 0x10000);
				}

				if (arg1 == 2) {
					method518(arg3, arg4, 20480);
					method518(arg3 + 1, arg4, 0x10000);
					method518(arg3, arg4 - 1, 1024);
				}

				if (arg1 == 3) {
					method518(arg3, arg4, 81920);
					method518(arg3, arg4 - 1, 1024);
					method518(arg3 - 1, arg4, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("XSQWUDHM.a(IIIIIZI)V")
	public void method516(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
		int var7 = 256;
		if (arg4) {
			var7 += 0x20000;
		}

		arg2 -= field1347;
		arg1 -= field1348;

		if (arg0 == 1 || arg0 == 3) {
			int var8 = arg5;
			arg5 = arg3;
			arg3 = var8;
		}

		for (int var9 = arg2; var9 < arg2 + arg5; var9++) {
			if (var9 >= 0 && var9 < field1349) {
				for (int var10 = arg1; var10 < arg1 + arg3; var10++) {
					if (var10 >= 0 && var10 < field1350) {
						method518(var9, var10, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("XSQWUDHM.a(III)V")
	public void method517(int arg0, int arg1) {
		arg0 -= field1347;
		arg1 -= field1348;
		field1351[arg0][arg1] |= 0x200000;
	}

	@ObfuscatedName("XSQWUDHM.b(III)V")
	public void method518(int arg0, int arg1, int arg2) {
		field1351[arg0][arg1] |= arg2;
	}

	@ObfuscatedName("XSQWUDHM.a(IIIIZI)V")
	public void method519(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
		arg2 -= field1347;
		arg0 -= field1348;
		if (arg1 == 0) {
			if (arg4 == 0) {
				method521(arg2, 128, arg0);
				method521(arg2 - 1, 8, arg0);
			}

			if (arg4 == 1) {
				method521(arg2, 2, arg0);
				method521(arg2, 32, arg0 + 1);
			}

			if (arg4 == 2) {
				method521(arg2, 8, arg0);
				method521(arg2 + 1, 128, arg0);
			}

			if (arg4 == 3) {
				method521(arg2, 32, arg0);
				method521(arg2, 2, arg0 - 1);
			}
		}

		if (arg1 == 1 || arg1 == 3) {
			if (arg4 == 0) {
				method521(arg2, 1, arg0);
				method521(arg2 - 1, 16, arg0 + 1);
			}

			if (arg4 == 1) {
				method521(arg2, 4, arg0);
				method521(arg2 + 1, 64, arg0 + 1);
			}

			if (arg4 == 2) {
				method521(arg2, 16, arg0);
				method521(arg2 + 1, 1, arg0 - 1);
			}

			if (arg4 == 3) {
				method521(arg2, 64, arg0);
				method521(arg2 - 1, 4, arg0 - 1);
			}
		}

		if (arg1 == 2) {
			if (arg4 == 0) {
				method521(arg2, 130, arg0);
				method521(arg2 - 1, 8, arg0);
				method521(arg2, 32, arg0 + 1);
			}

			if (arg4 == 1) {
				method521(arg2, 10, arg0);
				method521(arg2, 32, arg0 + 1);
				method521(arg2 + 1, 128, arg0);
			}

			if (arg4 == 2) {
				method521(arg2, 40, arg0);
				method521(arg2 + 1, 128, arg0);
				method521(arg2, 2, arg0 - 1);
			}

			if (arg4 == 3) {
				method521(arg2, 160, arg0);
				method521(arg2, 2, arg0 - 1);
				method521(arg2 - 1, 8, arg0);
			}
		}

		if (arg3) {
			if (arg1 == 0) {
				if (arg4 == 0) {
					method521(arg2, 0x10000, arg0);
					method521(arg2 - 1, 4096, arg0);
				}

				if (arg4 == 1) {
					method521(arg2, 1024, arg0);
					method521(arg2, 16384, arg0 + 1);
				}

				if (arg4 == 2) {
					method521(arg2, 4096, arg0);
					method521(arg2 + 1, 0x10000, arg0);
				}

				if (arg4 == 3) {
					method521(arg2, 16384, arg0);
					method521(arg2, 1024, arg0 - 1);
				}
			}

			if (arg1 == 1 || arg1 == 3) {
				if (arg4 == 0) {
					method521(arg2, 512, arg0);
					method521(arg2 - 1, 8192, arg0 + 1);
				}

				if (arg4 == 1) {
					method521(arg2, 2048, arg0);
					method521(arg2 + 1, 32768, arg0 + 1);
				}

				if (arg4 == 2) {
					method521(arg2, 8192, arg0);
					method521(arg2 + 1, 512, arg0 - 1);
				}

				if (arg4 == 3) {
					method521(arg2, 32768, arg0);
					method521(arg2 - 1, 2048, arg0 - 1);
				}
			}

			if (arg1 == 2) {
				if (arg4 == 0) {
					method521(arg2, 66560, arg0);
					method521(arg2 - 1, 4096, arg0);
					method521(arg2, 16384, arg0 + 1);
				}

				if (arg4 == 1) {
					method521(arg2, 5120, arg0);
					method521(arg2, 16384, arg0 + 1);
					method521(arg2 + 1, 0x10000, arg0);
				}

				if (arg4 == 2) {
					method521(arg2, 20480, arg0);
					method521(arg2 + 1, 0x10000, arg0);
					method521(arg2, 1024, arg0 - 1);
				}

				if (arg4 == 3) {
					method521(arg2, 81920, arg0);
					method521(arg2, 1024, arg0 - 1);
					method521(arg2 - 1, 4096, arg0);
					return;
				}
			}
		}
	}

	@ObfuscatedName("XSQWUDHM.a(IIIIIIZ)V")
	public void method520(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		int var7 = 256;
		if (arg5) {
			var7 += 0x20000;
		}

		arg1 -= field1347;
		arg2 -= field1348;

		if (arg3 == 1 || arg3 == 3) {
			int var8 = arg0;
			arg0 = arg4;
			arg4 = var8;
		}

		for (int var9 = arg1; var9 < arg0 + arg1; var9++) {
			if (var9 >= 0 && var9 < field1349) {
				for (int var10 = arg2; var10 < arg2 + arg4; var10++) {
					if (var10 >= 0 && var10 < field1350) {
						method521(var9, var7, var10);
					}
				}
			}
		}
	}

	@ObfuscatedName("XSQWUDHM.a(IIII)V")
	public void method521(int arg0, int arg1, int arg2) {
		field1351[arg0][arg2] &= 0xFFFFFF - arg1;
	}

	@ObfuscatedName("XSQWUDHM.c(III)V")
	public void method522(int arg0, int arg1) {
		arg0 -= field1347;
		arg1 -= field1348;
		field1351[arg0][arg1] &= 0xDFFFFF;
	}

	@ObfuscatedName("XSQWUDHM.a(IIIIIII)Z")
	public boolean method523(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg1 == arg4 && arg2 == arg3) {
			return true;
		}

		arg4 -= field1347;
		arg2 -= field1348;
		arg1 -= field1347;
		arg3 -= field1348;
		if (arg0 == 0) {
			if (arg5 == 0) {
				if (arg1 - 1 == arg4 && arg2 == arg3) {
					return true;
				}

				if (arg1 == arg4 && arg3 + 1 == arg2 && (field1351[arg4][arg2] & 0x1280120) == 0) {
					return true;
				}

				if (arg1 == arg4 && arg3 - 1 == arg2 && (field1351[arg4][arg2] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg5 == 1) {
				if (arg1 == arg4 && arg3 + 1 == arg2) {
					return true;
				}

				if (arg1 - 1 == arg4 && arg2 == arg3 && (field1351[arg4][arg2] & 0x1280108) == 0) {
					return true;
				}

				if (arg1 + 1 == arg4 && arg2 == arg3 && (field1351[arg4][arg2] & 0x1280180) == 0) {
					return true;
				}
			} else if (arg5 == 2) {
				if (arg1 + 1 == arg4 && arg2 == arg3) {
					return true;
				}

				if (arg1 == arg4 && arg3 + 1 == arg2 && (field1351[arg4][arg2] & 0x1280120) == 0) {
					return true;
				}

				if (arg1 == arg4 && arg3 - 1 == arg2 && (field1351[arg4][arg2] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg5 == 3) {
				if (arg1 == arg4 && arg3 - 1 == arg2) {
					return true;
				}

				if (arg1 - 1 == arg4 && arg2 == arg3 && (field1351[arg4][arg2] & 0x1280108) == 0) {
					return true;
				}

				if (arg1 + 1 == arg4 && arg2 == arg3 && (field1351[arg4][arg2] & 0x1280180) == 0) {
					return true;
				}
			}
		}

		if (arg0 == 2) {
			if (arg5 == 0) {
				if (arg1 - 1 == arg4 && arg2 == arg3) {
					return true;
				}

				if (arg1 == arg4 && arg3 + 1 == arg2) {
					return true;
				}

				if (arg1 + 1 == arg4 && arg2 == arg3 && (field1351[arg4][arg2] & 0x1280180) == 0) {
					return true;
				}

				if (arg1 == arg4 && arg3 - 1 == arg2 && (field1351[arg4][arg2] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg5 == 1) {
				if (arg1 - 1 == arg4 && arg2 == arg3 && (field1351[arg4][arg2] & 0x1280108) == 0) {
					return true;
				}

				if (arg1 == arg4 && arg3 + 1 == arg2) {
					return true;
				}

				if (arg1 + 1 == arg4 && arg2 == arg3) {
					return true;
				}

				if (arg1 == arg4 && arg3 - 1 == arg2 && (field1351[arg4][arg2] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg5 == 2) {
				if (arg1 - 1 == arg4 && arg2 == arg3 && (field1351[arg4][arg2] & 0x1280108) == 0) {
					return true;
				}

				if (arg1 == arg4 && arg3 + 1 == arg2 && (field1351[arg4][arg2] & 0x1280120) == 0) {
					return true;
				}

				if (arg1 + 1 == arg4 && arg2 == arg3) {
					return true;
				}

				if (arg1 == arg4 && arg3 - 1 == arg2) {
					return true;
				}
			} else if (arg5 == 3) {
				if (arg1 - 1 == arg4 && arg2 == arg3) {
					return true;
				}

				if (arg1 == arg4 && arg3 + 1 == arg2 && (field1351[arg4][arg2] & 0x1280120) == 0) {
					return true;
				}

				if (arg1 + 1 == arg4 && arg2 == arg3 && (field1351[arg4][arg2] & 0x1280180) == 0) {
					return true;
				}

				if (arg1 == arg4 && arg3 - 1 == arg2) {
					return true;
				}
			}
		}

		if (arg0 == 9) {
			if (arg1 == arg4 && arg3 + 1 == arg2 && (field1351[arg4][arg2] & 0x20) == 0) {
				return true;
			}

			if (arg1 == arg4 && arg3 - 1 == arg2 && (field1351[arg4][arg2] & 0x2) == 0) {
				return true;
			}

			if (arg1 - 1 == arg4 && arg2 == arg3 && (field1351[arg4][arg2] & 0x8) == 0) {
				return true;
			}

			if (arg1 + 1 == arg4 && arg2 == arg3 && (field1351[arg4][arg2] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("XSQWUDHM.b(IIIIIII)Z")
	public boolean method524(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 == arg1 && arg4 == arg5) {
			return true;
		}

		arg0 -= field1347;
		arg4 -= field1348;
		arg1 -= field1347;
		arg5 -= field1348;
		if (arg2 == 6 || arg2 == 7) {
			if (arg2 == 7) {
				arg3 = arg3 + 2 & 0x3;
			}

			if (arg3 == 0) {
				if (arg1 + 1 == arg0 && arg4 == arg5 && (field1351[arg0][arg4] & 0x80) == 0) {
					return true;
				}

				if (arg0 == arg1 && arg5 - 1 == arg4 && (field1351[arg0][arg4] & 0x2) == 0) {
					return true;
				}
			} else if (arg3 == 1) {
				if (arg1 - 1 == arg0 && arg4 == arg5 && (field1351[arg0][arg4] & 0x8) == 0) {
					return true;
				}

				if (arg0 == arg1 && arg5 - 1 == arg4 && (field1351[arg0][arg4] & 0x2) == 0) {
					return true;
				}
			} else if (arg3 == 2) {
				if (arg1 - 1 == arg0 && arg4 == arg5 && (field1351[arg0][arg4] & 0x8) == 0) {
					return true;
				}

				if (arg0 == arg1 && arg5 + 1 == arg4 && (field1351[arg0][arg4] & 0x20) == 0) {
					return true;
				}
			} else if (arg3 == 3) {
				if (arg1 + 1 == arg0 && arg4 == arg5 && (field1351[arg0][arg4] & 0x80) == 0) {
					return true;
				}

				if (arg0 == arg1 && arg5 + 1 == arg4 && (field1351[arg0][arg4] & 0x20) == 0) {
					return true;
				}
			}
		}

		if (arg2 == 8) {
			if (arg0 == arg1 && arg5 + 1 == arg4 && (field1351[arg0][arg4] & 0x20) == 0) {
				return true;
			}

			if (arg0 == arg1 && arg5 - 1 == arg4 && (field1351[arg0][arg4] & 0x2) == 0) {
				return true;
			}

			if (arg1 - 1 == arg0 && arg4 == arg5 && (field1351[arg0][arg4] & 0x8) == 0) {
				return true;
			}

			if (arg1 + 1 == arg0 && arg4 == arg5 && (field1351[arg0][arg4] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("XSQWUDHM.a(IIIIIIII)Z")
	public boolean method525(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg2 + arg5 - 1;
		int var9 = arg0 + arg6 - 1;
		if (arg3 >= arg2 && arg3 <= var8 && arg4 >= arg0 && arg4 <= var9) {
			return true;
		}

		if (arg2 - 1 == arg3 && arg4 >= arg0 && arg4 <= var9 && (field1351[arg3 - field1347][arg4 - field1348] & 0x8) == 0 && (arg1 & 0x8) == 0) {
			return true;
		}

		if (var8 + 1 == arg3 && arg4 >= arg0 && arg4 <= var9 && (field1351[arg3 - field1347][arg4 - field1348] & 0x80) == 0 && (arg1 & 0x2) == 0) {
			return true;
		}

		if (arg0 - 1 == arg4 && arg3 >= arg2 && arg3 <= var8 && (field1351[arg3 - field1347][arg4 - field1348] & 0x2) == 0 && (arg1 & 0x4) == 0) {
			return true;
		}

		if (var9 + 1 == arg4 && arg3 >= arg2 && arg3 <= var8 && (field1351[arg3 - field1347][arg4 - field1348] & 0x20) == 0 && (arg1 & 0x1) == 0) {
			return true;
		}

		return false;
	}
}
