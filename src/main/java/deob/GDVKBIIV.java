package deob;

@ObfuscatedName("GDVKBIIV")
public class GDVKBIIV {

	@ObfuscatedName("GDVKBIIV.j")
	public int field707 = 0;

	@ObfuscatedName("GDVKBIIV.k")
	public int field708 = 0;

	@ObfuscatedName("GDVKBIIV.l")
	public int field709;

	@ObfuscatedName("GDVKBIIV.m")
	public int field710;

	@ObfuscatedName("GDVKBIIV.n")
	public int[][] field711;

	public GDVKBIIV(int arg0, int arg1) {
		field709 = arg0;
		field710 = arg1;
		field711 = new int[field709][field710];
		method215();
	}

	@ObfuscatedName("GDVKBIIV.a()V")
	public void method215() {
		for (int var1 = 0; var1 < field709; var1++) {
			for (int var2 = 0; var2 < field710; var2++) {
				if (var1 == 0 || var2 == 0 || field709 - 1 == var1 || field710 - 1 == var2) {
					field711[var1][var2] = 0xFFFFFF;
				} else {
					field711[var1][var2] = 0x1000000;
				}
			}
		}
	}

	@ObfuscatedName("GDVKBIIV.a(ZIZIII)V")
	public void method216(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
		arg4 -= field707;
		arg0 -= field708;
		if (arg2 == 0) {
			if (arg3 == 0) {
				method219(arg4, arg0, 128);
				method219(arg4 - 1, arg0, 8);
			}

			if (arg3 == 1) {
				method219(arg4, arg0, 2);
				method219(arg4, arg0 + 1, 32);
			}

			if (arg3 == 2) {
				method219(arg4, arg0, 8);
				method219(arg4 + 1, arg0, 128);
			}

			if (arg3 == 3) {
				method219(arg4, arg0, 32);
				method219(arg4, arg0 - 1, 2);
			}
		}

		if (arg2 == 1 || arg2 == 3) {
			if (arg3 == 0) {
				method219(arg4, arg0, 1);
				method219(arg4 - 1, arg0 + 1, 16);
			}

			if (arg3 == 1) {
				method219(arg4, arg0, 4);
				method219(arg4 + 1, arg0 + 1, 64);
			}

			if (arg3 == 2) {
				method219(arg4, arg0, 16);
				method219(arg4 + 1, arg0 - 1, 1);
			}

			if (arg3 == 3) {
				method219(arg4, arg0, 64);
				method219(arg4 - 1, arg0 - 1, 4);
			}
		}

		if (arg2 == 2) {
			if (arg3 == 0) {
				method219(arg4, arg0, 130);
				method219(arg4 - 1, arg0, 8);
				method219(arg4, arg0 + 1, 32);
			}

			if (arg3 == 1) {
				method219(arg4, arg0, 10);
				method219(arg4, arg0 + 1, 32);
				method219(arg4 + 1, arg0, 128);
			}

			if (arg3 == 2) {
				method219(arg4, arg0, 40);
				method219(arg4 + 1, arg0, 128);
				method219(arg4, arg0 - 1, 2);
			}

			if (arg3 == 3) {
				method219(arg4, arg0, 160);
				method219(arg4, arg0 - 1, 2);
				method219(arg4 - 1, arg0, 8);
			}
		}

		if (arg1) {
			if (arg2 == 0) {
				if (arg3 == 0) {
					method219(arg4, arg0, 0x10000);
					method219(arg4 - 1, arg0, 4096);
				}

				if (arg3 == 1) {
					method219(arg4, arg0, 1024);
					method219(arg4, arg0 + 1, 16384);
				}

				if (arg3 == 2) {
					method219(arg4, arg0, 4096);
					method219(arg4 + 1, arg0, 0x10000);
				}

				if (arg3 == 3) {
					method219(arg4, arg0, 16384);
					method219(arg4, arg0 - 1, 1024);
				}
			}

			if (arg2 == 1 || arg2 == 3) {
				if (arg3 == 0) {
					method219(arg4, arg0, 512);
					method219(arg4 - 1, arg0 + 1, 8192);
				}

				if (arg3 == 1) {
					method219(arg4, arg0, 2048);
					method219(arg4 + 1, arg0 + 1, 32768);
				}

				if (arg3 == 2) {
					method219(arg4, arg0, 8192);
					method219(arg4 + 1, arg0 - 1, 512);
				}

				if (arg3 == 3) {
					method219(arg4, arg0, 32768);
					method219(arg4 - 1, arg0 - 1, 2048);
				}
			}

			if (arg2 == 2) {
				if (arg3 == 0) {
					method219(arg4, arg0, 66560);
					method219(arg4 - 1, arg0, 4096);
					method219(arg4, arg0 + 1, 16384);
				}

				if (arg3 == 1) {
					method219(arg4, arg0, 5120);
					method219(arg4, arg0 + 1, 16384);
					method219(arg4 + 1, arg0, 0x10000);
				}

				if (arg3 == 2) {
					method219(arg4, arg0, 20480);
					method219(arg4 + 1, arg0, 0x10000);
					method219(arg4, arg0 - 1, 1024);
				}

				if (arg3 == 3) {
					method219(arg4, arg0, 81920);
					method219(arg4, arg0 - 1, 1024);
					method219(arg4 - 1, arg0, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("GDVKBIIV.a(IIIIIIZ)V")
	public void method217(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		int var7 = 256;
		if (arg5) {
			var7 += 0x20000;
		}

		arg4 -= field707;
		arg2 -= field708;

		if (arg0 == 1 || arg0 == 3) {
			int var8 = arg3;
			arg3 = arg1;
			arg1 = var8;
		}

		for (int var9 = arg4; var9 < arg3 + arg4; var9++) {
			if (var9 >= 0 && var9 < field709) {
				for (int var10 = arg2; var10 < arg1 + arg2; var10++) {
					if (var10 >= 0 && var10 < field710) {
						method219(var9, var10, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("GDVKBIIV.a(IIB)V")
	public void method218(int arg0, int arg1) {
		arg1 -= field707;
		arg0 -= field708;
		field711[arg1][arg0] |= 0x200000;
	}

	@ObfuscatedName("GDVKBIIV.a(III)V")
	public void method219(int arg0, int arg1, int arg2) {
		field711[arg0][arg1] |= arg2;
	}

	@ObfuscatedName("GDVKBIIV.a(IIZIIZ)V")
	public void method220(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
		arg3 -= field707;
		arg4 -= field708;
		if (arg0 == 0) {
			if (arg1 == 0) {
				method222(arg4, 128, arg3);
				method222(arg4, 8, arg3 - 1);
			}

			if (arg1 == 1) {
				method222(arg4, 2, arg3);
				method222(arg4 + 1, 32, arg3);
			}

			if (arg1 == 2) {
				method222(arg4, 8, arg3);
				method222(arg4, 128, arg3 + 1);
			}

			if (arg1 == 3) {
				method222(arg4, 32, arg3);
				method222(arg4 - 1, 2, arg3);
			}
		}

		if (arg0 == 1 || arg0 == 3) {
			if (arg1 == 0) {
				method222(arg4, 1, arg3);
				method222(arg4 + 1, 16, arg3 - 1);
			}

			if (arg1 == 1) {
				method222(arg4, 4, arg3);
				method222(arg4 + 1, 64, arg3 + 1);
			}

			if (arg1 == 2) {
				method222(arg4, 16, arg3);
				method222(arg4 - 1, 1, arg3 + 1);
			}

			if (arg1 == 3) {
				method222(arg4, 64, arg3);
				method222(arg4 - 1, 4, arg3 - 1);
			}
		}

		if (arg0 == 2) {
			if (arg1 == 0) {
				method222(arg4, 130, arg3);
				method222(arg4, 8, arg3 - 1);
				method222(arg4 + 1, 32, arg3);
			}

			if (arg1 == 1) {
				method222(arg4, 10, arg3);
				method222(arg4 + 1, 32, arg3);
				method222(arg4, 128, arg3 + 1);
			}

			if (arg1 == 2) {
				method222(arg4, 40, arg3);
				method222(arg4, 128, arg3 + 1);
				method222(arg4 - 1, 2, arg3);
			}

			if (arg1 == 3) {
				method222(arg4, 160, arg3);
				method222(arg4 - 1, 2, arg3);
				method222(arg4, 8, arg3 - 1);
			}
		}

		if (arg2) {
			if (arg0 == 0) {
				if (arg1 == 0) {
					method222(arg4, 0x10000, arg3);
					method222(arg4, 4096, arg3 - 1);
				}

				if (arg1 == 1) {
					method222(arg4, 1024, arg3);
					method222(arg4 + 1, 16384, arg3);
				}

				if (arg1 == 2) {
					method222(arg4, 4096, arg3);
					method222(arg4, 0x10000, arg3 + 1);
				}

				if (arg1 == 3) {
					method222(arg4, 16384, arg3);
					method222(arg4 - 1, 1024, arg3);
				}
			}

			if (arg0 == 1 || arg0 == 3) {
				if (arg1 == 0) {
					method222(arg4, 512, arg3);
					method222(arg4 + 1, 8192, arg3 - 1);
				}

				if (arg1 == 1) {
					method222(arg4, 2048, arg3);
					method222(arg4 + 1, 32768, arg3 + 1);
				}

				if (arg1 == 2) {
					method222(arg4, 8192, arg3);
					method222(arg4 - 1, 512, arg3 + 1);
				}

				if (arg1 == 3) {
					method222(arg4, 32768, arg3);
					method222(arg4 - 1, 2048, arg3 - 1);
				}
			}

			if (arg0 == 2) {
				if (arg1 == 0) {
					method222(arg4, 66560, arg3);
					method222(arg4, 4096, arg3 - 1);
					method222(arg4 + 1, 16384, arg3);
				}

				if (arg1 == 1) {
					method222(arg4, 5120, arg3);
					method222(arg4 + 1, 16384, arg3);
					method222(arg4, 0x10000, arg3 + 1);
				}

				if (arg1 == 2) {
					method222(arg4, 20480, arg3);
					method222(arg4, 0x10000, arg3 + 1);
					method222(arg4 - 1, 1024, arg3);
				}

				if (arg1 == 3) {
					method222(arg4, 81920, arg3);
					method222(arg4 - 1, 1024, arg3);
					method222(arg4, 4096, arg3 - 1);
					return;
				}
			}
		}
	}

	@ObfuscatedName("GDVKBIIV.a(IIIIIZZ)V")
	public void method221(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		int var7 = 256;
		if (arg5) {
			var7 += 0x20000;
		}

		arg4 -= field707;
		arg3 -= field708;

		if (arg2 == 1 || arg2 == 3) {
			int var8 = arg0;
			arg0 = arg1;
			arg1 = var8;
		}

		for (int var9 = arg4; var9 < arg0 + arg4; var9++) {
			if (var9 >= 0 && var9 < field709) {
				for (int var10 = arg3; var10 < arg1 + arg3; var10++) {
					if (var10 >= 0 && var10 < field710) {
						method222(var10, var7, var9);
					}
				}
			}
		}
	}

	@ObfuscatedName("GDVKBIIV.a(IIII)V")
	public void method222(int arg0, int arg1, int arg2) {
		field711[arg2][arg0] &= 0xFFFFFF - arg1;
	}

	@ObfuscatedName("GDVKBIIV.b(IIB)V")
	public void method223(int arg0, int arg1) {
		arg1 -= field707;
		arg0 -= field708;
		field711[arg1][arg0] &= 0xDFFFFF;
	}

	@ObfuscatedName("GDVKBIIV.a(IIIIBII)Z")
	public boolean method224(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg3 == arg5 && arg1 == arg2) {
			return true;
		}

		arg5 -= field707;
		arg2 -= field708;
		arg3 -= field707;
		arg1 -= field708;
		if (arg4 == 0) {
			if (arg0 == 0) {
				if (arg3 - 1 == arg5 && arg1 == arg2) {
					return true;
				}

				if (arg3 == arg5 && arg1 + 1 == arg2 && (field711[arg5][arg2] & 0x1280120) == 0) {
					return true;
				}

				if (arg3 == arg5 && arg1 - 1 == arg2 && (field711[arg5][arg2] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg0 == 1) {
				if (arg3 == arg5 && arg1 + 1 == arg2) {
					return true;
				}

				if (arg3 - 1 == arg5 && arg1 == arg2 && (field711[arg5][arg2] & 0x1280108) == 0) {
					return true;
				}

				if (arg3 + 1 == arg5 && arg1 == arg2 && (field711[arg5][arg2] & 0x1280180) == 0) {
					return true;
				}
			} else if (arg0 == 2) {
				if (arg3 + 1 == arg5 && arg1 == arg2) {
					return true;
				}

				if (arg3 == arg5 && arg1 + 1 == arg2 && (field711[arg5][arg2] & 0x1280120) == 0) {
					return true;
				}

				if (arg3 == arg5 && arg1 - 1 == arg2 && (field711[arg5][arg2] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg0 == 3) {
				if (arg3 == arg5 && arg1 - 1 == arg2) {
					return true;
				}

				if (arg3 - 1 == arg5 && arg1 == arg2 && (field711[arg5][arg2] & 0x1280108) == 0) {
					return true;
				}

				if (arg3 + 1 == arg5 && arg1 == arg2 && (field711[arg5][arg2] & 0x1280180) == 0) {
					return true;
				}
			}
		}

		if (arg4 == 2) {
			if (arg0 == 0) {
				if (arg3 - 1 == arg5 && arg1 == arg2) {
					return true;
				}

				if (arg3 == arg5 && arg1 + 1 == arg2) {
					return true;
				}

				if (arg3 + 1 == arg5 && arg1 == arg2 && (field711[arg5][arg2] & 0x1280180) == 0) {
					return true;
				}

				if (arg3 == arg5 && arg1 - 1 == arg2 && (field711[arg5][arg2] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg0 == 1) {
				if (arg3 - 1 == arg5 && arg1 == arg2 && (field711[arg5][arg2] & 0x1280108) == 0) {
					return true;
				}

				if (arg3 == arg5 && arg1 + 1 == arg2) {
					return true;
				}

				if (arg3 + 1 == arg5 && arg1 == arg2) {
					return true;
				}

				if (arg3 == arg5 && arg1 - 1 == arg2 && (field711[arg5][arg2] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg0 == 2) {
				if (arg3 - 1 == arg5 && arg1 == arg2 && (field711[arg5][arg2] & 0x1280108) == 0) {
					return true;
				}

				if (arg3 == arg5 && arg1 + 1 == arg2 && (field711[arg5][arg2] & 0x1280120) == 0) {
					return true;
				}

				if (arg3 + 1 == arg5 && arg1 == arg2) {
					return true;
				}

				if (arg3 == arg5 && arg1 - 1 == arg2) {
					return true;
				}
			} else if (arg0 == 3) {
				if (arg3 - 1 == arg5 && arg1 == arg2) {
					return true;
				}

				if (arg3 == arg5 && arg1 + 1 == arg2 && (field711[arg5][arg2] & 0x1280120) == 0) {
					return true;
				}

				if (arg3 + 1 == arg5 && arg1 == arg2 && (field711[arg5][arg2] & 0x1280180) == 0) {
					return true;
				}

				if (arg3 == arg5 && arg1 - 1 == arg2) {
					return true;
				}
			}
		}

		if (arg4 == 9) {
			if (arg3 == arg5 && arg1 + 1 == arg2 && (field711[arg5][arg2] & 0x20) == 0) {
				return true;
			}

			if (arg3 == arg5 && arg1 - 1 == arg2 && (field711[arg5][arg2] & 0x2) == 0) {
				return true;
			}

			if (arg3 - 1 == arg5 && arg1 == arg2 && (field711[arg5][arg2] & 0x8) == 0) {
				return true;
			}

			if (arg3 + 1 == arg5 && arg1 == arg2 && (field711[arg5][arg2] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("GDVKBIIV.a(IIIIIII)Z")
	public boolean method225(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 == arg5 && arg1 == arg2) {
			return true;
		}

		arg5 -= field707;
		arg2 -= field708;
		arg0 -= field707;
		arg1 -= field708;
		if (arg3 == 6 || arg3 == 7) {
			if (arg3 == 7) {
				arg4 = arg4 + 2 & 0x3;
			}

			if (arg4 == 0) {
				if (arg0 + 1 == arg5 && arg1 == arg2 && (field711[arg5][arg2] & 0x80) == 0) {
					return true;
				}

				if (arg0 == arg5 && arg1 - 1 == arg2 && (field711[arg5][arg2] & 0x2) == 0) {
					return true;
				}
			} else if (arg4 == 1) {
				if (arg0 - 1 == arg5 && arg1 == arg2 && (field711[arg5][arg2] & 0x8) == 0) {
					return true;
				}

				if (arg0 == arg5 && arg1 - 1 == arg2 && (field711[arg5][arg2] & 0x2) == 0) {
					return true;
				}
			} else if (arg4 == 2) {
				if (arg0 - 1 == arg5 && arg1 == arg2 && (field711[arg5][arg2] & 0x8) == 0) {
					return true;
				}

				if (arg0 == arg5 && arg1 + 1 == arg2 && (field711[arg5][arg2] & 0x20) == 0) {
					return true;
				}
			} else if (arg4 == 3) {
				if (arg0 + 1 == arg5 && arg1 == arg2 && (field711[arg5][arg2] & 0x80) == 0) {
					return true;
				}

				if (arg0 == arg5 && arg1 + 1 == arg2 && (field711[arg5][arg2] & 0x20) == 0) {
					return true;
				}
			}
		}

		if (arg3 == 8) {
			if (arg0 == arg5 && arg1 + 1 == arg2 && (field711[arg5][arg2] & 0x20) == 0) {
				return true;
			}

			if (arg0 == arg5 && arg1 - 1 == arg2 && (field711[arg5][arg2] & 0x2) == 0) {
				return true;
			}

			if (arg0 - 1 == arg5 && arg1 == arg2 && (field711[arg5][arg2] & 0x8) == 0) {
				return true;
			}

			if (arg0 + 1 == arg5 && arg1 == arg2 && (field711[arg5][arg2] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("GDVKBIIV.a(IIIIIBII)Z")
	public boolean method226(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg2 + arg3 - 1;
		int var9 = arg5 + arg6 - 1;
		if (arg0 >= arg2 && arg0 <= var8 && arg4 >= arg5 && arg4 <= var9) {
			return true;
		}

		if (arg2 - 1 == arg0 && arg4 >= arg5 && arg4 <= var9 && (field711[arg0 - field707][arg4 - field708] & 0x8) == 0 && (arg1 & 0x8) == 0) {
			return true;
		}

		if (var8 + 1 == arg0 && arg4 >= arg5 && arg4 <= var9 && (field711[arg0 - field707][arg4 - field708] & 0x80) == 0 && (arg1 & 0x2) == 0) {
			return true;
		}

		if (arg5 - 1 == arg4 && arg0 >= arg2 && arg0 <= var8 && (field711[arg0 - field707][arg4 - field708] & 0x2) == 0 && (arg1 & 0x4) == 0) {
			return true;
		}

		if (var9 + 1 == arg4 && arg0 >= arg2 && arg0 <= var8 && (field711[arg0 - field707][arg4 - field708] & 0x20) == 0 && (arg1 & 0x1) == 0) {
			return true;
		}

		return false;
	}
}
